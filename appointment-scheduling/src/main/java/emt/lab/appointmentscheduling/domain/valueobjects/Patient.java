package emt.lab.appointmentscheduling.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import emt.lab.sharedkernel.domain.base.ValueObject;
import emt.lab.sharedkernel.domain.identity.Name;
import lombok.Getter;

import java.util.Date;

@Getter
public class Patient implements ValueObject {
    private final PatientId id;
    private final Name patientName;
    private final ContactNumber contactNumber;
    private final Gender gender;
    private final Date dateOfBirth;

    private Patient() {
        this.id = new PatientId();
        this.patientName = new Name("", "");
        this.contactNumber = new ContactNumber("012456789");
        this.gender = Gender.FEMALE;
        this.dateOfBirth = new Date();
    }

    @JsonCreator
    public Patient(@JsonProperty("id") PatientId id,
                   @JsonProperty("patientName") Name patientName,
                   @JsonProperty("contactNumber") ContactNumber contactNumber,
                   @JsonProperty("gender") Gender gender,
                   @JsonProperty("dateOfBirth") Date dateOfBirth) {
        this.id = id;
        this.patientName = patientName;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
}
