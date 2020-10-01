package com.mateo9x.swaggercrud.repository;

import com.mateo9x.swaggercrud.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
