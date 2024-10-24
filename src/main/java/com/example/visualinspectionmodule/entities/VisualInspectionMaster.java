package com.example.visualinspectionmodule.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "visual_inspection_master")
public class VisualInspectionMaster {

    @Id
    @Column(name = "rail_id")
    private String railId;

    @Column(name = "user_id", nullable = false, insertable = false, updatable = false)
    private String userId;

    @Column(name = "duty_id", nullable = false, insertable = false, updatable = false)
    private String dutyId;

    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Column(name = "shift", nullable = false)
    private String shift;

    @Column(name = "mill", nullable = false)
    private String mill;

    @Column(name = "start_time", nullable = false)
    private Timestamp startTime;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "user_id", referencedColumnName = "user_id"),
            @JoinColumn(name = "duty_id", referencedColumnName = "duty_id")
    })
    private VisualInspectionDuty visualInspectionDuty;

    // Getters and Setters

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

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public VisualInspectionDuty getVisualInspectionDuty() {
        return visualInspectionDuty;
    }

    public void setVisualInspectionDuty(VisualInspectionDuty visualInspectionDuty) {
        this.visualInspectionDuty = visualInspectionDuty;
    }
}
