package enums;

public enum USER_INFO {
    THERAPIST_CREDENTIALS("hypnotes2022tr1@gmail.com","Aydinlik123/")
    ;
private final String therapist_email;
private final String therapist_password;

    USER_INFO(String therapist_email, String therapist_password) {
        this.therapist_email = therapist_email;
        this.therapist_password = therapist_password;
    }

    public String getTherapist_email() {
        return therapist_email;
    }

    public String getTherapist_password() {
        return therapist_password;
    }
}
