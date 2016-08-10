package richellin.dagger2example;

import android.app.Application;
import android.support.annotation.VisibleForTesting;

import com.example.sangjun_lee.dagger2demo.di.DaggerApplicationComponent;

import richellin.dagger2example.di.ApplicationComponent;
import richellin.dagger2example.di.ApplicationModule;

/**
 * Created by sangjun_lee on 2016/08/10.
 */
public class MyApplication extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }

    @VisibleForTesting
    public void setComponent(ApplicationComponent applicationComponent) {
        this.component = applicationComponent;
    }
}
