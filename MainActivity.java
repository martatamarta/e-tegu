package com.example.triinoper.e_tegu.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView notifications;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);

        notifications = (TextView)findViewById(R.id.textView7);
        notifications.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id = R.id.textView7){
            Intent notificationsIntent = new Intent(MainActivity.this,NotificationsActivity.class);
            MainActivity.this.startActivity(notificationsIntent);
        }

    }
}
