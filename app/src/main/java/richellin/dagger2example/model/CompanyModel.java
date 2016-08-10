package richellin.dagger2example.model;

/**
 * Created by sangjun_lee on 2016/08/10.
 */
public class CompanyModel {
    private String name;
    private String phoneNumber;
    private String address;

    public CompanyModel() {
    }

    public CompanyModel(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }


}
