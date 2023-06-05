package lv.venta.repos;

import org.springframework.data.repository.CrudRepository;

import lv.venta.models.Student;

public interface iStudentRepo extends CrudRepository<Student, Long>{

}
