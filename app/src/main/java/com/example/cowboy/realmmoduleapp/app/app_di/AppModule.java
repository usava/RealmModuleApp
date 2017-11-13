package com.example.cowboy.realmmoduleapp.app.app_di;

import android.app.Application;

import com.example.cowboy.realmmoduleapp.realm.RealmService;
import com.example.cowboy.realmmoduleapp.realm.IRealmService;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by Cowboy on 13.11.2017.
 */

@Module
public class AppModule {

    private Application application;

    public AppModule(Application application){this.application = application;}

    @Provides
    @AppScope
    public Application provideApplication(){return application;}

    @Provides
    @AppScope
    Realm provideRealm(){return Realm.getDefaultInstance();}

    @Provides
    @AppScope
    IRealmService provideRealmService(final Realm realm){return new RealmService(realm);}
}
