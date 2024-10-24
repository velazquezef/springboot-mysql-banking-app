package com.asic.javaguide.banking.repository;

import com.asic.javaguide.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
