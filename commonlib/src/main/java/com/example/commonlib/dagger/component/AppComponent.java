package com.example.commonlib.dagger.component;

import android.content.Context;

import com.example.commonlib.arouter.interceptor.LoginInterceptor;
import com.example.commonlib.bean.UserBean;
import com.example.commonlib.dagger.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by smile on 2019/3/18.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(LoginInterceptor loginInterceptor);
    Context getContext();
    UserBean getUserBean();
}
