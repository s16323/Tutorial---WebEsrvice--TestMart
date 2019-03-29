package org.testmart;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {


   public List<String>  getProductCategories(){         //Retrieve product categories availble in Test Mart as a list.
       List<String> categories = new ArrayList<>();
       categories.add("Books");
       categories.add("Music");
       categories.add("Movies");
       return categories;
   }

}
