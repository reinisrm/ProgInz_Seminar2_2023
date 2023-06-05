package lv.venta.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "grade_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Grade {
	
	@Setter(value = AccessLevel.NONE)
	@Column(name = "idg")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long idg;
	
	@Column(name = "GradeValue")
	@Min(value = 0)
	@Max(value = 10)
	public int gradeValue;
	
	//TODO izveidot argumenta konstruktoru

}
