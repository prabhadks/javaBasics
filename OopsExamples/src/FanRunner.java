public class FanRunner {

    public static void main(String[] args) {
        Fan fan = new Fan("Brand1" , 5.0, "red");
        System.out.println(fan);
        fan.switchOn();
        fan.setSpeed((byte) 2);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
