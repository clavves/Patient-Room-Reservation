/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patientroomreserve;

import static patientroomreserve.Main.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 90554
 */
public class Database {

    public Database() {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(1, 50));
        }
    }
    ArrayList<User> userList = new ArrayList();
    ArrayList<Room> rooms = new ArrayList();
    ArrayList<Patient> patientList = new ArrayList();
    ArrayList<Doctor> doctorList = new ArrayList();
    ArrayList<Nurse> nurseList = new ArrayList();

    public Doctor assignDoctor(String DoctorName) {
        Doctor doctor = null;
        for (Doctor d : this.doctorList) {
            if ((d.getFirstName() + " " + d.getLastName()).equals(DoctorName)) {
                doctor = d;
                return doctor;
            }
        }
        return doctor;
    }

    

}
