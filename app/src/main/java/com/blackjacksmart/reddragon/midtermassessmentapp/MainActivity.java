package com.blackjacksmart.reddragon.midtermassessmentapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.blackjacksmart.reddragon.midtermassessmentapp.network.POJOS.VinePOJO;
import com.blackjacksmart.reddragon.midtermassessmentapp.network.VineService;
import com.blackjacksmart.reddragon.midtermassessmentapp.recycler.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/** Rafat Khandaker     12/10/2016
 *
 *           My set up is correct, Bug was fixed... POJO error because data type Long was not preset
 *           on JSON converter
 * **/

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    public static List<VinePOJO> dataRecords;
    public static List<Object> dataLiked = new ArrayList<>();
    public static List<Object> dataUsername = new ArrayList<>();
    public static List<Object> dataProfileBackground = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiateRetrofit();
    }

//-------------------------------RECYCLER-----------------------------------------------------------

    private void initiateRecyclerView() {

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        adapter = new RecyclerAdapter();
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    public void initiateRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://vine.co/api/timelines/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        VineService service = retrofit.create(VineService.class);
        Call<VinePOJO> getService = service.getVinePOJOJSON();

        getService.enqueue(new Callback<VinePOJO>() {
            @Override
            public void onResponse(Call<VinePOJO> call, Response<VinePOJO> response) {
                if (response.isSuccessful()) {
                    VinePOJO result = response.body();

                    Log.d("ON RESPONSE: ", "" + result.getData().getCount());
                    Log.d("ON RESPONSE: ", "" +result.getData().getSize());
                    Log.d("ON RESPONSE: ", "" +result.getData().getRecords().size());

                    Log.d("ON RESPONSE" , "" +result.getData().getRecords().get(0).getUsername());
                    Log.d("ON RESPONSE" , "" +result.getData().getRecords().get(0).getProfileBackground());
                    Log.d("ON RESPONSE" , "" +result.getData().getRecords().get(0).getLiked());

                    for (int i = 0; i < result.getData().getRecords().size(); i++) {
                        Long liked = result.getData().getRecords().get(i).getLiked();
                        String username = result.getData().getRecords().get(i).getUsername();
                        String background = result.getData().getRecords().get(i).getProfileBackground();

                        dataLiked.add(liked);
                        dataUsername.add(username);
                        dataProfileBackground.add(background);

                    }

                    System.out.println("data liked result: " +result.getData().getRecords().get(0).getUsername());
                    System.out.println("data liked result: " +result.getData().getRecords().get(1).getUsername());
                    System.out.println("data liked result: " +result.getData().getRecords().get(2).getUsername());
                    System.out.println("data liked result: " +result.getData().getRecords().get(3).getUsername());
                    System.out.println("data liked result: " +result.getData().getRecords().get(4).getUsername());
                    System.out.println("data liked result: " +result.getData().getRecords().get(5).getUsername());
                    System.out.println("data liked result: " +result.getData().getRecords().get(6).getUsername());
                    System.out.println("data liked result: " +result.getData().getRecords().get(7).getUsername());
                    System.out.println("data liked result: " +result.getData().getRecords().get(8).getUsername());


                    System.out.println("data liked in data: " +dataProfileBackground.get(0));
                    System.out.println("data liked in data: " +dataProfileBackground.get(1));
                    System.out.println("data liked in data: " +dataProfileBackground.get(2));
                    System.out.println("data liked in data: " +dataProfileBackground.get(3));
                    System.out.println("data liked in data: " +dataProfileBackground.get(4));
                    System.out.println("data liked in data: " +dataProfileBackground.get(5));
                    System.out.println("data liked in data: " +dataProfileBackground.get(6));
                    System.out.println("data liked in data: " +dataProfileBackground.get(7));
                    System.out.println("data liked in data: " +dataProfileBackground.get(8));

                    initiateRecyclerView();
                }

            }
                @Override
                public void onFailure(Call<VinePOJO> call, Throwable t) {
                    Log.d("call:fail ", "retrofit fail: " + t.toString());
                }
    });

    }

}


