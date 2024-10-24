package com.example.visualinspectionmodule.services;

import com.example.visualinspectionmodule.entities.VisualInspectionDetail;
import com.example.visualinspectionmodule.repositories.VisualInspectionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisualInspectionDetailService {
    @Autowired
    private VisualInspectionDetailRepository detailRepository;

    public List<VisualInspectionDetail> getAllDetails() {
        return detailRepository.findAll();
    }

    public void addDetail(VisualInspectionDetail detail) {
        detailRepository.save(detail);
    }
}
