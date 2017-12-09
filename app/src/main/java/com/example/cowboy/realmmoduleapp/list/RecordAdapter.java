package com.example.cowboy.realmmoduleapp.list;

/**
 * Created by Cowboy on 01.12.2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cowboy.realmmoduleapp.R;
import com.example.cowboy.realmmoduleapp.model.Person;

import java.util.ArrayList;

/**
 * Created by Svyatoslav on 21.06.2017.
 */

public class RecordAdapter extends RecyclerView.Adapter<RecordViewHolder> {

    private Context context;
    private ArrayList<Person> values  = new ArrayList<>();
    private ItemClickListener<Person> mListener;

    public RecordAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false);
        return new RecordViewHolder(this.context, view);
    }

    @Override
    public void onBindViewHolder(RecordViewHolder holder, int position) {
        holder.bindPerson(values.get(position));
        holder.setmListener(this.mListener);
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public void setData(ItemClickListener<Person> icl) {
        mListener = icl;
    }

   public void addNewItems(ArrayList<Person> items){
       if(items.size() == 0){
           return;
       }
       values.addAll(items);
       this.notifyDataSetChanged();
   }
}