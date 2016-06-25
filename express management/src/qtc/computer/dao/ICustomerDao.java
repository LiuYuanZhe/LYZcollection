package qtc.computer.dao;

import java.util.ArrayList;

import qtc.computer.domain.Customer;

public interface ICustomerDao {
	/*
	 * 声明 对customer的操作
	 */
	void addCustomer(Customer customer);//添加一个用户
	void deleteCustomerById(int id);
	void updateCustomer(Customer customer);
	Customer findCustomerById(int id);
	ArrayList<Customer> findAllCustomers();
	boolean login(String name,String password);

}
