package com.revature.bankapp.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class UserDAOTest {

	@Test
	 public void testValidLogin() throws SQLException {

        String email = "n@gmail.com";
        String password = "pass123";
        UserDAO userDAO = new UserDAO();
        boolean isValidLogin = userDAO.login(email, password);
        assertTrue(isValidLogin);
    }
	 
	@Test
	    public void testInValidLogin() throws SQLException {

	        String email = "";
	        String password = "";
	        UserDAO userDAO = new UserDAO();
	        boolean isValidLogin = userDAO.login(email, password);
	        assertFalse(isValidLogin);
	    }

}
