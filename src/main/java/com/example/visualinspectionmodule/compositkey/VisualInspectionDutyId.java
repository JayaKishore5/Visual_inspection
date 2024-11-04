package com.example.visualinspectionmodule.compositkey;

import java.io.Serializable;
import java.util.Objects;

public class VisualInspectionDutyId  implements Serializable {
    private String userId;
    private String dutyId;

    public VisualInspectionDutyId() {}

    public VisualInspectionDutyId(String userId, String dutyId) {
        this.userId = userId;
        this.dutyId = dutyId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VisualInspectionDutyId)) return false;
        VisualInspectionDutyId that = (VisualInspectionDutyId) o;
        return Objects.equals(getUserId(), that.getUserId()) &&
                Objects.equals(getDutyId(), that.getDutyId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getDutyId());
    }
}
