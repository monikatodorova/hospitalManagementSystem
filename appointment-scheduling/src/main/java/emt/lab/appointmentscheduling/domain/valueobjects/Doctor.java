package emt.lab.appointmentscheduling.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import emt.lab.sharedkernel.domain.base.ValueObject;
import emt.lab.sharedkernel.domain.identity.Name;
import lombok.Getter;

@Getter
public class Doctor implements ValueObject {
    private final DoctorId id;
    private final Name doctorName;
    private final ContactNumber contactNumber;
    private final Specialization specialization;
    private final String email;

    private Doctor() {
        this.id = new DoctorId();
        this.doctorName = new Name("", "");
        this.contactNumber = new ContactNumber("123456789");
        this.specialization = Specialization.Dermatology;
        this.email = "";
    }

    @JsonCreator
    public Doctor(@JsonProperty("id") DoctorId id,
                   @JsonProperty("doctorName") Name doctorName,
                   @JsonProperty("contactNumber") ContactNumber contactNumber,
                   @JsonProperty("specialization") Specialization specialization,
                   @JsonProperty("email") String email) {
        this.id = id;
        this.doctorName = doctorName;
        this.contactNumber = contactNumber;
        this.specialization = specialization;
        this.email = email;
    }
}
