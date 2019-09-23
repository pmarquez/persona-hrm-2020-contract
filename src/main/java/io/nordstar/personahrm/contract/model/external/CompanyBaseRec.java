
package io.nordstar.personahrm.contract.model.external;

//   Standard Libraries Imports

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//   Third Party Libraries Imports

//   FENIX Framework Imports

//   Application Domain Imports


/**
 * CompanyBaseRec.java<br/><br/>
 * Creation Date 2015-03-24 09:40<br/><br/>
 * <b>DESCRIPTION:</b><br/><br/>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br/>
 * Version Date: 2015-03-24 09:40<br/>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2015-03-24 09:40
 */
public class CompanyBaseRec {
    
    private int          companyCode;
    private String       taxId;
    private String       name;

    private int          companyTypeCode;
    private String       companyType;

    private String       companySocialSecurityNumber;
    
    private String       email;
    private String       web;
    private String       phone;
    private String       fax;
    
    private LocalDateTime creationDate;

    private boolean      active;

//    private ListaContactoEmpresaRec     contactos;
//    private ListaDireccionPostalRec     direcciones;

    public CompanyBaseRec ( ) {
        this.companyCode                 = 0;
        this.taxId                       = "";
        this.name                        = "";
        this.companyTypeCode             = 0;
        this.companyType                 = "";
        this.companySocialSecurityNumber = "";
        this.email                       = "";
        this.web                         = "";
        this.phone                       = "";
        this.fax                         = "";
        this.creationDate                = LocalDateTime.now ( );
        this.active                      = false;
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
     * @return the taxId
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * @param taxId the taxId to set
     */
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the companyTypeCode
     */
    public int getCompanyTypeCode() {
        return companyTypeCode;
    }

    /**
     * @param companyTypeCode the companyTypeCode to set
     */
    public void setCompanyTypeCode(int companyTypeCode) {
        this.companyTypeCode = companyTypeCode;
    }

    /**
     * @return the companyType
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * @param companyType the companyType to set
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    /**
     * @return the companySocialSecurityNumber
     */
    public String getCompanySocialSecurityNumber() {
        return companySocialSecurityNumber;
    }

    /**
     * @param companySocialSecurityNumber the companySocialSecurityNumber to set
     */
    public void setCompanySocialSecurityNumber(String companySocialSecurityNumber) {
        this.companySocialSecurityNumber = companySocialSecurityNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the web
     */
    public String getWeb() {
        return web;
    }

    /**
     * @param web the web to set
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
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

}
