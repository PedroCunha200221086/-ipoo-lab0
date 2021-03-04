
/**
 * This class calls the methods of the class 'Size' and gives an output based on Enum type.
 * 
 * @author PedroCunha 
 * @version v1.0
 */
public class AppStart
{
    public static void main(String[] args) {
        
    Size medium = Size.MEDIUM;
    
    System.out.println("Tipo de copo = "+medium.toString());
    
    System.out.println("Ordem = "+medium.ordinal());
    
    System.out.println("Descrição = "+medium.getDescription());
    
    System.out.println("Valor Mínimo = "+medium.getMinValue());
    
    System.out.println("Valor Máximo = "+medium.getMaxValue());
    
    System.out.println("Código = "+medium.getCode());
    
  }
    
}
