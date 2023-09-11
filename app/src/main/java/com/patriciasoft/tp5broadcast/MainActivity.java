package com.patriciasoft.tp5broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    private CambioWifi cw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pedirPermiso();
        registrarBroadcast();
    }
    private void registrarBroadcast(){
        this.cw = new CambioWifi();
        registerReceiver(this.cw,new IntentFilter("android.net.wifi.supplicant.CONNECTION_CHANGE"));
    }

    private void pedirPermiso() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(android.Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 2500);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.cw);
    }

}