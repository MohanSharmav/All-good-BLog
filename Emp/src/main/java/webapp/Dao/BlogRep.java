package webapp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import webapp.Entity.BlogPojo;


@Repository
public interface BlogRep extends JpaRepository<BlogPojo , String>
{
}
