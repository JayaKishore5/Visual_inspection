package com.example.visualinspectionmodule.controllers;

import com.example.visualinspectionmodule.entities.VisualInspectionMaster;
import com.example.visualinspectionmodule.services.VisualInspectionMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masters")
public class VisualInspectionMasterController {

    @Autowired
    private VisualInspectionMasterService masterService;

    @GetMapping
    public ResponseEntity<List<VisualInspectionMaster>> getAllMasters() {
        return ResponseEntity.ok(masterService.getAllMasters());
    }

    @PostMapping
    public ResponseEntity<Void> addMaster(@RequestBody VisualInspectionMaster master) {
        masterService.addMaster(master);
        return ResponseEntity.status(201).build();
    }
}