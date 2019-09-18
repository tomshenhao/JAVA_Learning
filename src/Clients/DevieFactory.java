package Clients;

import manufacture.GeneralManufacturingProcess;
import manufacture.LaptopManufacturingProcess;
import manufacture.SmartphoneManufacturingProcess;

public class DevieFactory {

	public static void main(String args[]) {
		GeneralManufacturingProcess smartphone = new SmartphoneManufacturingProcess("Iphone");
		smartphone.launchProcess();
		
		GeneralManufacturingProcess laptop = new LaptopManufacturingProcess("Dell");
		laptop.launchProcess();
		
	}
}
