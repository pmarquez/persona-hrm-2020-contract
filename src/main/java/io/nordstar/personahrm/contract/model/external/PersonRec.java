
package io.nordstar.personahrm.contract.model.external;

//   Standard Libraries Imports
import java.util.List;

//   Third Party Libraries Imports
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//   FENIX Framework Imports

//   Application Domain Imports
import io.nordstar.personahrm.contract.model.external.AcademiaBaseRec;


/**
 * PersonRec.java<br><br>
 * Creation Date 2019-09-15 19:58 PT<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br>
 * Version Date: 2019-09-15 19:58 PT<br>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2019-09-15 19:58 PT
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonRec extends PersonBaseRec {

    private List<AcademiaBaseRec> academia;

}
