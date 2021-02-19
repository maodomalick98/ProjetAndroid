package com.example.projetandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class StudentsInfo extends EpsiActivity {

    public static void displayActivity(EpsiActivity activity,String url,String title, String email, String name, String groupe){
        Intent intent = new Intent(activity,StudentsInfo.class);
        intent.putExtra("url",url);
        intent.putExtra("title",title);
        intent.putExtra("email",email);
        intent.putExtra("name",name);
        intent.putExtra("groupe",groupe);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_info);
        String url = getIntent().getExtras().getString("url","");
        String title = getIntent().getExtras().getString("title","");
        String email = getIntent().getExtras().getString("email","");
        String name = getIntent().getExtras().getString("name","");
        String groupe = getIntent().getExtras().getString("groupe","");


        setTitle(title);
        showBack();
        ImageView imageView = findViewById(R.id.image);
        Picasso.get().load(url).into(imageView);
        TextView textView = findViewById(R.id.textViewName);
        textView.setText("Nom prénom : " +title  + " " + name);
        TextView textEmail = findViewById(R.id.textViewInfo);
        textEmail.setText("Email : " + email);
        TextView infos = findViewById(R.id.textViewEmail);
        infos.setText("Infos : " + "Etudiant");
        TextView groupeView = findViewById(R.id.textViewGroup);
        groupeView.setText("Groupe : " +groupe);

    }
}