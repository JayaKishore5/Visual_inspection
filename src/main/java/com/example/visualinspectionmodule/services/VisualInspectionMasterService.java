package com.example.visualinspectionmodule.services;

import com.example.visualinspectionmodule.entities.VisualInspectionMaster;
import com.example.visualinspectionmodule.repositories.VisualInspectionMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisualInspectionMasterService {

    @Autowired
    private VisualInspectionMasterRepository masterRepository;

    public List<VisualInspectionMaster> getAllMasters() {
        return masterRepository.findAll();
    }

    public void addMaster(VisualInspectionMaster master) {
        masterRepository.save(master);
    }
}
