package enums;

import lombok.Getter;

@Getter
public enum LINKS {
    BASEURL("https://test.hypnotes.net/"),
    THERAPIST_REGISTER_URL("https://test.hypnotes.net/register"),
    CLIENT_REGISTER_URL("https://test.hypnotes.net/register/client"),

    THERAPIST_LOGIN_URL("https://test.hypnotes.net/login"),
    VERIFY_EMAIL_URL("https://test.hypnotes.net/verify-email?email=");




    private final String getLink;

    LINKS(String getLink) {

        this.getLink = getLink;
    }

    public String getLink() {

        return getLink;
    }
}
