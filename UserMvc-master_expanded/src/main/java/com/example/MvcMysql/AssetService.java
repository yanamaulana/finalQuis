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
public class AssetService {
	@Autowired
	private AssetRepo repo;
	
	public List<Asset> listAll() {
		return repo.findAll();
	}
	
	public void save1(Asset asset) {
		repo.save(asset);
	}
	
	public Asset get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete1(int id) {
		repo.deleteById(id);
	}
}
