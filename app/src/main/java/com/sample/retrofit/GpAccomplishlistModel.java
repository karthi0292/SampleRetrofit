package com.sample.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by CIPL0233 on 1/5/2017.
 */

public class GpAccomplishlistModel {
    @SerializedName("AL")
    private List<AlDetails> alDetails;

    public List<AlDetails> getAlDetails() {
        return alDetails;
    }

    public void setAlDetails(List<AlDetails> alDetails) {
        this.alDetails = alDetails;
    }
}
