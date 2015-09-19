package com.spring.mvc.service.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.mvc.bean.User;
import com.spring.mvc.dao.UserDao;
import com.spring.mvc.service.IUserService;
import com.spring.util.Authority;
import com.spring.util.Message;


@Service("userService")
public class UserService implements IUserService{
	private static final Log log=LogFactory.getLog(UserService.class);
	private UserDao userDao;

	public UserDao getHelloDao() {
		return userDao;
	}

	@Resource
	public void setHelloDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public String addUser(User user) {
		user.setAuthority(Authority.USER_AUTHORITY);
		userDao.save(user);
		//helloDao.getSession().save(user);
		return Message.SUCCESS;
	}

	@Override
	public boolean login( User user) {
//		Query query=(Query) helloDao.getSession().createQuery("from User where username=:username and password=:password");
//		query.setString("username", user.getUsername());
//		query.setString("password", user.getPassword());
//		if (query.list().size()==1) {
//			return true;
//		}
//		return false;
		return userDao.login(user);
	}

	@Override
	public List getAll() {
		
		return userDao.getAll();
	}

	@Override
	public void deleteUser(int id) {
		userDao.delete(id);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}
}
