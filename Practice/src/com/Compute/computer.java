package com.Compute;

import com.Product.Component;
import com.Product.workable;
import com.Type.CPU;
import com.Type.Disk;

public class computer extends Component implements workable {
    private CPU cpu;
    private Disk disk;

    public computer(String Name,CPU cpu, Disk disk) {
        super(Name,-1);
        this.cpu = cpu;
        this.disk = disk;
        super.setPrice(cpu.price+disk.price);
    }

    @Override
    public void work() {
        cpu.work();
        disk.work();
    }

    @Override
    public String descrip() {
        StringBuilder sn = new StringBuilder();
        sn.append("Computer:{").append(cpu.descrip()).append("};{").append(disk.descrip()).append("};");
        return sn.toString();
    }
}
