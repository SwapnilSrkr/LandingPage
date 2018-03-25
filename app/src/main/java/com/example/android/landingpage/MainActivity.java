package com.example.android.landingpage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void link(View view) {
        Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://s000.tinyupload.com/?file_id=22761914212878649542"));
        startActivity(websiteIntent);
    }
}