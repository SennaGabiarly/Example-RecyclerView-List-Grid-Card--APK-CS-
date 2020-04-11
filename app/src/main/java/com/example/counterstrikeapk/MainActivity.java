package com.example.counterstrikeapk;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String grid_role[] = {"CT", "TR"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ScrollView
        ScrollView mainscroll = (ScrollView) findViewById(R.id.scroll_utama);

        mainscroll.setFocusableInTouchMode(true);
        mainscroll.setDescendantFocusability(ViewGroup.FOCUS_BEFORE_DESCENDANTS);

        // Gridview
        gridView = findViewById(R.id.list_view_utama);
        UtamaAdapter listutamaadapter = new UtamaAdapter(this, grid_role);
        gridView.setAdapter(listutamaadapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent = new Intent(view.getContext(),CT_Activity.class);
                    startActivityForResult(intent,0);
                }
                if (i==1){
                    Intent intent = new Intent(view.getContext(),TR_Activity.class);
                    startActivityForResult(intent,1);
                }
            }
        });

    }
    class UtamaAdapter extends ArrayAdapter<String> {
        Context context;
        String rlist_role[];

        UtamaAdapter(Context c, String title[]) {
            super(c, R.layout.row_menu_utama, R.id.txt_menu_utama, title);
            this.context = c;
            this.rlist_role = title;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflaterMain = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row_menu_utama = layoutInflaterMain.inflate(R.layout.row_menu_utama,parent,false);
            TextView text =  row_menu_utama.findViewById(R.id.txt_menu_utama);

            text.setText(rlist_role[position]);

            return row_menu_utama;
        }

    }
}
