package io.nordstar.personahrm.contract.services;

import io.nordstar.personahrm.contract.model.contract.ContractBaseRec;
import io.nordstar.personahrm.contract.model.contract.ContractRec;

import java.util.List;

public interface ContractsService {

//    CONTRACT CRUD
    public void createContract ( ContractRec contractData );

    public List<ContractBaseRec> retrieveContracts ( );

    public List<ContractBaseRec> searchContracts ( );

    public ContractRec retrieveContractByCode ( int contractCode );

    public ContractRec updateContract ( int personCode, ContractRec contractData );

    public void deleteContract ( int contractCode );

}
