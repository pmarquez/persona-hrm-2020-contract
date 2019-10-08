package io.nordstar.personahrm.contract.web.controller;

//   Standard Libraries Imports
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

//   Third Party Libraries Imports
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
    private static final String REQUESTED_PERSON_DOES_NOT_EXIST                 = "CONTRACTS_008";   //   The requested contract does not exist.

    private final ContractsService contractsService;

    /**
     * Constructor
     *
     * @param contractsService
     */
    public ContractsRestController ( ContractsService contractsService ) {
        this.contractsService = contractsService;
    }

    @PostMapping ( value = "/contractsAPI/1.0/contracts/contract" )
    public ResponseEntity createContract ( @RequestBody ContractRec contractData ) {

        this.contractsService.createContract ( contractData );

        return new ResponseEntity ( HttpStatus.CREATED );
    }

    /**
     * Retrieves a list of persons from storage.
     * @return ResponseRec<List<PersonBaseRec>>
     */
    @GetMapping ( value = "/contractsAPI/1.0/contracts/persons" )
    public ResponseEntity<List<PersonBaseRec>> personList ( ) {

        List<PersonBaseRec> l = this.personsService.retrievePersons ( );

        ResponseEntity response = null;

        if ( l.size ( ) > PersonsRestController.EMPTY_PERSON_LIST ) {
            response = new ResponseEntity ( l, HttpStatus.OK );
            logger.info ( "personList.response - Status OK" );

        } else {
            response = new ResponseEntity ( l, HttpStatus.NOT_FOUND );

        }

        return response;
    }

    /**
     * Retrieves a single person from storage
     * @param personCode
     * @return ResponseRec<PersonRec>
     */
    @GetMapping ( value = "/contractsAPI/1.0/contracts/persons/{personCode}" )
    public ResponseEntity<PersonRec> retrievePersonByCode ( @PathVariable int personCode ) {

        PersonRec r = this.personsService.retrievePersonByCode ( personCode );

        ResponseEntity response = null;

        if ( r.getPersonCode ( ) > PersonsRestController.EMPTY_PERSON_REC ) {
            response = new ResponseEntity ( r, HttpStatus.OK );

        } else {
            response = new ResponseEntity ( r, HttpStatus.NOT_FOUND );

        }

        return response;

    }

    /**
     *
     * @param personCode
     * @param personData
     * @return
     */
    @PutMapping ( value = "/contractsAPI/1.0/contracts/persons/{personCode}" )
    public ResponseEntity updatePerson ( @PathVariable int personCode, @RequestBody PersonRec personData ) {

        this.personsService.updatePerson ( personCode, personData );

        return new ResponseEntity ( HttpStatus.NO_CONTENT );

    }

    /**
     *
     * @param personCode
     */
    @DeleteMapping ( value = "/contractsAPI/1.0/contracts/persons/{personCode}" )
    public ResponseEntity deletePerson ( int personCode ) {

        this.personsService.deletePerson ( personCode );

        return new ResponseEntity ( HttpStatus.NO_CONTENT );

    }

    /**
     * Checks whether a person exists in storage.
     * @param personCode
     * @return ResponseEntity<Boolean>
     * @since 1.0
     */
    @GetMapping ( value = "/contractsAPI/1.0/contracts/exists/{personCode}" )
    public ResponseEntity personExists ( @PathVariable int personCode ) {
        ResponseEntity response = new ResponseEntity ( HttpStatus.OK );
        return response;
    }


}
