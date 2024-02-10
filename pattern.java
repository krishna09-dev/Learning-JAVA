public class pattern {
    public static void main(String[] args) {
        int number = 10;
	    int num = 0;
	    int check = 1;
	    for(int i =1; i<=5; i++){
	    	for(int j = 1; j<=3; j++){
	    		num = (number * 100 + number) * 100 + number;
	    	}
	    	System.out.println(num);
	    	if(check == 1){
	    		number = 20;
	    		check = 2;
	    	}
	    	else{
	    		number = 10;
	    		check = 1;
	    	}
	    }
        }
}
