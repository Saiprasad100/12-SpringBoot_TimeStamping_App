package in.sai.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee2 {
	

	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String empGender;
	private String dept;
	
	@CreationTimestamp
	@Column(name="date_Created",updatable = false)
	private LocalDate dateCreated;
	
	
	@UpdateTimestamp
	@Column(name="last_updated",insertable = false)
	private LocalDate lastDate;

}
