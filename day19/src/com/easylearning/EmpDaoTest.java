package com.easylearning;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoTest {
	
	public static void main(String[] args) {
		
		EmpDao dao = new EmpDao();
		dao.setConnection(ConnectionUtil.getConnection());
		
		//dao.addEmployees(getDummyList());
		
		printStartLine("fetch data by salary=5000");
		List<Employee> list = dao.getEmployeeBySalary(5000);
		list.forEach(System.out::println);
		
		printStartLine("fetch data by name");
		dao.getEmployeeByName("Sonu").forEach(System.out::println);
		
		printStartLine("Fetch Data for employees tables");
		//dao.displayAllDataOfEmployeestables();
		
		printStartLine("Procedure add example");
		dao.addNum(222, 123);
		
		printStartLine("test of execute method");
		//executeExample("update emp set salary=salary+1000");
		executeExample("create table abc123(id number)");
		
	}
	
	public static List<Employee> getDummyList(){
		List<Employee> empList =new ArrayList<Employee>();
		empList.add(new Employee(10,"Sam",5000));
		empList.add(new Employee(11,"Jessica",1000));
		empList.add(new Employee(12,"John",2000));
		empList.add(new Employee(13,"Mohit",5000));
		
		return empList;
	}
	
	private static void printStartLine(String msg) {
		System.out.println("-----------------------"+msg+"----------------------------------");
	}
	
	public static void executeExample(String sql) {
		
		try (Statement st = ConnectionUtil.getConnection().createStatement()) {
			if(st.execute(sql)) {
				ResultSet rs = st.getResultSet();
				System.out.println("Inside if");
			}else {
				System.out.println("inside else");
				int count= st.getUpdateCount();
				System.out.println(count+"  row affected...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
