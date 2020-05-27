package com.example.starbuzzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID = "drinkID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkID = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkID];

        TextView name = (TextView) findViewById(R.id.tv_drink_name);
        name.setText(drink.getName());

        TextView description = (TextView) findViewById(R.id.tv_drink_desc);
        description.setText(drink.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.iv_drink);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}
