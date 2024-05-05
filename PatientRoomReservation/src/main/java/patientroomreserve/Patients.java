/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patientroomreserve;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author 90554
 */
@Entity
@Table(name = "PATIENTS")
@NamedQueries({
    @NamedQuery(name = "Patients.findAll", query = "SELECT p FROM Patients p"),
    @NamedQuery(name = "Patients.findByPatientId", query = "SELECT p FROM Patients p WHERE p.patientId = :patientId"),
    @NamedQuery(name = "Patients.findByPatientFirstName", query = "SELECT p FROM Patients p WHERE p.patientFirstName = :patientFirstName"),
    @NamedQuery(name = "Patients.findByPatientLastName", query = "SELECT p FROM Patients p WHERE p.patientLastName = :patientLastName"),
    @NamedQuery(name = "Patients.findByPatientGender", query = "SELECT p FROM Patients p WHERE p.patientGender = :patientGender"),
    @NamedQuery(name = "Patients.findByPatientBloodType", query = "SELECT p FROM Patients p WHERE p.patientBloodType = :patientBloodType"),
    @NamedQuery(name = "Patients.findByPatientBirthdate", query = "SELECT p FROM Patients p WHERE p.patientBirthdate = :patientBirthdate"),
    @NamedQuery(name = "Patients.findByPatientDoctor", query = "SELECT p FROM Patients p WHERE p.patientDoctor = :patientDoctor"),
    @NamedQuery(name = "Patients.findByPatientNurse", query = "SELECT p FROM Patients p WHERE p.patientNurse = :patientNurse")})
public class Patients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PATIENT_ID")
    private String patientId;
    @Basic(optional = false)
    @Column(name = "PATIENT_FIRST_NAME")
    private String patientFirstName;
    @Basic(optional = false)
    @Column(name = "PATIENT_LAST_NAME")
    private String patientLastName;
    @Basic(optional = false)
    @Column(name = "PATIENT_GENDER")
    private String patientGender;
    @Basic(optional = false)
    @Column(name = "PATIENT_BLOOD_TYPE")
    private String patientBloodType;
    @Basic(optional = false)
    @Column(name = "PATIENT_BIRTHDATE")
    private String patientBirthdate;
    @Column(name = "PATIENT_DOCTOR")
    private String patientDoctor;
    @Column(name = "PATIENT_NURSE")
    private String patientNurse;

    public Patients() {
    }

    public Patients(String patientId) {
        this.patientId = patientId;
    }

    public Patients(String patientId, String patientFirstName, String patientLastName, String patientGender, String patientBloodType, String patientBirthdate) {
        this.patientId = patientId;
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.patientGender = patientGender;
        this.patientBloodType = patientBloodType;
        this.patientBirthdate = patientBirthdate;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientBloodType() {
        return patientBloodType;
    }

    public void setPatientBloodType(String patientBloodType) {
        this.patientBloodType = patientBloodType;
    }

    public String getPatientBirthdate() {
        return patientBirthdate;
    }

    public void setPatientBirthdate(String patientBirthdate) {
        this.patientBirthdate = patientBirthdate;
    }

    public String getPatientDoctor() {
        return patientDoctor;
    }

    public void setPatientDoctor(String patientDoctor) {
        this.patientDoctor = patientDoctor;
    }

    public String getPatientNurse() {
        return patientNurse;
    }

    public void setPatientNurse(String patientNurse) {
        this.patientNurse = patientNurse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientId != null ? patientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patients)) {
            return false;
        }
        Patients other = (Patients) object;
        if ((this.patientId == null && other.patientId != null) || (this.patientId != null && !this.patientId.equals(other.patientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "patientroomreserve.Patients[ patientId=" + patientId + " ]";
    }
    
}
