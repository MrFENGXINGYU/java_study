package com.fxy.dao;

import com.fxy.domain.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    @Insert("insert into tbl_account (id,username, money) values (#{id},#{username},#{money})")
    void addAccount(Account account);

    @Delete("delete from tbl_account where id = #{id}")
    void deleteAccount(Integer id);

    @Select(" select * from tbl_account")
    List<Account> findAll();

    @Update("update tbl_account set money = money - #{money} where username = #{username}")
    void inMoney(@Param("username") String username, @Param("money") Double money);

    @Update("update tbl_account set money = money + #{money} where username = #{username}")
    void outMoney(@Param("username") String username, @Param("money") Double money);


}
