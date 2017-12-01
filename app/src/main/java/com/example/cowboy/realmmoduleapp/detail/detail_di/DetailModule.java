package com.example.cowboy.realmmoduleapp.detail.detail_di;

import android.app.Application;

import com.example.cowboy.realmmoduleapp.common.IPresentContract;
import com.example.cowboy.realmmoduleapp.detail.DetailPresenterImpl;
import com.example.cowboy.realmmoduleapp.list.ListPresenterImpl;
import com.example.cowboy.realmmoduleapp.realm.IRealmService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Cowboy on 22.11.2017.
 */
@Module
public class DetailModule {

    @Provides
    @DetailScope
    IPresentContract.IDetialPresenter provideDetailPresenter(Application application, IRealmService iRealmService){
        return new DetailPresenterImpl(application, iRealmService);
    }
}
