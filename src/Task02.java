public class Task02 {
    static void MethodArith(){
        try{
            int no = 155/0;
            System.out.println(no);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide a number by zero ");
            System.out.println(e.toString());

        }
        catch(ArrayIndexOutOfBoundsException
                e ){
            System.out.println("Index Out Of Range");
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Done");
        }
    }
//    static void MethodArray(){
//        try{
//            String[] Arr={"First","Second","Third"};
//            System.out.println(Arr[6]);
//            //This should send an error
//        }
//        catch(ArrayIndexOutOfBoundsException
//        e ){
//            System.out.println("Index Out Of Range");
//            System.out.println(e.toString());
//        }

//    }
    public static void main(String[]args){
        MethodArith();
        System.out.println("---------------------------");
//        MethodArray();

    }
}
