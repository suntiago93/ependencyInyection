package com.demo.usermicroservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "user")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {
    @Id
    private String id;
    private String identification;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private int age;

}
