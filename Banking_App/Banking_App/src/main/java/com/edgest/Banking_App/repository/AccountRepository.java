package com.edgest.Banking_App.repository;

import com.edgest.Banking_App.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long > {
}
