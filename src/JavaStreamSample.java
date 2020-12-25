import com.sun.xml.internal.ws.api.databinding.MappingInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamSample {


    public static void main(String args[]){

        Supplier abc = new Supplier("ABC");
        Supplier xyz = new Supplier("XYZ");
        List<CollectionItem> objList = new ArrayList<>();
        objList.add(new CollectionItem(abc, "item1"));
        objList.add(new CollectionItem(abc, "item2"));
        objList.add(new CollectionItem(abc, "item3"));
        objList.add(new CollectionItem(xyz, "item4"));
        objList.add(new CollectionItem(xyz, "item5"));
        objList.add(new CollectionItem(abc, "item6"));


        Map<Supplier, List<CollectionItem>> postsPerType = objList.stream().collect(Collectors.groupingBy(CollectionItem::getSupplier));
        System.out.println(postsPerType);
    }


}

class Supplier{
    String supplierName;
    Supplier(String supplierName){
       this.supplierName = supplierName;
    }

}

class CollectionItem {
    Supplier supplier;
    String itemName;
    CollectionItem(Supplier supplier, String itemName){
        this.supplier = supplier;
        this.itemName = itemName;
    }
    public Supplier getSupplier(){
        return supplier;
    }
}
