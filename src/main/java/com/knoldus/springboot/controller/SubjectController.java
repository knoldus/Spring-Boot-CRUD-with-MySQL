package com.knoldus.springboot.controller;

import com.knoldus.springboot.bean.Subject;
import com.knoldus.springboot.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {
    /**
     * Injecting Subject Service
     */
    @Autowired
    private SubjectService subjectService;

    /**
     * Get all subjects
     * @return All subjects
     */
    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects()
    {
        return subjectService.getAllSubjects();
    }

    /**
     * Add the subjects
     * @param subject the subject
     */
    @RequestMapping(method = RequestMethod.POST, value="/subjects")
    public void addSubject(@RequestBody Subject subject)
    {
        subjectService.addSubject(subject);
    }

    /**
     * Update the subjects
     * @param id the subject id
     * @param subject the subject
     */
    @RequestMapping(method = RequestMethod.PUT, value="/subjects/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject)
    {
        subjectService.updateSubject(id, subject);
    }

    /**
     * delete the subjects
     * @param id subject id
     */
    @RequestMapping(method = RequestMethod.DELETE, value="/subjects/{id}")
    public void DeleteSubject(@PathVariable String id)
    {
        subjectService.deleteSubject(id);
    }

}
