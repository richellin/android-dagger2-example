package richellin.dagger2example.di;

import dagger.Module;
import dagger.Provides;
import richellin.dagger2example.model.CompanyModel;
import richellin.dagger2example.model.UserModel;

/**
 * Created by sangjun_lee on 2016/08/10.
 */
@Module
public class ActivityModule {

    @Provides
    @ActivityScope
    public UserModel provideUserModel(){
        return new UserModel("1","vivian","woman");
    }

    @Provides
    @ActivityScope
    public CompanyModel provideCompanyModel(){
        return new CompanyModel("2","vivian","woman");
    }
}
