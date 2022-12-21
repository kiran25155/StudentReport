package com.Kiran.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Kiran.Model.RegisterStudent;

@Repository
public interface RegisterStudentRepo extends JpaRepository<RegisterStudent, Integer>{
	@Query(value="select AVG(percentage) from \r\n"
			+ "(select  REGISTER_STUDENT.ROLL_NO,REGISTER_STUDENT.NAME,ADD_MARKS.AVERAGE,ADD_MARKS.ENGLISH,"
			+ "ADD_MARKS.MATHS,ADD_MARKS.PERCENTAGE,"
			+ "ADD_MARKS.SCIENCE,ADD_MARKS.TOTAL,ADD_MARKS.SEMESTER,ADD_MARKS.ROLL_NO from REGISTER_STUDENT\r\n"
			+ "inner join ADD_MARKS on REGISTER_STUDENT.ROLL_NO=ADD_MARKS.ROLL_NO) where semester=?1",nativeQuery = true)
	public String avgPercentageFromRecentSem(String sem);

	@Query(value="select trunc(AVG(English)) as \"English Marks\",trunc(AVG(Maths)) as \"Maths\",trunc(AVG(Science)) as \"Science\" from (select  REGISTER_STUDENT.ROLL_NO,REGISTER_STUDENT.NAME,ADD_MARKS.AVERAGE,ADD_MARKS.ENGLISH,ADD_MARKS.MATHS,ADD_MARKS.PERCENTAGE,ADD_MARKS.SCIENCE,ADD_MARKS.TOTAL,ADD_MARKS.SEMESTER,ADD_MARKS.ROLL_NO from REGISTER_STUDENT\r\n"
			+ "inner join ADD_MARKS on REGISTER_STUDENT.ROLL_NO=ADD_MARKS.ROLL_NO)",nativeQuery = true)
	public String avgMarksOfStudentsEachSubject();
	
	@Query(value="select * from(\r\n"
			+ "select ROLL_NO from(\r\n"
			+ "select MAX(ADD_MARKS.AVERAGE),ADD_MARKS.ROLL_NO from REGISTER_STUDENT\r\n"
			+ "inner join ADD_MARKS on REGISTER_STUDENT.ROLL_NO=ADD_MARKS.ROLL_NO GROUP BY ADD_MARKS.SEMESTER,ADD_MARKS.ROLL_NO\r\n"
			+ "HAVING MAX(ADD_MARKS.AVERAGE)> 80\r\n"
			+ "ORDER BY MAX(ADD_MARKS.AVERAGE) desc)GROUP BY ROLL_NO)\r\n"
			+ "where ROWNUM <3",nativeQuery = true)
	public String top2ConsistentStudentsAcrossAllSemesters();
	



	
}
