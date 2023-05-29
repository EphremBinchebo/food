package com.noFoodWaste.repository;

import com.noFoodWaste.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    com.noFoodWaste.model.Role findByName(String name);
}