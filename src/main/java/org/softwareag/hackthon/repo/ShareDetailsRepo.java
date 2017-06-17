package org.softwareag.hackthon.repo;

import java.util.List;

import org.softwareag.hackthon.entity.ShareDetails;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShareDetailsRepo extends JpaRepository<ShareDetails, Long>{
	
	List<ShareDetails> findByUserId(String userID);
	
	

}
