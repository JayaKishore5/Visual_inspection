package com.example.visualinspectionmodule.repositories;

import com.example.visualinspectionmodule.entities.VisualInspectionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisualInspectionDetailRepository extends JpaRepository<VisualInspectionDetail, String> {
}
