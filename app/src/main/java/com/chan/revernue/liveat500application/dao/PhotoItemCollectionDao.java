package com.chan.revernue.liveat500application.dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PhotoItemCollectionDao {

    @SerializedName("success")   private Boolean success;
    @SerializedName("data")   private List<PhotoItemDao> data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<PhotoItemDao> getData() {
        return data;
    }

    public void setData(List<PhotoItemDao> data) {
        this.data = data;
    }
}
