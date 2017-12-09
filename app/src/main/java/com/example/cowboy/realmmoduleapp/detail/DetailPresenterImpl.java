package com.example.cowboy.realmmoduleapp.detail;

import android.app.Application;

import com.example.cowboy.realmmoduleapp.common.BasePresenter;
import com.example.cowboy.realmmoduleapp.common.IBaseView;
import com.example.cowboy.realmmoduleapp.common.IPresentContract;
import com.example.cowboy.realmmoduleapp.model.Person;
import com.example.cowboy.realmmoduleapp.realm.IRealmService;

/**
 * Created by Cowboy on 24.11.2017.
 */

public class DetailPresenterImpl extends BasePresenter<IBaseView.IDetailView> implements IPresentContract.IDetialPresenter<IBaseView.IDetailView> {

    public DetailPresenterImpl(Application application, IRealmService realmService){
        this.realmService = realmService;
        this.application = application;
    }

    @Override
    public void getData(long id) {
        realmService.getObject(Person.class, id).subscribe(
            next->{
                if(next != null){
                    view.showData(next);
                }
            },throwable ->{
                view.showError(throwable.getMessage());
            }, ()->{

            }
        );
    }

    @Override
    public void init(IBaseView.IDetailView view) {
        super.init(view);
    }

    @Override
    public void dismiss() {
        super.dismiss();
    }
}
