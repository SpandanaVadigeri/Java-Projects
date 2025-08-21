package com.project.employeeManagement.repository.authentication;

import com.project.employeeManagement.model.authentication.userModel.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthRepo extends JpaRepository<Users,Integer>{

    Users findByUsername(String username);
}

