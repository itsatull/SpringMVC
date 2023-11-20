package com.Daos;

import com.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("ALL")
@Repository
public class UserDao {
    @Autowired
    HibernateTemplate hibernateTemplate;


    @Transactional
    public int createUser(User user) {
        int status = (int) hibernateTemplate.save(user);
        return status;
    }

}
