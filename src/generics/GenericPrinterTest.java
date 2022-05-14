package generics;

/*
 * GenericPrinter<Powder>:제네릭 자료형 (Generic type), 매개변수화된 자료형(parameterized type)
 * Powder:대입된 자료형
 */

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //Powder형으로 GenericPrinter 클래스 생성
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>(); //Plastic형으로 GenericPrinter 클래스 생성
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}

}
