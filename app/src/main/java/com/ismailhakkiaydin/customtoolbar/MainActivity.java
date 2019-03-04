package com.ismailhakkiaydin.customtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            toolbar.setElevation(5f);
        }
        */

        Toolbar toolbar= findViewById(R.id.toolbar);

       /* setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Merhaba");

        getSupportActionBar().setSubtitle("Alt başlık");*/
        toolbar.setTitle("Merhaba");
        toolbar.setSubtitle("Alt başlık");

        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String mesaj="";

                switch (item.getItemId()){

                    case R.id.ara:
                        mesaj="ARA TIKLANDI";
                        break;
                    case R.id.sil:
                        mesaj="SİL TIKLANDI";
                        break;
                    case R.id.duzenle:
                        mesaj="DÜZENLE TIKLANDI";
                        break;
                    case R.id.ayarlar:
                        mesaj="AYARLAR TIKLANDI";
                        break;
                    case R.id.cikis:
                        mesaj="ÇIKIŞ TIKLANDI";
                        break;

                }
                Toast.makeText(MainActivity.this, mesaj, Toast.LENGTH_LONG).show();

                return true;

            }
        });
    }
}
