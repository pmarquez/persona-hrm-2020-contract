package io.nordstar.personahrm.contract.web.controller;

//   Standard Libraries Imports
import java.util.List;

//   Third Party Libraries Imports
import io.nordstar.personahrm.contract.model.contract.ContractBaseRec;
import io.nordstar.personahrm.contract.model.contract.ContractRec;
import io.nordstar.personahrm.contract.web.services.ContractsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//   FENIX Framework Imports

//   Application Domain Imports


/**
 * ContractsRestController.java<br><br>
 * Creation Date 2019-10-08 11:04 PT<br><br>
 * <b>DESCRIPTION:</b><br><br>
 * <p>Rest Controller for all things PERSON</p>
 *
 *<PRE>
 *<table width="90%" border="1" cellpadding="3" cellspacing="2">
 *<tr><th colspan="2">   History   </th></tr>
 *
 *<tr>
 *<td width="20%">Version 1.0<br>
 * Version Date: 2019-10-08 11:04 PT<br>
 * Version Creator: Paulo Márquez</td>
 *<td width="80%"><p>Creation</p></td>
 *</tr>
 *</table>
 *</PRE>
 * @author Paulo Márquez
 * @version 1.0 - 2019-10-08 11:04 PT
 */
@RestController
public class ContractsRestController {

    private static final Logger logger = LogManager.getLogger ( ContractsRestController.class );

    //   Controller Constants
    private static final int EMPTY_CONTRACT_LIST = 0;
    private static final int EMPTY_CONTRACT_REC  = 0;

    //   Response Status
    private static final String OPERATION_SUCCESSFUL                            = "CONTRACTS_001";   //   The requested operation was successfully completed.
    private static final String NO_CONTRACT_FOUND                               = "CONTRACTS_002";   //   Could not find requested contract.
    private static final String NO_CONTRACTS_FOUND                              = "CONTRACTS_003";   //   The requested list of contract is empty.
    private static final String INVALID_USER_PRIVILEGES                         = "CONTRACTS_004";   //   User does not have the required privileges for this call.
    private static final String INVALID_AUTHORIZATION_TOKEN                     = "CONTRACTS_005";   //   Authorization token received is not valid.
    private static final String INTERNAL_ERROR_ENCOUNTERED                      = "CONTRACTS_006";   //   An internal error was encountered.
    private static final String REQUESTED_CONTRACT_EXISTS                       = "CONTRACTS_007";   //   The requested contract does exist.
    private static final String REQUESTED_CONTRACT_DOES_NOT_EXIST               = "CONTRACTS_008";   //   The requested contract does not exist.

    private final ContractsService contractsService;

    /**
     * Constructor
     *
     * @param //contractsService
     */
    public ContractsRestController ( ContractsService contractsService ) {
        this.contractsService = contractsService;
    }

    @PostMapping ( value = "/contractsAPI/1.0/contracts/contract" )
    public ResponseEntity createContract ( @RequestBody ContractRec contractData ) {
        return new ResponseEntity ( HttpStatus.CREATED );
    }

    /**
     * Retrieves a list of contracts from storage.
     * @return ResponseRec<List<ContractBaseRec>>
     */
    @GetMapping ( value = "/contractsAPI/1.0/contracts/contracts" )
    public ResponseEntity<List<ContractBaseRec>> contractsList ( ) {

        ResponseEntity response = new ResponseEntity ( null, HttpStatus.OK );

        return response;
    }

    /**
     * Retrieves a single contract from storage
     * @param contractCode
     * @return ResponseRec<ContractRec>
     */
    @GetMapping ( value = "/contractsAPI/1.0/contracts/contracts/{contractCode}" )
    public ResponseEntity<ContractRec> retrieveContractByCode ( @PathVariable ( "contractCode" ) int contractCode ) {

        ResponseEntity response = new ResponseEntity ( null, HttpStatus.OK );
        return response;

    }

    /**
     *
     * @param contractCode
     * @param contractData
     * @return
     */
    @PutMapping ( value = "/contractsAPI/1.0/contracts/contracts/{contractCode}" )
    public ResponseEntity updateContract ( @PathVariable ( "contractCode" ) int contractCode, @RequestBody ContractRec contractData ) {
        return new ResponseEntity ( HttpStatus.NO_CONTENT );
    }

    /**
     *
     * @param contractCode
     */
    @DeleteMapping ( value = "/contractsAPI/1.0/contracts/contract/{contractCode}" )
    public ResponseEntity deleteContract ( @PathVariable ( "contractCode" ) int contractCode ) {

        return new ResponseEntity ( HttpStatus.NO_CONTENT );

    }

}
