public class AccountDetails {
    private String name;
    private LoginInfo loginInfo;
    private Address address;

    public AccountDetails(String name, LoginInfo loginInfo, Address address) {
        this.name = name;
        this.loginInfo = loginInfo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AccountDetails{" +
                "name='" + name + '\'' +
                ", username='" + loginInfo + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
