class Student {
public static void studentDetails(String name, String standard , byte rollNo, short fees) {
System.out.println("Name: " + name);
System.out.println("Standard:" + standard);
System.out.println("Roll No: " + rollNo);
System.out.println("Fees: " + fees);
}
public static void main(String[] args) {
	//byte temp=12
	//Student.studentDetails("prem", "eighth",temp, 3000); or  
Student.studentDetails("prem", "eighth",(byte)12,3000);   //typecasting
}
}



