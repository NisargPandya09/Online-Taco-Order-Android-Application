package edu.csulb.android.temprature.tacopronto;

import java.io.Serializable;

/**
 * Created by nisar on 15/02/2017.
 */

public class name_value implements Serializable {
  //  private int id;
    String name;
    Double value;

    public name_value(){
        super();
    }

    public name_value(String name, double price) {
        super();
     //   this.id = id;
        this.name = name;
        this.value = price;
    }

    @Override
    public String toString() {
        //return this.id + ". " +this.name + " [$" + this.value + "]";
        return this.name + " [$" + this.value + "]";
    }
}
