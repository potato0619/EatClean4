package com.example.eatclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lntracuu,lnThucdon,lnmythucdon,lnbaitap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        even();
    }
    public void anhxa(){
        lntracuu=findViewById(R.id.lntracuu);
        lnThucdon=findViewById(R.id.lnThucdon);
        lnmythucdon=findViewById(R.id.lnmythucdon);
        lnbaitap=findViewById(R.id.lnmythucdon);
    }
    public void even(){
        lntracuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Tra_Cuu.class));

            }
        });
        lnThucdon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, thucdon.class));
            }
        });
        lnmythucdon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,thucdoncuatoi.class));
            }
        });
        lnbaitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, baitap.class));
            }
        });


    }
}


