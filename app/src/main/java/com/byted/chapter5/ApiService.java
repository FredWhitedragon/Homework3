package com.byted.chapter5;

import java.util.Observable;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    // https://wanandroid.com/wxarticle/chapters/json
    @GET("wxarticle/chapters/json")
    Call<ArticleResponse> getArticles();

    // todo 添加api
    // https://www.wanandroid.com/user/register
    //方法：POST
    //	username,password,repassword
    @POST("register")
    Call<User> register(@Body User user);
}
