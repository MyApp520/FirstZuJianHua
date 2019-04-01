package com.example.commonlib.dagger.module;

import android.content.Context;

import com.example.commonlib.bean.UserBean;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by smile on 2019/3/18.
 */
@Module
public class AppModule {
    Context context;

    public AppModule(Context context){
        this.context = context;
    }

    @Singleton
    @Provides
    public UserBean provideUserBean() {
        return new UserBean();
    }

    @Singleton
    @Provides
    public Context provideContext() {
        return context;
    }
}
