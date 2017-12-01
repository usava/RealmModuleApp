package com.example.cowboy.realmmoduleapp.list.list_di;

import android.app.Application;

import com.example.cowboy.realmmoduleapp.list.ListPresenterImpl;
import com.example.cowboy.realmmoduleapp.main.MainPresenterImpl;
import com.example.cowboy.realmmoduleapp.realm.IRealmService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Cowboy on 22.11.2017.
 */
@Module
public class ListModule {

    @Provides
    @ListScope
    ListPresenterImpl provideListPresenter(Application application, IRealmService iRealmService){
        return new ListPresenterImpl(application, iRealmService);
    }
}
