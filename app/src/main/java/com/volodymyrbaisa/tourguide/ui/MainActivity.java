package com.volodymyrbaisa.tourguide.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.volodymyrbaisa.tourguide.R;
import com.volodymyrbaisa.tourguide.ui.fragments.DiningFragment;
import com.volodymyrbaisa.tourguide.ui.fragments.EventsFragment;
import com.volodymyrbaisa.tourguide.ui.fragments.PlacesToStayFragment;
import com.volodymyrbaisa.tourguide.ui.fragments.ThingsToDoFragment;
import com.volodymyrbaisa.tourguide.util.ActivityUtils;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    @BindView(R.id.toolbar)
    protected Toolbar mToolbar;

    @BindView(R.id.drawer)
    protected DrawerLayout mDrawerLayout;

    @BindView(R.id.navigation_view)
    protected NavigationView mNavigationView;

    @BindView(R.id.container)
    protected ConstraintLayout mContainer;

    private ActionBarDrawerToggle mActionBarDrawerToggle;

    @Inject
    protected ThingsToDoFragment mThingsToDoFragment;

    @Inject
    protected EventsFragment mEventsFragment;

    @Inject
    protected DiningFragment mDiningFragment;

    @Inject
    protected PlacesToStayFragment mPlacesToStayFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        init();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        if (savedInstanceState == null) {
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    mThingsToDoFragment, R.id.fragment_container);
        }
    }

    private void init() {
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);
        mActionBarDrawerToggle.syncState();
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mActionBarDrawerToggle != null && mActionBarDrawerToggle.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.things_to_do:
                ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                        mThingsToDoFragment, R.id.fragment_container);
                break;

            case R.id.events:
                ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                        mEventsFragment, R.id.fragment_container);
                break;

            case R.id.dining:
                ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                        mDiningFragment, R.id.fragment_container);
                break;

            case R.id.places_to_stay:
                ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                        mPlacesToStayFragment, R.id.fragment_container);
                break;
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
