package com.practical.webservices.restfulwebservices.User;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User("sozhan", 1, new Date()));
        users.add(new User("ravanan", 2, new Date()));
        users.add(new User("prabhakaran", 3, new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
      if(user.getId() == null) {
          user.setId(++userCount);
      }
        users.add(user);
      return user;
    }

    public User findOne(int id) {
        for(User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<User> compareToMethod() {
      Collections.sort(users);
      return users;
    }
}
