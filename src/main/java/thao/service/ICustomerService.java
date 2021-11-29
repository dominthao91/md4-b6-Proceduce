package thao.service;

import thao.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}