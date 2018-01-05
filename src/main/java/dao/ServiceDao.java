package dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class ServiceDao {
	
	@Autowired
	private JdbcTemplate template;
	
	public boolean AddEntry(String req){
		String insertSql = "insert into test (name,time) values(?,?)";
		return template.update(insertSql, req,new Date())>0?true:false;
	}

}
