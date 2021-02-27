package com.example.projetandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ProduitsInfo extends EpsiActivity {

    public static void displayActivity(EpsiActivity activity,String name, String url,String description){
        Intent intent = new Intent(activity,ProduitsInfo.class);
        intent.putExtra("name", name);
        intent.putExtra("url",url);
        intent.putExtra("description",description);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produit_info);
        String name = getIntent().getExtras().getString("name","");
        String url = getIntent().getExtras().getString("url","");
        String title = getIntent().getExtras().getString("description","");


        setTitle(name);
        showBack();
        ImageView imageView = findViewById(R.id.imageProduit);
        Picasso.get().load(url).into(imageView);
        TextView textView = findViewById(R.id.Description);
        textView.setText("Description :  " + title);


    }
}