
package com.app.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="degree")
public class Degree implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="desc")
	private String desc;

    public Degree withId(Integer id){
	  this.id=id;
	  return this;
	}

    public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}

    public Degree withName(String name){
	  this.name=name;
	  return this;
	}

    public void setName(String name){
	  this.name=name;
	}
	
	public String getName(){
	 return this.name;
	}

    public Degree withDesc(String desc){
	  this.desc=desc;
	  return this;
	}

    public void setDesc(String desc){
	  this.desc=desc;
	}
	
	public String getDesc(){
	 return this.desc;
	}


	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	 Degree that = (Degree) obj;
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
	  buf.append(this.desc).append(",");
	  return buf.toString();
	}
}