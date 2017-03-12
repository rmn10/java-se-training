public class MaxBoxRun{
    public static void main(String[] args) {
        MaxBox box = new MaxBox();
        box.setValue(-30);
        System.out.println(box.getValue());
        box.setValue(10);
        box.setValue(100);
        box.setValue(80);
        System.out.println(box.getValue());

    }
}
