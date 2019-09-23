
package io.nordstar.personahrm.contract.model.salary;

//   Standard Libraries Imports

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//   Third Party Libraries Imports

//   FENIX Framework Imports

//   Application Domain Imports

/**
 * SalaryBaseRec.java<br/><br/>
 * Creation Date 2015-03-28 16:57<br/><br/>
 * <b>DESCRIPTION:</b><br/><br/>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br/>
 * Version Date: 2015-03-28 16:57<br/>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2015-03-28 16:57
 */
public class SalaryBaseRec {
    private int           postCode;
    private String        postName;
    private int           salaryCode;
    private int           contractCode;
    private int           contractPostCode;
    private double        baseSalary;
    private LocalDateTime creationDate;
    private LocalDate     activationDate;
    private LocalDate     terminationDate;
    private boolean       active;

    public SalaryBaseRec ( ) {
        this.postCode         = 0;
        this.postName         = "";
        this.salaryCode       = 0;
        this.contractCode     = 0;
        this.contractPostCode = 0;
        this.baseSalary       = 0.0;
        this.creationDate     = LocalDateTime.now();
        this.activationDate   = LocalDate.MIN;
        this.terminationDate  = LocalDate.MAX;
        this.active           = false;
    }

    /**
     * @return the salaryCode
     */
    public int getSalaryCode() {
        return salaryCode;
    }

    /**
     * @param salaryCode the salaryCode to set
     */
    public void setSalaryCode(int salaryCode) {
        this.salaryCode = salaryCode;
    }

    /**
     * @return the contractCode
     */
    public int getContractCode ( ) {
        return contractCode;
    }

    /**
     * @param contractCode the contractCode to set
     */
    public void setContractCode ( int contractCode ) {
        this.contractCode = contractCode;
    }

    /**
     * @return the contractPostCode
     */
    public int getContractPostCode() {
        return contractPostCode;
    }

    /**
     * @param contractPostCode the contractPostCode to set
     */
    public void setContractPostCode(int contractPostCode) {
        this.contractPostCode = contractPostCode;
    }

    /**
     * @return the baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @param baseSalary the baseSalary to set
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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
    public void setCreationDateLDT ( LocalDateTime creationDate ) {
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

    /**
     * @return the activationDate
     */
    @JsonIgnore
    public LocalDate getActivationDateLD ( ) {
        return activationDate;
    }
    
    public String getActivationDate ( ) {
        return ( activationDate.equals ( LocalDate.MIN ) ) ? "" : ( activationDate.getYear ( ) + "-" + activationDate.getMonthValue ( ) + "-" + activationDate.getDayOfMonth ( ) );
    }

    /**
     * @param activationDate the activationDate to set
     */
    @JsonIgnore
    public void setActivationDateLD ( LocalDate activationDate ) {
        this.activationDate = activationDate;
    }
    
    public void setActivationDate ( String activationDate ) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ( "yyyy-MM-dd" );
        try {
            this.activationDate = LocalDate.parse ( activationDate, dtf );
        } catch ( DateTimeParseException dtpe ) {            
            this.activationDate = LocalDate.MIN;
        }
    }

    /**
     * @return the terminationDate
     */
    @JsonIgnore
    public LocalDate getTerminationDateLD ( ) {
        return terminationDate;
    }
    
    public String getTerminationDate ( ) {
        return ( terminationDate.equals ( LocalDate.MAX ) ) ? "" : ( terminationDate.getYear ( ) + "-" + terminationDate.getMonthValue ( ) + "-" + terminationDate.getDayOfMonth ( ) );
    }

    /**
     * @param terminationDate the terminationDate to set
     */
    @JsonIgnore
    public void setTerminationDateLD ( LocalDate terminationDate ) {
        this.terminationDate = terminationDate;
    }
    
    public void setTerminationDate ( String terminationDate ) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ( "yyyy-MM-dd" );
        try {
            this.terminationDate = LocalDate.parse ( terminationDate, dtf );
        } catch ( DateTimeParseException dtpe ) {            
            this.terminationDate = LocalDate.MAX;
        }
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the postCode
     */
    public int getPostCode() {
        return postCode;
    }

    /**
     * @param postCode the postCode to set
     */
    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    /**
     * @return the postName
     */
    public String getPostName() {
        return postName;
    }

    /**
     * @param postName the postName to set
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

}
