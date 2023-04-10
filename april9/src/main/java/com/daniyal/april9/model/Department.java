package com.daniyal.april9.model;

import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "dept")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deptId;
	
	private String deptName;

	@OneToMany(mappedBy = "department") // inverse side
	private Set<Employee> employees;
}
