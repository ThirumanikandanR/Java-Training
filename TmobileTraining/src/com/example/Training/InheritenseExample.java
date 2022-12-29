package com.example.Training;

class Vechile{
	
	 String name;
	

}

class Bus extends Vechile{

	 String modelName;
	 String noOfWheels;
	
	 public void display() {
			System.out.println("NAME:"+" "+name+" "+"ModelNAME:"+" "+modelName+" "+"NOofWHEELS:"+" "+noOfWheels+" ");
		}
	
}


class Lorry extends Vechile{

	 String modelName;
	 String noOfWheels;
	
	
	 public void display() {
			System.out.println("NAME:"+" "+name+" "+"ModelNAME:"+" "+modelName+" "+"NOofWHEELS:"+" "+noOfWheels+" ");
		}
	
	
}


public class InheritenseExample {
	
	public static void main(String[] args) {
		
		Bus b1=new Bus();
		b1.name="VOLOVO";
		b1.modelName="x34";
		b1.noOfWheels="10";
		
		b1.display();
		
		
	}

}
