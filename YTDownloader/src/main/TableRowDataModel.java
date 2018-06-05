package main;

import javafx.beans.property.StringProperty;


public class TableRowDataModel {
    private final StringProperty name;
    private final StringProperty durl;
   
  
 
    public TableRowDataModel(StringProperty name, StringProperty durl) {
        this.name = name;
        this.durl = durl;
       
        //this.start = start;
        
        
    }
 
    public StringProperty nameProperty() {
        return name;
    }
    public StringProperty durlProperty() {
        return durl;
    }
    
 
   
}

