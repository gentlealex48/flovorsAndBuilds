package com.example.admin.animations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvBlinking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(BuildConfig.FLAVOR.equals("flavor")) {
            tvBlinking = findViewById(R.id.tvActivity1);
            tvBlinking.setText("flavor");
        }
        if(BuildConfig.FLAVOR.equals("flavor2")) {
            tvBlinking = findViewById(R.id.tvActivity1);
            tvBlinking.setText("flavor2");
        }

    }

    public void OnClick(View view) {
        switch (view.getId()) {
            case R.id.btnActivity1:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btnActivity2:
                startActivity(new Intent(this, Main2Activity.class));
                break;
        }
    }
}
