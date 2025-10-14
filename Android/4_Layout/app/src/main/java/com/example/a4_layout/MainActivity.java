package com.example.a4_layout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnLinear;
    Button btnWeight;
    Button btnNesting;

    Button btnCode;
    Button btnRelative;

    Button btnTable;

    Button btnRelative2;
    Button btnCalc;

    FrameLayout flMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnLinear = (Button)findViewById(R.id.btnLinear);
        btnLinear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.flMain, new LinearFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        btnWeight = (Button)findViewById(R.id.btnWeight);
        btnWeight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.flMain, new WeightFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        btnNesting = (Button)findViewById(R.id.btnNesting);
        btnNesting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.flMain, new NestingFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        btnCode = (Button)findViewById(R.id.btnCode);
        btnCode.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.flMain, new CodeFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        btnRelative = (Button)findViewById(R.id.btnRelative);
        btnRelative.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.flMain, new RelativeFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        btnRelative2 = (Button)findViewById(R.id.btnRelative2);
        btnRelative2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.flMain, new Relative2Fragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        btnTable = (Button)findViewById(R.id.btnTable);
        btnTable.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.flMain, new TableFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        btnCalc = (Button)findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.flMain, new CalcFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}