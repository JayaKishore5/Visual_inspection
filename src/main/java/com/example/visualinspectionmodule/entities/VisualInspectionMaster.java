package com.example.visualinspectionmodule.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "visual_inspection_master")
public class VisualInspectionMaster {

    @Id
    @Column(name = "Rail_Id")
    private String railId;

    @Column(name = "User_Id")
    private String userId;

    @Column(name = "Duty_Id")
    private String dutyId;

    @Column(name = "Create_Date")
    private Date createDate;

    @Column(name = "Shift")
    private String shift;

    @Column(name = "Mill")
    private String mill;

    @Column(name = "Start_Time")
    private Date startTime;

    public String getRailId() {
        return railId;
    }

    public void setRailId(String railId) {
        this.railId = railId;
    }

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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
