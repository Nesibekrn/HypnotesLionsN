package enums;

public enum ClientEnum {
    CLIENT_CREDENTIALS("jasmine@yopmail.com","Hello123/");
    private final String email;
    private final String password;

    ClientEnum(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
