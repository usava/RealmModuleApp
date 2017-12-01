package com.example.cowboy.realmmoduleapp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.cowboy.realmmoduleapp.R;
import com.example.cowboy.realmmoduleapp.app.RealmModuleApp;
import com.example.cowboy.realmmoduleapp.common.IBaseView;
import com.example.cowboy.realmmoduleapp.common.IPresentContract;
import com.example.cowboy.realmmoduleapp.main.main_di.MainModule;
import com.example.cowboy.realmmoduleapp.model.Person;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IBaseView.IMainView{

    @Inject
    IPresentContract.IMainPresenter<IBaseView.IMainView> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((RealmModuleApp) getApplication()).getAppComponent().plus(new MainModule()).inject(this);

        presenter.init(this);

        Person p = new Person();

        EditText name = (EditText) findViewById(R.id.et_main_name);
        p.setName(name.toString());
        EditText surname = (EditText) findViewById(R.id.et_main_surname);
        p.setSurname(surname.toString());
        EditText phone = (EditText) findViewById(R.id.et_main_phone);
        p.setPhone(phone.toString());
        EditText email = (EditText) findViewById(R.id.et_main_email);
        p.setEmail(email.toString());
        EditText skype = (EditText) findViewById(R.id.et_main_skype);
        p.setSkype(skype.toString());

        presenter.setData(p);


    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void onSuccess(Person person) {

    }
}
