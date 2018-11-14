package io.github.gafurcseku.internetconnectivitychecker;


import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if(NetworkUtil.isConnected(this)){
            Toast.makeText(this,"Connected", Toast.LENGTH_LONG).show();
        }else{
            NetworkUtil.openSettings(this);
        }
    }
}
