package com.example.visualinspectionmodule.repositories;

import com.example.visualinspectionmodule.entities.VisualInspectionMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisualInspectionMasterRepository extends JpaRepository<VisualInspectionMaster, String> {
}