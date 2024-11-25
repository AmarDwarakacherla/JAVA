package Exception_Handling.Checked_CompileTime;

//public class try_catch_ClassNotFoundException {
//    public static void main(String[] args) {
//        method1();
//    }
//    static void method1(){
//        try{
//            throw new java.lang.ClassNotFoundException();
//        }catch(java.lang.ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }
//}

//-----------OR----------------------

public class try_catch_ClassNotFoundException {
    public static void main(String[] args) {
        try {
            method1();
        }catch(java.lang.ClassNotFoundException e){

        }
    }
    static void method1() throws java.lang.ClassNotFoundException {
            throw new java.lang.ClassNotFoundException();
    }
}
