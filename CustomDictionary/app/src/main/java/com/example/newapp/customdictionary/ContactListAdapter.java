package com.example.newapp.customdictionary;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gautam on 9/13/17.
 */

public class ContactListAdapter extends ArrayAdapter<PContact> {

    private static final String TAG = "ContactListAdapter";
    private Context mContext;
    int mResource;

    public ContactListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<PContact> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getName();
        String Phnumber = getItem(position).getPhnumber();

        PContact pC = new PContact(name,Phnumber);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);
        TextView tvName = (TextView) convertView.findViewById(R.id.textView3);
        TextView tvPhnumber = (TextView) convertView.findViewById(R.id.textView4);
        tvName.setText(name);
        tvPhnumber.setText(Phnumber);
        return convertView;
    }
}
