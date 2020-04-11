package com.example.counterstrikeapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Weapon_List_CT extends AppCompatActivity {
    RecyclerView rcycview;
    String weapon_ct[] = {"M416"};
    int weapon_img[] = {R.drawable.ct_weapon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon__list__c_t);

        rcycview = findViewById(R.id.rcycview);

        RecycleAdapterCT myAdapter = new RecycleAdapterCT(this, weapon_ct, weapon_img);
        rcycview.setAdapter(myAdapter);
        rcycview.setLayoutManager(new LinearLayoutManager(this));

    }
}
