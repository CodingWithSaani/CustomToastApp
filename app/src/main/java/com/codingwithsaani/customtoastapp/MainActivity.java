package com.codingwithsaani.customtoastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void customToast(View view)
    {
        //Step 1 - Create XML File
        //Step 2 - Create object of LayoutInflater class
        //Step 3 - Call the inflate method
        //Step 4 - Create Toast object
        //Step 5 - Adding Custom Properties to Toast object
        //Step 6 - Attaching view to Toast object
        //Step 7 - Showing the custom Toast

        LayoutInflater objectLayoutInflater=getLayoutInflater();
        View customToastLayout=objectLayoutInflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.CT_RL));

        Toast objectToast=new Toast(this);
        objectToast.setDuration(Toast.LENGTH_LONG);

        objectToast.setGravity(Gravity.CENTER,0,0);
        objectToast.setView(customToastLayout);

        objectToast.show();
    }
}