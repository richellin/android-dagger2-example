package richellin.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sangjun_lee.dagger2demo.R;

import javax.inject.Inject;

import richellin.dagger2example.di.ActivityComponent;
import richellin.dagger2example.di.ActivityModule;
import richellin.dagger2example.model.CompanyModel;
import richellin.dagger2example.model.UserModel;

public class MainActivity extends AppCompatActivity {
    private ActivityComponent mActivityComponent;

    @Inject
    UserModel mUserModel;

    @Inject
    CompanyModel mCompanyModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mActivityComponent = ((MyApplication) getApplication()).getComponent()
                .newActivityComponent(new ActivityModule());
        mActivityComponent.inject(this);

        ((TextView) findViewById(R.id.text)).setText(
                "ID:" + mUserModel.getId() +
                        "\n Name:" + mUserModel.getName() +
                        "\n Gender:" + mUserModel.getGender() +
                        "\n Company:" + mCompanyModel.getName()
                        + "\n Company PhoneNumber:" + mCompanyModel.getPhoneNumber()
                        + "\n Company Address:" + mCompanyModel.getAddress());

    }
}
