package com.example.fainal.Servce;

import com.example.fainal.Repostre.UserRepostre;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepostre userRepostre;

    public List<User> getAllUser(){
        return userRepostre.findAll();
    }
    public void adduser(User user){
        userRepostre.save(user);
    }
    public Boolean updateUser(Integer id, User user){
        User oldUser=userRepostre.getById(id);
        if (oldUser==null){
            return false;

        }

        oldUser.setUsername(user.getUsername());
        oldUser.setPassword(user.getPassword());
        return true;
    }
    public Boolean deleteUser(Integer id) {
        User oldUser= userRepostre.getById(id);
        if (oldUser == null) {
            return false;
        }
       userRepostre.delete(oldUser);
        return true;
    }

}