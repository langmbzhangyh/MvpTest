package com.example.lang.mvptest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lang.mvptest.R;
import com.example.lang.mvptest.bean.Student;

import java.util.List;

/**
 * Created by lang on 2017/8/30.
 */

public class StudentAdapter extends BaseAdapter {
    private List<Student> books;
    private Context context;
    private LayoutInflater mInflater;
    public StudentAdapter(List<Student> books, Context contextt) {
        this.books=books;
        this.context=contextt;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            holder=new ViewHolder();
            convertView = mInflater.inflate(R.layout.book_item, null);
            holder.img = (ImageView)convertView.findViewById(R.id.img);
            holder.title = (TextView)convertView.findViewById(R.id.tv_bookname);
            convertView.setTag(holder);

        }else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.title.setText((String)books.get(position).getName());
        return convertView;
    }
    public final class ViewHolder{
        public ImageView img;
        public TextView title;
    }
}
