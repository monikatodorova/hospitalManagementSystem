package emt.lab.doctormanagement.domain.models;

import emt.lab.doctormanagement.domain.valueobjects.ContactNumber;
import emt.lab.sharedkernel.domain.base.AbstractEntity;
import emt.lab.sharedkernel.domain.identity.Name;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
@Getter
public class Doctor extends AbstractEntity<DoctorId> {
    private Name doctorName;
    private ContactNumber contactNumber;
    private Specialization specialization;
    private String email;

    protected Doctor() {
        super(DoctorId.randomId(DoctorId.class));
    }

    public static Doctor build(Name doctorName, ContactNumber contactNumber, Specialization specialization, String email) {
        Doctor p = new Doctor();
        p.doctorName = doctorName;
        p.contactNumber = contactNumber;
        p.specialization = specialization;
        p.email = email;
        return p;
    }

}
