package com.example.b.bookstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by b on 7/4/2017.
 */

public class ScienceAdapter extends ArrayAdapter {


    private Context context;
    private int resource;
    ArrayList<SciencePojo> arrayList;
    LayoutInflater layoutInflater;


    public ScienceAdapter(Context context, int resource,ArrayList<SciencePojo> arrayList) {
        super(context, resource, arrayList);
        this.context=context;
        this.resource=resource;
        this.arrayList=arrayList;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }






}
