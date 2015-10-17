package com.example.win7.androidparsetodolist.model;

/**
 * Created by Win7 on 10/17/2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.win7.androidparsetodolist.R;

import java.util.ArrayList;


public class TaskAdapter extends ArrayAdapter<Task> {
    public TaskAdapter(Context context, ArrayList<Task> tasks) {
        super(context, 0, tasks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Task task = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_task, parent, false);
        }
        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        txtName.setText(task.name);
        return convertView;
    }
}