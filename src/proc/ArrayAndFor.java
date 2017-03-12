public class ArrayAndFor {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i =0; i<a.length;i++){
            System.out.println(a[i] + " ");
            delay();
        }
    }

    private static void delay() {
        try{
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
