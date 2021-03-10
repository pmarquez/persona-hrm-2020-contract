package io.nordstar.personahrm.contract.services;

import io.nordstar.personahrm.contract.model.contract.ContractBaseRec;
import io.nordstar.personahrm.contract.model.contract.ContractRec;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractsServiceImpl implements ContractsService {

    @Override
    public void createContract ( ContractRec contractData ) {

    }

    @Override
    public List<ContractBaseRec> retrieveContracts ( ) {
        return null;
    }

    @Override
    public List<ContractBaseRec> searchContracts ( ) {
        return null;
    }

    @Override
    public ContractRec retrieveContractByCode ( int contractCode ) {

        //   Retrieve Contract Base Data - HRM-2020-Contract

        //   Retrieve Person Data - HRM-2020-Person

        //   Retrieve Company Data - HRM-2020-Company

        return null;
    }

    @Override
    public ContractRec updateContract ( int personCode, ContractRec contractData ) {
        return null;
    }

    @Override
    public void deleteContract ( int contractCode ) {

    }
}
