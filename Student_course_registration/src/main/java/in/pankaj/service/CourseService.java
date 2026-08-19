package in.pankaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pankaj.entity.CourseEntity;
import in.pankaj.repo.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo cp;
	
	public List<CourseEntity> getAllCourse(){
		List<CourseEntity> all = cp.findAll();
		
		return all;
	}

}
