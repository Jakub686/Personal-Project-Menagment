package com.Jakub686.Personal.Project.Menagment.repositories;

import com.Jakub686.Personal.Project.Menagment.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {

    @Override
    default Optional<Project> findById(Long aLong) {
        return Optional.empty();
    }
}
