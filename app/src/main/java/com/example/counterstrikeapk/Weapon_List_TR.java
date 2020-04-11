package com.example.counterstrikeapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Weapon_List_TR extends AppCompatActivity {
    RecyclerView rcycviewtr;
    String weapon_tr[] = {"AK47"};
    int weapon_img[] = {R.drawable.tr_weapon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon__list__t_r);

        rcycviewtr = findViewById(R.id.rcycviewtr);

        RecycleAdapterTR myAdapter = new RecycleAdapterTR(this, weapon_tr, weapon_img);
        rcycviewtr.setAdapter(myAdapter);
        rcycviewtr.setLayoutManager(new LinearLayoutManager(this));

    }
}
