package main;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;

public class TableRowDataModel {
    private StringProperty name;
    private StringProperty durl;
    //private BooleanProperty start;
 
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
    //public BooleanProperty startProperty() {
    //    return start;
    //}
   
}

