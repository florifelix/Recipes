package com.jens.recipes;

import android.os.Bundle;
import android.widget.TextView;

import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SweetandSourPumpkinActivity extends RecipeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView titleView = findViewById(R.id.title);
        titleView.setText("Kürbis Süß-Sauer");

        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = findViewById(R.id.pager);
        FragmentStateAdapter pagerAdapter = new ScreenSlidePagerAdapter(this,
                R.drawable.dorade111,
                "sweetandSourPumpkinIngredients.html",
                "sweetandSourPumpkinRecipe.html"
        );
        viewPager.setAdapter(pagerAdapter);
        //viewPager.setPageTransformer(new ZoomOutPageTransformer());
        // TabSlider can only be set after adapter is set to viewpager
        createTabSlider();
    }
}