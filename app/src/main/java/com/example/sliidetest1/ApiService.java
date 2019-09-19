package com.example.sliidetest1;

import com.example.sliidetest1.ModelClasses.JsonPojo1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("content?key=t4QCg6zCkFrCW5CTJii52IAQojqNmyeJ&publisherId=Magazine_from_AppDevWebsite&userId=eccc7785-001c-4341-88f8-eddf15f3aa4a&countryCode=US&language=en&limit=100&offset=0")
    Call<JsonPojo1> getJsonData();
}
