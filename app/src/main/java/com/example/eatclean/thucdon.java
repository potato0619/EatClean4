package com.example.eatclean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class thucdon extends AppCompatActivity {
    private ListView lvthucdon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thucdon);
         lvthucdon=findViewById(R.id.lvthucdon);
    }
}
