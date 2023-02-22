// Lab-4.Task || Klem Stepan 244(Б) 

public class DoubleVector {
	 private double[] vector = null;
	 public DoubleVector(double[] vector){
		 this.vector = vector;
	 }
	 
	 //Скалярний добуток
	 public double mult(DoubleVector anotherVector){
		 double s = 0;
		 
		 for ( int i = 0; i < vector.length; i++ ){
		 s += vector[i] * anotherVector.vector[i];
		 }
		 
		 return s;
	 }
	 
	 public static double mult(DoubleVector a, DoubleVector b){
		 return a.mult(b);
	 }
	 
	 // Сума векторів 
	 public double Sum(DoubleVector anotherVector) {
		double sum = 0;
	 
		for (int i = 0; i < vector.length - 1; i++) {
			sum += vector[i] + anotherVector.vector[i];
		}
		
		return sum;
	 }
	
	 public static double Sum(DoubleVector a, DoubleVector b) {
		 return a.Sum(b);
	 }
	 
	 
	 
	 public static void main(String[] args){
		 double[] a = {1, 2, 3, 4};
		 double[] b = {1, 1, 1, 1};
		 double[] c = {2, 2, 2, 2};
		 
		 DoubleVector v1 = new DoubleVector(a);
		 DoubleVector v2 = new DoubleVector(b);
		 DoubleVector v3 = new DoubleVector(c);
		 
		 System.out.println("v1*v2=" + v1.mult(v2));
		 System.out.println("v1*v2=" + DoubleVector.mult(v1, v2));
		 System.out.println("v1*v3=" + v1.mult(v3));
		 
		 System.out.println();
		 
		 System.out.println("v1+v2=" + v1.Sum(v2));
		 System.out.println("v1+v2=" + DoubleVector.Sum(v1, v2));
		 System.out.println("v1*v3=" + v1.Sum(v3));
		 
		 
	 }
}
