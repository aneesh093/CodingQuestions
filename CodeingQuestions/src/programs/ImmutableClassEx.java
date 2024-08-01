package programs;

public class ImmutableClassEx{

	public static void main(String[] args) {
		Immutable im=new Immutable("Immutable Class");
		System.out.println(im.getName());
	}
}

final class Immutable{
	
	private final String name;
	
	public Immutable(String nm) {
		name=nm;
	}
	
	public String getName() {
		return name;
	}
}
