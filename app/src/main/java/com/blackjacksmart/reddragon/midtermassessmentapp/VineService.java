package com.blackjacksmart.reddragon.midtermassessmentapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by RedDragon on 12/10/16.
 */

public interface VineService {

    @GET("users/918753190470619136")
    Call<VinePOJO> getVineJSON();


}
