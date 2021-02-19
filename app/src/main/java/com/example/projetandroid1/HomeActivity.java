package com.example.projetandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends EpsiActivity implements View.OnClickListener {

    public static void displayActivity(EpsiActivity activity){
        Intent intent = new Intent(activity,HomeActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.buttonZone1).setOnClickListener(this);
        findViewById(R.id.buttonZone2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonZone1:
                StudentsActivity.displayActivity(this);
                break;
            case R.id.buttonZone2:
               Categories.displayActivity(this);
                break;
        }
    }
}