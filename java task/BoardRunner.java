class BoardRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in BoardRunner");
		
		Board board=new Board("Wooden","large","10m");
		System.out.println("Board type:"+board.type);
		System.out.println("Board size:"+board.size);
		System.out.println("Board length:"+board.length);

		
		Board board1=new Board("plastic","small","5m");
		System.out.println("Board type:"+board1.type);
		System.out.println("Board size:"+board1.size);
		System.out.println("Board length:"+board1.length);
		
		Board board2=new Board("whiteboard","medium","10m");
		System.out.println("Board type:"+board2.type);
		System.out.println("Board size:"+board2.size);
		System.out.println("Board length:"+board2.length);
		
		Board board3=new Board("blackboard","large","15m");
		System.out.println("Board type:"+board3.type);
		System.out.println("Board size:"+board3.size);
		System.out.println("Board length:"+board3.length);

		Board board4=new Board("cork","medium","10m");
		System.out.println("Board type:"+board4.type);
		System.out.println("Board size:"+board4.size);
		System.out.println("Board length:"+board4.length);
		
		Board board5=new Board("cardboard","small","5m");
		System.out.println("Board type:"+board5.type);
		System.out.println("Board size:"+board5.size);
		System.out.println("Board length:"+board5.length);
		Board board6=new Board("Wooden","large","15m");
		System.out.println("Board type:"+board6.type);
		System.out.println("Board size:"+board6.size);
		System.out.println("Board length:"+board6.length);
		
		Board board7=new Board("circuitboard","large","20m");
		System.out.println("Board type:"+board7.type);
		System.out.println("Board size:"+board7.size);
		System.out.println("Board length:"+board7.length);

		Board board8=new Board("glassboard","medium","10m");
		System.out.println("Board type:"+board8.type);
		System.out.println("Board size:"+board8.size);
		System.out.println("Board length:"+board8.length);

		Board board9=new Board("Acrylic","large","10m");
		System.out.println("Board type:"+board9.type);
		System.out.println("Board size:"+board9.size);
		System.out.println("Board length:"+board9.length);

		Board board10=new Board("plastic","medium","10m");
		System.out.println("Board type:"+board10.type);
		System.out.println("Board size:"+board10.size);
		System.out.println("Board length:"+board10.length);

		System.out.println("End main in BoardRunner");
	}
}