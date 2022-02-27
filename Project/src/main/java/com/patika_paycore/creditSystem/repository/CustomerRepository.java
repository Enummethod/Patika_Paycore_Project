package com.patika_paycore.creditSystem.repository;

import com.patika_paycore.creditSystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{


    @Query("select c from Customer c where c.identityNumber = :identityNumber")
    Customer findByIdentityNumber(@Param("identityNumber") String identityNumber);

}
