package com.example.find.ui;

import com.example.commonlib.dagger.component.AppComponent;
import com.example.commonlib.dagger.scope.AppScope;

import dagger.Component;

/**
 * Created by smile on 2019/3/20.
 */

@AppScope
@Component(dependencies = {AppComponent.class})
public interface FindMainComponent {
    void inject(FindMainActivity findMainActivity);
}
