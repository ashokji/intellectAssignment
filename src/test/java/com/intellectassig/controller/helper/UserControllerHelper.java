/**
 * 
 */
package com.intellectassig.controller.helper;

import com.intellectassig.entity.User;

/**
 * @author Admin
 *
 */
public class UserControllerHelper {

	public User getUser(){
		User user = new User();
		user.setAvtive(true);
		user.setfName("Ashok");
		user.setlName("Kumar");
		return user;
	}
}
