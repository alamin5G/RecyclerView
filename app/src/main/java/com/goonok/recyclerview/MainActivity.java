package com.goonok.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.goonok.recyclerview.adapter.CustomAdapterRecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> arrayListString = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewID);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayListString.add("Apple");
        arrayListString.add("Banana");
        arrayListString.add("Cherries");
        arrayListString.add("Date");
        arrayListString.add("Elderberry");
        arrayListString.add("Fig");
        arrayListString.add("Grape");
        arrayListString.add("Huckleberry");
        arrayListString.add("Jackfruit");
        arrayListString.add("Kumquat");
        arrayListString.add("Lemon ");
        arrayListString.add("Mango");
        arrayListString.add("Orange");
        arrayListString.add("Papaya");
        arrayListString.add("Tomato ");
        arrayListString.add("Watermelon");
        arrayListString.add("Lichi");
        arrayListString.add("Jam");

        CustomAdapterRecyclerView customAdapterRecyclerView = new CustomAdapterRecyclerView(getApplicationContext(), arrayListString);
        recyclerView.setAdapter(customAdapterRecyclerView);

        


    }
}