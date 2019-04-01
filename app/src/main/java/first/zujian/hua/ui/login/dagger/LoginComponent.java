package first.zujian.hua.ui.login.dagger;

import com.example.commonlib.dagger.component.AppComponent;
import com.example.commonlib.dagger.scope.AppScope;

import dagger.Component;
import first.zujian.hua.ui.login.LoginActivity;

/**
 * Created by smile on 2019/3/19.
 */
@AppScope
@Component(dependencies = {AppComponent.class})
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
