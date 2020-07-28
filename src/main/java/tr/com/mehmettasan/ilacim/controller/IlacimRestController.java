package tr.com.mehmettasan.ilacim.controller;

import java.util.List;

import tr.com.mehmettasan.ilacim.domain.Ilac;
import tr.com.mehmettasan.ilacim.service.IlacService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/services")
public class IlacimRestController {
	 
	@Autowired
	private IlacService ilacService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/ilac")
	public ResponseEntity<List<Ilac>> getAccounts() {
		List<Ilac> ilacList = ilacService.findAll();
		return ResponseEntity.ok(ilacList);
	}

}
