import java.lang.Math;
public class LineComparision {
    public static void main(String[] args) {
	    System.out.println("Welcom to LINE COMPARISION computation program");
		double x1=5, x2=6, y1=4, y2=5;
		double x3=6, x4=7, y3=5, y4=7;
		double len_of_line1, len_of_line2;
		len_of_line1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		len_of_line2 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
		System.out.println("Length of line 1 : " +len_of_line1);
		System.out.println("Length of line 2 : " +len_of_line2);
                boolean EQUAL = (len_of_line1 == len_of_line2);
		System.out.println("is it equal : "+EQUAL);
		int line = Double.compare(len_of_line1,len_of_line2);
		if (line == 1){
		    System.out.println("line1 is greater than line2");
		}
		else
		    System.out.println("line2 is greater than line1");
	}
}  	
