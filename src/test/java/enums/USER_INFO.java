package enums;

public enum USER_INFO {

    THERAPIST("Merve","ybm88@yopmail.com","M1234&yb")
    ;

    private String name;
    private String email;
    private String password;

    USER_INFO(String name, String email,String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void login(){
        System.out.println(this.email +" " + this.name);
    }
}

