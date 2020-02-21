package com.example.orb_tfeat;

import android.content.Intent;
import android.os.Bundle;

import com.example.orb_tfeat.orb.ORBMatchingActivity;
import com.example.orb_tfeat.tfeat.TFeatListActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_orb_click_view).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ORBMatchingActivity.class)));
        findViewById(R.id.main_tfeat_click_view).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TFeatListActivity.class)));
    }
}
