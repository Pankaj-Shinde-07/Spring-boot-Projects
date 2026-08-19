package in.pankaj.generator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {
//	private static int count = 1;

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		try {
			Connection con = session.getJdbcConnectionAccess().obtainConnection();

			// Read current value
			PreparedStatement ps1 = con.prepareStatement(
			        "SELECT next_val FROM id_sequence");

			ResultSet rs = ps1.executeQuery();

			int value = 1;

			if (rs.next()) {
			    value = rs.getInt(1);
			}

			// Increment value
			PreparedStatement ps2 = con.prepareStatement(
			        "UPDATE id_sequence SET next_val = next_val + 1");

			ps2.executeUpdate();

			return "OD" + value;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
//	@Override
//	public Object generate(SharedSessionContractImplementor session, Object object) {
//		String id = "OD"+count;
//		count++;
//		
//		return id;
//	}
	
	
	
}
