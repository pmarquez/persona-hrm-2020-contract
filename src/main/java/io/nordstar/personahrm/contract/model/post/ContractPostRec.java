
package io.nordstar.personahrm.contract.model.post;

//   Standard Libraries Imports
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//   Third Party Libraries Imports
import com.fasterxml.jackson.annotation.JsonIgnore;

//   FENIX Framework Imports

//   Application Domain Imports

/**
 * ContractPostRec.java<br/><br/>
 * Creation Date 2015-03-26 12:50<br/><br/>
 * <b>DESCRIPTION:</b><br/><br/>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br/>
 * Version Date: 2015-03-26 12:50<br/>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2015-03-26 12:50
 */
public class ContractPostRec {
    private int           contractPostCode;
    private int           contractCode;
    private int           departmentCode;
    private String        departmentName;
    private int           postCode;
    private String        postName;
    private int           supervisorPostCode;
    private String        supervisorPostName;
    private int           supervisorPersonCode;   //  Future Expansion
    private LocalDateTime creationDate;
    private LocalDate     activationDate;
    private LocalDate     terminationDate;
    private boolean       active;
    
    public ContractPostRec ( ) {
        this.contractPostCode     = 0;
        this.contractCode         = 0;
        this.departmentCode       = 0;
        this.departmentName       = "";
        this.postCode             = 0;
        this.postName             = "";
        this.supervisorPostCode   = 0;
        this.supervisorPostName   = "";
        this.supervisorPersonCode = 0;
        this.creationDate         = LocalDateTime.now ( );
        this.activationDate       = LocalDate.MIN;
        this.terminationDate      = LocalDate.MAX;
        this.active               = false;
    }

    /**
     * @return the contractPostCode
     */
    public int getContractPostCode ( ) {
        return contractPostCode;
    }

    /**
     * @param contractPostCode the contractPostCode to set
     */
    public void setContractPostCode(int contractPostCode) {
        this.contractPostCode = contractPostCode;
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
     * @return the departmentCode
     */
    public int getDepartmentCode() {
        return departmentCode;
    }

    /**
     * @param departmentCode the departmentCode to set
     */
    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
        return ( activationDate.equals ( LocalDate.MAX ) ) ? "" : ( activationDate.getYear ( ) + "-" + activationDate.getMonthValue ( ) + "-" + activationDate.getDayOfMonth ( ) );
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
            this.activationDate = LocalDate.MAX;
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
        return ( terminationDate.equals ( LocalDate.MIN ) ) ? "" : ( terminationDate.getYear ( ) + "-" + terminationDate.getMonthValue ( ) + "-" + terminationDate.getDayOfMonth ( ) );
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
            this.terminationDate = LocalDate.MIN;
        }
    }

    /**
     * @return the supervisorPostCode
     */
    public int getSupervisorPostCode() {
        return supervisorPostCode;
    }

    /**
     * @param supervisorPostCode the supervisorPostCode to set
     */
    public void setSupervisorPostCode(int supervisorPostCode) {
        this.supervisorPostCode = supervisorPostCode;
    }

    /**
     * @return the supervisorPostName
     */
    public String getSupervisorPostName() {
        return supervisorPostName;
    }

    /**
     * @param supervisorPostName the supervisorPostName to set
     */
    public void setSupervisorPostName(String supervisorPostName) {
        this.supervisorPostName = supervisorPostName;
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
     * @return the supervisorPersonCode
     */
    public int getSupervisorPersonCode() {
        return supervisorPersonCode;
    }

    /**
     * @param supervisorPersonCode the supervisorPersonCode to set
     */
    public void setSupervisorPersonCode(int supervisorPersonCode) {
        this.supervisorPersonCode = supervisorPersonCode;
    }
}
