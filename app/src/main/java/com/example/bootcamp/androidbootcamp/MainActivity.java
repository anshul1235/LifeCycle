package com.example.bootcamp.androidbootcamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    public static final String TAG = "MainActivity";
    public static final String ON_START = "onStart";
    public static final String ON_RESUME = "onResume";
    public static final String ON_PAUSE = "onPause";
    public static final String ON_STOP = "onStop";
    public static final String ON_RESTART = "onRestart";
    public static final String ON_DESTROY = "onDestroy";

    private Button mActivityTwoButton;
    private EditText mEditText1, mEditText2, mEditText3;


    private void initialiseViews() {
        mActivityTwoButton = (Button) findViewById(R.id.activity_button);
        mEditText1 = (EditText) findViewById(R.id.edit_text1);
        mEditText2 = (EditText) findViewById(R.id.edit_text2);
        mEditText3 = (EditText) findViewById(R.id.edit_text3);
    }

    private void setListeners() {
        mActivityTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityTwoIntent = new Intent(MainActivity.this, ActivityTwo.class);
                /**
                 * passing values as key value pair to another activity through intent
                 */
                activityTwoIntent.putExtra("value1", mEditText1.getText().toString());
                activityTwoIntent.putExtra("value2", mEditText2.getText().toString());
                activityTwoIntent.putExtra("value3", mEditText3.getText().toString());

                /**
                 * startActivity will run the second activity
                 */
                startActivity(activityTwoIntent);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiseViews();
        setListeners();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, ON_START);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, ON_RESUME);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, ON_PAUSE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, ON_STOP);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, ON_RESTART);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, ON_DESTROY);
    }

// if we rename all the methods

//    onCreateAndPrepareToDisplay()   [instead of onCreate() ]
//    onPrepareToDisplay()            [instead of onRestart() ]
//    onVisible()                     [instead of onStart() ]
//    onBeginInteraction()            [instead of onResume() ]
//    onPauseInteraction()            [instead of onPause() ]
//    onInvisible()                   [instead of onStop]
//    onDestroy()                     [no change]

}
