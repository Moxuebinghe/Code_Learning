package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/*
操作类，负责菜品上架和浏览
 */
public class FoodOperator {
    private ArrayList<Food> foodlist = new ArrayList<>();
    public void addFood(){//创建菜品对象
        Food f = new Food();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入上架菜品名称：");
        String name = sc.next();
        f.setName(name);

        System.out.println("请输入价格：");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("请输入菜品描述");
        String desc = sc.next();
        f.setDesc(desc);
        foodlist.add(f);
    }

    public void showAllFood(){
        if(foodlist.size() == 0){
            System.out.println("暂无菜品信息，请先上架");
            return;
        }
        for (int i = 0; i < foodlist.size(); i++) {
            Food f = foodlist.get(i);//提取每个菜品对象
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("---------------------");
        }
    }
    /*展示操作界面*/
    public void start(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择功能：");
            System.out.println("1.上架菜品：");
            System.out.println("2.展示菜品：");
            System.out.println("3.退出");
            System.out.println("请选择您的操作");
            String command = sc.next();
            switch (command){
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFood();
                    break;
                case "3":
                    System.out.println("下次再来~");
                    return;
                default:
                    System.out.println("您输入的命令不存在");
            }
        }
    }
}
