package com.example.counterstrikeapk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdapterCT extends RecyclerView.Adapter<RecycleAdapterCT.ViewHolderCT> {

    String[] named;
    int[] images;
    Context context;
    public RecycleAdapterCT(Context c, String[] weapon_ct, int[] weapon_img){
        context = c;
        named = weapon_ct;
        images = weapon_img;
    }
    @NonNull
    @Override
    public ViewHolderCT onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_weapon_all, parent, false);
        return new ViewHolderCT(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCT holder, int position) {
        holder.name_weapon.setText(named[position]);
        holder.image_weapon.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolderCT extends RecyclerView.ViewHolder{
        TextView name_weapon;
        ImageView image_weapon;
        public ViewHolderCT(@NonNull View view) {
            super(view);
            name_weapon = view.findViewById(R.id.name_weapon);
            image_weapon = view.findViewById(R.id.image_weapon);
        }
    }
}
