package com.example.admin.animations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
