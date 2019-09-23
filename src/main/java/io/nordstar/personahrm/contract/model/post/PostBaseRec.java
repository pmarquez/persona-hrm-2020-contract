
package io.nordstar.personahrm.contract.model.post;

//   Standard Libraries Imports

//   Third Party Libraries Imports

//   FENIX Framework Imports

//   Application Domain Imports

/**
 * PostBaseRec.java<br/><br/>
 * Creation Date 2015-03-26 12:43<br/><br/>
 * <b>DESCRIPTION:</b><br/><br/>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br/>
 * Version Date: 2015-03-26 12:43<br/>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2015-03-26 12:43
 */
public class PostBaseRec {
    private int     postCode;              //   AutoIncrement Post Code
    private String  postId;                //   Internal Post Code
    private String  postName;
    private int     companyCode;
    private int     departmentCode;
    private String  departmentId;
    private String  departmentName;
    private int     supervisorPostCode;
    private String  supervisorPostName;
    private boolean active;

    public PostBaseRec ( ) {
        this.postCode           = 0;
        this.postId             = "";
        this.postName           = "";
        this.companyCode        = 0;
        this.departmentCode     = 0;
        this.departmentId       = "";
        this.departmentName     = "";
        this.supervisorPostCode = 0;
        this.supervisorPostName = "";
        this.active             = false;
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
     * @return the companyCode
     */
    public int getCompanyCode ( ) {
        return companyCode;
    }

    /**
     * @param companyCode the companyCode to set
     */
    public void setCompanyCode ( int companyCode ) {
        this.companyCode = companyCode;
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
    public void setDepartmentCode ( int departmentCode ) {
        this.departmentCode = departmentCode;
    }

    /**
     * @return the departmentId
     */
    public String getDepartmentId ( ) {
        return departmentId;
    }

    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId ( String departmentId ) {
        this.departmentId = departmentId;
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName ( ) {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName ( String departmentName ) {
        this.departmentName = departmentName;
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
    
}
