package io.nordstar.personahrm.contract.web.services;

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
