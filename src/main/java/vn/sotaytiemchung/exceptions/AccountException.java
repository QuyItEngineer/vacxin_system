package vn.sotaytiemchung.exceptions;

public class AccountException extends Exception {
	private static final long serialVersionUID = 1L;
	int code = 5002;

	public int getCode() {
		return code;
	}

	public AccountException() {
		super();
	}

	public AccountException(String message) {
		super(message);
	}
}
