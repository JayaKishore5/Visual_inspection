package com.example.visualinspectionmodule.controllers;

import com.example.visualinspectionmodule.entities.VisualInspectionDetail;
import com.example.visualinspectionmodule.services.VisualInspectionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/detail")
public class VisualInspectionDetailController {

    @Autowired
    private VisualInspectionDetailService detailService;

    @GetMapping
    public ResponseEntity<List<VisualInspectionDetail>> getAllDetails() {
        List<VisualInspectionDetail> details = detailService.getAllDetails();
        details.forEach(this::encodeUploadToBase64);
        return ResponseEntity.ok(details);
    }

    @PostMapping
    public ResponseEntity<VisualInspectionDetail> createDetail(@RequestBody VisualInspectionDetail detail) {
        decodeUploadFromBase64(detail);
        VisualInspectionDetail createdDetail = detailService.createDetail(detail);
        encodeUploadToBase64(createdDetail);
        return new ResponseEntity<>(createdDetail, HttpStatus.CREATED);
    }

    @GetMapping("/{railId}")
    public ResponseEntity<VisualInspectionDetail> getDetail(@PathVariable String railId) {
        VisualInspectionDetail detail = detailService.getDetail(railId);
        if (detail == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        encodeUploadToBase64(detail);
        return ResponseEntity.ok(detail);
    }

    @PutMapping("/{railId}")
    public ResponseEntity<VisualInspectionDetail> updateDetail(@PathVariable String railId,
                                                               @RequestBody VisualInspectionDetail detail) {
        decodeUploadFromBase64(detail);
        VisualInspectionDetail updatedDetail = detailService.updateDetail(railId, detail);
        if (updatedDetail == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        encodeUploadToBase64(updatedDetail);
        return ResponseEntity.ok(updatedDetail);
    }

    @DeleteMapping("/{railId}")
    public ResponseEntity<Void> deleteDetail(@PathVariable String railId) {
        if (detailService.getDetail(railId) != null) {
            detailService.deleteDetail(railId);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    private void encodeUploadToBase64(VisualInspectionDetail detail) {
        if (detail.getUpload() != null) {
            detail.setUploadBase64(Base64.getEncoder().encodeToString(detail.getUpload()));
            detail.setUpload(null);  // Clear byte array to avoid returning in the response
        }
    }

    private void decodeUploadFromBase64(VisualInspectionDetail detail) {
        if (detail.getUploadBase64() != null) {
            detail.setUpload(Base64.getDecoder().decode(detail.getUploadBase64()));
        }
    }
}
