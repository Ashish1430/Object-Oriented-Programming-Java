package com.ashishjava;
interface MyCamera{
    void Capture();
    private void loading(){
        System.out.println("Loading.........");
    }
    default void record4kVideo(){
        loading();
        System.out.println("4k video recording......");
    }
}
interface MyNetwork{
    void Network();
}
class FeaturePhone{
    public void Call(){
        System.out.println("Calling.....");
    }
    public void EndCall(){
        System.out.println("Ending Call....");
    }
}

class Samsung extends FeaturePhone implements MyCamera,MyNetwork{
    public void Capture(){
        System.out.println("Capture.......");
    }

    @Override
    public void Network() {
        System.out.println("4G LTE+");
    }
    public void Call(){
        super.Call();
    }
}
public class Default_interface_two {
    public static void main(String[] args) {
      Samsung s = new Samsung();
      s.Capture();
      s.Network();
      s.Call();
      s.record4kVideo();

    }
}
