package com.example.cowboy.realmmoduleapp.list;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.cowboy.realmmoduleapp.R;
import com.example.cowboy.realmmoduleapp.app.RealmModuleApp;
import com.example.cowboy.realmmoduleapp.common.IBaseView;
import com.example.cowboy.realmmoduleapp.common.IPresentContract;
import com.example.cowboy.realmmoduleapp.detail.DetailActivity;
import com.example.cowboy.realmmoduleapp.list.list_di.ListModule;
import com.example.cowboy.realmmoduleapp.model.Person;

import java.util.ArrayList;

import javax.inject.Inject;

import io.realm.RealmResults;

public class ListActivity extends AppCompatActivity implements IBaseView.IListView, ItemClickListener<Person> {
    @Inject
    IPresentContract.IListPresenter presenter;

    ArrayList<Person> persons = new ArrayList<Person>();
    RecyclerView rv;
    RecordAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ((RealmModuleApp) getApplication()).getAppComponent().plus(new ListModule()).inject(this);
        presenter.init(this);

        rv = (RecyclerView) findViewById(R.id.rv_main);

        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        adapter = new RecordAdapter(this);
        rv.setAdapter(adapter);
//        adapter.setData(this);
        presenter.getListData();
    }

    @Override
    public void openDetailed(long itemId) {
        Intent i = new Intent(this, DetailActivity.class);
        i.putExtra("id", itemId);
        startActivity(i);
    }

    @Override
    public void updateItem(long itemId) {

    }

    @Override
    public void deleteItem(long itemId) {
        Toast.makeText(this, "id: " + itemId, Toast.LENGTH_SHORT).show();
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
    public void showRealmResult(RealmResults<Person> realms) {
        Log.d("TASKA", " LIST " + realms);
        ArrayList<Person> list = new ArrayList<>();
        for (Person p : realms) {
            list.add(p);
        }

        adapter.addNewItems(list);
    }
}
