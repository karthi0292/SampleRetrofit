package com.sample.retrofit;

import android.util.Base64;

import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by CIPL0233 on 1/5/2017.
 */

public class ApiClient {

    public static final String BASE_URL = "https://devmobile.teambizwiz.com/";
    private static Retrofit.Builder builder = null;
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    public static Retrofit retrofit;

    public static Retrofit getClient() {

        builder = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create());

        if (builder != null) {
            String credentials = "kbh:b1zw1zMob1leApps";
            final String basic =
                    "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);

            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();

                    Request.Builder requestBuilder = original.newBuilder()
                            .header("Authorization", basic)
                            .header("Accept", "application/json")
                            .method(original.method(), original.body());

                    Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });

            OkHttpClient client = httpClient.build();

            retrofit = builder.client(client).build();
        }
        return retrofit;
    }
}
