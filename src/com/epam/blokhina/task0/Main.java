package com.epam.blokhina.task0;

/**
 * Created by Yevheniia_Blokhina on 4/21/2015.
 */
public class Main {

    public static void main(String[] args) {
        Patient[] patients = new Patient[7];

        patients[0] = new Patient("Lapot`", "Vasya", "Grigorievich");
        patients[1] = new Patient("Lal", "Vanys", "Captoa");
        patients[2] = new Patient("Lalasd", "Ana", "Rasa", "Kharkiv, ul.Takaya-to 0", 1002, "chickenpox");
        patients[3] = new Patient("Mu", "Mala", "Captoa", "ul.8Marta", 231, "flu");
        patients[4] = new Patient("Capa", "Vaasdnys", "CaptoRRa", "ul.9Marta", 3212, "flu");
        patients[5] = new Patient("Lama", "Saha", "Serheevna", "ul.9Marta", 3212, "cold");
        patients[6] = new Patient("Rapun", "Katya", "Igorevna", "ul.9Marta", 3212, "measles");

        String diagnosis = "flu";
        System.out.println("Patients with " + diagnosis);
        Patient.getPatientsByDiagnosis(diagnosis, patients);

        int min = 1002;
        int max = 1999;
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Patients with numbers of medical card from " + min + " till " + max);
        Patient.getPatientsByMedicalNumber(min, max, patients);
    }
}
