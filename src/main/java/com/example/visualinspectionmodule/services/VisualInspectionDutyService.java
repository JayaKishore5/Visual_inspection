package com.example.visualinspectionmodule.services;

import com.example.visualinspectionmodule.entities.VisualInspectionDuty;
import com.example.visualinspectionmodule.repositories.VisualInspectionDutyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisualInspectionDutyService {
    @Autowired
    private VisualInspectionDutyRepository dutyRepository;

    public List<VisualInspectionDuty> getAllDuties() {
        return dutyRepository.findAll();
    }

    public void addDuty(VisualInspectionDuty duty) {
        dutyRepository.save(duty);
    }
}
