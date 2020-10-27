package com.example.iaccountchek;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Adapter;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    List<costList> mList;
    public ListAdapter(List<costList>list){
        mList=list;
    }
    @Override
    public int getCount(){
        return mList.size();
    }
    @Override
    public Object getItem(int position){
        return mList.get(position);
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View view=mList.get(position);
        TextView tv_tital = view.findViewById(R.id.title);

    }
}
