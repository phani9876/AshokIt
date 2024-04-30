package com.phanit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.phanit.entity.EligibilityDetails;
import com.phanit.repo.EligibilityDetailsRepo;

@Component
public class AppRunner implements ApplicationRunner{
	
	@Autowired
	private EligibilityDetailsRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		EligibilityDetails entity1 = new EligibilityDetails();
		entity1.setEligId(1);
		entity1.setName("phani");
		entity1.setMobile(1234459687L);
		entity1.setGender('M');
		entity1.setSsn(4444984154L);
		entity1.setPlanName("SNAP");
		entity1.setPlanStatus("Approved");
		
		repo.save(entity1);
		
		EligibilityDetails entity2 = new EligibilityDetails();
		entity2.setEligId(21);
		entity2.setName("Y.Phani");
		entity2.setMobile(234459687L);
		entity2.setGender('M');
		entity2.setSsn(9944984154L);
		entity2.setPlanName("CCAP");
		entity2.setPlanStatus("Denied");
		
		repo.save(entity2);
		
		EligibilityDetails entity3 = new EligibilityDetails();
		entity3.setEligId(31);
		entity3.setName("kalyan");
		entity3.setMobile(834459687L);
		entity3.setGender('M');
		entity3.setSsn(894984154L);
		entity3.setPlanName("Medicaid");
		entity3.setPlanStatus("Closed");
		
		repo.save(entity3);
	}

}
