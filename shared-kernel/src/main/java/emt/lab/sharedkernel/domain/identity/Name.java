package emt.lab.sharedkernel.domain.identity;

import emt.lab.sharedkernel.domain.base.ValueObject;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Name implements ValueObject {
    private final String name;
    private final String surname;

    protected Name() {
        this.name = "";
        this.surname = "";
    }

    public Name(@NonNull String name, @NonNull String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String fullName() {
        return name + " " + surname;
    }
}
