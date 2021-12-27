package com.jens.recipes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        final Button eierlikörButton = findViewById(R.id.buttonEierlikör);
        eierlikörButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(DessertsActivity.this, EierlikörActivity.class);
            startActivity(gotoSecond);
        });

        final Button abgeriebenerButton = findViewById(R.id.buttonAbgeriebener);
        abgeriebenerButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(DessertsActivity.this, AbgeriebenerActivity.class);
            startActivity(gotoSecond);
        });

        ActionBar sab = getSupportActionBar();
        if (sab != null) {
            sab.setDisplayHomeAsUpEnabled(true);
        }
    }
}