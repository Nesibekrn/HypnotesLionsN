package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.javafaker.Faker;
import lombok.NoArgsConstructor;

import java.util.Random;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationInfo {
    private String addressTitle;
    private String address;
    private String zipCode;
    private String timeZone;
    private String city;
    private String state;
    private String country;

    public LocationInfo(String addressTitle, String address, String zipCode, String timeZone, String city, String state, String country) {
        this.zipCode = zipCode;
        this.country = country;
        this.address = address;
        this.state = state;
        this.city = city;
        this.timeZone = timeZone;
        this.addressTitle = addressTitle;

    }

    public LocationInfo() {
        this.zipCode = Faker.instance().address().zipCode();
        this.country = Faker.instance().country().name();
        this.address = Faker.instance().address().streetAddress();
        this.state = Faker.instance().address().state();
        this.city = Faker.instance().address().city();
        this.timeZone = Faker.instance().address().timeZone();
        this.addressTitle = Faker.instance().name().fullName();

    }


    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getAddressTitle() {
        return addressTitle;
    }

    public void setAddressTitle(String addressTitle) {
        this.addressTitle = addressTitle;
    }


    @Override
    public String toString() {
        return "{" +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", addressTitle='" + addressTitle + '\'' +
                '}';
    }
}

