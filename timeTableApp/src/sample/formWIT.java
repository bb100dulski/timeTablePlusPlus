package sample;

import java.sql.Time;

public class formWIT {
    public String school;
    public String week;
    public String department;
    public Time startTime;
    public Time endTime;
    public String stage;
    public String group;

    public formWIT(String school, String week, String department, Time startTime, Time endTime, String stage, String group) {
        this.school = school;
        this.week = week;
        this.department = department;
        this.startTime = startTime;
        this.endTime = endTime;
        this.stage = stage;
        this.group = group;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
