package com.example.cowboy.realmmoduleapp.common;

import com.example.cowboy.realmmoduleapp.model.Person;

import io.realm.RealmResults;

/**
 * Created by Cowboy on 22.11.2017.
 */

public interface IBaseView {

    void showProgress();
    void hideProgress();
    void showError();

    interface IMainView extends IBaseView{
        void onSuccess(Person person);
    }
    interface IDetailView extends IBaseView{
        void showData(Person person);
    }
    interface IListView extends IBaseView {
        void showRealmResult(RealmResults<Person> realms);
    }
}
