package com.Type;

import com.Product.Component;
import com.Product.workable;

public abstract class CPU extends Component implements workable {
    public String coretype;
    public CPU(String Name, int price, String coretype) {
        super(Name, price);
        this.coretype = coretype;
    }

    @Override
    public String descrip() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name:{").append(super.Name).append("},{").append(super.price).append("},")
        .append("{").append(this.coretype).append("};");
        return stringBuilder.toString();
    }
}
