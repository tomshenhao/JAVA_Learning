package manufacture;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess{

	public SmartphoneManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assembleDevice() {
		System.out.println("assembled smartphone");		
	}

	@Override
	protected void testDevice() {
		System.out.println("tested smartphone");		
	}

	@Override
	protected void packageDevice() {
		System.out.println("packaged smartphone");	
	}

	@Override
	protected void storageDevice() {
		System.out.println("storaged smartphone");		
	}

}
