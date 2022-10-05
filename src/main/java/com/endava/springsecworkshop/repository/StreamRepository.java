package com.endava.springsecworkshop.repository;

import com.endava.springsecworkshop.entities.Stream;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreamRepository extends JpaRepository<Stream, Long> {
}
