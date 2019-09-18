package manufacture;

public abstract class GeneralManufacturingProcess {
	
	private String processName;
	
	public GeneralManufacturingProcess(String name) {
		processName = name;
	}
	protected abstract void assembleDevice();
	protected abstract void testDevice();
	protected abstract void packageDevice();
	protected abstract void storageDevice();

	public void launchProcess() {
		
		if(processName !=null && !processName.isEmpty()) {
		
		assembleDevice();
		testDevice();
		packageDevice();
		storageDevice();
		
		} else{
			System.out.println("no process name was specificed!");
		}
	}
}
