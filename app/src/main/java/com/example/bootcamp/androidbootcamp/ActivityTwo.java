package com.example.bootcamp.androidbootcamp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ActivityTwo extends Activity {

    public static final String TAG = "ActivityTwo";

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_two);

        initialiseViews();

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("value1");
        String value2 = intent.getStringExtra("value2");
        String value3 = intent.getStringExtra("value3");

        mTextView.setText(value1+" "+value2+" "+value3);
        mTextView.setPaintFlags(mTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

    }

    private void initialiseViews(){
        mTextView = (TextView) findViewById(R.id.textview);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, MainActivity.ON_START);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, MainActivity.ON_RESUME);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, MainActivity.ON_PAUSE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, MainActivity.ON_STOP);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, MainActivity.ON_RESTART);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, MainActivity.ON_DESTROY);
    }

}
