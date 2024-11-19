package com.ecommerce.springBootEcommerce.repositories;

import com.ecommerce.springBootEcommerce.model.AppRole;
import com.ecommerce.springBootEcommerce.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
