package com.example.projetandroid1;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BoissonAdapter extends RecyclerView.Adapter<BoissonAdapter.ViewHolder>{

    private ArrayList<BoissonsData> boissons;
    private EpsiActivity activity;

    public BoissonAdapter(EpsiActivity activity, ArrayList<BoissonsData> bois){
        this.activity=activity;
        this.boissons=bois;
    }

    @NonNull
    @Override
    public BoissonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cell_produits, viewGroup, false);
        return new BoissonAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BoissonAdapter.ViewHolder holder, int position) {
        BoissonsData boisson = boissons.get(position);
        holder.getTextViewName().setText(boisson.getName());
        holder.getViewDes().setText(boisson.getDes().substring(0,30));
        Picasso.get().load(boisson.getPict()).into(holder.getImage());
        holder.getLayoutCell().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProduitsInfo.displayActivity(activity,boisson.getName(),boisson.getPict(),boisson.getDes());
            }
        });
    }

    @Override
    public int getItemCount() {
        return boissons.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewName;
        private final View layoutCell;
        private final TextView description;
        private final ImageView image;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            textViewName = view.findViewById(R.id.textViewName);
            layoutCell = view.findViewById(R.id.layoutCell);
            description = view.findViewById(R.id.textViewDescription);
            image = view.findViewById(R.id.imageViewProduit);
        }

        public View getLayoutCell() {
            return layoutCell;
        }
        public TextView getTextViewName() {
            return textViewName;
        }
        public TextView getViewDes() {return description;}
        public ImageView getImage() {return image;}
    }
}