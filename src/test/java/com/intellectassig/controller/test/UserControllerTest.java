/**
 * 
 */
package com.intellectassig.controller.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.intellectassig.controller.UserController;
import com.intellectassig.controller.helper.UserControllerHelper;

/**
 * @author Admin
 *
 */
public class UserControllerTest {

	private UserController userController = new UserController();
	
	private UserControllerHelper helper = new UserControllerHelper();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.intellectassig.controller.UserController#createUser(com.intellectassig.entity.User)}.
	 */
	@Test
	public void testCreateUser_succeess() {
		userController.createUser(helper.getUser());
	}

	/**
	 * Test method for {@link com.intellectassig.controller.UserController#hello()}.
	 */
	@Test
	public void testHello() {
		fail("Not yet implemented");
	}

}
