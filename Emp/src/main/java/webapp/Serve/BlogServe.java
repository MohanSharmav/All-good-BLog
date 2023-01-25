package webapp.Serve;

import java.util.List;
import webapp.Entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import webapp.Dao.BlogRep;
import webapp.Entity.BlogPojo;


public interface BlogServe {
	
//	@Autowired
//	private BlogRep blogRep;
	/**
     * 根据城市名称，查询城市信息
     *  Title
     */
	List<BlogPojo> getAllBlogs1();

//	BlogPojo findByTitle()
//	
//	@Query(value = "select .* from Blogs",nativeQuery = true)
//	List<BlogPojo> findByNativeQuery(String param);
//	@Query(value = "SELECT * FROM Blo", nativeQuery = true)
//	@param
	//  List<BlogPojo> findByTitle(String Title);

//@Query(value="select * from Blogs",nativeQuery = true)
//	List<BlogPojo> getAllBlogs();
}
