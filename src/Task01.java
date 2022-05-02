public class Task01 {
    public static void MyMethod(String str){

        System.out.println(str.length());
    }
    public static void main(String[]args){
        try{
            String ex = null;
            MyMethod(ex);
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Error Catched");
            System.out.println(e.toString());
            e.printStackTrace();

        }

    }
}
