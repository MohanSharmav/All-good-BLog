package webapp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import webapp.Entity.BlogPojo;



public interface BlogRep  extends JpaRepository<BlogPojo,Long>
{

}
