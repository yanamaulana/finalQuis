package com.example.MvcMysql;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name= "TBL_ASSET")
@Entity
public class Asset {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer assetid;

    private String assetnumber;

    private String assetname;

    private String category;
    
	public Integer getAssetid() {
		return assetid;
	}

	public void setAssetid(Integer assetid) {
		this.assetid = assetid;
	}

	public String getAssetnumber() {
		return assetnumber;
	}

	public void setAssetnumber(String assetnumber) {
		this.assetnumber = assetnumber;
	}

	public String getAssetname() {
		return assetname;
	}

	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}	
}
