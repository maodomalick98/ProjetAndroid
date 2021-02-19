package com.example.projetandroid1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategorieAdapter extends RecyclerView.Adapter<CategorieAdapter.ViewHolder>{

    private ArrayList<CategoriesData> students;
    private EpsiActivity activity;

    public CategorieAdapter(EpsiActivity activity, ArrayList<CategoriesData> students){
        this.activity=activity;
        this.students=students;
    }

    @NonNull
    @Override
    public CategorieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cell_student, viewGroup, false);
        return new CategorieAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategorieAdapter.ViewHolder holder, int position) {
        CategoriesData student=students.get(position);
        holder.getTextViewName().setText(student.getTitle());
        holder.getLayoutCell().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // StudentsInfo.displayActivity(activity,student.getUrl(),student.getName(), student.getEmail(), student.getName2()
                   //     , student.getGroupe());
            }
        });
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewName;
        private final View layoutCell;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            textViewName = view.findViewById(R.id.textViewName);
            layoutCell = view.findViewById(R.id.layoutCell);
        }

        public View getLayoutCell() {
            return layoutCell;
        }
        public TextView getTextViewName() {
            return textViewName;
        }
    }
}