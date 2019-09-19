package com.example.sliidetest1.ModelClasses;

import android.content.ClipData;

import java.util.ArrayList;

public class RowModel {

    ArrayList<ItemModel> itemList;

    public RowModel() {
        itemList = new ArrayList<>();
    }

    public RowModel(ArrayList<ItemModel> itemList) {
        this.itemList = itemList;
    }

    public ArrayList<ItemModel> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<ItemModel> itemList) {
        this.itemList = itemList;
    }
}
