package com.payroll.microservice.RollMicroservice.Controller;

import com.payroll.microservice.RollMicroservice.Model.RoleDetails;
import com.payroll.microservice.RollMicroservice.Repository.RoleServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RollServiceController {
    @Autowired
    RoleServiceRepository roleServiceRepository;

    @GetMapping("role/{roleId}")
    public RoleDetails getRoleDetails(@PathVariable Long roleId){
        Optional<RoleDetails> roleDetails = roleServiceRepository.findById(roleId);
        if(roleDetails.isPresent()){
            return roleDetails.get();
        }else
            return null;
    }
}
