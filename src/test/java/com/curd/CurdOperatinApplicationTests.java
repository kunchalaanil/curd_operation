package com.curd;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.curd.entity.Boys;
import com.curd.repository.BoysRepository;

@SpringBootTest
class CurdOperatinApplicationTests {
	@Autowired
	private BoysRepository br;

	@Test
	void contextLoads() {
		System.out.println(br);
	}

	@Test
	void saveOnBoys() {

		Boys b = new Boys();

		b.setName("anil");
		b.setClassName("mba");
		b.setFee(100);

		br.save(b);
	}

	@Test
	void saveOnBoys1() {

		Boys b = new Boys();

		b.setName("lavanya");
		b.setClassName("mca");
		b.setFee(50);

		br.save(b);
	}

	@Test
	void saveOnBoys2() {

		Boys b = new Boys();

		b.setName("siva");
		b.setClassName("degree");
		b.setFee(25);

		br.save(b);
	}

	
	
	
	@Test
	void findBoysById(){
		Optional<Boys> findById = br.findById(1L);
		Boys boys = findById.get();
		System.out.println(boys.getName());
		
	}@Test
	void updateBoysById() {
		Boys b= new Boys();
		b.setId(1);
		b.setFee(1000);
		br.save(b);
		
	}

}
