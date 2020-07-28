package tr.com.mehmettasan.ilacim.service;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.mehmettasan.ilacim.repository.IlacRepository;
import tr.com.mehmettasan.ilacim.domain.Ilac;
 
@Service
public class IlacServiceImpl implements IlacService {
	
	@Autowired
	private IlacRepository ilacRepository;
	
	@Override
	public List<Ilac> findAll() {
		return ilacRepository.findAll();
	}

}
