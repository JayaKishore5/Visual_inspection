package com.example.visualinspectionmodule.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "visual_inspection_detail")
public class VisualInspectionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Assuming you want a generated ID
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private int heatNo;

    @Column(nullable = false)
    private String heatPassStatus;

    @Column(nullable = false)
    private BigDecimal actualOfferedLength;

    @Column(nullable = false)
    private BigDecimal acceptLength;

    @Column(nullable = false)
    private int acceptNo;

    @Column(nullable = false)
    private String railClass;

    private String subRailId;
    private String defectCategory;
    private String defectType;
    private BigDecimal defectLocation;
    private String defectPosition;
    private BigDecimal rejectionDetails13m;
    private BigDecimal rejectionDetails12m;
    private BigDecimal rejectionDetails11m;
    private BigDecimal rejectionDetails10m;
    private BigDecimal rejectionDetailsCompLength;
    private String remark;

    @Lob
    private byte[] upload;

    @ManyToOne
    @JoinColumn(name = "rail_id", nullable = false)
    private VisualInspectionMaster visualInspectionMaster;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHeatNo() {
        return heatNo;
    }

    public void setHeatNo(int heatNo) {
        this.heatNo = heatNo;
    }

    public String getHeatPassStatus() {
        return heatPassStatus;
    }

    public void setHeatPassStatus(String heatPassStatus) {
        this.heatPassStatus = heatPassStatus;
    }

    public BigDecimal getActualOfferedLength() {
        return actualOfferedLength;
    }

    public void setActualOfferedLength(BigDecimal actualOfferedLength) {
        this.actualOfferedLength = actualOfferedLength;
    }

    public BigDecimal getAcceptLength() {
        return acceptLength;
    }

    public void setAcceptLength(BigDecimal acceptLength) {
        this.acceptLength = acceptLength;
    }

    public int getAcceptNo() {
        return acceptNo;
    }

    public void setAcceptNo(int acceptNo) {
        this.acceptNo = acceptNo;
    }

    public String getRailClass() {
        return railClass;
    }

    public void setRailClass(String railClass) {
        this.railClass = railClass;
    }

    public String getSubRailId() {
        return subRailId;
    }

    public void setSubRailId(String subRailId) {
        this.subRailId = subRailId;
    }

    public String getDefectCategory() {
        return defectCategory;
    }

    public void setDefectCategory(String defectCategory) {
        this.defectCategory = defectCategory;
    }

    public String getDefectType() {
        return defectType;
    }

    public void setDefectType(String defectType) {
        this.defectType = defectType;
    }

    public BigDecimal getDefectLocation() {
        return defectLocation;
    }

    public void setDefectLocation(BigDecimal defectLocation) {
        this.defectLocation = defectLocation;
    }

    public String getDefectPosition() {
        return defectPosition;
    }

    public void setDefectPosition(String defectPosition) {
        this.defectPosition = defectPosition;
    }

    public BigDecimal getRejectionDetails13m() {
        return rejectionDetails13m;
    }

    public void setRejectionDetails13m(BigDecimal rejectionDetails13m) {
        this.rejectionDetails13m = rejectionDetails13m;
    }

    public BigDecimal getRejectionDetails12m() {
        return rejectionDetails12m;
    }

    public void setRejectionDetails12m(BigDecimal rejectionDetails12m) {
        this.rejectionDetails12m = rejectionDetails12m;
    }

    public BigDecimal getRejectionDetails11m() {
        return rejectionDetails11m;
    }

    public void setRejectionDetails11m(BigDecimal rejectionDetails11m) {
        this.rejectionDetails11m = rejectionDetails11m;
    }

    public BigDecimal getRejectionDetails10m() {
        return rejectionDetails10m;
    }

    public void setRejectionDetails10m(BigDecimal rejectionDetails10m) {
        this.rejectionDetails10m = rejectionDetails10m;
    }

    public BigDecimal getRejectionDetailsCompLength() {
        return rejectionDetailsCompLength;
    }

    public void setRejectionDetailsCompLength(BigDecimal rejectionDetailsCompLength) {
        this.rejectionDetailsCompLength = rejectionDetailsCompLength;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public byte[] getUpload() {
        return upload;
    }

    public void setUpload(byte[] upload) {
        this.upload = upload;
    }

    public VisualInspectionMaster getVisualInspectionMaster() {
        return visualInspectionMaster;
    }

    public void setVisualInspectionMaster(VisualInspectionMaster visualInspectionMaster) {
        this.visualInspectionMaster = visualInspectionMaster;
    }
}
