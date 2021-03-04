
/**
 * Enumeration class Size - Simulate a hot drinks machine with 
 * three different sizes of cups.
 * 
 * @author PedroCunha
 * @version V1.0
 */
public enum Size
/**
 * Definition of enum types(there are three types of cups)
 */
{
 SMALL(32, 36, "Pequeno",'S'),
 MEDIUM(37, 44, "Médio",'M'),
 LARGE(45, 52, "Grande",'L');
 /**
  * Attributes of enum class 'Size'
  */
 private final String description;
 private final int minValue;
 private final int maxValue;
 private final char code;
/**
 * Constructor of enum class 'Size' 
 */
 private Size(int minValue, int maxValue, String description, char code){
 this.description=description;
 this.minValue=minValue;
 this.maxValue=maxValue;
 this.code=code;
 }
 /**
  * This method returns the enum's name
  */
 @Override
 public String toString() {
 return this.description;
 }
 /**
  * This method returns the enum's description
  */
 public String getDescription() {
 return description;
 }
 /**
  * This method returns the enum's minimum value
  */
 public int getMinValue() {
 return minValue;
 }
 /**
  * This method returns the enum's maximum value
  */
 public int getMaxValue() {
 return maxValue;
 }
 /**
  * This method returns the enum's code
  */
 public char getCode() {
 return code;
 }

}
