class Keybunch {
    String material;
    Key key;
	
	Keybunch(String material, Key key) {
        this.material = material;
        this.key = key;
    }
    public void display() {
		this.key.declareDetails();
        System.out.println("Material=" + material);
		System.out.println("Key=" + key);
    }
}