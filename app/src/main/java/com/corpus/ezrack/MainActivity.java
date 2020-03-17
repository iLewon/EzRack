package com.corpus.ezrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hellowordTxtbox, lastnameTxtbox;
        String helloworld, lastname;

        Button pislitanan;

        helloworld = "Hello MCM!";
        lastname = "Tabingo";

//        System.out.println(helloworld);
//        System.out.println(lastname);

        pislitanan = findViewById(R.id.button);
        hellowordTxtbox = findViewById(R.id.helloworld_txt);
        lastnameTxtbox = findViewById(R.id.lastname_txt);

        hellowordTxtbox.setText(helloworld);
        lastnameTxtbox.setText("My name is Mr. "+lastname);
    }
}
