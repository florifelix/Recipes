package com.jens.recipes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

public class CakesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakes);

        final Button eierlikörButton = findViewById(R.id.buttonEierlikör);
        eierlikörButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(CakesActivity.this, AdvocaatActivity.class);
            startActivity(gotoSecond);
        });

        final Button abgeriebenerButton = findViewById(R.id.buttonAbgeriebener);
        abgeriebenerButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(CakesActivity.this, PoundCakeActivity.class);
            startActivity(gotoSecond);
        });

        final Button roastedalmondsButton = findViewById(R.id.buttonRoastedAlmonds);
        roastedalmondsButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(CakesActivity.this, RoastedAlmondsActivity.class);
            startActivity(gotoSecond);
        });

        final Button sweetandsourpumpkinButton = findViewById(R.id.buttonSweetandSourPumpkin);
        sweetandsourpumpkinButton.setOnClickListener(view -> {
            Intent gotoSecond = new Intent(CakesActivity.this, SweetandSourPumpkinActivity.class);
            startActivity(gotoSecond);
        });

        ActionBar sab = getSupportActionBar();
        if (sab != null) {
            sab.setDisplayHomeAsUpEnabled(true);
            sab.setTitle("Kuchen");
        }
    }
}