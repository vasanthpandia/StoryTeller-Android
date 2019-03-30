package com.teamfalcon.storyteller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreateStoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_story);

//        Story s = new Story();
//        s._id = "id1";
//        s.description = "This is the first Story";
//        s.title = "Story One";
//        s.slug = "Slug 1";
//        s.tags = new String[]{"tag1", "tag2", "tag3"};
//        s.authorName = "Vasanth Pandiarajan";
//
        StoryService sservice = RetrofitClient.getClient("").create(StoryService.class);

//        Call<List<Story>> call = sservice.getStories();
//        call.enqueue(new Callback<List<Story>>() {
//            @Override
//            public void onResponse(Call<List<Story>> call, Response<List<Story>> response) {
//                if(response.isSuccessful()){
//                    List<Story> a = response.body();
//                    for(Story s : a) {
//                        System.out.println(s.getTitle());
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Story>> call, Throwable t) {
//                Log.e("ERROR: ", t.getMessage());
//            }
//        });

//        Call<Story> call1 = sservice.getStory("id25");
//        call1.enqueue(new Callback<Story>() {
//            @Override
//            public void onResponse(Call<Story> call, Response<Story> response) {
//                if(response.isSuccessful()) {
//                    Story story25 = response.body();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Story> call, Throwable t) {
//                Log.e("Error : ", t.getMessage());
//            }
//        });

    }
}
