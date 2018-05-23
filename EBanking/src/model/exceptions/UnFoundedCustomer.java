package model.exceptions;

public class UnFoundedCustomer extends Exception {
	private static final long serialVersionUID = 1L;

	public UnFoundedCustomer(String message) {
		super(message);
	}
	
	public UnFoundedCustomer(int idCustomer) {
		super("No se encontro el cliente con id = " + idCustomer);
	}

}
