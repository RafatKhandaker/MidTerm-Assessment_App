package com.blackjacksmart.reddragon.midtermassessmentapp.network;

import com.blackjacksmart.reddragon.midtermassessmentapp.network.POJOS.Data;
import com.blackjacksmart.reddragon.midtermassessmentapp.network.POJOS.Record;
import com.blackjacksmart.reddragon.midtermassessmentapp.network.POJOS.VinePOJO;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by RedDragon on 12/10/16.
 */

public interface VineService {

    @GET("users/918753190470619136")
    Call<Data> getVineDataJSON();

    @GET("users/918753190470619136")
    Call<Record> getVinRecordJson();

    @GET("users/918753190470619136")
    Call<VinePOJO> getVinePOJOJSON();

}
