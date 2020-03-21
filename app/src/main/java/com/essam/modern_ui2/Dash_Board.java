package com.essam.modern_ui2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Dash_Board extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash__board);
        List<String> date = new ArrayList<>();
        List<String> posts = new ArrayList<>();
        List<Integer> imgs = new ArrayList<>();
        imgs.add(R.drawable.hassan);
        imgs.add(R.drawable.abdulla);
        imgs.add(R.drawable.soso);
        imgs.add(R.drawable.salah);
        imgs.add(R.drawable.hosny);
        imgs.add(R.drawable.fathy);

        posts.add("How to add menu item badge to Android Component Navigation in Kotlin");
        posts.add("How to add menu item badge to Android Component Navigation in JAVA");
        posts.add("How to add menu item badge to Android Component Navigation in Kotlin");
        posts.add("How to add menu item badge to Android Component Navigation in Kotlin");
        posts.add("How to add menu item badge to Android Component Navigation in Kotlin");
        posts.add("How to add menu item badge to Android Component Navigation in Kotlin");
        date.add("Mar 21,2020");
        date.add("Mar 21,2020");
        date.add("Mar 21,2020");
        date.add("Mar 21,2020");
        date.add("Mar 21,2020");
        date.add("Mar 21,2020");


        Adapter adapter = new Adapter(imgs, date, posts);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
