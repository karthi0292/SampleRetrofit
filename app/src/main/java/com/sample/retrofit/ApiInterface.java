package com.sample.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by CIPL0233 on 1/5/2017.
 */

public interface ApiInterface {

    @GET("/GreenPro/gp_accomplishlists.aspx")
    Call<GpAccomplishlistModel> getAlDetails(@Query("DealerId") String dealerId, @Query("AppId") String appId, @Query("EmployeeId") String employeeId, @Query("AppointmentResultId") String appointmentResultId, @Query("AppointmentId") String appointmentId, @Query("RetrieveType") String retrieveType);
}
