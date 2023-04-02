package com.stc.security.web.repositories;

import com.stc.security.web.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//JpaRepository<ТИП_СУЩНОСТИ, ТИП_ИДЕНТИФИКАТОРА_СУЩНОСТИ>
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> getAllByPassword(String password);

    //Закомментирован запрос на HQL языке. Отличие HQL от SQL в том, что HQL - объекто-ориентированный язык запросов и его запросы написаны в объектном стиле
    //@Query(value = "select account from Account account where account.email = :email")
    @Query(value = "select * from account where email = :email", nativeQuery = true) //nativeQuery = true - включили SQL синтаксис
    List<Account> getAllByEmail(@Param("email") String email);

    Optional<Account> findByEmail(String email);
}