package org.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

public class Projects {
    private int projectCode;
    private String projectDesc;
    private LocalDate startDate;
    private int duration;

    public Projects(int projectCode, String projectDesc, LocalDate startDate, int duration) {
        this.projectCode = projectCode;
        this.projectDesc = projectDesc;
        this.startDate = startDate;
        this.duration = duration;
    }

    public Projects() {}

    public int getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(int projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
