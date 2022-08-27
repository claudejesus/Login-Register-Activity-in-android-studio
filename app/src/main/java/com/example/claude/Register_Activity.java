package com.example.claude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Register_Activity extends AppCompatActivity {
        TextView AlreadAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        AlreadAccount=findViewById(R.id.AlreadAccount);

        AlreadAccount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(packageContext Register_Activity.this,Register_Activity.class));
            }

        });
    }
}