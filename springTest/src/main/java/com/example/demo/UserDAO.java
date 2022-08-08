package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface UserDAO extends JpaRepository<TestDTO, Integer> {
	@Query("from TestDTO where uname=?1 and pass=?2")
	public List<TestDTO> CheckUser(String name,String pass);
	
	@Query("from TestDTO order by uid ASC")
	public List<TestDTO> checkUID(TestDTO us);
	}
