# DispMov-TP5-Broadcast
En en un nuevo proyecto, desarrollar la siguiente consigna, luego sube a GitHub el proyecto y envíe por esta tarea el link a dicho repositorio.
Consigna para la actividad a desarrollar:
Crear una app que haga uso de un BroadcastReceiver dinámico, que:  Se accione cuando el dispositivo se conecte a una red WIFI realizando una llamada al nro. 2664553747 .

Datos adicionales:
Permiso necesario para realizar la llamada.
<uses-permission android:name="android.permission.CALL_PHONE"/>
 Acción a capturar para el Broadcast
"android.net.wifi.supplicant.CONNECTION_CHANGE"
Intent para iniciar Activity de LLamadas:
Intent.ACTION_CALL
