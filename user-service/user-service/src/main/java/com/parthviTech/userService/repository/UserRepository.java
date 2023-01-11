package com.parthviTech.userService.repository;

import com.parthviTech.userService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UserRepository extends JpaRepository<User,Long>{
        User findByUserId(Long userId);
    }

