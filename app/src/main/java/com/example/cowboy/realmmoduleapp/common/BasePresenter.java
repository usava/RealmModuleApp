package com.example.cowboy.realmmoduleapp.common;

import android.app.Application;

import com.example.cowboy.realmmoduleapp.realm.IRealmService;

/**
 * Created by Cowboy on 22.11.2017.
 */

public abstract class BasePresenter<V extends IBaseView> {
    protected V view;
    protected IRealmService realmService;
    protected Application application;

    public void init(V view){this.view = view;}
    public void dismiss(){this.view = null;}
}
