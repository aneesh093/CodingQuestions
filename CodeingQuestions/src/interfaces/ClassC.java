package interfaces;
/**
 * 
 * @author Aneesh.Mathai
 */
public class ClassC implements InterfaceA,InterfaceB {

	public static void main(String[] args) {
	}

	@Override
	public void show() {
		InterfaceA.super.show();
	}

	

	
}
