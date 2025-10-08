package com.example.a2_views;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button stopButton;
    Button startButton;
    Button googleButton;
    Button callButton;
    Button finishButton;
    Button mediaButton;

    Button viewsButton;
    Button textButton;

    Button calculatorButton;

    Button buttonButton;

    Button albumButton;

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

        stopButton = (Button)findViewById(R.id.stopButton);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Stop button pressed", Toast.LENGTH_SHORT).show();
            }
        });

        startButton = (Button)findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Start button pressed", Toast.LENGTH_SHORT).show();
            }
        });

        googleButton = (Button)findViewById(R.id.googleButton);
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                startActivity(mlntent);
            }
        });

        callButton = (Button)findViewById(R.id.callButton);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/011"));
                startActivity(mIntent);
            }
        });

        mediaButton = (Button)findViewById(R.id.mediaButton);
        mediaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });

        finishButton = (Button)findViewById(R.id.finishButton);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        viewsButton = (Button)findViewById(R.id.viewsButton);
        viewsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentLayout, new ViewsFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        textButton = (Button)findViewById(R.id.textButton);
        textButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentLayout, new TextFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        calculatorButton = (Button)findViewById(R.id.calculatorButton);
        calculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentLayout, new CalculatorFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        buttonButton = (Button)findViewById(R.id.buttonButton);
        buttonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentLayout, new ButtonFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        albumButton = (Button)findViewById(R.id.albumButton);
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v)
            {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentLayout, new AlbumFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}