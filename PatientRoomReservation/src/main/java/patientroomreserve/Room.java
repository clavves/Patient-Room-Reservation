/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patientroomreserve;

/**
 *
 * @author 90554
 */
public class Room {
    
    private Patient patient;
    private int paymentPerDay; 
    private int roomNumber;
    
    public Room (int roomNumber, int paymentPerDay) {
        this.roomNumber = roomNumber;
        this.paymentPerDay = paymentPerDay;
    }


    public int getPaymentPerDay() {
        return paymentPerDay;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    
}
