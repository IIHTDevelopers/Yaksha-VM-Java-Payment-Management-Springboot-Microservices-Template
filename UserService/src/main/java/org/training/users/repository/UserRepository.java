package org.training.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.training.users.model.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
