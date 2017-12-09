package com.example.cowboy.realmmoduleapp.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

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

    private EditText etName;
    private EditText etSurname;
    private EditText etPhone;
    private EditText etEmail;
    private EditText etSkype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ((RealmModuleApp) getApplication()).getAppComponent().plus(new DetailModule()).inject(this);
        presenter.init(this);

        etName = (EditText) findViewById(R.id.et_detailed_name);
        etSurname = (EditText) findViewById(R.id.et_detailed_surname);
        etPhone = (EditText) findViewById(R.id.et_detailed_phone);
        etEmail = (EditText) findViewById(R.id.et_detailed_email);
        etSkype = (EditText) findViewById(R.id.et_detailed_skype);

        long itemId = this.getIntent().getLongExtra("id", 0);

        presenter.getData(itemId);

        Toast.makeText(this, ""+itemId, Toast.LENGTH_SHORT).show();
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
        etName.setText(person.getName().toString());
        etSurname.setText(person.getSurname().toString());
        etPhone.setText(person.getPhone().toString());
        etEmail.setText(person.getEmail().toString());
        etSkype.setText(person.getSkype().toString());
    }
}
