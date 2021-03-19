package com.example.soundarya_lahari_telugu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
Button button3;
Button button4;
Button button5;
Button button6;
Button button7;
Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });
    }

    public void openActivity3() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void openActivity4() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void openActivity5() {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
    public void openActivity6() {
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }

    public void openActivity7() {
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }

    public void openActivity8() {
        Intent intent = new Intent(this, Main8Activity.class);
        startActivity(intent);
    }
}
