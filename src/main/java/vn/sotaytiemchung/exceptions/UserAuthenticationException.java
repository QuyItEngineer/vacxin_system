package vn.sotaytiemchung.exceptions;

public class UserAuthenticationException extends Exception {
	private static final long serialVersionUID = 1L;
	int code = 5003;

	public int getCode() {
		return code;
	}

	public UserAuthenticationException() {
		super();
	}

	public UserAuthenticationException(String message) {
		super(message);
	}
}