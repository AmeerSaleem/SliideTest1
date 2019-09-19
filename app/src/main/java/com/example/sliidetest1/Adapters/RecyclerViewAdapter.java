package com.example.sliidetest1.Adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.example.sliidetest1.MainActivity;
import com.example.sliidetest1.ModelClasses.RowModel;
import com.example.sliidetest1.R;
import com.example.sliidetest1.ViewPagerFragments.Fragment1;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    ArrayList<RowModel> rowList;
    ViewpagerFragmentAdapter vpAdapter;
    ArrayList<Fragment1> fragments4ViewPager;
    Fragment1 fragTest;
    Fragment1 fragTest2;
    Fragment1 fragTest3;
    private int Id =1;

    public RecyclerViewAdapter(Context context, ArrayList<RowModel> rowList) {
        this.context = context;
        this.rowList = rowList;

        fragTest = new Fragment1();
        fragTest2 = new Fragment1();
        fragTest3 = new Fragment1();
        fragments4ViewPager = new ArrayList<>();
//        fragments4ViewPager = new ArrayList<>();
//        Fragment1 frag1 = new Fragment1();
//        Fragment1 frag2 = new Fragment1();
//        Fragment1 frag3 = new Fragment1();
//
//        fragments4ViewPager.add(frag1);
//        fragments4ViewPager.add(frag2);
//        fragments4ViewPager.add(frag3);
//
//        vpAdapter = new ViewpagerFragmentAdapter(fragments4ViewPager.get(0).getChildFragmentManager(), fragments4ViewPager);

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageScreen1, imageScreen2, imageScreen3;
        TextView text1, text2, text3;
        ViewPager viewPager;

        public ViewHolder(View itemView) {

            super(itemView);
            imageScreen1 = itemView.findViewById(R.id.list_image_1);
            imageScreen2 = itemView.findViewById(R.id.list_image_2);
            imageScreen3 = itemView.findViewById(R.id.list_image_3);
            text1 = itemView.findViewById(R.id.itemText1);
            text2 = itemView.findViewById(R.id.itemText2);
            text3 = itemView.findViewById(R.id.itemText3);
            viewPager = itemView.findViewById(R.id.viewpagerId);
            viewPager.setOffscreenPageLimit(3);
//            this.viewPager.setId(Id++);
//            viewPager.setAdapter(MainActivity.vpAdapter);

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_list_recycler_view, parent, false);
        ViewHolder holder = new ViewHolder(v);
        vpAdapter = new ViewpagerFragmentAdapter(((AppCompatActivity) context).getSupportFragmentManager(),fragments4ViewPager);
//        vpAdapter = new ViewpagerFragmentAdapter(,fragments4ViewPager);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RowModel row = rowList.get(position);
//        Toast.makeText(context, "position: " + position, Toast.LENGTH_SHORT).show();
        holder.text1.setText(row.getItemList().get(0).getText());
        Glide
                .with(context)
                .load(row.getItemList().get(0).getImageUrl())
                .into(holder.imageScreen1);

        holder.text2.setText(row.getItemList().get(1).getText());
        Glide
                .with(context)
                .load(row.getItemList().get(1).getImageUrl())
                .into(holder.imageScreen2);

        holder.text3.setText(row.getItemList().get(2).getText());
        Glide
                .with(context)
                .load(row.getItemList().get(2).getImageUrl())
                .into(holder.imageScreen3);

        Fragment1 frag1 = new Fragment1(row.getItemList().get(3).getText(), row.getItemList().get(3).getImageUrl());
        Fragment1 frag2 = new Fragment1(row.getItemList().get(4).getText(), row.getItemList().get(4).getImageUrl());
        Fragment1 frag3 = new Fragment1(row.getItemList().get(5).getText(), row.getItemList().get(5).getImageUrl());

        ArrayList<Fragment1> fragments4ViewPager = new ArrayList<>();

        if (frag1.equals(null)) {
            Toast.makeText(context, "frag1 is null", Toast.LENGTH_LONG).show();
            Log.e("Tag", "Frag1 is equal to null");
        }

        fragments4ViewPager.add(frag1);
        fragments4ViewPager.add(frag2);
        fragments4ViewPager.add(frag3);
//        final Activity activity = (Activity) context;

        holder.viewPager.setSaveFromParentEnabled(false);
        holder.viewPager.setOffscreenPageLimit(2);
        holder.viewPager.setId((position) + 1);
//        vpAdapter = new ViewpagerFragmentAdapter(((AppCompatActivity) context).getSupportFragmentManager(), fragments4ViewPager);
//        vpAdapter = new ViewpagerFragmentAdapter(frag1.getChildFragmentManager(), fragments4ViewPager);
        vpAdapter.fragments = fragments4ViewPager;
        vpAdapter.notifyDataSetChanged();

        holder.viewPager.setAdapter(vpAdapter);
//        holder.viewPager.setAdapter(MainActivity.vpAdapter);
    }

    @Override
    public int getItemCount() {
        return rowList.size();
    }
}