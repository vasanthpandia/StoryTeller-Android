package com.teamfalcon.storyteller;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static Retrofit retrofit = null;

    public static Retrofit getClient(String url) {
        if(url.equals("")) {
            url = "https://en9j82p2v4ua.x.pipedream.net";
        }
        if(retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
