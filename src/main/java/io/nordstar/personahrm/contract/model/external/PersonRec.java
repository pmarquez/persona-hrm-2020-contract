
package io.nordstar.personahrm.contract.model.external;

//   Standard Libraries Imports
import java.util.ArrayList;
import java.util.List;

//   Third Party Libraries Imports

//   FENIX Framework Imports

//   Application Domain Imports


/**
 * PersonRec.java<br><br>
 * Creation Date 2015-03-23 17:27<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br>
 * Version Date: 2015-03-23 17:27<br>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2015-03-23 17:27
 */
public class PersonRec extends PersonBaseRec {
    
    private List<AcademiaBaseRec> academia;

    public PersonRec ( ) {
        this.academia = new ArrayList<> ( );
    }

    /**
     * @return the academia
     */
    public List<AcademiaBaseRec> getAcademia() {
        return academia;
    }

    /**
     * @param academia the academia to set
     */
    public void setAcademia(List<AcademiaBaseRec> academia) {
        this.academia = academia;
    }


}
