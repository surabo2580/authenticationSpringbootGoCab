package com.knf.dev.repository;

import com.knf.dev.models.Complain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplainRepository extends JpaRepository<Complain, Long> {

}
