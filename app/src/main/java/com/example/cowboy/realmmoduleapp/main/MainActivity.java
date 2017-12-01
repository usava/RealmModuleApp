package com.example.cowboy.realmmoduleapp.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cowboy.realmmoduleapp.R;
import com.example.cowboy.realmmoduleapp.app.RealmModuleApp;
import com.example.cowboy.realmmoduleapp.common.IBaseView;
import com.example.cowboy.realmmoduleapp.common.IPresentContract;
import com.example.cowboy.realmmoduleapp.list.ListActivity;
import com.example.cowboy.realmmoduleapp.main.main_di.MainModule;
import com.example.cowboy.realmmoduleapp.model.Person;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IBaseView.IMainView{

    @Inject
    IPresentContract.IMainPresenter presenter;
    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((RealmModuleApp) getApplication()).getAppComponent().plus(new MainModule()).inject(this);

        presenter.init(this);



        EditText name = (EditText) findViewById(R.id.et_main_name);

        EditText surname = (EditText) findViewById(R.id.et_main_surname);

        EditText phone = (EditText) findViewById(R.id.et_main_phone);

        EditText email = (EditText) findViewById(R.id.et_main_email);

        EditText skype = (EditText) findViewById(R.id.et_main_skype);


        Button btnSubmit = (Button) findViewById(R.id.btn_main_submit);
        btnSubmit.setOnClickListener(v -> {
            if(v.getId() == R.id.btn_main_submit){
                Person person = new Person();
                person.setName(name.getText().toString());
                person.setSurname(surname.getText().toString());
                person.setPhone(phone.getText().toString());
                person.setEmail(email.getText().toString());
                person.setSkype(skype.getText().toString());
                presenter.setData(person);

            }
        });
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSuccess(Person person) {

    }

    @Override
    public void onFollowList() {
        Intent intent = new Intent(MainActivity.this, ListActivity.class);
        startActivity(intent);
    }
}
