package richellin.dagger2example.model;

/**
 * Created by sangjun_lee on 2016/08/10.
 */
public class UserModel {
    private String id;
    private String name;
    private String gender;

    public UserModel() {
    }

    public UserModel(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
