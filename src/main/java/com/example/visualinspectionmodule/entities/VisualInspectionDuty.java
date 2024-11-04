package com.example.visualinspectionmodule.entities;

import com.example.visualinspectionmodule.compositkey.VisualInspectionDutyId;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "visual_inspection_duty")
@IdClass(VisualInspectionDutyId.class)
public class VisualInspectionDuty {

    @Id
    @Column(name = "User_Id")
    private String userId;

    @Id
    @Column(name = "Duty_Id")
    private String dutyId;

    @Column(name = "Create_Date", nullable = false)
    private Date createDate;

    @Column(name = "Shift", nullable = false)
    private String shift;

    @Column(name = "Mill", nullable = false)
    private String mill;

    @Column(name = "Line_No", nullable = false)
    private int lineNo;

    @Column(name = "Rail_Grade", nullable = false)
    private String railGrade;

    @Column(name = "Rail_Section", nullable = false)
    private String railSection;

    @Column(name = "Standard_Offered_Length", nullable = false)
    private int standardOfferedLength;

    @Column(name = "IE_Name_1", nullable = false)
    private String ieName1;

    @Column(name = "IE_Name_2")
    private String ieName2;

    @Column(name = "IE_Name_3")
    private String ieName3;

    @Column(name = "RCL_IE_Name_1")
    private String rclIeName1;

    @Column(name = "RCL_IE_Name_2")
    private String rclIeName2;

    @Column(name = "Start_Time", nullable = false)
    private Date startTime;

    @Column(name = "End_Time", nullable = false)
    private Date endTime;

    @Column(name = "Shift_Remark", nullable = false)
    private String shiftRemark;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDutyId() {
        return dutyId;
    }

    public void setDutyId(String dutyId) {
        this.dutyId = dutyId;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getShiftRemark() {
        return shiftRemark;
    }

    public void setShiftRemark(String shiftRemark) {
        this.shiftRemark = shiftRemark;
    }
}
