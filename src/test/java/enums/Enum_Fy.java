package enums;

public enum Enum_Fy {

    THERAPIST("fatihfrance@yopmail.com", "123456789Aa@"),
    NESIBE("test_trpst_basic@yopmail.com", "Trpst13."),
    THERAPISTLOGIN("ftmcglr@yopmail.com", "Test123456!"),
    GUL("gulyalcin2022@gmail.com", "Endemik38*"),
    THERAPIST_2("therapist2023@mailsac.com","12ASDasd.,asdASD34"),

    THERAPISTGENERAL("hypnotes2022tr1@gmail.com","Aydinlik123/");
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
