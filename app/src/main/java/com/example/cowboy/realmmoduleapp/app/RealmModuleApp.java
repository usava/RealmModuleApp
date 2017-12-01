package com.example.cowboy.realmmoduleapp.app;

import android.app.Application;
import android.content.Context;

import com.example.cowboy.realmmoduleapp.app.app_di.AppComponent;
import com.example.cowboy.realmmoduleapp.app.app_di.AppModule;
import com.example.cowboy.realmmoduleapp.app.app_di.DaggerAppComponent;


import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Cowboy on 13.11.2017.
 */

public class RealmModuleApp extends Application {

    private AppComponent appComponent;

    public static RealmModuleApp get(Context context) {
        return (RealmModuleApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        initRealmConfiguration();
        initAppComponent();
    }

    private void initAppComponent() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    private void initRealmConfiguration() {
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this)
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }


}
