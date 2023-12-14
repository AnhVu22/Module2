package services;

import model.Contract;

public interface IContractService extends Service{
    void addContract(Contract contract);
    void displayContracts();
}
