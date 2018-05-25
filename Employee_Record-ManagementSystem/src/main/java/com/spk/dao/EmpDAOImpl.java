package com.spk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spk.beans.EmpBO;

@Repository
public class EmpDAOImpl implements EmpDAO {
	private static final String GET_RECORD = "SELECT ENO,ENAME,JOB,SAL FROM EMPLOYEE";

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<EmpBO> getEmpRecords() {
		List<EmpBO> bo = jt.query(GET_RECORD, new EmpRowMapper());
		return null;
	}

	private class EmpRowMapper implements RowMapper<EmpBO> {

		public EmpBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmpBO empBO = new EmpBO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			return empBO;
		}

	}
}
