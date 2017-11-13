package com.example.cowboy.realmmoduleapp.realm;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import rx.Observable;

/**
 * Created by Cowboy on 13.11.2017.
 */

public class RealmService implements IRealmService{

    private Realm mRealm;

    public RealmService(final Realm realm) {
        mRealm = realm;
    }

    @Override
    public Realm get() {
        return null;
    }

    @Override
    public void closeRealm() {

    }

    @Override
    public void refresh() {

    }

    @Override
    public <T extends RealmObject> Observable<T> addObject(T object, Class<T> clazz) {
        return null;
    }

    @Override
    public <T extends RealmObject> Observable<RealmResults<T>> getObjects(Class<T> clazz) {
        return null;
    }

    @Override
    public <T extends RealmObject> Observable<Class<T>> deleteObject(long id, Class<T> clazz) {
        return null;
    }

    @Override
    public <T extends RealmObject> Observable<Class<T>> deleteAllObjects(Class<T> clazz) {
        return null;
    }

    @Override
    public <T extends RealmObject> Observable<T> getLastObject(Class<T> clazz) {
        return null;
    }
}