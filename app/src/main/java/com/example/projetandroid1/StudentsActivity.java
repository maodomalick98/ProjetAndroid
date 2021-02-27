package com.example.projetandroid1;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class StudentsActivity extends EpsiActivity {

    ArrayList<Students> students;
    StudentAdapter studentAdapter;
    RecyclerView recyclerView;
    public static void displayActivity(EpsiActivity activity){
        Intent intent = new Intent(activity, com.example.projetandroid1.StudentsActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        setTitle("Infos");
        showBack();
        recyclerView=findViewById(R.id.recyclerView);
        students = new ArrayList<>();
        try {

            JSONObject jsonObject=new JSONObject(Data.allData);
            JSONArray jsonItems=jsonObject.getJSONArray("items");
            for (int i=0;i<jsonItems.length();i++){
                Students student=new Students(jsonItems.getJSONObject(i));
                students.add(student);
            }

            studentAdapter= new StudentAdapter(this,students);


            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(studentAdapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}