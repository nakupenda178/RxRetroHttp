package com.bakerj.demo.rxretrohttp.weather;

import com.bakerj.demo.rxretrohttp.entity.weather.Weather;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("json.shtml")
    Observable<Weather> getWeather(@Query("city") String city);
}
