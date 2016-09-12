package com.aso.godapp.tools.retrofit;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by MartinLin on 2016/9/9.
 */

public interface MovieService {

    //https://api.douban.com/v2/movie/top250?start=0&count=10
    @GET("top250")
    Call<String> getMovie(@Query("start") int start, @Query("count") int count);

    @GET("top250")
    Observable<String> getMovie2(@Query("start") int start, @Query("count") int count);
}
