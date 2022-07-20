package com.exm.crypto.agent.Repository;

import com.exm.crypto.agent.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UseRepository extends JpaRepository<UserData,Long> {
}
