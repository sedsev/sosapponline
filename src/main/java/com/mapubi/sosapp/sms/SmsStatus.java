package com.mapubi.sosapp.sms;

public class SmsStatus {
	private int id;
	private int groupId;
	private String groupName;
	private String name;
	private String description;

	public SmsStatus() {
		// TODO Auto-generated constructor stub
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SmsStatus [groupId=" + groupId + ", groupName="
				+ groupName + ", id=" + id + ", name=" + name
				+ ", description=" + description + "]";
	}

}

