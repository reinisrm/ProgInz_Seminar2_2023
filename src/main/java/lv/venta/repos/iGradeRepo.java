package lv.venta.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.models.Grade;

public interface iGradeRepo extends CrudRepository<Grade, Long> {
	//TODO atlasit visu studentu atzimes, ja ir zinams studentu id
	ArrayList<Grade> findByStudentIds(long ids);
	
	//TODO atlasit visa kursa atzimes, ja ir zinams kursa nosaukums
	ArrayList<Grade> findByCourseTitle(String title);
}
