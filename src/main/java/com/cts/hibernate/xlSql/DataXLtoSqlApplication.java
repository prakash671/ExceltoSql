package com.cts.hibernate.xlSql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.hibernate.xlSql.service.ReadService;

@SpringBootApplication
public class DataXLtoSqlApplication implements CommandLineRunner{
	ReadService service;
	public static void main(String[] args) {
	
		
		SpringApplication.run(DataXLtoSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String path =args[0];
		System.out.println("application start");
		service.ReadDataFromExcel(path);
		System.out.println("application end");
	}

}
