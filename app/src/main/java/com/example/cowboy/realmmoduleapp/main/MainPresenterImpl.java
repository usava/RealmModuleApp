package com.example.cowboy.realmmoduleapp.main;

import android.app.Application;

import com.example.cowboy.realmmoduleapp.common.BasePresenter;
import com.example.cowboy.realmmoduleapp.common.IBaseView;
import com.example.cowboy.realmmoduleapp.common.IPresentContract;
import com.example.cowboy.realmmoduleapp.model.Person;
import com.example.cowboy.realmmoduleapp.realm.IRealmService;

/**
 * Created by Cowboy on 22.11.2017.
 */

public class MainPresenterImpl extends BasePresenter<IBaseView.IMainView> implements IPresentContract.IMainPresenter<IBaseView.IMainView>{

    public MainPresenterImpl(Application application, IRealmService realmService){
        this.realmService = realmService;
        this.application = application;
    }

    @Override
    public void init(IBaseView.IMainView view){
        super.init(view);
    }
    @Override
    public void dismiss(){
        super.dismiss();
    }
    @Override
    public void setData(Person person) {

    }
}
