import java.util.ArrayList;
import java.util.Iterator;
public class IteratorJava{
    public static void main(String[] args) {
        
        ArrayList<String> carros = new ArrayList<String>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("Mustang");
        carros.add("Cruze");
        carros.add("Ka");
        carros.add("Argo");

        System.out.println(carros);

        Iterator<String> it = carros.iterator();
        while(it.hasNext()){
            String c=it.next(); //transforma em String 
          //if(it == "Argo"){ //dessa forma apresenta erro de tipos incompatíveis iterator<String> e String  
            if(c == "Argo"){
                it.remove();
            }
        }
        System.out.println(carros);


    }
}