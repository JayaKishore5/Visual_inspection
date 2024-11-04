package com.example.visualinspectionmodule.repositories;

import com.example.visualinspectionmodule.entities.VisualInspectionDuty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisualInspectionDutyRepository extends JpaRepository<VisualInspectionDuty, com.example.visualinspectionmodule.compositkey.VisualInspectionDutyId> {
}