package lv.venta.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "professor_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Professor {
	//TODO uzlikt datagpa anotacijas
	//TODO uzlikt atbilstosas validaciju anotacijas
	//TODO izveidot Student klasi
	//TODO izveidot Course klasi
	//TODO izveidot Grade klasi
	@Setter(value = AccessLevel.NONE)
	@Column(name = "idp")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idp;
	
	@Column(name = "name")
	@NotNull
	@Size(min = 3, max = 15)
	private String name;
	
	@NotNull
	@Size(min = 3, max = 15)
	@Column(name = "surname")
	private String surname;
	
	@NotBlank
	@Column(name = "degree")
	private Degree degree;
	
	@OneToOne(mappedBy = "professor") //sasaistam ar otras klases mainigo
	private Course course;

	public Professor(String name, String surname, Degree degree) {
		this.name = name;
		this.surname = surname;
		this.degree = degree;
	}
	
	
	
}
