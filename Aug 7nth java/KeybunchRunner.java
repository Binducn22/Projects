class KeybunchRunner {
    public static void main(String[] args) {
        Key key = new Key(100, "Samsung");
        Keybunch keybunch = new Keybunch("Metal", key);
        keybunch.display();
		
		
		Key key1 = new Key(200, "union");
        Keybunch keybunch1 = new Keybunch("plastic", key1);
        keybunch1.display();
    }
}
