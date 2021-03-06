package TuitionQuestion;

import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class TotalTuitionBill {
	/**This class takes the private variables: double initialTuitionCost, 
	 *double percentatgeIncreaseForTuition, double repaymentAPR, and double repaymentTerm, 
	 *and returns a value for the total amount of money that you will have to pay for your uninterrupted
	 *four years of college
	 *
	 *@author olivias94
	 */

	//declare private variables
	private double initialTuitionCost;
	private double totalTuitionCost;
	private double percentatgeIncreaseForTuition;
	private double repaymentAPR;
	private double repaymentTerm;

	//constructors
	public TotalTuitionBill(){
	}
	public TotalTuitionBill(double newITC, double newPIFT, double newRAPR, double newRT){
		this.initialTuitionCost = newITC;
		this.percentatgeIncreaseForTuition = newPIFT;
		this.repaymentAPR = newRAPR;
		this.repaymentTerm = newRT;
	}
	
	//getters and setters
	public double getInitialTuitionCost(){
		return initialTuitionCost;
	}
	public double getPercentageIncreaseForTuition(){
		return percentatgeIncreaseForTuition;
	}
	public double getRepaymentAPR(){
		return repaymentAPR;
	}
	public double getRepaymentTerm(){
		return repaymentTerm;
	}
	public void setInitialTuitionCost(){
		Scanner inputITC = new Scanner(System.in);
		System.out.println("Please enter your initial tuition cost: ");
		this.initialTuitionCost = inputITC.nextDouble();
	}
	public void setPercentageIncreaseForTuition(){
		Scanner inputPIFT = new Scanner(System.in);
		System.out.println("Please enter your percentage increase for tuition: ");
		this.percentatgeIncreaseForTuition = inputPIFT.nextDouble();
	}
	public void setRepaymentAPR(){
		Scanner inputRAPR = new Scanner(System.in);
		System.out.println("Please enter your repayment APR: ");
		this.repaymentAPR = inputRAPR.nextDouble();
	}
	public void setRepaymentTerm(){
		Scanner inputRT = new Scanner(System.in);
		System.out.println("Please enter your repayment term: ");
		this.repaymentTerm = inputRT.nextDouble();
	}
	
	
	public double returnTotalTuitionCost(){
		/**This method calculates the total tuition for the 4 years you spend at college.
		 *This only takes into account the tuition and tuition increase percentage, it does not
		 *include anything about loan repayment. Loan repayment is calculated by the method PMT 
		 *from the imported Apache FincnaceLib library
		 *
		 *@param none
		 *@return totalTuitionCost
		 */
		for (int i = 1; i<5; i++){
			initialTuitionCost = (initialTuitionCost*(1 + percentatgeIncreaseForTuition));
			totalTuitionCost = initialTuitionCost;
			System.out.print(totalTuitionCost);
		}
		return totalTuitionCost;	
	}
	
		
	
	
	//now to code for amortization
	private double r = (repaymentAPR/12);
	private double n = (repaymentTerm*12);
	private double p = 0;
	private double f = returnTotalTuitionCost();
	private boolean t = false;
	
	public double PMT = FinanceLib.pmt(r, n, p, f, t); 
	//System.out.println("The total tuition that you have to pay is: $%.2d", PMT);
	
}
