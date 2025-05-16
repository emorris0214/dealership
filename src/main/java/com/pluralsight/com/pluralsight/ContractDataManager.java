package com.pluralsight;

// Business Logic Layer (Determines contract type, manages contract flow)
/**
 * ContractDataManager handles the business logic of saving contract data
 * and deciding how to handle different contract types (sale or lease).
 * It delegates actual file saving to ContractFileManager.
 */
public class ContractDataManager {
    protected ContractFileManager fileManager;

    // Constructor
    public ContractDataManager() {
        this.fileManager = new ContractFileManager();
    }

    /**
     * Saves the contract by checking its type and sending it to the file manager.
     * Uses instanceof to distinguish between SalesContract and LeaseContract.
     *
     * @param contract The contract to be saved (either sale or lease)
     */
    public void saveContract(Contract contract) {
        // Determine contract type
        if (contract instanceof SalesContract) {
            SalesContract salesContract = (SalesContract) contract;
            fileManager.saveContract(salesContract);
        } else if (contract instanceof LeaseContract) {
            LeaseContract leaseContract = (LeaseContract) contract;
            fileManager.saveContract(leaseContract);
        } else {
            System.out.println("Unknown contract type. Contract not saved.");
        }
    }
}