package richellin.dagger2example.di;

import dagger.Component;

/**
 * Created by sangjun_lee on 2016/08/10.
 */

@ApplicationScope
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    ActivityComponent newActivityComponent(ActivityModule module);
}
