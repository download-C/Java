package chapter12_generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMetarial(new Powder());
		Powder powder = powderPrinter.getMetarial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		
		plasticPrinter.setMetarial(new Plastic());
		Plastic plastic = plasticPrinter.getMetarial();
		System.out.println(plasticPrinter.toString());
		
//		GenericPrinter powderprinter2 = new GenericPrinter<>();
//		powderprinter2.setMetarial(new Powder());
//		Powder powder2 = (Powder)powderprinter2.getMetarial();
//		System.out.println(powderprinter2.toString());
		
		
	}

}
