package com.sahidalmas.chathead;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null && bundle.getString("LAUNCH").equals("YES")) {
            startService(new Intent(MainActivity.this, ChatHead.class));
        }

        Button launch = (Button)findViewById(R.id.button);
        launch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startService(new Intent(MainActivity.this, ChatHead.class));
            }
        });

        Button stop = (Button)findViewById(R.id.button2);
        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopService(new Intent(MainActivity.this, ChatHead.class));
            }
        });

    }


    @Override
    protected void onResume() {
        Bundle bundle = getIntent().getExtras();

        if(bundle != null && bundle.getString("LAUNCH").equals("YES")) {
            startService(new Intent(MainActivity.this, ChatHead.class));
        }
        super.onResume();
    }
}
