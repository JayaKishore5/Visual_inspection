package com.example.visualinspectionmodule.controllers;

import com.example.visualinspectionmodule.entities.VisualInspectionDuty;
import com.example.visualinspectionmodule.services.VisualInspectionDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/duty")
public class VisualInspectionDutyController {

    @Autowired
    private VisualInspectionDutyService dutyService;

    @GetMapping
    public List<VisualInspectionDuty> getAllDuties() {
        return dutyService.getAllDuties();
    }

    @PostMapping("/{userId}/{dutyId}")
    public ResponseEntity<VisualInspectionDuty> createDuty(
            @PathVariable String userId,
            @PathVariable String dutyId,
            @RequestBody VisualInspectionDuty duty) {
        duty.setUserId(userId);
        duty.setDutyId(dutyId);
        VisualInspectionDuty createdDuty = dutyService.createDuty(duty);
        return new ResponseEntity<>(createdDuty, HttpStatus.CREATED);
    }

    @GetMapping("/{userId}/{dutyId}")
    public ResponseEntity<VisualInspectionDuty> getDuty(@PathVariable String userId, @PathVariable String dutyId) {
        return ResponseEntity.ok(dutyService.getDuty(userId, dutyId));
    }

    @PutMapping("/{userId}/{dutyId}")
    public ResponseEntity<VisualInspectionDuty> updateDuty(
            @PathVariable String userId,
            @PathVariable String dutyId,
            @RequestBody VisualInspectionDuty duty) {
        return ResponseEntity.ok(dutyService.updateDuty(userId, dutyId, duty));
    }

    @DeleteMapping("/{userId}/{dutyId}")
    public ResponseEntity<Void> deleteDuty(@PathVariable String userId, @PathVariable String dutyId) {
        dutyService.deleteDuty(userId, dutyId);
        return ResponseEntity.noContent().build();
    }
}
