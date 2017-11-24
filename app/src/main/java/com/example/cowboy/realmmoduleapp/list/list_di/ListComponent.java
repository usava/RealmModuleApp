package com.example.cowboy.realmmoduleapp.list.list_di;

/**
 * Created by Cowboy on 22.11.2017.
 */

import com.example.cowboy.realmmoduleapp.list.ListActivity;

import dagger.Subcomponent;

@ListScope
@Subcomponent(modules = ListModule.class)
public interface ListComponent {
    void inject(ListActivity activity);
}
