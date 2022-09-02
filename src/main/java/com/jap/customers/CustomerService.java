package com.jap.customers;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
public List<String> getListOfCustomersSortedByName(List<Customer> customerList){
    List<String> list = new ArrayList<>();
    Collections.sort(customerList);
    Iterator<Customer> iterator = customerList.iterator();
    while(iterator.hasNext()){
        list.add(iterator.next().getCustomerName());

    }
    return list;
}

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(10,"Abhishek","Male",false,"Indore"));
        customerList.add(new Customer(11,"Vaibhav","Male",false,"Indore"));
        customerList.add(new Customer(12,"Diwakar","Male",false,"Indore"));

        System.out.println(customerService.getListOfCustomersSortedByName(customerList));
    }
}
