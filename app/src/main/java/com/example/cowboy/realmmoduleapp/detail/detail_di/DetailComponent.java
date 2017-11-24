package com.example.cowboy.realmmoduleapp.detail.detail_di;

/**
 * Created by Cowboy on 22.11.2017.
 */

import com.example.cowboy.realmmoduleapp.detail.DetailActivity;

import dagger.Subcomponent;

@DetailScope
@Subcomponent(modules = DetailModule.class)
public interface DetailComponent {
    void inject(DetailActivity activity);
}
