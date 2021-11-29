package thao.service;

import org.springframework.beans.factory.annotation.Autowired;
import thao.model.Customer;
import thao.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerRepository.insertWithStoredProcedure(customer);
    }
}