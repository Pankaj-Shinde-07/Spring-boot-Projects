package in.pankaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pankaj.entity.TimingEntity;
import in.pankaj.repo.TimingRepo;

@Service
public class TimingService {

	@Autowired
	private TimingRepo tp;
	
	public List<TimingEntity> getAllTiming(){
		List<TimingEntity> all = tp.findAll();
		
		return all;
	}
}
