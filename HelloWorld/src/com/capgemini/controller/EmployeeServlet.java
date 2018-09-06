package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ArrayList<Employee> Employee = new ArrayList<>();
   
        @Override
        public void init() throws ServletException {
        	Employee.add(new Employee(1220,"Manju","Java",30000.0));
        	Employee.add(new Employee(1221,"Mandy","SAP",60000.0));
        	Employee.add(new Employee(1222,"Sony","CLOUD",90000.0));
        	
        }
        	
        	 public EmployeeServlet() {
        	        super();
        	    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
String empnumber=request.getParameter("username");
int Empnumber=Integer.parseInt(empnumber);
		
		for(Employee e:Employee)
		{
			if(e.empnumber==Empnumber) {
				out.println("<table border='1'> <tr><th>EmpName</th><th>Empdept</th><th>Salary</th></tr>");

		out.println("<tr><th>" + e.getEmpname() + "</th><th>" + e.getEmpdept()+"</th><th>"+ e.getSalary()+"</th></tr>");
	}
		}
		out.close();
}
}
