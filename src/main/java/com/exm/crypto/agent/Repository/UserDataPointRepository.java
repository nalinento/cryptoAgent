package com.exm.crypto.agent.Repository;

import com.exm.crypto.agent.model.UserDataPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataPointRepository extends JpaRepository<UserDataPoint, Long> {
}
