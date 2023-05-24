package emt.lab.patientmanagement.services.form;

import emt.lab.patientmanagement.domain.models.Gender;
import emt.lab.patientmanagement.domain.valueobjects.ContactNumber;
import emt.lab.sharedkernel.domain.identity.Name;
import lombok.Data;

import java.util.Date;

@Data
public class PatientForm {
    private Name patientName;
    private ContactNumber contactNumber;
    private Gender gender;
    private Date dateOfBirth;
}
