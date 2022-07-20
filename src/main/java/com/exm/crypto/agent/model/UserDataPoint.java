package com.exm.crypto.agent.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDataPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String tokenId;
    private long user_id;




}
