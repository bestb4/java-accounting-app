
public class AccountingApp {
public static void main(String[] args) {
	
	int ValueOfSupply = 10000;
	double vatRate = 0.1;
	double expenseRate= 0.3;
	System.out.println("Value of supply:"+ValueOfSupply);

	System.out.println("VAT:"+ValueOfSupply*vatRate);
	System.out.println("Total:"+(ValueOfSupply+ValueOfSupply*vatRate));
	System.out.println("Expense:"+ValueOfSupply*expenseRate);
	System.out.println("Income:"+(ValueOfSupply-ValueOfSupply*expenseRate));
	System.out.println("Dividend1:"+(ValueOfSupply-ValueOfSupply*0.3)*0.5);
	System.out.println("Dividend2:"+(ValueOfSupply-ValueOfSupply*0.3)*0.3);
	System.out.println("Dividend3:"+(ValueOfSupply-ValueOfSupply*0.3)*0.2);
	
	
}
}
