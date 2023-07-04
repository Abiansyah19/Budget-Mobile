package com.habibfr.budget_buddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

public class HomeActivity extends AppCompatActivity {

    FrameLayout frameTambahTransaksi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        frameTambahTransaksi=findViewById(R.id.frameStackplus);

        frameTambahTransaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, FormActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}