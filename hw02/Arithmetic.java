/////////////////////////////////////////////////////////////////////////////
// hw02-Arithmetic
// Arithmetic Java Program
//
//You go shopping at Walmart’s and want to compute the cost of the items you bought, including the PA sales tax of 6%.
//
//Arik Baer
// here we define a class
public class Arithmetic{
    
    //next, we add the main method
    public static void main(String[] args) {
        
        //Now we define our variables, starting with the number of pair of socks
        int nSocks=3;
         //Followed by the price per pair
        double sockCost$=2.58;
        
        //Now the number of drinking glasses
        int nGlasses=6;
        //Followed by the price per drinking glass
        double glassCost$=2.29;
        
        //Now we define the number of boxes of envelopes
        int nEnvelopes=1;
        //Followed by the cost of a box of envelopes
        double envelopeCost$=3.25;
        //Now we define the PA tax
        double taxPercent=0.06;
        
        // Now we set up the mathematical aspect
        double preTaxSockCost$=nSocks*sockCost$; //the cost of the socks pre-tax
        double sockSaleTax$=taxPercent*preTaxSockCost$; // Sales Tax for socks
        double totalSockCost$=(preTaxSockCost$+sockSaleTax$); //the total cost of the socks
        
        double preTaxGlassCost$=nGlasses*glassCost$; //the total cost of the glasses pre-tax
        double glassSaleTax$=taxPercent*preTaxGlassCost$; // Sales Tax for glass
        double totalGlassCost$=(preTaxGlassCost$+glassSaleTax$); //the total cost of the glasses
        
        double preTaxEnvelopeCost$=nEnvelopes*envelopeCost$; //the total cost of the envelope boxes pre-tax
        double envelopeSaleTax$=taxPercent*preTaxEnvelopeCost$; // Sales Tax for envelope boxes
        double totalEnvelopeCost$=(preTaxEnvelopeCost$+envelopeSaleTax$); //the total cost of the envelope box 

        double totalPreTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; // the total pre-tax cost
        double taxValue$=taxPercent*totalPreTax$; //the value of the tax
        double finalPrice$=(taxValue$+totalPreTax$); //the total value post tax
       
        // Now we use printf statements to get two decimal places. 
        //For the socks
        System.out.printf("The pre-tax total for the sock purchase is $ %.2f",preTaxSockCost$);
        System.out.printf("\nThe tax of the purchase results to $ %.2f",sockSaleTax$);
        System.out.printf("\nThe post-tax total of the purchase for socks is $ %.2f",totalSockCost$);
        
        //For the glass
        System.out.printf("\n\nThe pre-tax total for the glass purchase is $ %.2f",preTaxGlassCost$);
        System.out.printf("\nThe tax of the purchase results to $ %.2f",glassSaleTax$);
        System.out.printf("\nThe post-tax total of the purchase for glasses is $ %.2f",totalGlassCost$);
        
        //For the envelope boxes
        System.out.printf("\n\nThe pre-tax total for the boxes of envelopes purchase is $ %.2f",preTaxEnvelopeCost$);
        System.out.printf("\nThe tax of the purchase results to $ %.2f",envelopeSaleTax$);
        System.out.printf("\nThe post-tax total of the purchase for boxes of envelopes is $ %.2f",totalEnvelopeCost$);
        
        //For the total
        System.out.printf("\n\nThe pre-tax total for the total purchase is $ %.2f",totalPreTax$);
        System.out.printf("\nThe tax of the purchase results to $ %.2f",taxValue$);
        System.out.printf("\nThe post-tax total of the purchase for total is $ %.2f",finalPrice$);
    
    }
}