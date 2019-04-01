package com.example.find.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.commonlib.arouter.FindModuleArouterPath;
import com.example.commonlib.base.BaseApplication;
import com.example.commonlib.bean.UserBean;
import com.example.find.R;

import javax.inject.Inject;

@Route(path = FindModuleArouterPath.FIND_MAIN_ACTIVITY)
public class FindMainActivity extends Activity {

    private final String TAG = getClass().getSimpleName();

    @Inject
    UserBean userBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_main);
        DaggerFindMainComponent.builder().appComponent(BaseApplication.getAppComponent()).build().inject(this);

        Log.e(TAG, "FindMainActivity onCreate: userBean = " + userBean + ", " + userBean.getUserName());
    }
}
