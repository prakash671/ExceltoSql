package com.cts.hibernate.xlSql.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.hibernate.xlSql.pojo.Datapojo;

@Repository
public interface SavedataToDb extends CrudRepository<Datapojo,Long> {

}
