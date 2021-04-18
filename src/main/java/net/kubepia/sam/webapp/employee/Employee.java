package net.kubepia.sam.webapp.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


// CREATE TABLE employees (
//     emp_no      INT             NOT NULL,
//     birth_date  DATE            NOT NULL,
//     first_name  VARCHAR(14)     NOT NULL,
//     last_name   VARCHAR(16)     NOT NULL,
//     gender      ENUM ('M','F')  NOT NULL,    
//     hire_date   DATE            NOT NULL,
//     PRIMARY KEY (emp_no)
// );

@Entity
@Table(name="employees")
public class Employee {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;

  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;

  @Column(name = "hire_date")
  @Temporal(TemporalType.DATE)
  private java.util.Date hireDate;

  @Column(name = "birth_date")
  @Temporal(TemporalType.DATE)
  private java.util.Date birthDate;

  @Column(name="gender")
  private String gender;

  protected Employee() {
  }

  public Employee(String firstName, String lastName, java.util.Date birthDate, java.util.Date hireDate, String gender) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate=birthDate;
    this.hireDate = hireDate;
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "";
  }

  public Long getId() {
    return id;
  }

  // public void setId(Long id) {
  //   this.id = id;
  // }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public java.util.Date getHireDate() {
    return hireDate;
  }

  public void setHireDate(java.util.Date hireDate) {
    this.hireDate = hireDate;
  }

  public java.util.Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(java.util.Date birthDate) {
    this.birthDate = birthDate;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  
  
}
