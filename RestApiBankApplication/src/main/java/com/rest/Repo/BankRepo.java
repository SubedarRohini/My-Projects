package com.rest.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.Entity.BankEntity;
public interface BankRepo extends JpaRepository<BankEntity, Long> {

}
