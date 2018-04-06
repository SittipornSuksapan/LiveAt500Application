package com.chan.revernue.liveat500application.manager.http;

import com.chan.revernue.liveat500application.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiService {
    @POST("list")
    Call<PhotoItemCollectionDao> loadProtoList();
}
