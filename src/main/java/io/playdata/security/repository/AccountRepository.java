package io.playdata.security.repository;

import io.playdata.security.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username); // JPA 메소드 생성규칙

    boolean existsByUsername(String username); // JPA 메소드 생성규칙
}
