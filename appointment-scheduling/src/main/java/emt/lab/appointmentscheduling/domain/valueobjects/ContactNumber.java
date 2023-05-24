package emt.lab.appointmentscheduling.domain.valueobjects;

import emt.lab.sharedkernel.domain.base.ValueObject;
import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class ContactNumber implements ValueObject {
    private final String number;

    protected ContactNumber() {
        this.number = "";
    }
    public ContactNumber(String number) {
        this.number = number;
    }
}
