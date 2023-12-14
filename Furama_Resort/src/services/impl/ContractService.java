package services.impl;

import model.Contract;
import services.IContractService;

import java.util.List;

public class ContractService implements IContractService {
    private List<Contract> contracts;

    public ContractService() {
    }

    public ContractService(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    @Override
    public void addContract(Contract contract) {
    }

    @Override
    public void displayContracts() {
    }

    @Override
    public void displayInfo() {
    }
}
