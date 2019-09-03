package com.payroll.microservice.RollMicroservice.Repository;

import com.payroll.microservice.RollMicroservice.Model.RoleDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleServiceRepository extends JpaRepository<RoleDetails, Long> {

    public Optional<RoleDetails> findByRoleName(String roleName);
}
