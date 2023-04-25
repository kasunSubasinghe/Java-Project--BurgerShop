import java.util.*;

class BurgerShop {
	
	static String [] arrNum= new String [0];
	static int count = 0;
	
	

	

//----------Home Page------------------	
	public static void homePage(){
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\t iHungry Burger");
		System.out.println("\t\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		System.out.print("[1] Add New Customer");
		System.out.println("\t\t\t[2] Place Order");
		System.out.print("[3] Search Best Customer");
		System.out.println("\t\t[4] Search Order");
		System.out.print("[5] Search Customer");
		System.out.println("\t\t\t[6]View Customer");
		System.out.print("[7] Update Order Details");
		System.out.println("\t\t[8] Exit");
		System.out.println("\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Enter an option to continue > ");
		int option = input.nextInt();
		
		switch(option){
			
			case 1 : addNewCustomer();break;
			case 2 : placeOrder();break;
			//case 3 : searchBestCustomer();break;
			//case 4 : searchOrder();break;
			//case 5 : searchCustomer();break;
			//case 6 : viewCustomer();break;
			//case 7 : updateOrderDetails();break;
			//case 8 : Exit();break;
			default : System.out.println ("Invalid Input..");
			}
		}
//---------------Add New Customer----------------------------------

	public static void addNewCustomer(){
		
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\t Add New Customer");
		System.out.println("\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		 AddNewCustomer();
		 
	 }
	
//-----------------------------------------------------------------//
	public static void AddNewCustomer(){
		
		 System.out.println ("");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Customer ID (phone no.) : ");
		String phoneNum = input.nextLine();
		
		String [] arrTemp = new String [arrNum.length+1] ;
		for(int i=0; i<arrNum.length;i++){
			arrTemp [i]=arrNum[i];
			}
		int countNum =0;
		arrTemp[count] = phoneNum;
		
		for (String num:arrTemp){
			if(num.equals(phoneNum)){
				countNum++;
				}
			
			}if (countNum>1){
				System.out.print ("\t\tThis customer ID already exists.. Enter the correct customer ID again...");
				
				AddNewCustomer();
				
				}
			arrNum = arrTemp;
		
		if( (phoneNum.charAt(0)=='0') && ( phoneNum.length() == 10) ) {
			  count++;
			System.out.print ("Enter Customer Name   : ");
			 String custName = input.next();
			
			 System.out.println ("\t\tCustomer has added successfully..   ");
			 
			  System.out.println ("");
			 System.out.print ("Do you want to add another customer (Y/N) : ");
			  String result = input.next();
			  char option = result.charAt(0);
			  if(option=='Y'||option=='y') {
				      AddNewCustomer();
				   }else if (option=='N'||option=='n'){
					   System.out.println("\n\n\n\n");
					  homePage();
					   }else {}
			 
			}else {
				 System.out.print ("\t\tCustomer ID is not correct format...");
				   System.out.println ("");
				  System.out.print ("Do you Enter the correct customer ID again? (Y/N) : ");
				    String result = input.next();
			  char option = result.charAt(0);
			  if(option=='Y'||option=='y') {
				  count++;
				      AddNewCustomer();
				   }else if (option=='N'||option=='n') {
					  System.out.println ("");
					   }else{}
				}
				
			}
		
//---------------------------Place Order------------------------------------

	public static void placeOrder(){
		
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\t Place Order");
		System.out.println("\t\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
}
	
	public static void main (String args[]){
		
		homePage ();
		
		}
	
	}
