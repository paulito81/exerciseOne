package no.student.haspau.westerdals.dto;

import javax.persistence.Embeddable;

/**
 * Created by Paul on 25.01.2016.
 */
@Embeddable
public class Address {

    String state;
    String city;
    String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
