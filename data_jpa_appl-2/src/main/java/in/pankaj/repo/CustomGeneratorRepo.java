package in.pankaj.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.pankaj.entity.DemoGeneratorEntity;
import jakarta.transaction.Transactional;

public interface CustomGeneratorRepo extends JpaRepository<DemoGeneratorEntity, String> {

	@Query("from DemoGeneratorEntity")
	public ArrayList<DemoGeneratorEntity>  getAllRecords();
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO demo_generator_entity(id, name, age) VALUES (:id, :name, :age)",
	       nativeQuery = true)
	int insertData(@Param("id") String id,
	               @Param("name") String name,
	               @Param("age") int age);
}


