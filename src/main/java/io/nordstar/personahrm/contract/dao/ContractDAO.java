package io.nordstar.personahrm.contract.dao;

//   Standard Libraries Imports
import java.util.ArrayList;
import java.util.List;

//   Third Party Libraries Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

//   FENIX Framework Imports


//   Application Domain Imports
import io.nordstar.personahrm.contract.model.contract.ContractBaseRec;

/**
 * ContractDAOImpl.java<br/><br/>
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
public class ContractDAO {
    @Autowired
    private JdbcTemplate contractJdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate contractNpJdbcTemplate;

    //   Contracts CRUD
    private static final String RETRIEVE_CONTRACTS_SQL_QUERY =  "SELECT hrm_ctrc_contractentity.contractCode, "        +
                                                                       "hrm_ctrc_contractentity.contractId, "          +
                                                                       "hrm_ctrc_contractentity.contractTypeCode, "    +
                                                                       "hrm_ctrc_contractentity.personCode, "          +
                                                                       "hrm_ctrc_contractentity.companyCode, "         +
                                                                       "hrm_ctrc_contractentity.creationDate, "        +
                                                                       "hrm_ctrc_contractentity.activationDate, "      +
                                                                       "hrm_ctrc_contractentity.terminationDate, "     +
                                                                       "hrm_ctrc_contractentity.active "               +

                                                                "FROM hrm_ctrc_contractentity "                        +

                                                                "ORDER BY ACTIVATION_DATE";

    private static final String RETRIEVE_CONTRACT_BY_CODE_SQL_QUERY =   "SELECT hrm_ctrc_contractentity.contractCode, "        +
                                                                               "hrm_ctrc_contractentity.contractId, "          +
                                                                               "hrm_ctrc_contractentity.contractTypeCode, "    +
                                                                               "hrm_ctrc_contractentity.personCode, "          +
                                                                               "hrm_ctrc_contractentity.companyCode, "         +
                                                                               "hrm_ctrc_contractentity.creationDate, "        +
                                                                               "hrm_ctrc_contractentity.activationDate, "      +
                                                                               "hrm_ctrc_contractentity.terminationDate, "     +
                                                                               "hrm_ctrc_contractentity.active "               +

                                                                        "FROM hrm_ctrc_contractentity "                        +

                                                                        "WHERE hrm_ctrc_contractentity.contractCode = ";

    /**
     *
     * @return
     */
    public List<ContractBaseRec> retrieveContracts ( ) {

        List<ContractBaseRec> persons = new ArrayList<> ( );

        try {
            persons = contractJdbcTemplate.query ( RETRIEVE_CONTRACTS_SQL_QUERY,
                    ( rs, rowNum ) -> new ContractBaseRec (   rs.getInt     ( "contractCode"     ),
                            rs.getString  ( "contractId"       ),
                            rs.getInt     ( "contractTypeCode" ),
                            "",
                            rs.getInt     ( "personCode"       ),
                            null,
                            rs.getInt     ( "companyCode"      ),
                            null,
                            rs.getString  ( "creationDate"     ),
                            rs.getString  ( "startDate"        ),
                            rs.getString  ( "terminationDate"  ),
                            rs.getBoolean ( "active"           )
                    )
            );

        } catch ( InvalidResultSetAccessException irsae ) {
            System.out.println ( "InvalidResultSetAccessException: " + irsae.getStackTrace ( ) );

        } catch ( DataAccessException dae ) {
            System.out.println ( "DataAccessException: " + dae.getStackTrace ( ) );

        } catch ( Exception e ) {
            System.out.println ( "Exception: " + e.getStackTrace ( ).toString ( ) );

        }

        return persons;

    }
}

