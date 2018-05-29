package main;

import javafx.beans.property.StringProperty;

public class TableRowDataModel {
    private StringProperty name;
    private StringProperty durl;   
 
    public TableRowDataModel(StringProperty name, StringProperty durl) {
        this.name = name;
        this.durl = durl;
        
        
    }
 
    public StringProperty nameProperty() {
        return name;
    }
    public StringProperty durlProperty() {
        return durl;
    }
   
}

