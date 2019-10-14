
package io.nordstar.personahrm.contract.model.external.education;

//   Standard Libraries Imports
import java.time.LocalDate;
import java.time.LocalDateTime;

//   Third Party Libraries Imports
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//   FENIX Framework Imports

//   Application Domain Imports

/**
 * AcademiaBaseRec.java<br/><br/>
 * Creation Date 2019-09-15 19:59 PT<br/><br/>
 * <b>DESCRIPTION:</b><br/><br/>
 * <p>Keeps track of academic achievements.</p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br/>
 * Version Date: 2019-09-15 19:59 PT<br/>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2019-09-15 19:59 PT
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AcademiaBaseRec {
    private int           academiaCode;
    private int           personCode;
    private LocalDate     startDate;
    private LocalDate     endDate;
    private boolean       ongoing;
    private String        degreeName;
    private String        institution;      //   Educational Institution
    private String        institutionCity;
    private String        institutionState;
    private String        institutionCountry;
    private String        achievements;
    private LocalDateTime creationDate;

}
