package com.example.projetandroid1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Boisson extends EpsiActivity {

    String wsUrl="https://djemam.com/epsi/boissons.json";
    ArrayList<Students> students;
    StudentAdapter studentAdapter;
    RecyclerView recyclerView;
    public static void displayActivity(EpsiActivity activity){
        Intent intent = new Intent(activity, Boisson.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        setTitle("Boissons");
        showBack();
        recyclerView=findViewById(R.id.recyclerView);
        students = new ArrayList<>();
        studentAdapter= new StudentAdapter(this,students);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(studentAdapter);
        WSCall wsCall= new WSCall(wsUrl, new WSCall.Callback() {
            @Override
            public void onComplete(String result) {
                try {
                    JSONObject jsonObject=new JSONObject(result);
                    JSONArray jsonItems=jsonObject.getJSONArray("items");
                    for (int i=0;i<jsonItems.length();i++){
                        Students student= null;
                        student = new Students(jsonItems.getJSONObject(i));
                        students.add(student);
                    }
                    studentAdapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(Boisson.this,e.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
        wsCall.run();
    }
}