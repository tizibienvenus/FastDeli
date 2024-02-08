
package com.example.delivero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView txtSignUp;
    TextView btnSignIn;
    private ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        txtSignUp = findViewById(R.id.txtSignUp);
        myImageView = findViewById(R.id.imgId);

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float currentAlpha = myImageView.getAlpha();

                // Basculez entre 0 et 1
                float newAlpha = (currentAlpha == 0f) ? 1f : 0f;

                // Appliquer la nouvelle opacité à l'image
                myImageView.setAlpha(newAlpha);
                //Toast.makeText(getApplicationContext(), "Tizi Bienvenus", Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();*/
            }
        });
    }
}