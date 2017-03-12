public class MaxBox {

    private int saveValue;
    
    public void setValue(int value){
        if(value > saveValue && value > 0){
            saveValue = value;
        }
    }

    public int getValue(){
        return saveValue;
    }
}
