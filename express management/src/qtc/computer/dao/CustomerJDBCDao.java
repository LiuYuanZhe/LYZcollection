package qtc.computer.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import qtc.computer.domain.Customer;
import qtc.computer.util.DBHelper;

public class CustomerJDBCDao implements ICustomerDao {

	

	public void addCustomer(qtc.computer.domain.Customer customer) {
		String sql = "insert into tb_customer (name,password,email,gender,phone,rank)values('"+customer.getName()+"','"+customer.getPassword()+"','"+customer.getEmail()+"','"+customer.getGender()+"','"+customer.getPhone()+"','"+customer.getRank()+"')";
		Connection conn = DBHelper.getConnection();
		Statement stmt = null;//要是一开始在try里面写会报错，因为作用域不同。
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
			//System.out.print("添加数据为："+stmt.getUpdateCount());
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from tb_customer where id='"+id+"'";
		Connection conn = DBHelper.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);

			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

	public void updateCustomer(qtc.computer.domain.Customer customer) {
		int id = customer.getId();
		String sql = "UPDATE tb_customer SET name='"+customer.getName()+"',password='"+customer.getPassword()+"',email='"+customer.getEmail()+"',gender='"+customer.getGender()+"',phone='"+customer.getPhone()+"' where id='"+id+"'";
		Connection conn = DBHelper.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		


	}

	public qtc.computer.domain.Customer findCustomerById(int id) {
		Customer customer=new Customer();
		String sql = "select * from tb_customer where id='"+id+"'";
		Connection conn = DBHelper.getConnection();
		Statement stmt = null;
		try {
			  stmt = conn.createStatement();
			  stmt.execute(sql);
			  ResultSet rs = stmt.executeQuery(sql);
			
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString("name"));
				customer.setPassword(rs.getString(3));
	            customer.setEmail(rs.getString(4));
			    customer.setGender(rs.getString(5));
				customer.setPhone(rs.getString(6));
			    customer.setRank(rs.getInt(7));
		        rs.close();
			    stmt.close();
			    conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customer;
		
	}

	public ArrayList<qtc.computer.domain.Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		
		
		      
		        String sql = "select * from tb_customer";
				Connection conn = DBHelper.getConnection();
				Statement stmt = null;
				List<Customer> list=null;
				try {
					stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					list = new ArrayList<Customer>();
					while(rs.next()){
						Customer customer=new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),
								       rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
						list.add(customer);
					}
						
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return (ArrayList<Customer>) list;

	}

	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from user where username='"+name+"' and password='"+password+"'";
		
		conn = DBHelper.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
}
	public static void main(String args[]){
		
		//Customer customer = new Customer("xxxx", "xxxx", null,null,null,0);
		//ICustomerDao iCustomerDao = new CustomerJDBCDao();
		//iCustomerDao.addCustomer(customer);
		
		
		
	    /*ICustomerDao iCustomerDao = new CustomerJDBCDao();
		Customer customer=iCustomerDao.findCustomerById(2);
		System.out.println(customer.getId()+"  "+customer.getName()+"  "+customer.getPassword()+"  "+customer.getEmail()+"  "+customer.getGender()+"  "+customer.getPhone()+"  "+customer.getRank());*/
		
		/*ICustomerDao iCustomerDao = new CustomerJDBCDao();
		Customer customer = iCustomerDao.findCustomerById(1);
		System.out.println("ID  姓名             密码               邮箱            性别          电话           权限");
	    System.out.println(customer.getId()+"  "+customer.getName()+"  "
					  +customer.getPassword()+"  "+customer.getEmail()+"  "
					  +customer.getGender()+"  "+customer.getPhone()+"  "
					  +customer.getRank());*/

		

		/*System.out.println("要删除的id为"+2);
		ICustomerDao iCustomerDao = new CustomerJDBCDao();
		iCustomerDao.findById(2);*/
		/*System.out.println("要删除的id为"+2);

		ICustomerDao iCustomerDao = new CustomerJDBCDao();
		iCustomerDao.deleteById(10);*/
		

		//Customer customer = new Customer(1,"user1", "user", null,null,null,0);		
		//ICustomerDao iCustomerDao = new CustomerJDBCDao();
		//iCustomerDao.updateCustomer(customer);
		//浏览全部信息
				ICustomerDao iCustomerDao = new CustomerJDBCDao();
				List<Customer> list=iCustomerDao.findAllCustomers();
				Iterator<Customer> it=list.iterator();//迭代器？
				if(list != null && list.size()>0){
									for(int i=0;i<list.size();i++){  
										Customer customer1=it.next();	
									System.out.println(customer1.getId()+"         "+customer1.getName()+"         "+customer1.getPassword()
									   +"         "+customer1.getEmail()+"         "+customer1.getGender()+"         "+customer1.getPhone()
									   +"         "+customer1.getRank());  
						            }  
		       } 

				
			
    }
		
		


}


