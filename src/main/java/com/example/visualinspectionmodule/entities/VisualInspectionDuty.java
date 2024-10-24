package com.example.visualinspectionmodule.entities;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "visual_inspection_duty")
public class VisualInspectionDuty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generate a unique ID for each entry
    @Column(name = "duty_id")
    private Long dutyId;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(nullable = false)
    private Date createDate;

    @Column(nullable = false)
    private String shift;

    @Column(nullable = false)
    private String mill;

    @Column(nullable = false)
    private int lineNo;

    @Column(nullable = false)
    private String railGrade;

    @Column(nullable = false)
    private String railSection;

    @Column(nullable = false)
    private int standardOfferedLength;

    @Column(nullable = false)
    private String ieName1;

    private String ieName2;
    private String ieName3;
    private String rclIeName1;
    private String rclIeName2;

    @Column(nullable = false)
    private Timestamp startTime;

    @Column(nullable = false)
    private Timestamp endTime;

    @Column(nullable = false)
    private String shiftRemark;


    public Long getDutyId() {
        return dutyId;
    }

    public void setDutyId(Long dutyId) {
        this.dutyId = dutyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getMill() {
        return mill;
    }

    public void setMill(String mill) {
        this.mill = mill;
    }

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public String getRailGrade() {
        return railGrade;
    }

    public void setRailGrade(String railGrade) {
        this.railGrade = railGrade;
    }

    public String getRailSection() {
        return railSection;
    }

    public void setRailSection(String railSection) {
        this.railSection = railSection;
    }

    public int getStandardOfferedLength() {
        return standardOfferedLength;
    }

    public void setStandardOfferedLength(int standardOfferedLength) {
        this.standardOfferedLength = standardOfferedLength;
    }

    public String getIeName1() {
        return ieName1;
    }

    public void setIeName1(String ieName1) {
        this.ieName1 = ieName1;
    }

    public String getIeName2() {
        return ieName2;
    }

    public void setIeName2(String ieName2) {
        this.ieName2 = ieName2;
    }

    public String getIeName3() {
        return ieName3;
    }

    public void setIeName3(String ieName3) {
        this.ieName3 = ieName3;
    }

    public String getRclIeName1() {
        return rclIeName1;
    }

    public void setRclIeName1(String rclIeName1) {
        this.rclIeName1 = rclIeName1;
    }

    public String getRclIeName2() {
        return rclIeName2;
    }

    public void setRclIeName2(String rclIeName2) {
        this.rclIeName2 = rclIeName2;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public String getShiftRemark() {
        return shiftRemark;
    }

    public void setShiftRemark(String shiftRemark) {
        this.shiftRemark = shiftRemark;
    }
}
