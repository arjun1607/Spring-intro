package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff{
    private String qualifications;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualifications='" + qualifications + '\'' +
                '}';
    }
//    private Nurse nurse;
//
//    public Doctor(String qualifications, Nurse nurse) {
//        this.qualifications = qualifications;
//        this.nurse = nurse;
//    }
//    public Doctor(String qualifications) {
//        this.qualifications = qualifications;
//    }

    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
//
//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
}
