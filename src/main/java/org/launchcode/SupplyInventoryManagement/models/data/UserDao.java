package org.launchcode.SupplyInventoryManagement.models.data;

import org.launchcode.SupplyInventoryManagement.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Integer> {

    public User findByEmail(String email);

}
