class MatrimonyRunner {
    public static void main(String[] args) {
        System.out.println("Start main in MatrimonyRunner");
        Matrimony matrimony = new Matrimony();
        String name = matrimony.name;
        int age = matrimony.age;
        String gender = matrimony.gender;
        System.out.println("Matrimony name:" + name);
        System.out.println("Matrimony age:" + age);
        System.out.println("Matrimony gender:" + gender);

        matrimony.name = "John Doe";
        matrimony.age = 30;
        matrimony.gender = "Male";
        System.out.println("Matrimony updated name:" + matrimony.name);
        System.out.println("Matrimony updated age:" + matrimony.age);
        System.out.println("Matrimony updated gender:" + matrimony.gender);
        System.out.println("Stop main in MatrimonyRunner");
    }
}

