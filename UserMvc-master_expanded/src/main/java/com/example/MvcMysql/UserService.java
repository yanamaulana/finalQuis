package com.example.MvcMysql;

import java.util.List;

import javax.persistence.EntityManager;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;

import scala.Int;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<Tbluser> listAll() {
		return repo.findAll();
	}
	
	public void save(Tbluser tbl_user) {
		repo.save(tbl_user);
	}
	
	public Tbluser get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}