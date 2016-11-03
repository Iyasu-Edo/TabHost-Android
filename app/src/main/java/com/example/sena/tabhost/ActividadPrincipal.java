package com.example.sena.tabhost;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActividadPrincipal extends AppCompatActivity {
    private FragmentTabHost fragment_tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);

        fragment_tab=(FragmentTabHost)findViewById(R.id.tabhost);
        fragment_tab.setup(this, getSupportFragmentManager(),R.id.tabcontent);

        fragment_tab.addTab(fragment_tab.newTabSpec("tab1").setIndicator("uno"), TabHost1.class, null);
        fragment_tab.addTab(fragment_tab.newTabSpec("tab2").setIndicator("dos"),TabHost2.class,null);
        fragment_tab.addTab(fragment_tab.newTabSpec("tab3").setIndicator("tres"),TabHost3.class,null);

    }
}
