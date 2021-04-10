package com.example.recyclerviewviewtype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList = new ArrayList<>();
    String[] data = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        MyAdapter myAdapter = new MyAdapter(this, getData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(myAdapter);
    }

    private ArrayList<ModelClass> getData() {
        arrayList.add(new ModelClass(ModelClass.TYPE_NAME, data[0], 0));
        arrayList.add(new ModelClass(ModelClass.TYPE_NAME, data[1], 0));
        arrayList.add(new ModelClass(ModelClass.TYPE_IMAGE, data[2], R.drawable.ic_android_green));

        arrayList.add(new ModelClass(ModelClass.TYPE_NAME, data[3], 0));
        arrayList.add(new ModelClass(ModelClass.TYPE_NAME, data[4], 0));
        arrayList.add(new ModelClass(ModelClass.TYPE_IMAGE, data[5], R.drawable.ic_android_green));

        arrayList.add(new ModelClass(ModelClass.TYPE_NAME, data[6], 0));
        arrayList.add(new ModelClass(ModelClass.TYPE_NAME, data[7], 0));
        arrayList.add(new ModelClass(ModelClass.TYPE_NAME, data[8], 0));

        return arrayList;
    }
}