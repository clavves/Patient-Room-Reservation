/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patientroomreserve;

/**
 *
 * @author 90554
 */
public class Doctor extends Person {
    
    private int charge;
    
    public Doctor(String firstName, String lastName, int charge) {
        super(firstName, lastName);
        this.charge = charge;
    }

    
    public int getCharge() {
        return charge;
    } 
}
