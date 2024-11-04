package com.example.visualinspectionmodule.controllers;

import com.example.visualinspectionmodule.entities.VisualInspectionMaster;
import com.example.visualinspectionmodule.services.VisualInspectionMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/master")
public class VisualInspectionMasterController {

    @Autowired
    private VisualInspectionMasterService masterService;

    @GetMapping
    public List<VisualInspectionMaster> getAllMasters() {
        return masterService.getAllMasters();
    }

    @PostMapping
    public ResponseEntity<VisualInspectionMaster> createMaster(@RequestBody VisualInspectionMaster master) {
        return ResponseEntity.ok(masterService.createMaster(master));
    }

    @GetMapping("/{railId}")
    public ResponseEntity<VisualInspectionMaster> getMaster(@PathVariable String railId) {
        return ResponseEntity.ok(masterService.getMaster(railId));
    }

    @PutMapping("/{railId}")
    public ResponseEntity<VisualInspectionMaster> updateMaster(@PathVariable String railId,
                                                               @RequestBody VisualInspectionMaster master) {
        return ResponseEntity.ok(masterService.updateMaster(railId, master));
    }

    @DeleteMapping("/{railId}")
    public ResponseEntity<Void> deleteMaster(@PathVariable String railId) {
        masterService.deleteMaster(railId);
        return ResponseEntity.noContent().build();
    }
}
