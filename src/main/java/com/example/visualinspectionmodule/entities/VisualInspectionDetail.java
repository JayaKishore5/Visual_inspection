package com.example.visualinspectionmodule.entities;

import jakarta.persistence.*;
import java.util.Base64;

@Entity
@Table(name = "visual_inspection_detail")
public class VisualInspectionDetail {

    @Id
    @Column(name = "Rail_Id")
    private String railId;

    @Column(name = "Heat_No")
    private int heatNo;

    @Column(name = "Heat_Pass_Status")
    private String heatPassStatus;

    @Column(name = "Actual_Offered_Length")
    private double actualOfferedLength;

    @Column(name = "Accept_Length")
    private double acceptLength;

    @Column(name = "Accept_No")
    private int acceptNo;

    @Column(name = "Rail_Class")
    private String railClass;  // No CHECK constraint in this version

    @Column(name = "Sub_Rail_Id")
    private String subRailId;

    @Column(name = "Defect_Category")
    private String defectCategory;  // No CHECK constraint in this version

    @Column(name = "Defect_Type")
    private String defectType;

    @Column(name = "Defect_Location")
    private double defectLocation;

    @Column(name = "Defect_Position")
    private String defectPosition;  // No CHECK constraint in this version

    @Column(name = "Rejection_Details_13m")
    private double rejectionDetails13m;

    @Column(name = "Rejection_Details_12m")
    private double rejectionDetails12m;

    @Column(name = "Rejection_Details_11m")
    private double rejectionDetails11m;

    @Column(name = "Rejection_Details_10m")
    private double rejectionDetails10m;

    @Column(name = "Rejection_Details_Comp_Length")
    private double rejectionDetailsCompLength;

    @Column(name = "Remark")
    private String remark;

    @Column(name = "Upload")
    private byte[] upload;

    @Transient // This field will not be persisted to the database
    private String uploadBase64;

    // Getters and Setters...

    public String getRailId() {
        return railId;
    }

    public void setRailId(String railId) {
        this.railId = railId;
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

    public double getActualOfferedLength() {
        return actualOfferedLength;
    }

    public void setActualOfferedLength(double actualOfferedLength) {
        this.actualOfferedLength = actualOfferedLength;
    }

    public double getAcceptLength() {
        return acceptLength;
    }

    public void setAcceptLength(double acceptLength) {
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

    public double getDefectLocation() {
        return defectLocation;
    }

    public void setDefectLocation(double defectLocation) {
        this.defectLocation = defectLocation;
    }

    public String getDefectPosition() {
        return defectPosition;
    }

    public void setDefectPosition(String defectPosition) {
        this.defectPosition = defectPosition;
    }

    public double getRejectionDetails13m() {
        return rejectionDetails13m;
    }

    public void setRejectionDetails13m(double rejectionDetails13m) {
        this.rejectionDetails13m = rejectionDetails13m;
    }

    public double getRejectionDetails12m() {
        return rejectionDetails12m;
    }

    public void setRejectionDetails12m(double rejectionDetails12m) {
        this.rejectionDetails12m = rejectionDetails12m;
    }

    public double getRejectionDetails11m() {
        return rejectionDetails11m;
    }

    public void setRejectionDetails11m(double rejectionDetails11m) {
        this.rejectionDetails11m = rejectionDetails11m;
    }

    public double getRejectionDetails10m() {
        return rejectionDetails10m;
    }

    public void setRejectionDetails10m(double rejectionDetails10m) {
        this.rejectionDetails10m = rejectionDetails10m;
    }

    public double getRejectionDetailsCompLength() {
        return rejectionDetailsCompLength;
    }

    public void setRejectionDetailsCompLength(double rejectionDetailsCompLength) {
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

    public String getUploadBase64() {
        return uploadBase64;
    }

    public void setUploadBase64(String uploadBase64) {
        this.uploadBase64 = uploadBase64;
        if (uploadBase64 != null) {
            this.upload = Base64.getDecoder().decode(uploadBase64);
        }
    }
}
