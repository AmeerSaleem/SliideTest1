package com.example.sliidetest1.ViewPagerFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.sliidetest1.R;

public class Fragment1 extends Fragment {

    String text;
    String imageUrl;
    TextView fragmentText;
    ImageView fragmentImage;

    public Fragment1() {
        super();
    }

    public Fragment1(String text, String imageUrl) {
        this.text = text;
        this.imageUrl = imageUrl;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.viewpager_fragment1,container,false);
        fragmentText = (TextView) v.findViewById(R.id.fragment_text);
        fragmentImage = (ImageView) v.findViewById(R.id.fragment_image_view);

        fragmentText.setText(text);

        Glide
                .with(getContext())
                .load(imageUrl)
                .into(fragmentImage);

        return v;
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//
//    }

    public TextView getFragmentText() {
        return fragmentText;
    }

    public void setFragmentText(String text) {
        fragmentText.setText(text);
    }

    public ImageView getFragmentImage() {
        return fragmentImage;
    }

    public void setFragmentImage(ImageView fragmentImage) {
        this.fragmentImage = fragmentImage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
