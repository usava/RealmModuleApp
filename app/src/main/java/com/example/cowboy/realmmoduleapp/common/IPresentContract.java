package com.example.cowboy.realmmoduleapp.common;

import com.example.cowboy.realmmoduleapp.model.Person;

/**
 * Created by Cowboy on 22.11.2017.
 */

public interface IPresentContract {

    void dismiss();

    interface IMainPresenter<V extends IBaseView.IMainView> extends IPresentContract{
        void init(V view);
        void setData(Person person);
    }
    interface IListPresenter<V extends IBaseView.IListView> extends IPresentContract{
        void init(V view);
        void getListData();
    }
    interface IDetialPresenter<V extends IBaseView.IDetailView> extends IPresentContract{
        void init(V view);
        void getData(long id);
    }
}
