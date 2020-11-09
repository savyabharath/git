package day5exc.service;

public class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s;

	public CustomException() {
		s = "CustomException: Invalid Age Range";
	}

	@Override
	public String toString() {
		return s;
	}

}
