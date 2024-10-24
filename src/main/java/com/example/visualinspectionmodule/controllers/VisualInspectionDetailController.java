package com.example.visualinspectionmodule.controllers;

import com.example.visualinspectionmodule.entities.VisualInspectionDetail;
import com.example.visualinspectionmodule.services.VisualInspectionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/details")
public class VisualInspectionDetailController {

    @Autowired
    private VisualInspectionDetailService detailService;

    @GetMapping
    public ResponseEntity<List<VisualInspectionDetail>> getAllDetails() {
        return ResponseEntity.ok(detailService.getAllDetails());
    }

    @PostMapping
    public ResponseEntity<Void> addDetail(@RequestBody VisualInspectionDetail detail) {
        detailService.addDetail(detail);
        return ResponseEntity.status(201).build();
    }
}