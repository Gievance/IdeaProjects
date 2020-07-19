package com.Type;

import com.Product.Component;
import com.Product.workable;

public abstract class Disk extends Component implements workable {
    public String disktype;

    public Disk(String Name, int price, String disktype) {
        super(Name, price);
        this.disktype = disktype;
    }

    @Override
    public String descrip() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name:{").append(super.Name).append("},{").append(super.price).append("},")
                .append("{").append(this.disktype).append("};");
        return stringBuilder.toString();
    }
}
