package chapter12_generic;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrint = new GenericPrinter<>();
		powderPrint.setMetarial(new Powder());
		powderPrint.printing();
		
		GenericPrinter<Plastic> plasticPrint = new GenericPrinter<>();
		plasticPrint.setMetarial(new Plastic());
		plasticPrint.printing();
		
		//GenericPrinter<Water> waterPrint = new GenericPrinter<>();
		
	}

}
