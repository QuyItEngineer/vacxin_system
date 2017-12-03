package vn.sotaytiemchung.models.dao;

import vn.sotaytiemchung.models.dto.ImmunizationSchedule;
import vn.sotaytiemchung.models.dto.LineSchedule;

public class ImmunizationScheduleDAOImpl implements ImmunizationScheduleDAO {

	@Override
	public ImmunizationSchedule getUserSchedule(String id) {
		// Step 1: Open database connection.
		// Step 2: Build statement for find schedule by user id.
		// Step 3: If found schedule just return.
		return null;
	}

	@Override
	public LineSchedule getLineSchedule(String lineScheduleId) {
		// Step 1: Open database connection.
		// Step 2: Build statement for find line schedule.
		// Step 3: If found line schedule just return.
		return null;
	}

	@Override
	public LineSchedule updateLineSchedule(LineSchedule lineSchedule) {
		// Step 1: Open database connection.
		// Step 2: Build statement for update line schedule by ID.
		// Step 3: After update line schedule just return.
		return null;
	}

	@Override
	public LineSchedule createLineSchedule(LineSchedule lineSchedule) {
		// Step 1: Open database connection.
		// Step 2: Build statement for create line schedule.
		// Step 3: After create successfully line schedule just return.

		return null;
	}

	@Override
	public LineSchedule removeLineSchedule(String lineScheduleId) {
		// Step 1: Open database connection.
		// Step 2: Build statement for remove line schedule by ID.
		// Step 3: After remove successfully line schedule just return.
		return null;
	}

}
