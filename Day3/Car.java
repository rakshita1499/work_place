package Day3;

class Car1 {
	String carName;
	String carType;
	

	public Car1(String carName, String carType) {
		super();
		this.carName = carName;
		this.carType = carType;
	}
	private String getCarName() {
		return this.carName;
	}
	
	class Engine{
		String engineType;
        void setEngine() {

           // Accessing the carType property of Car
            if(Car1.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(Car1.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            }else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}

public class Car{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car1 = new Car1("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car1.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Car1 car2 = new Car1("Crysler", "4WD");
        Car1.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    
		}
}


