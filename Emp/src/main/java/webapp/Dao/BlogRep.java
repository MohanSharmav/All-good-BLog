package webapp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import webapp.Entity.employee;

@Repository
public interface employeeRep extends JpaRepository<employee , Long>{
}
