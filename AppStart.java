import java.util.Scanner;

/**
 * This class calls the methods of the class 'Size' and gives an output based on Enum type.
 * 
 * @author PedroCunha 
 * @version v1.0
 */
public class AppStart
{
    static Scanner scanner = new Scanner(System.in);
    
    public static void  main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha o tipo de bebida: 1- Pequena | 2- Média | 3- Grande\n");
        
        while (sc.hasNext()) {
            
            int select = 0;
            
            if (sc.hasNextInt()) {
                    select = sc.nextInt();
                }
                
            switch (select) {

            case 1:
            
                Size small = Size.SMALL;
    
                System.out.println("Tipo de copo = " + small.toString());
    
                System.out.println("Ordem = " + small.ordinal());
    
                System.out.println("Descrição = " + small.getDescription());
    
                System.out.println("Valor Mínimo = " + small.getMinValue());
    
                System.out.println("Valor Máximo = " + small.getMaxValue());
    
                System.out.println("Código = " + small.getCode());
                
                break;
                
            case 2:

                Size medium = Size.MEDIUM;
    
                System.out.println("Tipo de copo = " + medium.toString());
    
                System.out.println("Ordem = " + medium.ordinal());
    
                System.out.println("Descrição = " + medium.getDescription());
    
                System.out.println("Valor Mínimo = " + medium.getMinValue());
    
                System.out.println("Valor Máximo = "  + medium.getMaxValue());
    
                System.out.println("Código = " + medium.getCode());
                
                break;
                
            case 3:
            
                Size large = Size.LARGE;
    
                System.out.println("Tipo de copo = " + large.toString());
    
                System.out.println("Ordem = " + large.ordinal());
    
                System.out.println("Descrição = " + large.getDescription());
    
                System.out.println("Valor Mínimo = " + large.getMinValue());
    
                System.out.println("Valor Máximo = " + large.getMaxValue());
    
                System.out.println("Código = " + large.getCode());
                
                break;

            default:
            
                System.out.println("Opção inválida! Escolha um tipo de bebida de 1 a 3\n");
                
                break;
            }

        }
    }
}
