package com.test.springBoot.springBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.test.springBoot.springBoot.entity.*;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, Long> {

}