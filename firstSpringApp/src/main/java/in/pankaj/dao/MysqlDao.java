package in.pankaj.dao;

import org.springframework.stereotype.Component;

@Component
public class MysqlDao implements UserDao {

	 public MysqlDao() {
		 System.out.println("Constructor called for MysqlDAO");
	 }
	 
	@Override
	public void getNameById(Integer id) {

		System.out.println("mysql as name");

	}

}
