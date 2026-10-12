class Practice{
    int[] array = new int[5];
    array = {1,2,3};
    public static void insert(int index , int value){
        if(index < 0 || index > array.length){
            System.out.println("Index is not correct.");
        }
        else{
            for(int i = array.length ; i > index; i--){
                array[i] = array[i - 1];
            }
            array[index] = value;
            System.out.println("Added at " + index + " , Value " + value);
        }
    }
    public static void delete(int index){

    }
    public static void display(int index){

    }
    public static void displayAll(){

    }
    public static void main(String[] args) {
        
    }
}