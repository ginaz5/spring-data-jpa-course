package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// pass in entity and identifier type
public interface StudentRepository extends JpaRepository<Student, Long> {
}
