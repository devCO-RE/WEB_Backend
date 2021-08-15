package com.core.microservices.core.user.persistence;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId", unique = true, nullable = false)
    private int id;

    private String Identity;

    private String password;

    private String name;

    private Integer companyId;

    private String phoneNum;

    private String userImage;

    private String celebrityUrl;

    private Boolean celebrity;


    @Builder
    public UserEntity(String identity, String password, String name, Integer companyId, String phoneNum, String userImage, String celebrityUrl, Boolean celebrity){
        this.Identity = identity;
        this.password = password;
        this.name = name;
        this.companyId = companyId;
        this.phoneNum = phoneNum;
        this.userImage = userImage;
        this.celebrityUrl = celebrityUrl;
        this.celebrity = celebrity;
    }

}
