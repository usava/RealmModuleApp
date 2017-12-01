package com.example.cowboy.realmmoduleapp.main.main_di;

/**
 * Created by Cowboy on 22.11.2017.
 */

import com.example.cowboy.realmmoduleapp.main.MainActivity;

import dagger.Subcomponent;

@MainScope
@Subcomponent(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
