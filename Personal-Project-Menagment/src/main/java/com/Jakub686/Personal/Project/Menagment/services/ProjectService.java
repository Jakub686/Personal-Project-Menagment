package com.Jakub686.Personal.Project.Menagment.services;


import com.Jakub686.Personal.Project.Menagment.domain.Project;
import com.Jakub686.Personal.Project.Menagment.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public Project saveOrUpdateProject(Project project){

        return projectRepository.save(project);
    }
}
