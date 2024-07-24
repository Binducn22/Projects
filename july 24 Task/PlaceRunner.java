class PlaceRunner {
    public static void main(String[] args) {
        System.out.println("Start main in PlaceRunner");
        Place place = new Place();
        String name = place.name;
        String location = place.location;
        int capacity = place.capacity;
        System.out.println("Place name:" + name);
        System.out.println("Place location:" + location);
        System.out.println("Place capacity:" + capacity);

        place.name = "Conference Hall";
        place.location = "New York";
        place.capacity = 500;
        System.out.println("Place updated name:" + place.name);
        System.out.println("Place updated location:" + place.location);
        System.out.println("Place updated capacity:" + place.capacity);
        System.out.println("Stop main in PlaceRunner");
    }
}
