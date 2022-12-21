package com.Kiran.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kiran.Model.AddMarks;

@Repository
public interface AddMarksRepo extends JpaRepository<AddMarks, Integer>{


}
