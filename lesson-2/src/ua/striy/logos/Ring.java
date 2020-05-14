package ua.striy.logos;

public class Ring {

		private int radius;
		private int diameter;
	
		Ring(){
			this.radius=50;
			this.diameter=100;
		}
		Ring(int radius,int diameter){
		 this.radius=radius;
		 this.diameter=diameter;
		}
		
		public void square () {
			System.out.println("Ring's square = " + diameter / 2);
		}
		 public void Lenght () {
		        System.out.println("Ring's Lenght = " + radius * 2);
		    }
		
		
		public int getRadius() {
			return radius;
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}
		public int getDiameter() {
			return diameter;
		}
		public void setDiameter(int diameter) {
			this.diameter = diameter;
		}
		
		
}
