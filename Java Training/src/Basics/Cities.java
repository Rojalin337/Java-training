package Basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] cities = {"Jaypur","Hyderabad","Delhi","Banglore","Bhubaneswar"};
		int i=0;
		int n=0;
        boolean citiFound=false;
        
        do {
        	//int i=0;
        	System.out.println(cities[i]);
        	i++;
        	
        }while(i<5);
        
        while(!citiFound) {
            String state = cities[n];
            if(state == "Jaypur") {
            	System.out.println("citi got");
            	citiFound=true;
            }
            n++;
        }
        
        
	}

}
