
package com.app.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="salary")
	private Double salary;
	@OneToOne
	@JoinColumn(name="department")
	private Department department;
	@OneToOne
	@JoinColumn(name="degree")
	private Degree degree;

    public Employee withId(Integer id){
	  this.id=id;
	  return this;
	}

    public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}

    public Employee withName(String name){
	  this.name=name;
	  return this;
	}

    public void setName(String name){
	  this.name=name;
	}
	
	public String getName(){
	 return this.name;
	}

    public Employee withEmail(String email){
	  this.email=email;
	  return this;
	}

    public void setEmail(String email){
	  this.email=email;
	}
	
	public String getEmail(){
	 return this.email;
	}

    public Employee withSalary(Double salary){
	  this.salary=salary;
	  return this;
	}

    public void setSalary(Double salary){
	  this.salary=salary;
	}
	
	public Double getSalary(){
	 return this.salary;
	}

    public Employee withDepartment(Department department){
	  this.department=department;
	  return this;
	}

    public void setDepartment(Department department){
	  this.department=department;
	}
	
	public Department getDepartment(){
	 return this.department;
	}

    public Employee withDegree(Degree degree){
	  this.degree=degree;
	  return this;
	}

    public void setDegree(Degree degree){
	  this.degree=degree;
	}
	
	public Degree getDegree(){
	 return this.degree;
	}


	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	 Employee that = (Employee) obj;
	 if (this.getId() == null) {
	   return this.toString().equals(that.toString());
	  }
	  return this.getId().equals(that.getId());	  
	}

	@Override
	public int hashCode() {
	  if(this.id==null) { 
	    return toString().hashCode(); 
	   }
	  return this.id.hashCode();
	}
	
	@Override
	public String toString(){
	  StringBuffer buf=new StringBuffer();
	  buf.append(this.id).append(",");
	  buf.append(this.name).append(",");
	  buf.append(this.email).append(",");
	  buf.append(this.salary).append(",");
	  buf.append(this.department).append(",");
	  buf.append(this.degree).append(",");
	  return buf.toString();
	}
}