package com.example.gpt_call.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.gpt_call.R;

public class CallingScreen extends AppCompatActivity {
    private ImageView end_call_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling_screen);
        end_call_btn=findViewById(R.id.endCallBtn);
        end_call_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CallingScreen.this, "Here", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}