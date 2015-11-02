package main;

public class main {

	public static void main (String[] input){
		Integer x = new Integer(0);
        Integer y = new Integer(0);
        String moveUp = "^";
        String moveDown = "v";
        String moveLeft = "<";
        String moveRight = ">";
        String reverseIncrement = "~";
        boolean reverse = false;
        
        for (int i=0; i<= input.length;i++){
        if (reverse = false){
        	if ( input[i].equals(moveUp)){
        		y = y++;        		
        	}else if ( input[i].equals(moveDown)){
        		y = y--;
        	}else if ( input[i].equals(moveLeft)){
        		x = x--;
        	}else if ( input[i].equals(moveRight)){
        		x = x++;
        	}else if ( input[i].equals(reverseIncrement)){
        		reverse = true; 
        	}else 
        		System.out.println("Input String is not valid");
        }
        else{
        	if ( input[i].equals(moveUp)){
        		y = y--;
        	}else if ( input[i].equals(moveDown)){
        		y = y++;
        	}else if ( input[i].equals(moveLeft)){
        		x = x++;
        	}else if ( input[i].equals(moveRight)){
        		x = x--;
        	}else if ( input[i].equals(reverseIncrement)){
        		reverse = false; 
        	}else 
        		System.out.println("Input String is not valid");
        }
        }
        System.out.println( "(" + x + "," + ")" ) ;
	}
}
