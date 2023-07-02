import java.util.*;

class BurgerShop {
	
	static String [] arrNum= new String [0];
	static String [] arrName= new String [0];
	static String [] arrOrderId= new String [0];
	static String [] arrOrderName= new String [0];
	static double [] arrOrderAmount= new double [0];
	static String [] OrderId = new String [0];
	static double [] OrderValue = new double [0];
	static String [] orderStatus = new String [0];
	static int [] quantity= new int [0];
	static int count = 0;
	static int count1 = 0;
	static int count2 =0;
	static int orderId = 1000;
	public static final int CANCEL=0;
    public static final int PREPARING=1;
    public static final int DELIVERED=2;
    static String ID = "";
	
	
//----------Home Page-------------------------------
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
			case 3 : searchBestCustomer();break;
			case 4 : searchOrder();break;
			case 5 : searchCustomer();break;
			case 6 : viewCustomer();break;
			case 7 : updateOrderDetails();break;
			case 8 : Exit();break;
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
	if( (phoneNum.charAt(0)=='0') && ( phoneNum.length() == 10) ){	
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
		
		
			  count++;
			System.out.print ("Enter Customer Name   : ");
			 String custName = input.next();
			String [] arrTempName = new String [arrName.length+1];
			for(int i=0; i<arrName.length;i++){
			arrTempName [i]=arrName[i];
			}
		
			arrTempName[count1] = custName;
			arrName=arrTempName;
			count1++;
			
		 System.out.println ("\t\tCustomer has added successfully..   ");
			 
			  System.out.println ("");
			 System.out.print ("Do you want to add another customer (Y/N) : ");
			  String result = input.next();
			  char option = result.charAt(0);
			  if(option=='Y'||option=='y') {
				      AddNewCustomer();
				   }else if (option=='N'||option=='n'){
					   System.out.println("\n\n\n\n");
					   clearConsole();
					  homePage();
					   }else {}
			  
			}else {
				 System.out.print ("\t\tCustomer ID is not correct format...");
				   System.out.println ("");
				  System.out.print ("Do you Enter the correct customer ID again? (Y/N) : ");
				    String result = input.next();
			  char option = result.charAt(0);
			  if(option=='Y'||option=='y') {
				  //count++;
				      AddNewCustomer();
				   }else if (option=='N'||option=='n') {
					 homePage();
					   }else{}
				}
				
			}
		
