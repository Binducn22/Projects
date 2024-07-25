class Employee {
    public static double employee(String name, double salary, int experience) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience);
        if (experience >= 5) 
		{
            return salary + 2000;
        } 
		else 
		{
            return salary;
        }
    }

    public static void main(String[] args)
	{
        double salary = employee("John Doe", 50000, 6);
        System.out.println("Salary: " + salary);
    }
}


































