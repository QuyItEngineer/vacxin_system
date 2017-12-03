package vn.sotaytiemchung.models.bo;

import vn.sotaytiemchung.exceptions.UserNotFoundException;
import vn.sotaytiemchung.models.dto.ImmunizationSchedule;
import vn.sotaytiemchung.models.dto.LineSchedule;

public interface ImmunizationScheduleBO {
	public ImmunizationSchedule getUserSchedule(String userId) throws UserNotFoundException;
	
	public LineSchedule getLineSchedule(String lineScheduleId);

	public LineSchedule updateLineSchedule(LineSchedule lineSchedule);

	public LineSchedule createLineSchedule(LineSchedule lineSchedule);

	public LineSchedule removeLineSchedule(String lineScheduleId);
}
