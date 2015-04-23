package com.epam.blokhina.task0;

/**
 * Created by Yevheniia_Blokhina on 4/21/2015.
 */
//3. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
//
//        Создать массив объектов. Вывести:
//
//        a) список пациентов, имеющих данный диагноз;
//
//        b) список пациентов, номер медицинской карты которых находится в за-данном интервале.
public class Patient {

    private static int count = 0;
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private int medicalNumber;
    private String diagnosis;

    public Patient(String lastName, String firstName, String patronymic, String address, int medicalNumber, String diagnosis) {
        id = ++count;
        setLastName(lastName);
        setFirstName(firstName);
        setPatronymic(patronymic);
        setAddress(address);
        setMedicalNumber(medicalNumber);
        setDiagnosis(diagnosis);
    }

    public Patient(String lastName, String firstName, String patronymic) {
        setLastName(lastName);
        setFirstName(firstName);
        setPatronymic(patronymic);
        address = "--";
        id = ++count;
        medicalNumber = 1000 + id;
        diagnosis = "unknown disease";
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMedicalNumber() {
        return medicalNumber;
    }

    public void setMedicalNumber(int medicalNumber) {
        this.medicalNumber = medicalNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public static void getPatientsByMedicalNumber(int min, int max, Patient[] patients) {
        if (max < min) {
            int tmp = min;
            min = max;
            max = tmp;
        }
        for (Patient patient : patients) {
            if (patient.getMedicalNumber() >= min && patient.getMedicalNumber() <= max) {
                System.out.println(patient);
            }
        }
    }
    public static void getPatientsByDiagnosis(String diagnosis, Patient[] patients){
        for (Patient patient : patients) {
            if(patient.getDiagnosis().equals(diagnosis)){
                System.out.println(patient);
            }
        }
    }


    @Override
    public String toString() {
        return "Patient " + lastName + " " + firstName + " " + patronymic +
                ", id: " + id +
                ".   Address: " + address +
                ", medicalNumber: " + medicalNumber +
                ", diagnosis: " + diagnosis  +
                '}';
    }
}
