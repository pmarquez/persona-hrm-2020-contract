
package io.nordstar.personahrm.contract.model.external;

//   Standard Libraries Imports

//   Third Party Libraries Imports

//   FENIX Framework Imports

//   Application Domain Imports


/**
 * CompanyOrganizationalRec.java<br><br>
 * Creation Date 2015-04-05 15:53<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br>
 * Version Date: 2015-04-05 15:53<br>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez Herrero
 * @version 1.0 - 2015-04-05 15:53
 */
public class CompanyOrganizationalRec {
    private int     companyCode;
    private String  companyName;
    private int     departmentCode;
    private String  departmentName;
    private int     postCode; 
    private String  postId;
    private String  postName;
    private int     numPostOpenings;
    private int     supervisorPostCode;
    private boolean active;

    public CompanyOrganizationalRec ( ) {
        this.companyCode        = 0;
        this.companyName        = "";
        this.departmentCode     = 0;
        this.departmentName     = "";
        this.postCode           = 0;
        this.postId             = "";
        this.postName           = "";
        this.numPostOpenings    = 0;
        this.supervisorPostCode = 0;
        this.active             = false;
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
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
     * @return the postId
     */
    public String getPostId() {
        return postId;
    }

    /**
     * @param postId the postId to set
     */
    public void setPostId(String postId) {
        this.postId = postId;
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
     * @return the numPostOpenings
     */
    public int getNumPostOpenings() {
        return numPostOpenings;
    }

    /**
     * @param numPostOpenings the numPostOpenings to set
     */
    public void setNumPostOpenings(int numPostOpenings) {
        this.numPostOpenings = numPostOpenings;
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
