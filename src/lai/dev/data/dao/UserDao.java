package lai.dev.data.dao;

import java.util.List;

import lai.dev.data.model.User;

public interface UserDao {
	public boolean insert(User user);
	public boolean update(User user);
	public boolean delete(int userId);
	public User find(int userId);
	public List<User> findAll();
    public User find(String email, String password);
    public User find(String email);
    public List<Integer> getAllUserIds();
}
