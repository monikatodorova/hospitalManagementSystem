package emt.lab.doctormanagement.services.form;

import emt.lab.doctormanagement.domain.models.Specialization;
import emt.lab.doctormanagement.domain.valueobjects.ContactNumber;
import emt.lab.sharedkernel.domain.identity.Name;
import lombok.Data;

@Data
public class DoctorForm {
    private Name doctorName;
    private ContactNumber contactNumber;
    private Specialization specialization;
    private String email;
}
