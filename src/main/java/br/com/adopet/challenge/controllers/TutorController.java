package br.com.adopet.challenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adopet.challenge.entities.Tutor;
import br.com.adopet.challenge.repositories.TutorRepository;

@RestController
@RequestMapping(value = "/tutores")
public class TutorController {
    
    @Autowired
    private TutorRepository tutorRepository;

    @GetMapping
    public List<Tutor> getObjects() {
        List <Tutor> list = tutorRepository.findAll();

        return list;
    }
}
