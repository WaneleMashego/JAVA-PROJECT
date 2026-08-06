/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.memberClass;

/**
 *
 * @author Wanele Mashego
 */
public class MemberClass {
    
    private String name;
    private String surname;
    private String idno;
    private String gender;
    private String contractType;
    private boolean isPersonalTrainerNeeded;

    public MemberClass(String name, String surname, String idno, String gender, String contractType, boolean isPersonalTrainerNeeded) {
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.gender = gender;
        this.contractType = contractType;
        this.isPersonalTrainerNeeded = isPersonalTrainerNeeded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public boolean isIsPersonalTrainerNeeded() {
        return isPersonalTrainerNeeded;
    }

    public void setIsPersonalTrainerNeeded(boolean isPersonalTrainerNeeded) {
        this.isPersonalTrainerNeeded = isPersonalTrainerNeeded;
    }
    
    
    
}
