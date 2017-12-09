package com.example.cowboy.realmmoduleapp.list;

/**
 * Created by Cowboy on 01.12.2017.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cowboy.realmmoduleapp.R;
import com.example.cowboy.realmmoduleapp.model.Person;

public class RecordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private TextView mName;
    private TextView mSurname;
    private TextView mPhone;
    private TextView mEmail;
    private TextView mSkype;

    private Context context;
    public Person person;
    public ItemClickListener<Person> mListener;

    public RecordViewHolder(Context context, View itemView) {
        super(itemView);

        this.mName = (TextView) itemView.findViewById(R.id.tv_main_name);
        this.mSurname = (TextView) itemView.findViewById(R.id.tv_main_surname);
        this.mPhone = (TextView) itemView.findViewById(R.id.tv_main_phone);
        this.mEmail = (TextView) itemView.findViewById(R.id.tv_main_email);
        this.mSkype = (TextView) itemView.findViewById(R.id.tv_main_skype);

        ImageButton btnDelete = (ImageButton) itemView.findViewById(R.id.ib_delete);
        btnDelete.setOnClickListener(this);
        ImageButton btnCall = (ImageButton) itemView.findViewById(R.id.ib_call);
        btnCall.setOnClickListener(this);
        ImageButton btnEmail = (ImageButton) itemView.findViewById(R.id.ib_email);
        btnEmail.setOnClickListener(this);
        ImageButton btnSkype = (ImageButton) itemView.findViewById(R.id.ib_skype);
        btnSkype.setOnClickListener(this);

        this.context = context;
        itemView.setOnClickListener(this);
    }

    public void bindPerson(Person person){
        if(person != null){
            this.person = person;
            mName.setText(person.getName());
            mSurname.setText(person.getSurname());
            mPhone.setText(person.getPhone());
            mEmail.setText(person.getEmail());
            mSkype.setText(person.getSkype());
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.ib_delete){
            this.mListener.deleteItem(person.getId());
        }else{
            this.mListener.openDetailed(person.getId());
        }
    }

    public void setmListener(ItemClickListener<Person> icl){
        this.mListener = icl;
    }
}

