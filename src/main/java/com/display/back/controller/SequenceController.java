package com.display.back.controller;

import com.display.back.model.Sequence;
import com.display.back.repository.SequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SequenceController {

    @Autowired
    private SequenceRepository sequenceRepository;

    @GetMapping("/get/{id}")
    public Optional<Sequence> getSequence(@PathVariable int id) {
        return sequenceRepository.findById(id);
    }
}