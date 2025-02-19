package com.example.mongodb.service;


import com.example.mongodb.model.User;

import java.util.List;

public interface IUserService {

    List<User> list();

    User getOneById(Long id);

    User save(User user);

    void removeById(Long id);

    User updateById(User user);

    User findByEmail(String email);

}
