import java.util.ArrayList;
import java.util.List;

public class studentgroup {
    public String nazwa;
    public List <String> sklad = new ArrayList<String>();

    public void addtogroup (String index){
        if(sklad.size()>15){
            throw new RuntimeException("W grupie nie może być więcej niż 15 studentów.");
        }
        if(sklad.contains(index)){
            throw new RuntimeException("Ten student należy już do grupy: " + nazwa + ".");
        }
        sklad.add(index);
    }
}
