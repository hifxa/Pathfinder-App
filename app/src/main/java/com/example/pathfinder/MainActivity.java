package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void secondAct(View view)
    {
        Intent intent = new Intent(getApplicationContext(),signup.class);
        startActivity(intent);
    }
    public void OpenNav(View view)
    {
        Intent intent = new Intent(getApplicationContext(),home.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
