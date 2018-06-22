package dynamicproxy;

public class Bus implements ITransportation {

    @Override
    public void move(String name) {
        System.out.println(name+"在行驶中…………");
    }
}
