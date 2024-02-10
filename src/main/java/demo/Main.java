package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        /*

//        Doctor doctor = new Doctor();
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();

        // Using id
        Nurse nurse = (Nurse) context.getBean("nurse"); // it brings data of type Object, we have to type cast
        nurse.assist();

        Staff staff =  context.getBean(Doctor.class);
        staff.assist();

        */

        Doctor doctor =  context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualifications("MBBS");
        System.out.println(doctor);

        Doctor doctor1 =  context.getBean(Doctor.class);
        System.out.println(doctor1);        // will get same object back if default scope
    }
}