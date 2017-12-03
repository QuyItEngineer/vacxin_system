package vn.sotaytiemchung.exceptions;

public class UserNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	int code = 5001;

	public int getCode() {
		return code;
	}

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message) {
		super(message);
	}
}
