package io.nordstar.personahrm.contract.dao;

//   Standard Libraries Imports


//   Third Party Libraries Imports


//   FENIX Framework Imports


//   Application Domain Imports


/**
 * ContractRepositoryImpl.java<br/><br/>
 * Creation Date 2019-10-07 15:18 PT<br/><br/>
 * <b>DESCRIPTION:</b><br/><br/>
 * <p></p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br/>
 * Version Date: 2019-10-07 15:18 PT<br/>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2019-10-07 15:18 PT
 */
public class ContractRepositoryImpl {

    //   Contracts CRUD
    private static final String RETRIEVE_CONTRACTS_SQL_QUERY =   "SELECT hrm_ctrc_contractentity.contractCode, "        +
                                                                        "hrm_ctrc_contractentity.contractId, "          +
                                                                        "hrm_ctrc_contractentity.contractTypeCode, "    +
                                                                        "hrm_ctrc_contractentity.personCode, "          +
                                                                        "hrm_ctrc_contractentity.companyCode, "         +
                                                                        "hrm_ctrc_contractentity.creationDate, "        +
                                                                        "hrm_ctrc_contractentity.activationDate, "      +
                                                                        "hrm_ctrc_contractentity.terminationDate, "     +
                                                                        "hrm_ctrc_contractentity.active "               +

                                                                 "FROM hrm_ctrc_contractentity "                        +

                                                                 "WHERE hrm_ctrc_contractentity.contractCode = 1";

}
