package com.example.arunkumar.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;

/**
 * Created by LakshmiArun on 17-11-2017.
 */

public class Utility  {
    Context context;


    Utility(Context context)
    {
        this.context=context;
    }


    public void goToIntent(int num ,int check) {







    int eSlokaFormat = context.getResources().getIdentifier("esloka" + Integer.toString(num), "string", "com.example.arunkumar.myapplication");
    int sSlokaFormat = context.getResources().getIdentifier("ssloka" + Integer.toString(num), "string", "com.example.arunkumar.myapplication");
    int audioSlow = context.getResources().getIdentifier("ssloka" + Integer.toString(num), "raw", "com.example.arunkumar.myapplication");
    int audioNorm = context.getResources().getIdentifier("sloka" + Integer.toString(num), "raw", "com.example.arunkumar.myapplication");

        Sloka_data sloka_data; //= new Sloka_data();
        sloka_data = new Sloka_data(num, context.getString(eSlokaFormat), context.getString(sSlokaFormat),  audioSlow,audioNorm,check);
        Intent myIntent1 = new Intent(context, Sloka_display.class);
        myIntent1.putExtra("Sloka_data", sloka_data);
        context.startActivity(myIntent1);


    }
}
