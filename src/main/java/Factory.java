public class Factory {
    
	public void buildCar(Car car) {
        System.out.println("Build new car: color=" + car.getColor() + ", manufacturer=" + car.getManufacturer() + ", doors=" + car.getDoors());
    }
	
}
