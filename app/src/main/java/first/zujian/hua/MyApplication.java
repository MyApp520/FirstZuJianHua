package first.zujian.hua;

import android.util.Log;

import com.example.commonlib.base.BaseApplication;
import com.example.commonlib.bean.UserBean;

import javax.inject.Inject;

/**
 * Created by smile on 2019/3/12.
 */

public class MyApplication extends BaseApplication {

    private final String TAG = getClass().getSimpleName();

    @Inject
    UserBean userBean;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMyAppComponent.builder().appComponent(BaseApplication.getAppComponent()).build().inject(this);

        Log.e(TAG, "MyApplication onCreate: userBean = " + userBean);
    }

}
