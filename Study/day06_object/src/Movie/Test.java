package Movie;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //设计电影类
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1,"水门桥",38.9,9.8,"徐克","吴京","12万人想看");
        movies[1] = new Movie(2,"出拳吧",39,7.8,"唐晓白","田雨","3.5万人想看");
        movies[2] = new Movie(3, "月球陨落", 42, 7.9, "罗兰", "贝瑞", "17.9万人想看");
        movies[3] = new Movie(4, "一点就到家", 35, 8.7, "许宏宇","刘昊然", "10.8万人想看");
        MovieOperator operator = new MovieOperator(movies);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.全部信息");
            System.out.println("2.根据id查询");
            System.out.println("请输入：");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    operator.printAllMovies();
                    break;
                case 2:
                    System.out.println("请输入id：");
                    int id = sc.nextInt();
                    operator.searchMovieById(id);
                    break;
                case 3:
                    System.out.println("结束查询！");
                    return;
                default:
                    System.out.println("输入错误！");
            }
        }
    }
}
