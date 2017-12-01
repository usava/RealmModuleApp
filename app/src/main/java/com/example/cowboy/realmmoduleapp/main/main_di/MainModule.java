package com.example.cowboy.realmmoduleapp.main.main_di;

import android.app.Application;

import com.example.cowboy.realmmoduleapp.common.IPresentContract;
import com.example.cowboy.realmmoduleapp.main.MainActivity;
import com.example.cowboy.realmmoduleapp.main.MainPresenterImpl;
import com.example.cowboy.realmmoduleapp.realm.IRealmService;
import com.example.cowboy.realmmoduleapp.realm.RealmService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Cowboy on 22.11.2017.
 */
@Module
public class MainModule {

    @Provides
    @MainScope
    IPresentContract.IMainPresenter provideMainPresenter(Application application, IRealmService iRealmService){
        return new MainPresenterImpl(application, iRealmService);
    }
}
