package branch;

public class EndlessLoopDemo {
    //死循环的几种形式
    public static void main(String[] args) {
//        for(;;){
        //for循环的（初始化、条件判断、迭代）都为空，因此循环条件永远为真，循环将无限执行。
//            System.out.println("hello world");
//        }

//        while(true){
        //while循环的条件始终为true，因此循环将无限执行。
//            System.out.println("hello world2");
//        }
//    }

        do{
            //do-while循环首先执行循环体，然后检查条件。由于条件始终为true，循环将无限执行。
            System.out.println("hello world");
        }while(true);
    }
}