//---------------------------Place Order------------------------------------

	public static void placeOrder(){
		String name="";
		String status="";
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\t Place Order");
		System.out.println("\t\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
  orderId+=1;
 
  System.out.print ("ORDER ID - B");
  System.out.println (orderId);
  System.out.println ("================");
  
  String oID = ("B"+orderId) ;
  
 
  
 String tempOrderId[] = new String [OrderId.length+1];
  for(int i=0;i<OrderId.length;i++){
	  tempOrderId[i]= OrderId[i];
	  }
	  tempOrderId[tempOrderId.length-1]= oID;
	  OrderId =tempOrderId;
	  
  
        System.out.println ("");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Customer ID (phone no.) : ");
		String phoneNum = input.nextLine();
		
		if( (phoneNum.charAt(0)=='0') && ( phoneNum.length() == 10) ){
			int count5 =0;
			 for(int i =0;i<arrNum.length;i++){
				 if (arrNum[i].equals(phoneNum)){
					 
					 name = arrName[i];
					 System.out.println("Customer Name : "+arrName[i]);
					 count5 ++;
					 }
				 }
				 if(count5 ==0){
						System.out.println ("Customer not added to the System");
				}
			
		}else {
			System.out.print ("\t\tCustomer ID is not correct format...");
				   System.out.println ("");
				  System.out.print ("Do you Enter the correct customer ID again? (Y/N) : ");
				    String result = input.next();
			  char option = result.charAt(0);
			  if(option=='Y'||option=='y') {
				  count++;
				  clearConsole();
				      placeOrder();
				   }else if (option=='N'||option=='n') {
					   clearConsole();
					 homePage();
					   }else{}
				}
			
		System.out.print("Enter Burger Quantity : ");
		int Quantity = input.nextInt();
		 while(Quantity<=0){
			System.out.println("Invalid Quantity");
			
			System.out.print("Enter Burger Quantity : ");
		    Quantity = input.nextInt();
		}
		int tempQuantity [] = new int [quantity.length+1];
		for(int i=0;i<quantity.length;i++){
	    tempQuantity[i]= quantity[i];
		}
	  tempQuantity[tempQuantity.length-1]= Quantity;
	  quantity =tempQuantity;
	  
		
		
		double total = (Quantity*500);
		
		double tempValue [] = new double [OrderValue.length+1];
		for(int i=0;i<OrderValue.length;i++){
	    tempValue[i]= OrderValue[i];
			}
			 tempValue[tempValue.length-1]= total;
			 OrderValue =tempValue;
		
		
		
		System.out.println("Total Value - "+total);
		System.out.print("Are You Confirm Order ? (Y/N) : ");
		String option = input.next();
		char opt = option.charAt(0);
		if (opt=='Y'||opt=='y'){
			
			status = "PREPARING";
			String tempStatus [] = new String [orderStatus.length+1];
		for(int i=0;i<orderStatus.length;i++){
	    tempStatus[i]= orderStatus[i];
			}
			
			
			String[] arrTempId = new String [arrOrderId.length+1];
			for (int i=0;i<arrOrderId.length;i++){
				arrTempId[i]=arrOrderId[i];
				}
				arrTempId[arrTempId.length-1]= phoneNum;
				arrOrderId=arrTempId;
				
				String[] arrTempName = new String [arrOrderName.length+1];
				for (int i=0;i<arrOrderName.length;i++){
				arrTempName[i]=arrOrderName[i];
				}
				arrTempName[arrTempName.length-1]= name;
				arrOrderName=arrTempName;
				
				double[] arrTempAmount = new double [arrOrderAmount.length+1];
				for (int i=0;i<arrOrderAmount.length;i++){
				arrTempAmount[i]=arrOrderAmount[i];
				}
				arrTempAmount[arrTempAmount.length-1]= total;
				arrOrderAmount=arrTempAmount;
				
				System.out.print("update the current status of the order(CANCEL/PREPARING/DELIVERED) : " );
				status = input.next();
				System.out.print("");
				
				
			 tempStatus[tempStatus.length-1]= status;
			 orderStatus =tempStatus;
		    }
		    System.out.print("Do you want to place anothe order? (Y/N) : ");
		    String option2 = input.next();
		    char opt2 = option2.charAt(0);
		       if (opt2=='Y'||opt2=='y'){
				   placeOrder();
				   }else{
					   clearConsole();
					   homePage();
					   
					   }
				
				
		
	}
	
//----------------------------Search Best Cuctomer----------------------------------

	public static void searchBestCustomer(){
		
			System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\tSearch Best Customer");
		System.out.println("\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		for(int j =0; j<arrOrderAmount.length-1;j++){
		for (int i=arrOrderAmount.length-1;i>0;i--){
			if (arrOrderAmount[i]>arrOrderAmount[i-1]){
				double temp = arrOrderAmount[i];
				arrOrderAmount[i] = arrOrderAmount[i-1];
				arrOrderAmount[i-1] = temp;
				
				String temp1 = arrOrderName[i];
				arrOrderName[i] = arrOrderName[i-1];
				arrOrderName[i-1] = temp1;
				
				String temp2 = arrOrderId[i];
				arrOrderId[i] = arrOrderId[i-1];
				arrOrderId[i-1] = temp2;
				
				String temp3 = OrderId[i];
				OrderId[i] = OrderId[i-1];
				OrderId[i-1] = temp3;
				
				int temp4 = quantity[i];
				quantity[i] = quantity[i-1];
				quantity[i-1] = temp4;
				
				double temp5 = OrderValue[i];
				OrderValue[i] = OrderValue[i-1];
				OrderValue[i-1] = temp5;
				
				String temp6 = orderStatus[i];
				orderStatus[i] = orderStatus[i-1];
				orderStatus[i-1] = temp6;
				}
			}
		}
		
	System.out.print("Customer ID \t Name \t\t Total");
	System.out.println("");
	for (int i =0;i<arrOrderAmount.length;i++){
		System.out.println ("----------------------------------------------------------");
		System.out.println (arrOrderId[i]+" \t "+arrOrderName[i]+" \t\t "+arrOrderAmount[i]);
		System.out.println ("----------------------------------------------------------");
		
		}	
		System.out.print("Do you want to go back to main menu?  (Y/N) : ");
		System.out.println("");
		Scanner input = new Scanner(System.in);
		  String option3 = input.next();
		    char opt3 = option3.charAt(0);
		       if (opt3=='Y'||opt3=='y'){
				   clearConsole();
				   homePage();
				   }else{
					   
					   }
		
		
	}
//--------------------------Search Order----------------------------------------------

public static void searchOrder(){

	System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\t Search Order");
		System.out.println("\t\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Order Id : ");
		String ODERID = input.nextLine();
		String [] arrcolums = {"Order ID", "Customer ID","Name","Quantity","Order Value","Order Status"};
		for (int i=0;i<OrderId.length;i++){
			if ( OrderId[i].equals(ODERID) ) {
				System.out.println("------------------------------------------------------------------------------------------");
				String fss = String.format ("%-12s%-15s%-10s%8s%15s%16s",arrcolums[0],arrcolums[1],arrcolums[2],arrcolums[3],arrcolums[4],arrcolums[5]);
				System.out.print(fss);
				System.out.println("\t\t|");
				System.out.println("------------------------------------------------------------------------------------------");
				String fs = String.format ("%-12s%-15s%-10s%8d%15.2f%16s", OrderId[i],arrOrderId[i],arrOrderName[i],quantity[i],OrderValue[i],orderStatus[i]);
				System.out.print(fs);
				System.out.println("\t\t|");
				System.out.println("------------------------------------------------------------------------------------------");;
				
				
				
				System.out.println("Do you want to serch another order details ?(Y/N) : ");
				String option2 = input.next();
				char opt2 = option2.charAt(0);
					if (opt2=='Y'||opt2=='y'){
					searchOrder();
					 }else{
						 clearConsole();
						homePage();
					   }
				
				
				
				}
			}
					
					System.out.println("Invalid order ID. Do you want enter again ?(Y/N) : ");
				    String option2 = input.next();
					char opt2 = option2.charAt(0);
					if (opt2=='Y'||opt2=='y'){
					 searchOrder();
					  }else{
						  clearConsole();
						homePage();
					   }
					
	}
	
//-----------------------------Search Customer-----------------------------------------
	public static void searchCustomer(){
	
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\tSearch Customer Details");
		System.out.println("\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter customer Id : ");
		String cusID = input.nextLine();
		System.out.print("\n");
		
		 for(int i =0;i<arrNum.length;i++){
		 if (arrNum[i].equals(cusID)){
				System.out.println ("CustomerID - "+cusID);
				System.out.println ("Name       - "+arrName[i]);
				System.out.println("\n");
				System.out.println("Customer order details");
				System.out.println("=======================");
				System.out.println("\n");
				
						 System.out.println("-------------------------------------------------------------------");
						 System.out.println("Order_ID\t\tOrder_Quntity\t\tTotal_Value");
						 System.out.println("-------------------------------------------------------------------");
				
				 for(int j =0;j<arrOrderId.length;j++){
					 if(arrOrderId[j].equals(cusID)){
						
						 System.out.println(OrderId[j]+"\t\t\t"+quantity[j]+"\t\t\t"+OrderValue[j]);
						 
						 }
					}
					System.out.println("-------------------------------------------------------------------");
				System.out.println ("Do you want to search another customer details?(Y/N) : ");
					String option4 = input.next();
					char opt4 = option4.charAt(0);
					if (opt4=='Y'||opt4=='y'){
					searchCustomer();
					  }else{
						  clearConsole();
						homePage();
					   }
			}else{System.out.println ("\tThis customer ID is not added yet...");}
		}
				
					
					System.out.println ("Do you want to search another customer details?(Y/N) : ");
					String option4 = input.next();
					char opt4 = option4.charAt(0);
					if (opt4=='Y'||opt4=='y'){
					searchCustomer();
					  }else{
						  clearConsole();
						homePage();
					   }
					}
//---------------------------View Orders---------------------------------------
	public static void viewCustomer(){
		
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\tView Order List");
		System.out.println("\t\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		System.out.println("[1] Delivered Order");
		System.out.println("[2] Preparing Order");
		System.out.println("[3] Cancel Oreder");
		System.out.print("\n");
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Enter an option to continue > ");
		int option = input.nextInt();
		
		switch(option){
			
			case 1 : deliveredOrder();break;
			case 2 : preparingOrder();break;
			case 3 : cancelOrder();break;
			default : System.out.println ("Invalid Input..");
	}

}

//-------------------------Delivered Order-------------------------
	public static void deliveredOrder(){
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\tDELIVERED ORDER");
		System.out.println("\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		String s1 = "DELIVERED";
		String [] arrcolums = {"Order ID", "Customer ID","Name","Quantity","Order Value",};
		for(int i=0;i<orderStatus.length;i++){
			if(s1.equalsIgnoreCase(orderStatus[i])){
				
				System.out.println("-------------------------------------------------------------------------------------");
				String fss = String.format ("%-12s%-15s%-10s%8s%15s",arrcolums[0],arrcolums[1],arrcolums[2],arrcolums[3],arrcolums[4]);
				System.out.print(fss);
				System.out.println("\t\t");
				System.out.println("-------------------------------------------------------------------------------------");
				String fs = String.format ("%-12s%-15s%-10s%8d%15.2f", OrderId[i],arrOrderId[i],arrOrderName[i],quantity[i],OrderValue[i]);
				System.out.print(fs);
				System.out.println("\t\t");
				System.out.println("-------------------------------------------------------------------------------------");;
				
				
				
				}
			
			}
		
		
		
		}
//---------------------Preparing Order-------------------------------
 public static void preparingOrder(){
	 
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\tPREPARING OREDR");
		System.out.println("\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
	 
		String s1 = "PREPARING";
		String [] arrcolums = {"Order ID", "Customer ID","Name","Quantity","Order Value",};
		for(int i=0;i<orderStatus.length;i++){
			if(s1.equalsIgnoreCase(orderStatus[i])){
				
				System.out.println("-------------------------------------------------------------------------------------");
				String fss = String.format ("%-12s%-15s%-10s%8s%15s",arrcolums[0],arrcolums[1],arrcolums[2],arrcolums[3],arrcolums[4]);
				System.out.print(fss);
				System.out.println("\t\t");
				System.out.println("-------------------------------------------------------------------------------------");
				String fs = String.format ("%-12s%-15s%-10s%8d%15.2f", OrderId[i],arrOrderId[i],arrOrderName[i],quantity[i],OrderValue[i]);
				System.out.print(fs);
				System.out.println("\t\t");
				System.out.println("-------------------------------------------------------------------------------------");;
				
				
				
				}
			
			}
	 
	 
	 }

//-------------------------Cancel Order-------------------------
	public static void cancelOrder(){
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\tCANCEL OREDR");
		System.out.println("\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		String s1 = "CANCEL";
		String [] arrcolums = {"Order ID", "Customer ID","Name","Quantity","Order Value",};
		for(int i=0;i<orderStatus.length;i++){
			if(s1.equalsIgnoreCase(orderStatus[i])){
				
				System.out.println("-------------------------------------------------------------------------------------");
				String fss = String.format ("%-12s%-15s%-10s%8s%15s",arrcolums[0],arrcolums[1],arrcolums[2],arrcolums[3],arrcolums[4]);
				System.out.print(fss);
				System.out.println("\t\t");
				System.out.println("-------------------------------------------------------------------------------------");
				String fs = String.format ("%-12s%-15s%-10s%8d%15.2f", OrderId[i],arrOrderId[i],arrOrderName[i],quantity[i],OrderValue[i]);
				System.out.print(fs);
				System.out.println("\t\t");
				System.out.println("-------------------------------------------------------------------------------------");;
				
				}
			
			}
	 
		}
//-------------------------Update Order Details------------------------------

	public static void updateOrderDetails(){
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.print("|");
		System.out.print ("\t\t\t\t\tUPDATE ORDER DETAILS");
		System.out.println("\t\t\t\t |");
		System.out.println ("------------------------------------------------------------------------------------------");
		System.out.println("\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Enter ORDER id > ");
		 ID = input.next();
		for(int i=0; i<OrderId.length; i++){
			if(ID.equals(OrderId[i])){
				if((orderStatus[i].equals("PREPARING"))|| (orderStatus[i].equals("preparing"))){
					System.out.println("Order ID - "+OrderId[i]);
					System.out.println("Customer ID - "+arrOrderId[i]);
					System.out.println("Name - "+arrName[i]);
					System.out.println("Quantity - "+quantity[i]);
					System.out.println("Order Value - "+OrderValue[i]);
					System.out.println("Order Status - "+orderStatus[i]);
					
					System.out.print("What do you want to update? : ");
					System.out.println("");
					System.out.println("(01) Quantity");
					System.out.println("(02) Status");
					System.out.println("\n");
					System.out.print("Enter your option : ");
					int option = input.nextInt();
					System.out.println("");
					
					if(option == 1){
						
						quntityUpdate();
						
						}else if(option == 2){
							
							statusUpdate();
							
							}
					
								
				
					
					
					}else if( (orderStatus[i].equals("CANCEL"))|| (orderStatus[i].equals("cancel"))){
								System.out.println("This order is already cancelled... You cannot update this order...");
								System.out.println("\n");
								System.out.println("Do you want to update another order detail (Y/N) : ");
								
									String option4 = input.next();
									char opt4 = option4.charAt(0);
									if (opt4=='Y'||opt4=='y'){
									updateOrderDetails();
									}else{
										clearConsole();
									homePage();
								}
							}else if( (orderStatus[i].equals("DELIVERED"))|| (orderStatus[i].equals("delivered"))){
								System.out.println("This order is already delivered... You cannot update this order...");
								System.out.println("\n");
								System.out.println("Do you want to update another order detail (Y/N) : ");
								
									String option4 = input.next();
									char opt4 = option4.charAt(0);
									if (opt4=='Y'||opt4=='y'){
									updateOrderDetails();
									}else{
										clearConsole();
									homePage();
								}
				}
			
			
			}
		
		
		}
   
}
//---------------------Quantity Update-----------------------------
		public static void quntityUpdate(){
	System.out.println("Quntity Update");
	System.out.println("================");
	System.out.println("\n");
			
			for(int i=0; i<OrderId.length; i++){
			if(ID.equals(OrderId[i])){
				if((orderStatus[i].equals("PREPARING"))|| (orderStatus[i].equals("preparing"))){
					System.out.println("Order ID - "+OrderId[i]);
					System.out.println("Customer ID - "+arrOrderId[i]);
					System.out.println("Name - "+arrName[i]);
				}
			}
			Scanner input = new Scanner(System.in);
			System.out.print("Enter your quantity update value : ");
			int newValue = input.nextInt();
			System.out.println("");
			quantity[i] = newValue;
			OrderValue[i]= (500*newValue);
			
			
		System.out.println("\tUpdate order quantity succeessfully...");
		System.out.println("New order quantity :"+newValue);
		System.out.println("New order value :"+(500*newValue));
		}
		System.out.println("Do you want to update another order detail (Y/N))");
		Scanner input = new Scanner(System.in);
		String option6 = input.next();
									char opt6 = option6.charAt(0);
									if (opt6=='Y'||opt6=='y'){
									updateOrderDetails();
									}else{
										clearConsole();
									homePage();
								}
	}
//-----------------------Status Update---------------------------------

public static void statusUpdate(){
	System.out.println("Status Update");
	System.out.println("================");
	System.out.println("\n");
	
	
		for(int i=0; i<OrderId.length; i++){
			if(ID.equals(OrderId[i])){
				if((orderStatus[i].equals("PREPARING"))|| (orderStatus[i].equals("preparing"))){
					System.out.println("Order ID - "+OrderId[i]);
					System.out.println("Customer ID - "+arrOrderId[i]);
					System.out.println("Name - "+arrName[i]);
				}
			}
			Scanner input = new Scanner(System.in);
			System.out.print("Enter new order status (CANCEL/PREPARING/DELIVERED) : ");
			System.out.println("");
			String newStatus = input.next();
			orderStatus[i] = newStatus;
			
			
		System.out.println("\tUpdate order status succeessfully...");
		System.out.println("New order status :"+newStatus);
		
		}
			System.out.println("Do you want to update another order detail (Y/N))");
			Scanner input = new Scanner(System.in);
			String option6 = input.next();
									char opt6 = option6.charAt(0);
									if (opt6=='Y'||opt6=='y'){
									updateOrderDetails();
									}else{
										clearConsole();
									homePage();
								}
		
	
	}
//-------------------------------Exit------------------------------------
	public static void Exit(){
		
		 
 clearConsole();
 System.out.println("\n\t\tYou left the program...\n");
 System.exit(0);
 
		
		}
//-------------------------Clear Consol------------------------
public final static void clearConsole() { 
 try {
 final String os = System.getProperty("os.name"); 
 if (os.contains("Windows")) {
 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
 } else {
 System.out.print("\033[H\033[2J"); 
 System.out.flush();
 }
 } catch (final Exception e) {
 e.printStackTrace();
 // Handle any exceptions.
 }
 }
 //-----------------------------------------------------
	public static void main (String args[]){
		
		homePage ();
		
		}
	
	}
