package com.blackjacksmart.reddragon.midtermassessmentapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.blackjacksmart.reddragon.midtermassessmentapp.network.POJOS.VinePOJO;
import com.blackjacksmart.reddragon.midtermassessmentapp.network.VineService;
import com.blackjacksmart.reddragon.midtermassessmentapp.recycler.RecyclerAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    public static List<Object> dataLiked;
    public static List<Object> dataUsername;
    public static List<Object> dataProfileBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiateRetrofit();
    }

    private void initiateRecyclerView() {

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        adapter = new RecyclerAdapter();
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    public void initiateRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://vine.co/api/timelines/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        VineService service = retrofit.create(VineService.class);
        Call<VinePOJO.Data> getService = service.getVineJSON();

        getService.enqueue(new Callback<VinePOJO.Data>() {
            @Override
            public void onResponse(Call<VinePOJO.Data> call, Response<VinePOJO.Data> response) {
                if (response.isSuccessful()) {
                    VinePOJO.Data result = response.body();
                    Log.d("ON RESPONSE: ", "" +response.body());

//                    List<VinePOJO.Data> records = result;

//                    for (int i = 0; i < records.size(); i++) {
//                        dataLiked.add(result.getData().getRecords().get(i).getLiked());
//                        dataUsername.add(response.body().getData().getRecords().get(i).getUsername());
//                        dataProfileBackground.add(response.body().getData().getRecords().get(i)
//                                .getProfileBackground());
//
//                        initiateRecyclerView();
//
//                    }
                    initiateRecyclerView();
                }
            }
                @Override
                public void onFailure(Call<VinePOJO.Data> call, Throwable t) {
                    Log.d("call:fail ", "retrofit fail: " + t.toString());
                }

    });

    }
}


