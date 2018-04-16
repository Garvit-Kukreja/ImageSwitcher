package com.example.garvit.imageswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void SwitchImage(View view)
    {
        Log.i("bb","Button Pressed");
        Toast.makeText(this, "SwatCat", Toast.LENGTH_SHORT).show();
        ImageView image = (ImageView) findViewById(R.id.SwatCatImageView);
        image.setImageResource(R.drawable.tomje);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
