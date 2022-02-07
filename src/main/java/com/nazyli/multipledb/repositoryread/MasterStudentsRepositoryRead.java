package com.nazyli.multipledb.repositoryread;

import com.nazyli.multipledb.entity.MasterStudents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterStudentsRepositoryRead extends JpaRepository<MasterStudents, Integer> {

}
