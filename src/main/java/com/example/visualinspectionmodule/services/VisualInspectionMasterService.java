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

    public VisualInspectionMaster createMaster(VisualInspectionMaster master) {
        return masterRepository.save(master);
    }

    public VisualInspectionMaster getMaster(String railId) {
        return masterRepository.findById(railId)
                .orElseThrow(() -> new RuntimeException("Master not found"));
    }

    public VisualInspectionMaster updateMaster(String railId, VisualInspectionMaster master) {
        VisualInspectionMaster existingMaster = getMaster(railId);

        String newRailId = master.getRailId();
        if (!existingMaster.getRailId().equals(newRailId)) {
            VisualInspectionMaster newMaster = new VisualInspectionMaster();
            newMaster.setRailId(newRailId); // Set new railId
            newMaster.setUserId(master.getUserId());
            newMaster.setDutyId(master.getDutyId());
            newMaster.setCreateDate(master.getCreateDate());
            newMaster.setShift(master.getShift());
            newMaster.setMill(master.getMill());
            newMaster.setStartTime(master.getStartTime());

            masterRepository.save(newMaster);
            masterRepository.delete(existingMaster);
            return newMaster;
        }

        // Update other fields if railId hasn't changed
        existingMaster.setUserId(master.getUserId());
        existingMaster.setDutyId(master.getDutyId());
        existingMaster.setCreateDate(master.getCreateDate());
        existingMaster.setShift(master.getShift());
        existingMaster.setMill(master.getMill());
        existingMaster.setStartTime(master.getStartTime());

        return masterRepository.save(existingMaster);
    }

    public void deleteMaster(String railId) {
        masterRepository.deleteById(railId);
    }
}
