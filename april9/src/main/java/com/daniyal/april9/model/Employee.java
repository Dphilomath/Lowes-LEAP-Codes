package com.daniyal.april9.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name="employee_details")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empId;
	private String empName;
	private Double salary;
	
	//HAS-A relationship 
	@ManyToOne(cascade = CascadeType.ALL)//Owning side
	@JoinColumn(name = "deptId")
	private Department department;
}
