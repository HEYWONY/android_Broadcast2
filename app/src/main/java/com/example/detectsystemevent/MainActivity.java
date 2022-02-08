package com.example.detectsystemevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver mReceiver;
    private IntentFilter mFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mReceiver = new MyReceiver2();
        mFilter = new IntentFilter(Intent.ACTION_HEADSET_PLUG);
    }
    @Override
    protected void onStart() { //무언가 행위가 있을 때 Start가 된다. 행위를 이벤트로 감지함.
        super.onStart();
        registerReceiver(mReceiver, mFilter);
    }
    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(mReceiver);
    }
}
