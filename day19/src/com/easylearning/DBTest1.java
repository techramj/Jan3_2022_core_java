package com.easylearning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBTest1 {
	
	private static Connection connection = ConnectionUtil.getConnection();

	public static void main(String[] args) {

		
		//sql injection
		String str="Sonu' union select id,password, null from emp_user where '1' ='1";
		String str1="Sonu";
		displayEmpDetails(str);
		
		//list of emp
		
		List<Employee> empList =new ArrayList<Employee>();
		empList.add(new Employee(10,"Sam",5000));
		empList.add(new Employee(11,"Jessica",1000));
		empList.add(new Employee(12,"John",2000));
		empList.add(new Employee(13,"Mohit",8000));
		
		
	}
	
	public static void insertEmp(int id,String name,double salary) {
		String sql="insert into emp values (?,?,?)";
		try(PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, salary);
			

			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void displayEmpDetail1(String name) {
		String sql="select name,salary from emp where name = ?";
		try(PreparedStatement ps= connection.prepareStatement(sql)){
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String nm = rs.getString(1);   //rs.getString("name")
			    double salary = rs.getDouble(2);
			    System.out.println("name: "+nm+"  salary:"+salary);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void displayEmpDetails(String name) {
		String sql ="select * from emp where name = ?";
		//System.out.println( sql);
		try(PreparedStatement st= connection.prepareStatement(sql)){
			st.setString(1, name);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);   
				String nm=rs.getString("name");
			    double salary = rs.getDouble(3);
			    System.out.println("id: "+id+"    name: "+nm+"  salary:"+salary);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void displayEmpDetail(String id) {
		String sql="select name,salary from emp where id="+id;
		try(Statement st= connection.createStatement()){
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString(1);   //rs.getString("name")
			    double salary = rs.getDouble(2);
			    System.out.println("name: "+name+"  salary:"+salary);
			}
		}catch(SQLException e) {
			
		}
	}
	
	public static void addEmp(int id,String name, double salary) {
		String sql="insert into emp(id,name,salary) values ("+id+", '"+name+"', "+salary+")";
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();

		try (Statement st = con.createStatement();) {
			int x = st.executeUpdate(sql);
			System.out.println(x + " row updated");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public static void updateSalary(int id, double newSalary) {
		String sql="update emp set salary="+newSalary+" where id="+id;
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();

		try (Statement st = con.createStatement();) {
			int x = st.executeUpdate(sql);
			System.out.println(x + " row updated");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public static void deleteEmp(int id) {
		String sql="delete emp where id="+id;
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();

		try (Statement st = con.createStatement();) {
			int x = st.executeUpdate(sql);
			System.out.println(x + " row updated");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}


	public static void insertDummyData(String sql) {
		Connection con = ConnectionUtil.getConnection();

		try (Statement st = con.createStatement();) {
			int x = st.executeUpdate(sql);
			System.out.println(x + " row updated");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	


	public static void insertDummyData1() {
		String sql = "insert into emp(id,name,salary) values (3,'Sam',15000)";
		Connection con = ConnectionUtil.getConnection();

		try (Statement st = con.createStatement();) {
			int x = st.executeUpdate(sql);
			System.out.println(x + " row updated");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static void insertDummyData() {
		String sql = "insert into emp(id,name,salary) values (1,'Jessica',5000)";
		Connection con = ConnectionUtil.getConnection();
		Statement st = null;
		try {
			st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
