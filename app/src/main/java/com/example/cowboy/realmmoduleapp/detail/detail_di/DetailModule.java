package com.example.cowboy.realmmoduleapp.detail.detail_di;

import android.app.Application;

import com.example.cowboy.realmmoduleapp.list.ListPresenterImpl;
import com.example.cowboy.realmmoduleapp.realm.IRealmService;

import dagger.Provides;

/**
 * Created by Cowboy on 22.11.2017.
 */

public class DetailModule {

    @Provides
    @DetailScope
    ListPresenterImpl provideListPresenter(Application application, IRealmService iRealmService){
        return new ListPresenterImpl(application, iRealmService);
    }
}
