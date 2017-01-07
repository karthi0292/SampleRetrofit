package com.sample.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<GpAccomplishlistModel> call = apiService.getAlDetails("71", "4", "1580", "28241", "30188", "proposal");
        call.enqueue(new Callback<GpAccomplishlistModel>() {
            @Override
            public void onResponse(Call<GpAccomplishlistModel> call, Response<GpAccomplishlistModel> response) {
                List<AlDetails> gpAccomplishlistModelList=response.body().getAlDetails();
                Log.d("AlDetails",""+gpAccomplishlistModelList.get(0).getAccomplishListId());
            }

            @Override
            public void onFailure(Call<GpAccomplishlistModel> call, Throwable t) {

            }
        });
    }
}
