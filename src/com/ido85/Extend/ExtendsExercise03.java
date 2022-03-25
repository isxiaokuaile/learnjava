package com.ido85.Extend;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        pc pc = new pc();
        NotePad notePad = new NotePad();
        pc.setBrand("dell");
        notePad.setColor("黑色");
        pc.setCpu("cpu01");
        pc.setDisk("内存01");
        pc.setRam("硬盘01");
        System.out.println(pc.getPrint()+" 颜色："+notePad.getColor());
    }
}
class Computer{
   private String cpu;   //cpu
   private String ram;  //内存
   private String disk;   //硬盘

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getDetails(){  //返回computer的信息
       return "cpu:"+this.cpu+" 内存："+this.disk+" 硬盘："+this.ram;
   }
}
class pc extends Computer{
    private String brand;  //品牌

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getPrint(){
        return getDetails()+" 品牌："+brand;
    }
}
class NotePad extends Computer{
    private String color;  //颜色

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
