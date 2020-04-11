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
import android.widget.ListView;
import android.widget.TextView;

public class CT_Activity extends AppCompatActivity {
    ListView listrow;
    String role_list[] = {"Weapon", "Character"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_t_);

        // ListView
        listrow = findViewById(R.id.list_ct);
        RoleAdapter listroleadapter = new RoleAdapter(this, role_list);
        listrow.setAdapter(listroleadapter);

        listrow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(view.getContext(), Weapon_List_CT.class);
                    startActivityForResult(intent, 0);
                }
                if (i == 1) {
                    Intent intent = new Intent(view.getContext(), Char_list_CT.class);
                    startActivityForResult(intent, 1);
                }
            }
        });

    }

    class RoleAdapter extends ArrayAdapter<String> {
        Context context;
        String rrole_list[];

        RoleAdapter(Context c, String title[]) {
            super(c, R.layout.row_all, R.id.txt_row_list, title);
            this.context = c;
            this.rrole_list = title;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflaterRole = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row_all = layoutInflaterRole.inflate(R.layout.row_all,parent,false);
            TextView text = row_all.findViewById(R.id.txt_row_list);

            text.setText(rrole_list[position]);

            return row_all;
        }
    }
}

