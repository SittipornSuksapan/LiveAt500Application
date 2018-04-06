package com.chan.revernue.liveat500application.adapter;


import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.chan.revernue.liveat500application.manager.PhotoListManager;
import com.chan.revernue.liveat500application.view.PhotoListItem;

public class PhotoListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        if (PhotoListManager.getInstance().getDao() == null)
            return 0;
        if (PhotoListManager.getInstance().getDao().getData() == null)
            return 0;
        return PhotoListManager.getInstance().getDao().getData().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

//    @Override
//    public int getViewTypeCount() {
//        return 2;
//    }
//
//    @Override
//    public int getItemViewType(int position) {
//        return position % 2 == 0 ? 0 : 1;
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        if (position % 2 == 0) {
            PhotoListItem item;
            if (convertView != null) {
                item = (PhotoListItem) convertView;

            } else {
                item = new PhotoListItem(parent.getContext());
            }
            return item;
//        } else {
//            TextView item;
//            if (convertView != null) {
//                item = (TextView) convertView;
//
//            } else {
//                item = new TextView(parent.getContext());
//            }
//            item.setText("Position" + position);
//            return item;
//
//        }


    }
}
