package com.volodymyrbaisa.tourguide.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;

import com.volodymyrbaisa.tourguide.BuildConfig;
import com.volodymyrbaisa.tourguide.R;
import com.volodymyrbaisa.tourguide.base.BaseFragment;
import com.volodymyrbaisa.tourguide.ui.MainContract;
import com.volodymyrbaisa.tourguide.ui.adapter.ListAdapter;

import java.io.IOException;
import java.io.InputStream;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Bios on 2/18/2018.
 */

public class EventsFragment extends BaseFragment implements MainContract.View {
    @Inject
    protected MainContract.Presenter mPresenter;

    @BindView(R.id.events_items)
    ListView mListView;

    @Inject
    public EventsFragment() {
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        android.view.View root = inflater.inflate(R.layout.fragment_events, container, false);
        ButterKnife.bind(this, root);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
    }

    private void init() {
        mPresenter.takeView(this);
        ListAdapter listAdapter = new ListAdapter(getContext(), R.layout.item_view, mPresenter.getItemsEvents());
        mListView.setAdapter(listAdapter);
    }

    @Override
    public void onDestroy() {
        mPresenter.dropView();
        super.onDestroy();
    }

    @Override
    public InputStream getAssetsFile() throws IOException {
        return getContext().getAssets().open(BuildConfig.DATA_FILE);
    }

    @Override
    public void errorMessage(CharSequence msg) {
        errorMessage(mListView, msg);
    }
}
