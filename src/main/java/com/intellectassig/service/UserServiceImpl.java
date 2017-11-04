/**
 * 
 */
package com.intellectassig.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.intellectassig.entity.User;
import com.intellectassig.repo.UserRepoImpl;

/**
 * @author Admin
 *
 */
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepoImpl repo;
	
	/* (non-Javadoc)
	 * @see com.intellectassignment.service.IUserService#createUser(com.intellectassignment.entity.User)
	 */
	@Override
	public boolean createUser(User user) {
		return repo.createUser(user);
	}

	/* (non-Javadoc)
	 * @see com.intellectassignment.service.IUserService#updateUser(com.intellectassignment.entity.User)
	 */
	@Override
	public String updateUser(User user, String userId) {
		repo.updateUser(user, userId);
		return null;
	}

	/* (non-Javadoc)
	 * @see com.intellectassignment.service.IUserService#daleteUser(java.lang.String)
	 */
	@Override
	public boolean daleteUser(String userId) {
		 return repo.deleteUser(userId);
	}

}
