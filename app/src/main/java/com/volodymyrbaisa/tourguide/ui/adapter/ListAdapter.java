package com.volodymyrbaisa.tourguide.ui.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.volodymyrbaisa.tourguide.R;
import com.volodymyrbaisa.tourguide.data.Item;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Bios on 2/18/2018.
 */

public class ListAdapter extends ArrayAdapter<Item> {
    private int mResourceId;

    public ListAdapter(@NonNull Context context, @LayoutRes int resourceId, List items) {
        super(context, 0, items);
        mResourceId = resourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(mResourceId, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        Item item = getItem(position);

        if (item != null) {
            int imageId = convertView.getResources().getIdentifier(item.getImage()[0], "drawable", convertView.getContext().getPackageName());
            holder.mImagePreview.setImageResource(imageId);
            holder.mTitle.setText(item.getTitle());
            holder.mPlace.setText(item.getLocation());
            holder.mPrice.setText(item.getPrice());
            holder.mTime.setText(item.getTime());
            holder.mWeb.setText(item.getWebsite());
        }

        return convertView;
    }

    static final class ViewHolder {
        @BindView(R.id.image_preview)
        protected ImageView mImagePreview;

        @BindView(R.id.title)
        protected TextView mTitle;

        @BindView(R.id.place)
        protected TextView mPlace;

        @BindView(R.id.price)
        protected TextView mPrice;

        @BindView(R.id.time)
        protected TextView mTime;

        @BindView(R.id.web)
        protected TextView mWeb;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
