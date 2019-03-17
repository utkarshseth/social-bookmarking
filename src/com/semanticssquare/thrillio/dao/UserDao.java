package com.semanticssquare.thrillio.dao;

import java.util.ArrayList;

import com.semanticssquare.thrillio.DataStore;
import com.semanticssquare.thrillio.entities.User;

public class UserDao {
	public ArrayList<User> getUsers() {

		return DataStore.getUsers();

	}
}
