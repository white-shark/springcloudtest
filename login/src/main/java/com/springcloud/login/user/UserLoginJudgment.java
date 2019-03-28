package com.springcloud.login.user;

import javax.persistence.*;

//使用JPA注解配制映射
@Entity     //告诉JPA这是一个实体类（和数据表映射类）
@Table(name = "tb_userlogin") //@Table来指定和哪个数据表对应
public class UserLoginJudgment {

    @Id     //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;
    @Column         //数据表中的列
    private String username;
    @Column
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserLoginJudgment(Integer id,String username, String password) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public UserLoginJudgment(){

    }

    @Override
    public String toString() {
        return "UserLoginJudgment{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
