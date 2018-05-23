package model.exceptions;

public class UnFoundedAccount extends Exception{

	private static final long serialVersionUID = 1L;

	public UnFoundedAccount(String message) {
		super(message);
	}
	
	public UnFoundedAccount(int idAccount) {
		super("No se encontro la cuenta con id = " + idAccount);
	}
	
}
