package com.jamaalscarlett.dpntester.nokindle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.jamaalscarlett.dpntester.R;
public class MainActivity extends AppCompatActivity {
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    String TAG = "LoginActiviy-Trace";
    SharedPreferences sharedPreferences;
    String tempToken;
    private BroadcastReceiver mRegistrationBroadcastReceiver;
    private BroadcastReceiver msgReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.the_text_view);
        textView.setText("No Kindle Hello World");
        Log.d("JES", "JES No Kindle Product Flavour");

        mRegistrationBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Log.i("JES", "RECEIVER RESPONSE!");

            }
        };

        Intent intent =
                new Intent(getApplicationContext(), RegistrationIntentService.class);
        startService(intent);
    }
}
