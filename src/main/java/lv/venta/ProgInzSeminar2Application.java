package lv.venta;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lv.venta.models.Course;
import lv.venta.models.Degree;
import lv.venta.models.Grade;
import lv.venta.models.Professor;
import lv.venta.models.Student;
import lv.venta.repos.iCourseRepo;
import lv.venta.repos.iGradeRepo;
import lv.venta.repos.iProfessorRepo;
import lv.venta.repos.iStudentRepo;

@SpringBootApplication
public class ProgInzSeminar2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProgInzSeminar2Application.class, args);
	}
	
	@Bean //izsauc funkciju briidii kad starteesies sistema
	public CommandLineRunner testModel(iProfessorRepo profRepo, iStudentRepo stRepo, 
			iCourseRepo courRepo, iGradeRepo grRepo) {
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				
				
				Professor pr1 = new Professor("Karina", "Skirmante", Degree.mg);
				Professor pr2 = new Professor("Martins", "Saulitis", Degree.mg);
				profRepo.save(pr1);
				profRepo.save(pr2);
				
				Student st1 = new Student("Janis", "Berzins");
				Student st2 = new Student("Baiba", "Kalnina");
				stRepo.save(st1);
				stRepo.save(st2);
				
				Course c1 = new Course("JAVA I", 4, pr1);
				Course c2 = new Course("DatuBazes", 4, pr2);
				courRepo.save(c1);
				courRepo.save(c2);
				
				grRepo.save(new Grade(10, st1, c1)); //Janis nopelnija 10 Javaa
				grRepo.save(new Grade(6, st1, c2)); //Janis nopelnija 6 DB
				grRepo.save(new Grade(8, st2, c1)); //Baiba nopelnija 8 Java
				grRepo.save(new Grade(10, st2, c2)); //Baiba nopelnija 10 DB
				
				//TODO izveidot jaunu zaru un pariet uz to (git branch xxx, git checkout xxx)
				//TODO parveidot saiti starp profesoru un kursu uz manytomany
				//TODO pamainit testModel funkciju, ielikot 1. prof divus kursus un 1. kursam, ka to pasniedz abi profesori
				
				
			}
		};
	}

}
