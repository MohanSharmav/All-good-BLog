package webapp.Serve;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import webapp.Dao.BlogRep;
import webapp.Entity.BlogPojo;

@Service
public interface BlogServe {
	
//	@Autowired
//	private BlogRep blogRep;
	
//	
//	@Query(value = "select .* from Blogs",nativeQuery = true)
//	List<BlogPojo> findByNativeQuery(String param);
	@Query(value = "SELECT * FROM Blo", nativeQuery = true)
	  List<BlogPojo> findByTitle(String Title);

//@Query(value="select * from Blogs",nativeQuery = true)
//	List<BlogPojo> getAllBlogs();
}
