package com.springcloud.login.repository;


import com.springcloud.login.user.UserLoginJudgment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLoginJudgment,Integer> {
    //继承JpaRepository完成数据库操作

    public UserLoginJudgment findByUsername(String username);


}
