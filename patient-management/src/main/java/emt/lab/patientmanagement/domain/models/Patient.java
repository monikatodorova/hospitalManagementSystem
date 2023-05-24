package emt.lab.patientmanagement.domain.models;

import emt.lab.patientmanagement.domain.valueobjects.ContactNumber;
import emt.lab.sharedkernel.domain.base.AbstractEntity;
import emt.lab.sharedkernel.domain.identity.Name;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="patients")
@Getter
public class Patient extends AbstractEntity<PatientId> {
    private Name patientName;
    private ContactNumber contactNumber;
    private Gender gender;
    private Date dateOfBirth;

    protected Patient() {
        super(PatientId.randomId(PatientId.class));
    }

    public static Patient build(Name patientName, ContactNumber contactNumber, Gender gender, Date dateOfBirth) {
        Patient p = new Patient();
        p.patientName = patientName;
        p.contactNumber = contactNumber;
        p.gender = gender;
        p.dateOfBirth = dateOfBirth;
        return p;
    }

}
