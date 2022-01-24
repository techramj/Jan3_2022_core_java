package com.easylearning;

import java.lang.reflect.Parameter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {

	private Connection connection;

	public int addEmployee(Employee emp) {
		return addEmployee(emp.getId(), emp.getName(), emp.getSalary());
	}

	public int addEmployee(int id, String name, double salary) {
		String sql = "insert into emp(id,name,salary) values (?,?,?)";

		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, salary);
			return ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void addEmployees(List<Employee> empList) {
		String sql = "insert into emp(id,name,salary) values (?,?,?)";

		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			for (Employee emp : empList) {
				ps.setInt(1, emp.getId());
				ps.setString(2, emp.getName());
				ps.setDouble(3, emp.getSalary());
				ps.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		/*
		 * for(Employee emp: empList) { String
		 * sql="insert into emp(id,name,salary) values ("+emp.getId()+", '"+emp.getName(
		 * )+"', "+emp.getSalary()+")"; System.out.println(sql); Connection con =
		 * ConnectionUtil.getConnection();
		 * 
		 * try (Statement st = con.createStatement();) { int x = st.executeUpdate(sql);
		 * System.out.println(x + " row updated"); } catch (SQLException e) {
		 * 
		 * e.printStackTrace(); } }
		 */
	}

	public void delete(int id) {

	}

	public List<Employee> getEmployeeByName(String name) {
		String sql = "select * from emp where name = ?";
		Object[] params = { name };
		return queryList(sql, params);
	}

	public List<Employee> getEmployeeByName1(String name) {
		String sql = "select * from emp where name = ?";
		List<Employee> emplist = new ArrayList<Employee>();
		try (PreparedStatement st = connection.prepareStatement(sql)) {
			st.setString(1, name);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				emplist.add(fetchEmp(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emplist;
	}

	public List<Employee> getEmployeeBySalary(double salary) {
		String sql = "select * from emp where salary = ?";
		Object[] params = { salary };
		return queryList(sql, params);
	}

	public List<Employee> queryList(String sql, Object[] paramters) {
		List<Employee> emplist = new ArrayList<Employee>();
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			for (int i = 0; i < paramters.length; i++) {
				ps.setObject(i + 1, paramters[i]);
			}
			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					emplist.add(fetchEmp(rs));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emplist;
	}

	public void displayAllDataOfEmployeestables() {
		String sql = "select * from employees";
		try (Statement st = connection.createStatement()) {
			ResultSet rs = st.executeQuery(sql);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int noOfColumn = rsmd.getColumnCount();
			for (int i = 1; i <= noOfColumn; i++) {
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println();
			
			while (rs.next()) {
				for (int i = 1; i <= noOfColumn; i++) {
					System.out.print(rs.getObject(i)+"\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	public void addNum(int a, int b) {
		try (CallableStatement cs = connection.prepareCall("call add_num(?,?,?)")) {
			cs.setInt(1, a);
			cs.setInt(2, b);
			cs.registerOutParameter(3, Types.INTEGER);
			cs.execute();
			
			int result=cs.getInt(3);
			System.out.println("result: "+result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	private Employee fetchEmp(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String nm = rs.getString(2);
		double salary = rs.getDouble(3);
		Employee emp = new Employee(id, nm, salary);
		return emp;
	}
	

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
