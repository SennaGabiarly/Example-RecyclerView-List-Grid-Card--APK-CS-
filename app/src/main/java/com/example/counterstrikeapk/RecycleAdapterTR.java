package com.example.counterstrikeapk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdapterTR extends RecyclerView.Adapter<RecycleAdapterTR.ViewHolderTR> {

    String[] named;
    int[] images;
    Context context;
    public RecycleAdapterTR(Context c, String[] weapon_tr, int[] weapon_img){
        context = c;
        named = weapon_tr;
        images = weapon_img;
    }
    @NonNull
    @Override
    public ViewHolderTR onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_weapon_all, parent, false);
        return new ViewHolderTR(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTR holder, int position) {
        holder.name_weapon.setText(named[position]);
        holder.image_weapon.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolderTR extends RecyclerView.ViewHolder{
        TextView name_weapon;
        ImageView image_weapon;
        public ViewHolderTR(@NonNull View view) {
            super(view);
            name_weapon = view.findViewById(R.id.name_weapon);
            image_weapon = view.findViewById(R.id.image_weapon);
        }
    }
}
