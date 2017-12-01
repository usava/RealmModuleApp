package com.example.cowboy.realmmoduleapp.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cowboy.realmmoduleapp.R;
import com.example.cowboy.realmmoduleapp.app.RealmModuleApp;
import com.example.cowboy.realmmoduleapp.list.list_di.ListModule;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ((RealmModuleApp) getApplication()).getAppComponent().plus(new ListModule()).inject(this);
    }
}
