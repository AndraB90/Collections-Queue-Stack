package queueexamples;

import java.util.PriorityQueue;
import java.util.Queue;

public class Hospital {
    Queue<Patient> patients = new PriorityQueue<>();
    Doctor doctor = new Doctor();

    public void receivePatient(Patient patient){
        patients.offer(patient);
        System.out.println("Patient received ");
    }

    public void treatAllPatients(){
        for (int i = 0; i < patients.size(); i++) {
            this.doctor.treatPatient(patients.poll());
        }
        System.out.println("All patients treated ");
    }

}
