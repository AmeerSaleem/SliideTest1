package com.example.sliidetest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sliidetest1.Adapters.RecyclerViewAdapter;
import com.example.sliidetest1.Adapters.ViewpagerFragmentAdapter;
import com.example.sliidetest1.ModelClasses.Content;
import com.example.sliidetest1.ModelClasses.ItemModel;
import com.example.sliidetest1.ModelClasses.JsonPojo1;
import com.example.sliidetest1.ModelClasses.RowModel;
import com.example.sliidetest1.ViewPagerFragments.Fragment1;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    public static ViewpagerFragmentAdapter vpAdapter;
    public static ArrayList<Fragment1> fragments4ViewPager;

    private static final String JsonUrl =
            "https://contentapi.celltick.com/mediaApi/v1.0/content?key=t4QCg6zCkFrCW5CTJii52IAQojqNmyeJ&publisherId=Magazine_from_AppDevWebsite&userId=eccc7785-001c-4341-88f8-eddf15f3aa4a&countryCode=US&language=en&limit=100&offset=0";
    RecyclerView rcvItems;
    JsonPojo1 JsonApiData;
    RecyclerViewAdapter adapter;
    LinearLayoutManager manager;
    ArrayList<RowModel> rowList;
    ArrayList<Content> contentList;
    TextView textTrial;
    ImageView refreshImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refreshImage = findViewById(R.id.image_refresh);
        refreshImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = new RotateAnimation(0.0f, 360.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                        0.5f);
                animation.setRepeatCount(-1);
                animation.setDuration(2000);

                refreshImage.startAnimation(animation);
                rowList = new ArrayList<>();
                loadJsonData();

            }
        });
        fragments4ViewPager = new ArrayList<>();
//        Fragment1 frag1 = new Fragment1();
//        Fragment1 frag2 = new Fragment1();
//        Fragment1 frag3 = new Fragment1();

//        fragments4ViewPager.add(frag1);
//        fragments4ViewPager.add(frag2);
//        fragments4ViewPager.add(frag3);

        vpAdapter = new ViewpagerFragmentAdapter(getSupportFragmentManager(), fragments4ViewPager);

        rowList = new ArrayList<>();
        textTrial = findViewById(R.id.textTrial);
        rcvItems = findViewById(R.id.recyclerItems);
        rcvItems.setHasFixedSize(true);
        loadJsonData();


    }

    private void loadJsonData() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://contentapi.celltick.com/mediaApi/v1.0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        Call<JsonPojo1> call = apiService.getJsonData();

        call.enqueue(new Callback<JsonPojo1>() {
            @Override
            public void onResponse(Call<JsonPojo1> call, Response<JsonPojo1> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Code: " + response.code(), Toast.LENGTH_LONG).show();
                    return;
                }

                JsonApiData = ((JsonPojo1) response.body());
                contentList = ((ArrayList<Content>) JsonApiData.getContent());
                int objectSwitcher = 0;
                RowModel rowIteration = new RowModel();
                for(int i = 0;i < contentList.size();i++ ){
                    if (objectSwitcher < 6) {
                        ItemModel item = new ItemModel(contentList.get(i).getTitle(),contentList.get(i).getImages().getMainImage().getUrl());
                        rowIteration.getItemList().add(item);
                        objectSwitcher++;
                    }
                    else{
                        rowList.add(rowIteration);
                        rowIteration = new RowModel();
                        ItemModel item = new ItemModel(contentList.get(i).getTitle(),contentList.get(i).getImages().getMainImage().getUrl());
                        rowIteration.getItemList().add(item);
                        objectSwitcher = 1;
                    }
                }

                adapter = new RecyclerViewAdapter(MainActivity.this,rowList);
                LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
                rcvItems.setLayoutManager(manager);
                rcvItems.setAdapter(adapter);
                refreshImage.clearAnimation();
                Toast.makeText(MainActivity.this, "News updated.", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<JsonPojo1> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
