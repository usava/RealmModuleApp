package com.example.cowboy.realmmoduleapp.list;

/**
 * Created by Cowboy on 01.12.2017.
 */

public interface ItemClickListener<M> {
    void openDetailed(long itemId);
    void updateItem(long itemId);
    void deleteItem(long itemId);
}
