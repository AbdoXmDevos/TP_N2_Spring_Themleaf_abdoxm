package ma.enset.karimi.hospital;

import ma.enset.karimi.hospital.entities.Patient;
import ma.enset.karimi.hospital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {
    @Autowired
    PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Patient patient = new Patient();

       // Patient patient = Patient.builder().nom("Taha").dateNaissance(new Date()).score(55).malade(true).build();
        patientRepository.save(new Patient(null,"Patient1",new Date(),true,350));

        patientRepository.save(new Patient(null,"Patient2",new Date(),false,200));
        patientRepository.save(new Patient(null,"Patient3",new Date(),true,160));
    }
}
