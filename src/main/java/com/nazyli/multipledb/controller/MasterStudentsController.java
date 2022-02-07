package com.nazyli.multipledb.controller;

import com.nazyli.multipledb.dto.MasterStudentsDto;
import com.nazyli.multipledb.dto.Response;
import com.nazyli.multipledb.entity.MasterStudents;
import com.nazyli.multipledb.repository.MasterStudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/rest/students")
public class MasterStudentsController {
    @Autowired
    MasterStudentsRepository masterStudentsRepository;

    @PostMapping("/save")
    public Response<String> save(@RequestBody MasterStudentsDto req) {
        Response<String> response = new Response<>();
        MasterStudents students = new MasterStudents();
        try {
            if (req.getId() != null) {
                Optional<MasterStudents> optionalEntity = masterStudentsRepository.findById(req.getId());
                if (optionalEntity.isPresent()) {
                    students = optionalEntity.get();
                }
            }
            students.setName(req.getName());
            students.setNim(req.getNim());
            students.setProdi(req.getProdi());
            students.setAddress(req.getAddress());
            masterStudentsRepository.save(students);
            response.setSuccess("Master Students successfully save");
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
