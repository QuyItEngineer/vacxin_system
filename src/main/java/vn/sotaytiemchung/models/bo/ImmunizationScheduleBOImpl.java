package vn.sotaytiemchung.models.bo;

import vn.sotaytiemchung.exceptions.UserNotFoundException;
import vn.sotaytiemchung.models.dao.ImmunizationScheduleDAO;
import vn.sotaytiemchung.models.dao.ImmunizationScheduleDAOImpl;
import vn.sotaytiemchung.models.dto.ImmunizationSchedule;
import vn.sotaytiemchung.models.dto.LineSchedule;
import vn.sotaytiemchung.models.dto.User;

public class ImmunizationScheduleBOImpl implements ImmunizationScheduleBO {
	UserBO userBO;
	ImmunizationScheduleDAO iScheduleDAO;

	public ImmunizationScheduleBOImpl() {
		// Create instance of services class.
		userBO = new UserBOImpl();
		iScheduleDAO = new ImmunizationScheduleDAOImpl();
	}

	@Override
	public ImmunizationSchedule getUserSchedule(String userId) throws UserNotFoundException {
		User user = userBO.findOneUser(userId);

		if (user != null) {
			return iScheduleDAO.getUserSchedule(userId);
		} else {
			throw new UserNotFoundException();
		}
	}

	@Override
	public LineSchedule getLineSchedule(String lineScheduleId) {
		return iScheduleDAO.getLineSchedule(lineScheduleId);
	}

	@Override
	public LineSchedule updateLineSchedule(LineSchedule lineSchedule) {
		return iScheduleDAO.updateLineSchedule(lineSchedule);
	}

	@Override
	public LineSchedule createLineSchedule(LineSchedule lineSchedule) {
		return iScheduleDAO.createLineSchedule(lineSchedule);
	}

	@Override
	public LineSchedule removeLineSchedule(String lineScheduleId) {
		return iScheduleDAO.removeLineSchedule(lineScheduleId);
	}
}
