package com.patriciasoft.tp5broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class CambioWifi extends BroadcastReceiver {
    private Context context;

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean modoWifi = intent.getBooleanExtra("connected", false);

        if (modoWifi) {
            // Modo Wifi activado
            Toast.makeText(context, "Wifi Activado, LLamando", Toast.LENGTH_LONG).show();
            Intent intentLlamada = new Intent(Intent.ACTION_CALL);
            intentLlamada.setData(Uri.parse("tel:" + "2664553747"));
            intentLlamada.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentLlamada);
        } else {
            // Modo Wifi desactivado
            Toast.makeText(context, "Wifi Desactivado, No se puede Llamar", Toast.LENGTH_LONG).show();
        }
    }
}