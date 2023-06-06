package lv.venta.models;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Person {
	@Setter(value = AccessLevel.NONE)
	@Column(name = "idpe")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long idpe;
	
	@Column(name = "Name")
	@NotNull
	@Size(min = 3, max = 15)
	public String name;
	
	@NotNull
	@Size(min = 3, max = 15)
	@Column(name = "surname")
	public String surname;
}
