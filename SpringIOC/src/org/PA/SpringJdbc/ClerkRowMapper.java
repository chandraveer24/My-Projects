package org.PA.SpringJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClerkRowMapper implements RowMapper<Clerk> {

	@Override
	public Clerk mapRow(ResultSet rs, int arg1) throws SQLException {

		return new Clerk(rs.getString("ssn"), rs.getString("name"), rs.getDate("joinedDate"),
				rs.getDate("terminationDate"), rs.getBoolean("active"));
	}

}
