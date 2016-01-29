package no.student.haspau.westerdals.dto;

import com.sun.istack.internal.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Paul on 25.01.2016.
 */


@Entity
@NamedQueries({
        @NamedQuery(name = "Customer.allNorwegian",
                query = "select c from Customer c where c.state = :state"),
        @NamedQuery(name = "Customer.allFromOslo",
                query =  "select c from Customer c where c.city = :city"),
})
@SequenceGenerator(name = "SEQ_CUSTOMER", initialValue = 20)

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CUSTOMER")
    long customerId;

    @NotNull
    @Max(64)
    String firstName;
    @Nullable
    @Max(64)
    String middleName;
    @NotNull
    @Max(64)
    String surName;
    @NotNull
    @Min(18)
    LocalDate born;
    @NotNull
    @Future
    LocalDate dateOfRegistration;

    @Embedded
    private Address address;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstNameName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }





}
