package com.techwave.mvc.model;

public class project {
	private int projectId;
	private String projectDec;
	private int duration;
	
	@Override
	public String toString() {
		return "project [projectId=" + projectId + ", projectDec=" + projectDec + ", duration=" + duration + "]";
	}
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectDec() {
		return projectDec;
	}
	public void setProjectDec(String projectDec) {
		this.projectDec = projectDec;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public project(int projectId, String projectDec, int duration) {
		super();
		this.projectId = projectId;
		this.projectDec = projectDec;
		this.duration = duration;
	}
	
	public project() {}
	
	
	
}
