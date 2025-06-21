package eCommerce;

import java.util.*;

public class SearchUtils {
 
    public static Product linearSearch(Product[] prod, String target){
      for(Product p : prod){
        if(p.getProductName().equalsIgnoreCase(target)){
            return p;
        }
      }
      return null;
    }

    public static Product binarySearch(Product[] prod, String target){
        Arrays.sort(prod, Comparator.comparing(Product::getProductName));
        int left = 0, right = prod.length - 1;

        while(left <= right){
            int mid = left+(right-left)/2;
            int cmp = prod[mid].getProductName().compareToIgnoreCase(target);

            if(cmp == 0) return prod[mid];
            else if (cmp < 0) left = mid+1;
            else right = mid-1;
        }
        return null;
    }

}
