package com.dutradev.migrainebuddy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

/**
 * Created by dutradev on 04/11/2016.
 */

public class CustomGridAdapter extends BaseAdapter {
    private Context mContext;
    private String[] titles;
    private int[] icons;
    private int[] selectedIcons;
    private boolean[] click;
    LayoutInflater inflater;

    public CustomGridAdapter(Context context, String[] titles, int[] icons, int[] selectedIcons){
        this.mContext = context;
        this.titles = titles;
        this.icons = icons;
        this.selectedIcons = selectedIcons;
        click = new boolean[titles.length];
        Arrays.fill(click, Boolean.FALSE);
    }

    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public Object getItem(int position) {
        return titles[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.gridview_item, null);
        }
        final ImageView image = (ImageView) convertView.findViewById(R.id.imgItem);
        TextView textView = (TextView) convertView.findViewById(R.id.txtItem);

        image.setImageResource(icons[position]);
        textView.setText(titles[position]);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click[position] == false){
                    click[position] = true;
                    image.setImageResource(selectedIcons[position]);
                }else {
                    click[position] = false;
                    image.setImageResource(icons[position]);
                }
            }
        });
        return convertView;
    }
}
