package io.nordstar.personahrm.contract.model.external;

//   Standard Libraries Imports

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//   Third Party Libraries Imports

//   FENIX Framework Imports

//   Application Domain Imports


/**
 * PersonBaseRec.java<br/><br/>
 * Creation Date 2015-02-09 07:19<br/><br/>
 * <b>DESCRIPTION:</b><br/><br/>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br/>
 * Version Date: 2015-02-09 07:19<br/>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2015-02-09 07:19
 */
public class  PersonBaseRec {
    private int           personCode;
    private int           idTypeCode;
    private String        idType;
    private String        idNumber;
    private String        firstName;
    private String        middleName;
    private String        lastName;
    private int           genderCode;
    private String        gender;
    private String        socialSecurityNumber;
    private LocalDate     birthDate;
    private LocalDateTime creationDate;
    private Boolean       active;
    
    public PersonBaseRec ( ) {
        this.personCode           = 0;
        this.idTypeCode           = 0;
        this.idType               = "";
        this.idNumber             = "";
        this.firstName            = "";
        this.middleName           = "";
        this.lastName             = "";
        this.genderCode           = 0;
        this.gender               = "";
        this.socialSecurityNumber = "";
        this.birthDate            = LocalDate.MIN;
        this.creationDate         = LocalDateTime.now ( );
        this.active               = false;
    }
    
    public int getAge ( ) {
        int age = 0;
        
        LocalDate today = LocalDate.now ( );
        
//        LocalDate birthday = LocalDate.of ( 1965, Month.MARCH, 3 );

        Period p = Period.between ( birthDate, today );

//   Now access the values as below
//        System.out.println ( p.getDays   ( ) );
//        System.out.println ( p.getMonths ( ) );
//        System.out.println ( p.getYears  ( ) );

        return p.getYears  ( );
    }

    /**
     * @return the personCode
     */
    public int getPersonCode() {
        return personCode;
    }

    /**
     * @param personCode the personCode to set
     */
    public void setPersonCode(int personCode) {
        this.personCode = personCode;
    }

    /**
     * @return the idTypeCode
     */
    public int getIdTypeCode() {
        return idTypeCode;
    }

    /**
     * @param IdTypeCode the idTypeCode to set
     */
    public void setIdTypeCode(int IdTypeCode) {
        this.idTypeCode = IdTypeCode;
    }

    /**
     * @return the idType
     */
    public String getIdType() {
        return idType;
    }

    /**
     * @param idType the idType to set
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * @return the idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    
    /**
     * @return the personFullName
     */
    public String getPersonFullName ( ) {
        return this.firstName + " " + 
               ( ( this.middleName.equals ( "" ) ) ? "" : this.middleName + " " ) + 
               this.lastName;
    }    

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the birthDate
     */
    @JsonIgnore
    public LocalDate getBirthDateLD ( ) {
        return birthDate;
    }

    public String getBirthDate ( ) {
        return ( birthDate.equals ( LocalDate.MIN ) ) ? "" : ( birthDate.getYear ( ) + "-" + birthDate.getMonthValue ( ) + "-" + birthDate.getDayOfMonth ( ) );
    }

    /**
     * @param birthDate the birthDate to set
     */
    @JsonIgnore
    public void setBirthDateLD ( LocalDate birthDate ) {
        this.birthDate = birthDate;
    }

    public void setBirthDate ( String birthDate ) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ( "yyyy-MM-dd" );
        try {
            this.birthDate = LocalDate.parse ( birthDate, dtf );
        } catch ( DateTimeParseException dtpe ) {            
            System.err.println ( dtpe.getCause ( ) );            
            this.birthDate = LocalDate.MIN;
        }
    }

    /**
     * @return the socialSecurityNumber
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * @param socialSecurityNumber the socialSecurityNumber to set
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * @return the genderCode
     */
    public int getGenderCode() {
        return genderCode;
    }

    /**
     * @param genderCode the genderCode to set
     */
    public void setGenderCode(int genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * @return the creationDate
     */
    @JsonIgnore
    public LocalDateTime getCreationDateLDT ( ) {
        return creationDate;
    }
    
    public String getCretionDate ( ) {
        return ( creationDate.equals ( LocalDateTime.MIN ) ) ? "" : ( creationDate.getYear ( ) + "-" + creationDate.getMonthValue ( ) + "-" + creationDate.getDayOfMonth ( ) + " " + 
               creationDate.getHour ( ) + ":" + creationDate.getMinute ( ) + ":" + creationDate.getSecond ( ) );
    }

    /**
     * @param creationDate the creationDate to set
     */
    @JsonIgnore
    public void setCreationDate ( LocalDateTime creationDate ) {
        this.creationDate = creationDate;
    }
    
    public void setCreationDate ( String creationDate ) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ( "yyyy-MM-dd HH:mm:ss" );
        try {
            this.creationDate = LocalDateTime.parse ( creationDate, dtf );
        } catch ( DateTimeParseException dtpe ) {            
            this.creationDate = LocalDateTime.MIN;
        }
    }

}
