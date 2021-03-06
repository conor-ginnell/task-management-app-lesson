package com.conorginnell.service;

import com.conorginnell.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {

    Optional<Project> findById(Long id);

    Project save(Project project);


}
