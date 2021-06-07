package com.example.bonjouraurevoir;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int NbClick=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonBonjour= findViewById(R.id.ButtonBonjour);
        Button buttonAurevoir= findViewById(R.id.ButtonAurevoir);

        TextView textView= findViewById(R.id.TextView);
        textView.setText("Argg !!");

        buttonBonjour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Comment ca va ? ");
                NbClick ++;
                if (NbClick>15) {
                    buttonBonjour.setBackgroundColor(getColor(R.color.ma_couleur_preferee01));
                }

            }
        });
        buttonAurevoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Et Bonne Soiree !");

            }
        });



    }
}