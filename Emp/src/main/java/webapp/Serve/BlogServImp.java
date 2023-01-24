package webapp.Serve;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.Dao.employeeRep;
import webapp.Entity.employee;

@Service
public class employeeServImp implements employeeServe {
	
	@Autowired
	private employeeRep employeeRep;

	@Override
	public List<employee> getAllemployees() {	
		return employeeRep.findAll();
	}
}
