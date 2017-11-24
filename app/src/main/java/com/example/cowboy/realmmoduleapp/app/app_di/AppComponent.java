package com.example.cowboy.realmmoduleapp.app.app_di;

import com.example.cowboy.realmmoduleapp.detail.detail_di.DetailComponent;
import com.example.cowboy.realmmoduleapp.detail.detail_di.DetailModule;
import com.example.cowboy.realmmoduleapp.list.list_di.ListComponent;
import com.example.cowboy.realmmoduleapp.list.list_di.ListModule;
import com.example.cowboy.realmmoduleapp.main.main_di.MainComponent;
import com.example.cowboy.realmmoduleapp.main.main_di.MainModule;

import dagger.Component;

/**
 * Created by Cowboy on 13.11.2017.
 */

@AppScope
@Component(modules = {AppModule.class})

public interface AppComponent {
    MainComponent plus(MainModule module);
    ListComponent plus(ListModule module);
    DetailComponent plus(DetailModule module);
}
