package richellin.dagger2example.di;

import dagger.Subcomponent;
import richellin.dagger2example.MainActivity;

/**
 * Created by sangjun_lee on 2016/08/10.
 */
@ActivityScope
/*
@Component(
        modules= ActivityModule.class
)
*/
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
