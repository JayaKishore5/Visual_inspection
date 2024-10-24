package com.example.visualinspectionmodule.controllers;

import com.example.visualinspectionmodule.entities.VisualInspectionDuty;
import com.example.visualinspectionmodule.services.VisualInspectionDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/duties")
public class VisualInspectionDutyController {

    @Autowired
    private VisualInspectionDutyService dutyService;

    @GetMapping
    public ResponseEntity<List<VisualInspectionDuty>> getAllDuties() {
        return ResponseEntity.ok(dutyService.getAllDuties());
    }

    @PostMapping
    public ResponseEntity<Void> addDuty(@RequestBody VisualInspectionDuty duty) {
        dutyService.addDuty(duty);
        return ResponseEntity.status(201).build();
    }
}