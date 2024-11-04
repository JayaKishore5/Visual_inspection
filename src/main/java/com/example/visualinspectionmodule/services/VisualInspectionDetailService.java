package com.example.visualinspectionmodule.services;

import com.example.visualinspectionmodule.entities.VisualInspectionDetail;
import com.example.visualinspectionmodule.repositories.VisualInspectionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisualInspectionDetailService {

    @Autowired
    private VisualInspectionDetailRepository detailRepository;

    public List<VisualInspectionDetail> getAllDetails() {
        return detailRepository.findAll();
    }

    public VisualInspectionDetail createDetail(VisualInspectionDetail detail) {
        return detailRepository.save(detail);
    }

    public VisualInspectionDetail getDetail(String railId) {
        return detailRepository.findById(railId)
                .orElseThrow(() -> new RuntimeException("Detail with Rail ID " + railId + " not found"));
    }

    public VisualInspectionDetail updateDetail(String railId, VisualInspectionDetail detail) {
        VisualInspectionDetail existingDetail = getDetail(railId);

        // If railId is changing, create a new entry and delete the old one
        if (!existingDetail.getRailId().equals(detail.getRailId())) {
            detailRepository.delete(existingDetail);
            return detailRepository.save(detail);
        }

        // Otherwise, update fields in the existing entry
        existingDetail.setHeatNo(detail.getHeatNo());
        existingDetail.setHeatPassStatus(detail.getHeatPassStatus());
        existingDetail.setActualOfferedLength(detail.getActualOfferedLength());
        existingDetail.setAcceptLength(detail.getAcceptLength());
        existingDetail.setAcceptNo(detail.getAcceptNo());
        existingDetail.setRailClass(detail.getRailClass());
        existingDetail.setSubRailId(detail.getSubRailId());
        existingDetail.setDefectCategory(detail.getDefectCategory());
        existingDetail.setDefectType(detail.getDefectType());
        existingDetail.setDefectLocation(detail.getDefectLocation());
        existingDetail.setDefectPosition(detail.getDefectPosition());
        existingDetail.setRejectionDetails13m(detail.getRejectionDetails13m());
        existingDetail.setRejectionDetails12m(detail.getRejectionDetails12m());
        existingDetail.setRejectionDetails11m(detail.getRejectionDetails11m());
        existingDetail.setRejectionDetails10m(detail.getRejectionDetails10m());
        existingDetail.setRejectionDetailsCompLength(detail.getRejectionDetailsCompLength());
        existingDetail.setRemark(detail.getRemark());
        existingDetail.setUpload(detail.getUpload()); // Ensure this is a valid byte[]

        return detailRepository.save(existingDetail);
    }

    public void deleteDetail(String railId) {
        Optional<VisualInspectionDetail> existingDetail = detailRepository.findById(railId);
        if (existingDetail.isPresent()) {
            detailRepository.delete(existingDetail.get());
        } else {
            throw new RuntimeException("Detail with Rail ID " + railId + " not found");
        }
    }
}
