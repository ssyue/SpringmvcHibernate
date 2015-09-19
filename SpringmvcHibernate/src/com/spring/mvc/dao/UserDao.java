package com.spring.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.base.BaseHibernateDao;
import com.spring.mvc.bean.User;

public interface UserDao{

	public List getAll() ;

	public void save(User user);

	public boolean login(User user);

	public void delete(int id);

	public void delete(User user);


}
