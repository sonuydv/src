package com.sonu.vocabprogress;

import android.app.*;
import android.os.*;
import androidx.appcompat.app.*;

public class MainActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		//Removing divider between actionbar and layout
		getSupportActionBar().setElevation(0);
    }
}