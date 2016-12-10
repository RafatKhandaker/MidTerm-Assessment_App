package com.blackjacksmart.reddragon.midtermassessmentapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

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
                .baseUrl("https://vine.co/api/timelines/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        VineService service = retrofit.create(VineService.class);
        Call<VinePOJO> getService = service.getVineJSON();

        getService.enqueue(new Callback<VinePOJO>() {
            @Override
            public void onResponse(Call<VinePOJO> call, Response<VinePOJO> response) {
                if (response.isSuccessful()) {
                    VinePOJO vinePOJO = response.body();
                    Log.d("ON RESPONSE: ", "" +vinePOJO.getData().getRecords());
//                    for (int i = 0; i<results.size(); i++) {
////                        nyTimesData.add(results.get(i));
////                        headerData.add(response.body().getLast_updated());
////                        uriData.add(response.body().getResults().get(i).getUrl());
////                    }
////
////                    initiateRecyclerView();
//
////
//                }
            }
            }
                @Override
                public void onFailure(Call<VinePOJO> call, Throwable t) {
                    Log.d("call:fail ", "retrofit fail: " + t.toString());
                }

    });

    }
}


