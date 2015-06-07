package com.example.android.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void buttonOnClick(View v) {
        Button button = (Button) v;
        String toastStr = "This button will launch my ";
        if (button.getText().equals("SPOTIFY STREAMER")) {
            toastStr += "Spotify Streamer";
        }
        else if (button.getText().equals("SCORES APP")) {
            toastStr += "Scores App";
        }
        else if (button.getText().equals("LIBRARY APP")) {
            toastStr += "Library APP";
        }
        else if (button.getText().equals("BUILD IT BIGGER")) {
            toastStr += "Build It Bigger App";
        }
        else if (button.getText().equals("XYZ READER")) {
            toastStr += "XYZ Reader App";
        }
        else if (button.getText().equals("CAPSTONE: MY OWN APP")) {
            toastStr += "Capstone App";
        }
        else {
            toastStr += "INVALID APP";
        }
        Toast.makeText(MainActivity.this, toastStr,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
