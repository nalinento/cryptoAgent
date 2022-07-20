package com.exm.crypto.agent.Service;

import com.exm.crypto.agent.Repository.UseRepository;
import com.exm.crypto.agent.Repository.UserDataPointRepository;
import com.exm.crypto.agent.model.UserData;
import com.exm.crypto.agent.model.UserDataPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UseRepository useRepository;

    @Autowired
    private UserDataPointRepository userDataPointRepository;

   public void saveUser(UserData user){

       useRepository.save(user);
   }
   public void savePoint(UserDataPoint userDataPoint){

       String token = UUID.randomUUID().toString();
       userDataPoint.setTokenId(token);


       userDataPointRepository.save(userDataPoint);
   }
}
