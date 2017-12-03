package vn.sotaytiemchung.models.dto;

import java.util.List;

public class ImmunizationSchedule {
	User user;
	List<LineSchedule> lineSchedules;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<LineSchedule> getLineSchedules() {
		return lineSchedules;
	}

	public void setLineSchedules(List<LineSchedule> lineSchedules) {
		this.lineSchedules = lineSchedules;
	}
}
