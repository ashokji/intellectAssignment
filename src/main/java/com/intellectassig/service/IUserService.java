/**
 * 
 */
package com.intellectassig.service;

import org.springframework.stereotype.Service;

import com.intellectassig.entity.User;

/**
 * @author Admin
 *
 */
@Service
public interface IUserService {
	
	public boolean createUser(User user);
	
	public String updateUser(User user, String userId);
	
	public boolean daleteUser(String userId);
}
