package in.pankaj.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OracleDao implements UserDao {

	public OracleDao() {
		System.out.println("constuctor called for oracleDAO");
	}
	
	
	
	@Override
	public void getNameById(Integer id) {
		System.out.println("oracle as name");
	}

}
