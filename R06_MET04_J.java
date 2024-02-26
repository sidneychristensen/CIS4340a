//Rule 06: User example
//MET04-J

class Super{
	protected void doLogic(){
		System.out.println("Super invoked");
	}
}

public class Sub extends Super {
	public void doLogic() {
		System.out.println("Sub invoked");
		//Do sensitive operations
	}
}