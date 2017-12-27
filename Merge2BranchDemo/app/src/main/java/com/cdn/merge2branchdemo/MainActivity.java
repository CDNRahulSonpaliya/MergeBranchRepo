package com.cdn.merge2branchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //changing main-activity from Branch-B
        Toast.makeText(this, "toast in main-activity of branch B", Toast.LENGTH_SHORT).show();
    }
}
