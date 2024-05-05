/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patientroomreserve;

/**
 *
 * @author 90554
 */
public class Patient extends Person {

    String iD;
    String bloodType;
    String gender;
    String birthdate;
    Doctor doctor;
    Nurse nurse;

    
    public Patient(String firstName, String lastName, String iD, String bloodType, String gender, String birthdate, Doctor doctor, Nurse nurse) {
        super(firstName, lastName);
        this.iD = iD;
        this.bloodType = bloodType;
        this.gender = gender;
        this.birthdate = birthdate;
        this.doctor = doctor;
        this.nurse = nurse;
    }

    
    public String getiD() {
        return iD;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getGender() {
        return gender;
    }
    
    public String getBirthdate() {
        return birthdate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }
}
