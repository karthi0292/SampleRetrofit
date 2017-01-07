package com.sample.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CIPL0233 on 1/5/2017.
 */

public class AlDetails {
    @SerializedName("AccomplishListId")
    private String accomplishListId;
    @SerializedName("ALOrdinal")
    private String aLOrdinal;
    @SerializedName("ProjectPicture")
    private String projectPicture;
    @SerializedName("AccomplishListName")
    private String accomplishListName;
    @SerializedName("PresentedPrice")
    private String presentedPrice;

    public String getAccomplishListId() {
        return accomplishListId;
    }

    public void setAccomplishListId(String accomplishListId) {
        this.accomplishListId = accomplishListId;
    }

    public String getaLOrdinal() {
        return aLOrdinal;
    }

    public void setaLOrdinal(String aLOrdinal) {
        this.aLOrdinal = aLOrdinal;
    }

    public String getProjectPicture() {
        return projectPicture;
    }

    public void setProjectPicture(String projectPicture) {
        this.projectPicture = projectPicture;
    }

    public String getAccomplishListName() {
        return accomplishListName;
    }

    public void setAccomplishListName(String accomplishListName) {
        this.accomplishListName = accomplishListName;
    }

    public String getPresentedPrice() {
        return presentedPrice;
    }

    public void setPresentedPrice(String presentedPrice) {
        this.presentedPrice = presentedPrice;
    }
}
