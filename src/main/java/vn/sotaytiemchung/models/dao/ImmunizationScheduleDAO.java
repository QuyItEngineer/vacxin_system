package vn.sotaytiemchung.models.dao;

import vn.sotaytiemchung.models.dto.ImmunizationSchedule;
import vn.sotaytiemchung.models.dto.LineSchedule;

public interface ImmunizationScheduleDAO {
	public ImmunizationSchedule getUserSchedule(String id);

	public LineSchedule getLineSchedule(String lineScheduleId);

	public LineSchedule updateLineSchedule(LineSchedule lineSchedule);

	public LineSchedule createLineSchedule(LineSchedule lineSchedule);

	public LineSchedule removeLineSchedule(String lineScheduleId);
}
