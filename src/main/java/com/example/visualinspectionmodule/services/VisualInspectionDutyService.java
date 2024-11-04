package com.example.visualinspectionmodule.services;

import com.example.visualinspectionmodule.compositkey.VisualInspectionDutyId;
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

    public VisualInspectionDuty createDuty(VisualInspectionDuty duty) {
        return dutyRepository.save(duty);
    }

    public VisualInspectionDuty saveDuty(VisualInspectionDuty duty) {
        return dutyRepository.save(duty);
    }

    public VisualInspectionDuty getDuty(String userId, String dutyId) {
        return dutyRepository.findById(new VisualInspectionDutyId(userId, dutyId))
                .orElseThrow(() -> new RuntimeException("Duty not found"));
    }

    public VisualInspectionDuty updateDuty(String userId, String dutyId, VisualInspectionDuty duty) {
        VisualInspectionDuty existingDuty = getDuty(userId, dutyId);

        VisualInspectionDuty updatedDuty = new VisualInspectionDuty();

        if (!existingDuty.getUserId().equals(duty.getUserId()) || !existingDuty.getDutyId().equals(duty.getDutyId())) {
            updatedDuty.setUserId(duty.getUserId());
            updatedDuty.setDutyId(duty.getDutyId());
        } else {
            updatedDuty.setUserId(existingDuty.getUserId());
            updatedDuty.setDutyId(existingDuty.getDutyId());
        }

        updatedDuty.setCreateDate(duty.getCreateDate());
        updatedDuty.setShift(duty.getShift());
        updatedDuty.setMill(duty.getMill());
        updatedDuty.setLineNo(duty.getLineNo());
        updatedDuty.setRailGrade(duty.getRailGrade());
        updatedDuty.setRailSection(duty.getRailSection());
        updatedDuty.setStandardOfferedLength(duty.getStandardOfferedLength());
        updatedDuty.setIeName1(duty.getIeName1());
        updatedDuty.setIeName2(duty.getIeName2());
        updatedDuty.setIeName3(duty.getIeName3());
        updatedDuty.setRclIeName1(duty.getRclIeName1());
        updatedDuty.setRclIeName2(duty.getRclIeName2());
        updatedDuty.setStartTime(duty.getStartTime());
        updatedDuty.setEndTime(duty.getEndTime());
        updatedDuty.setShiftRemark(duty.getShiftRemark());

        dutyRepository.save(updatedDuty);

        dutyRepository.delete(existingDuty);

        return updatedDuty;
    }

    public void deleteDuty(String userId, String dutyId) {
        VisualInspectionDutyId id = new VisualInspectionDutyId(userId, dutyId);
        dutyRepository.deleteById(id);
    }
}
