package com.example.cowboy.realmmoduleapp.list;

import android.app.Application;

import com.example.cowboy.realmmoduleapp.common.BasePresenter;
import com.example.cowboy.realmmoduleapp.common.IBaseView;
import com.example.cowboy.realmmoduleapp.common.IPresentContract;
import com.example.cowboy.realmmoduleapp.realm.IRealmService;

/**
 * Created by Cowboy on 24.11.2017.
 */

public class ListPresenterImpl extends BasePresenter<IBaseView.IListView> implements IPresentContract.IListPresenter<IBaseView.IListView>{

    public ListPresenterImpl(Application application, IRealmService realmService){
        this.realmService = realmService;
        this.application = application;
    }
    @Override
    public void getListData() {

    }
}
