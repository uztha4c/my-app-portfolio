package com.uztha4c.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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

    /** Called when the user touches the button */
    public void spodifyStreamer(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Spodify Streamer App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void scoresApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Scores App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void libraryApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Library App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void buildItBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void xyzReader(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my XYZ Reader App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void capstoneApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
