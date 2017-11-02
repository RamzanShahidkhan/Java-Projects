package javatpointwork;

public class ContinueExample2 {  
public static void main(String[] args) {  
	for(int i=1;i<=10;i++){  
        if(i==5){  
            //continue; 
        	break;
        }  
        System.out.println(i);  
    }  
  

            for(int i=1;i<=3;i++){    
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //continue;  
                            break;
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }    
}  
}  