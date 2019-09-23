
package io.nordstar.personahrm.contract.model.contract;

//   Standard Libraries Imports

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.nordstar.personahrm.contract.model.external.CompanyRec;
import io.nordstar.personahrm.contract.model.external.PersonRec;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//   Third Party Libraries Imports
//   FENIX Framework Imports
//   Application Domain Imports

/**
 * ContractsBaseRec.java<br/><br/>
 * Creation Date 2015-03-25 19:07<br/><br/>
 * <b>DESCRIPTION:</b><br/><br/>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br/>
 * Version Date: 2015-03-25 19:07<br/>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2015-03-25 19:07
 */
public class ContractBaseRec {
    private int            contractCode; 
    private int            contractTypeCode;
    private String         contractType;
    private int            personCode;
    private PersonRec      person;
    private int            companyCode;
    private CompanyRec     company;
    private LocalDateTime  creationDate;
    private LocalDate      activationDate;
    private LocalDate      terminationDate;
    private boolean        active; 

    public ContractBaseRec ( ) {
        super ( );
        
        this.contractCode     = 0;
        this.contractTypeCode = 0;
        this.contractType     = "";
        this.personCode       = 0;
        this.companyCode      = 0;
        this.creationDate     = LocalDateTime.now();
        this.activationDate   = LocalDate.MIN;
        this.terminationDate  = LocalDate.MAX;
        this.active           = false;
    }

    /**
     * @return the contractCode
     */
    public int getContractCode() {
        return contractCode;
    }

    /**
     * @param contractCode the contractCode to set
     */
    public void setContractCode(int contractCode) {
        this.contractCode = contractCode;
    }

    /**
     * @return the contractTypeCode
     */
    public int getContractTypeCode() {
        return contractTypeCode;
    }

    /**
     * @param contractTypeCode the contractTypeCode to set
     */
    public void setContractTypeCode(int contractTypeCode) {
        this.contractTypeCode = contractTypeCode;
    }

    /**
     * @return the contractType
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * @param contractType the contractType to set
     */
    public void setContractType(String contractType) {
        this.contractType = contractType;
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
     * @return the companyCode
     */
    public int getCompanyCode() {
        return companyCode;
    }

    /**
     * @param companyCode the companyCode to set
     */
    public void setCompanyCode(int companyCode) {
        this.companyCode = companyCode;
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
     * @return the person
     */
    public PersonRec getPerson ( ) {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson( PersonRec person ) {
        this.person = person;
    }

    /**
     * @return the company
     */
    public CompanyRec getCompany ( ) {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany ( CompanyRec company ) {
        this.company = company;
    }

}
