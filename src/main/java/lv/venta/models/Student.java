package lv.venta.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "student_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {
	
	@Setter(value = AccessLevel.NONE)
	@Column(name = "ids")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long ids;
	
	@Column(name = "name")
	@NotNull
	@Size(min = 3, max = 15)
	public String name;
	
	@NotNull
	@Size(min = 3, max = 15)
	@Column(name = "surname")
	public String surname;

	public Student(long ids, String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	
}
