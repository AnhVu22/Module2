package repository.impl;

import model.Contract;
import repository.IContractRepository;

import java.util.List;

public class ContractRepository implements IContractRepository {
    private List<Contract> contracts;

    public ContractRepository() {
    }

    public ContractRepository(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    @Override
    public void add(Contract item) {

    }

    @Override
    public void displayAll() {

    }
}
