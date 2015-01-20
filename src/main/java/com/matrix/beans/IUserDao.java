package com.matrix.beans;

import java.util.List;

public interface IUserDao {
	boolean add(User user);

	boolean add(List<User> list);

	void delete(String key);

	void delete(List<String> list);

	boolean update(User user);

	User get(String keyId);
}
