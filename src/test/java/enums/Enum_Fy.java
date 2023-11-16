package enums;

public enum Enum_Fy {

    THERAPIST("fatihfrance@yopmail.com","123456789Aa@"),
    NESIBE("test_trpst_basic@yopmail.com","Trpst13.");

    private final String username;
    private final String password;

    public String getUsername() {// getterlar olusturdum "hypnotes2022tr@gmail.com", "Aydinlik123/"
        return username;
    }

    public String getPassword() {
        return password;
    }

    Enum_Fy(String username, String password) { //CONSTRACTOR olusturdum
        this.username = username;
        this.password = password;
    }


}
