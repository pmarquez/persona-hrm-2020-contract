
package io.nordstar.personahrm.contract.model.contract;

//   Standard Libraries Imports

import org.pmh.persona.contract.post.ContractPostRec;
import org.pmh.persona.contract.salary.SalaryBaseRec;

import java.util.ArrayList;
import java.util.List;

//   Third Party Libraries Imports
//   FENIX Framework Imports
//   Application Domain Imports

/**
 * ContractsRec.java<br/><br/>
 * Creation Date 2015-03-25 19:33<br/><br/>
 * <b>DESCRIPTION:</b><br/><br/>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br/>
 * Version Date: 2015-03-25 19:33<br/>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2015-03-25 19:33
 */
public class ContractRec extends ContractBaseRec {
    
    private List<ContractPostRec> posts;
    private List<SalaryBaseRec>   salaries;
    
    public ContractRec ( ) {
        super ( );  
        
        posts    = new ArrayList<> ( );
        salaries = new ArrayList<> ( );
    }

    /**
     * @return the posts
     */
    public List<ContractPostRec> getPosts ( ) {
        return posts;
    }

    /**
     * @param posts the posts to set
     */
    public void setPosts ( List<ContractPostRec> posts ) {
        this.posts = posts;
    }

    /**
     * @return the salaries
     */
    public List<SalaryBaseRec> getSalaries() {
        return salaries;
    }

    /**
     * @param salaries the salaries to set
     */
    public void setSalaries(List<SalaryBaseRec> salaries) {
        this.salaries = salaries;
    }

}
