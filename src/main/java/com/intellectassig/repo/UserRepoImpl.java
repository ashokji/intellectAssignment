/**
 * 
 */
package com.intellectassig.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.intellectassig.entity.User;

/**
 * @author Admin
 *
 */
@Repository
public class UserRepoImpl {
	
	List<User> users = new ArrayList<>();
	
	public boolean createUser(User user){
		boolean result = false;
		for (User u : users) {
			if(!u.getId().equals(user.getId()))
				users.add(user);
		}
		return result;
	}
	
	public void updateUser(User respuser, String userId){
		users.stream().filter(u -> u.getId().equals(userId)).forEach(u -> u.setBirthDate(respuser.getBirthDate()));
	}
	
	public boolean deleteUser(String userId){
		Iterator<User> iterator = users.iterator();
		boolean result = false;
        while (iterator.hasNext()) {
            User useri = iterator.next();
            if (useri.getId().equals(userId)) {
                useri.setAvtive(false);
                result = true;
            }
        }
        return result;
	}
}
