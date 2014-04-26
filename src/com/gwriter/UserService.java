package com.gwriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwriter.dao.UserHibernateDAO;
import com.gwriter.domain.User;

@Service
public class UserService {
   
	@Autowired
	private UserHibernateDAO userHibernateDAO;
	
	public void createUser(User user){
		userHibernateDAO.save(user);
	}

	public User getUserById(String userId) {
		User user = new User();
		user.setUserName("test");
		return user;
	}
	
}
