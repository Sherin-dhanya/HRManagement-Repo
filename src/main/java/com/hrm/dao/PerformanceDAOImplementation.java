package com.hrm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hrm.bean.Performance;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PerformanceDAOImplementation implements PerformanceDAO {

	@Autowired
	 EntityManager entityManager;
			
			

//		insert details  
			@Override
			public boolean addPerform(Performance performance) {
				entityManager.persist(performance);
				return true;
			}



			@Override
			public boolean save(Performance performance) {
				
				return false;
			}
}
