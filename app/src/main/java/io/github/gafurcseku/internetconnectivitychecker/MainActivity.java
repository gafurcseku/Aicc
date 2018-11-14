package io.github.gafurcseku.internetconnectivitychecker;


import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if(NetworkUtil.isConnected(this)){
            /// Connection is Available
        }else{
            /// Connection is not Available
        }

        NetworkUtil.openSettings(this);
    }
}
