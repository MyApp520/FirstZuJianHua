package first.zujian.hua;

import com.example.commonlib.dagger.component.AppComponent;
import com.example.commonlib.dagger.scope.AppScope;

import dagger.Component;

/**
 * Created by smile on 2019/3/19.
 */

@AppScope
@Component(dependencies = {AppComponent.class})
public interface MyAppComponent {
    void inject(MyApplication myApplication);
}
