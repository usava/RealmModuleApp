package com.example.cowboy.realmmoduleapp.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cowboy.realmmoduleapp.R;
import com.example.cowboy.realmmoduleapp.app.RealmModuleApp;
import com.example.cowboy.realmmoduleapp.common.IBaseView;
import com.example.cowboy.realmmoduleapp.common.IPresentContract;
import com.example.cowboy.realmmoduleapp.detail.detail_di.DetailModule;
import com.example.cowboy.realmmoduleapp.list.list_di.ListModule;
import com.example.cowboy.realmmoduleapp.model.Person;

import javax.inject.Inject;

public class DetailActivity extends AppCompatActivity implements IBaseView.IDetailView {

    @Inject
    IPresentContract.IDetialPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ((RealmModuleApp) getApplication()).getAppComponent().plus(new DetailModule()).inject(this);
        presenter.init(this);
        presenter.getData(0);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String s) {

    }

    @Override
    public void showData(Person person) {

    }
}
