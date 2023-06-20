package com.netwerkapp.game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.netwerkapp.MainActivity;
import com.netwerkapp.R;

import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        recyclerView = findViewById(R.id.game_recyclerview);

        List<User> users = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            users.add(new User( (int) (Math.random() * 10000) + ""));
        }

        GameRecyclerviewAdapter adapter = new GameRecyclerviewAdapter(recyclerView, users);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}