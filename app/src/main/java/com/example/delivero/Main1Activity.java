package com.example.delivero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main1Activity extends AppCompatActivity {
    Button open;
    Button openSinIn;
    Button call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        open = findViewById(R.id.openBtn);
        openSinIn = findViewById(R.id.signInBtn);
        call = findViewById(R.id.calling);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(open);
            }
        });
        openSinIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signIn = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(signIn);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri telNumber = Uri.parse("tel:691951267");
                Intent callNumber = new Intent(Intent.ACTION_DIAL, telNumber);
                startActivity(callNumber);
            }
        });

    }

  //  Intent open = new Intent(getApplicationContext(), Main1Activity.class);
    //startActivity.;

}