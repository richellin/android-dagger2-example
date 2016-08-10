package richellin.dagger2example.di;


import dagger.Module;
import richellin.dagger2example.MyApplication;

/**
 * Created by sangjun_lee on 2016/08/10.
 */
@Module
public class ApplicationModule {
    private final MyApplication mApplication;

    public ApplicationModule(MyApplication application) {
        mApplication = application;
    }

}
