package com.example.fainal.Repostre;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepostre extends JpaRepository<User,Integer> {
}
