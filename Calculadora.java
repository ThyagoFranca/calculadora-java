    import java.util.Scanner;

    public class Calculadora {  
        public static void main(String[] args) {
            
        	double num1, num2, resultado = 0;
            int op; 
            Scanner scnnumeros = new Scanner(System.in);  
      
            boolean continua = false;
            
            do {
                System.out.println("Digite um número: ");
                num1 = scnnumeros.nextDouble();
                System.out.println("Escolha uma operação: (+, -, *, /)");  
                op = scnnumeros.next().charAt(0); 
                System.out.println("Digite o segundo número: ");  
                num2 = scnnumeros.nextDouble();
      
                switch (op) {
                    case '+': 
                        resultado = num1 + num2;  
                        break;  
                    case '-':  
                        resultado = num1 - num2;  
                        break;  
                    case '*':
                        resultado = num1 * num2;  
                        break;  
                    case '/':  
                        resultado = num1 / num2;  
                        break;  
                }  
            	System.out.println();  
            	System.out.println("O resultado da operação é: " + resultado);  
                	
        		System.out.printf("\n \nDeseja realizar outra operação? Digite S para continuar e 0 para Sair.)");
                		
    		    op = scnnumeros.next().charAt(0); 
            		
        		switch (op) {
        		case 's':
    				continua = false; 
    			    break;
            	case '0':
    				continua = true;
    				System.out.printf("Obrigado!");
    				break;	
                }
            		       	        
            } while(continua == false);
        }
	}  