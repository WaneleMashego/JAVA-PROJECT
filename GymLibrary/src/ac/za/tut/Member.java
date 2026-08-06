/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut;

/**
 *
 * @author Wanele Mashego
 */
public class Member {
    
    private String name;
    private String surname;
    private String idNumber;
    private String gender;
    private String contractType;
    private Boolean isPersonalTrainerSelected;

    public Member(String name, String surname, String idNumber, String gender, String contractType, Boolean isPersonalTrainerSelected) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.gender = gender;
        this.contractType = contractType;
        this.isPersonalTrainerSelected = isPersonalTrainerSelected;
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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

    public Boolean getIsPersonalTrainerSelected() {
        return isPersonalTrainerSelected;
    }

    public void setIsPersonalTrainerSelected(Boolean isPersonalTrainerSelected) {
        this.isPersonalTrainerSelected = isPersonalTrainerSelected;
    }

   
    
}
