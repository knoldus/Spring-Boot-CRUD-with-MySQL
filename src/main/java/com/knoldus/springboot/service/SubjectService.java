package com.knoldus.springboot.service;

import com.knoldus.springboot.bean.Subject;
import com.knoldus.springboot.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    /**
     *Injecting Subject repo
     */
    @Autowired
    public SubjectRepository subjectRepo;

    /**
     * method to get all subjects
     * @return subjects
     */
    public List<Subject> getAllSubjects()
    {
        List<Subject> subjects = new ArrayList<>();
        subjectRepo.findAll().forEach(subjects::add);
        return subjects;
    }

    /**
     * method to add subjects
     * @param subject the subject
     */
    public void addSubject(Subject subject) {
        subjectRepo.save(subject);

    }

    /**
     * method to update subjects
     * @param id the id
     * @param subject the subject
     */
    public void updateSubject(String id, Subject subject) {
        subjectRepo.save(subject);

    }

    /**
     * method to delete Subjects
     * @param id the id
     */
    public void deleteSubject(String id) {
        subjectRepo.deleteById(id);

    }

}
