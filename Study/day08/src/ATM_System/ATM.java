package ATM_System;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();//泛型参数Account，用于创建账户对象
    Scanner sc = new Scanner(System.in);//放在循环外，避免重复创建对象
    private Account LoginAccount;

    public void start(){
        while (true) {
            System.out.println("===欢迎进入ATM系统===");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("请选择:");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //login
                    login();
                    break;
                case 2:
                    //开户操作
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }
    //完成登录操作
    private void login(){
        System.out.println("---------系统登录：----");
        if(accounts.size() == 0){
            System.out.println("当前没有用户，请先开户");
            return;
        }
        while (true) {
            System.out.println("请输入卡号：");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId);//通过卡号，查询账户信息,若找到，返回账户信息，找不到，返回null
            if(acc == null){
                System.out.println("用户不存在，请确认");
            }else{
                while (true) {
                    System.out.println("请输入密码：");
                    String passWord = sc.next();
                    if(acc.getPassWord().equals(passWord)){
                        LoginAccount = acc;
                        System.out.println("恭喜您，用户 " + acc.getUserName() + "，"+ "成功登录系统，" + "卡号是：" + acc.getCardId());
                        //展示登录成功界面
                        showUserMenu();
                        return;//登录成功,跳出login方法,回到start界面
                    }else {
                        System.out.println("密码错误！");
                    }
                }
            }
        }
    }
    //登录后操作界面展示
    public void showUserMenu(){
        while (true) {
            System.out.println(LoginAccount.getUserName() + "欢迎登录ATM系统！选择下列功能：");
            System.out.println("1.查询余额");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            int command = sc.nextInt();
            switch (command){
                case 1:
    //                System.out.println("查询余额");
                    showLoginAccount();
                    break;
                case 2:
//                    System.out.println("存款");
                    deposit();
                    break;
                case 3:
//                    System.out.println("取款");
                    withdraw();
                    break;
                case 4:
//                    System.out.println("转账");
                    transfer();
                    break;
                case 5:
//                    System.out.println("修改密码");
                    changePassword();
                    return;
                case 6:
                    System.out.println(LoginAccount.getUserName() + "，" + "退出系统成功");
                    return;
                case 7:
//                    System.out.println("注销账户");
                    if (deleteAccount()) {
                        return;
                    }
                    break;
                default:
                    System.out.println("您输入的命令不存在");
            }
        }
    }

    private void changePassword() {
        System.out.println("==修改密码==");
        System.out.println("请输入旧密码:");
        String oldPassWord = sc.next();

        if (oldPassWord.equals(LoginAccount.getPassWord())) {
            while (true) {
                //修改新密码
                System.out.println("请输入新密码:");
                String newPassWord = sc.next();
                System.out.println("请再次输入新密码:");
                String okPassWord = sc.next();
                if (newPassWord.equals(okPassWord)) {
                    LoginAccount.setPassWord(newPassWord);
                    System.out.println("修改密码成功！");
                    return;
                } else {
                    System.out.println("两次输入的密码不一致！");
                }
            }
        }else {
            System.out.println("密码错误！");
        }
    }

    private boolean deleteAccount() {
        System.out.println("==注销账户==");
        System.out.println("是否确认销户？y/n");
        String command = sc.next();
        switch ( command){
            case "y":
                if (LoginAccount.getMoney() == 0){
                    accounts.remove(LoginAccount);//删除账户对象
                    System.out.println("注销成功！");
                    return true;//销户成功，跳出deleteAccount方法，回到showUserMenu界面
                }else {
                    System.out.println("账户中还有钱，请先取款");
                    return false;
                }
            default:
                System.out.println("好的,取消销户");
                return false;
        }
    }

    private void transfer() {
        System.out.println("==转账操作==");
        //判断系统中是否有至少2个账户
        if(accounts.size() < 2){
            System.out.println("系统内至少要2个账户，请先开户！");
            return;//跳出方法，回到start界面
        }
        //判断自己账户中是否有钱
        if(LoginAccount.getMoney() <= 0){
            System.out.println("余额不足，不允许转账");
            return;
        }
        while (true) {
            System.out.println( "请输入转账账户的卡号：");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId);//通过卡号，查询账户信息,若找到，继续验证账户信息，找不到，返回null
            if(acc == null){
                System.out.println("用户不存在，请确认");
            }else{
                //账户存在，则验证姓氏
                String name = "*" + acc.getUserName().substring(1);
                System.out.println("请您输入【"+ name + "】的姓氏是：" );
                String preName = sc.next();
                if(acc.getUserName().startsWith(preName)){
                    //认证成功
                    System.out.println("请输入转账金额：");
                    double money = sc.nextDouble();
                    //判断金额是否充足
                    if(LoginAccount.getMoney() >= money){
                        //更新账户信息(转账不算限额)
                        LoginAccount.setMoney(LoginAccount.getMoney() - money);
                        acc.setMoney(acc.getMoney() + money);
                        System.out.println("转账成功，余额为：" + LoginAccount.getMoney());
                        return;//直接跳出transfer方法，回到start界面
                    }else {
                        System.out.println("余额不足，取款失败");
                    }
                }else {
                    System.out.println("输入姓氏不正确~");
                }
            }
        }
    }

    private void withdraw() {
        System.out.println("==取款操作==");
        if (LoginAccount.getMoney() <= 100) {
            System.out.println("余额不足，不允许继续取钱");
            return;
        }
        while (true) {//循环，让用户反复输入直到取款成功
            System.out.println("请输入取款金额：");
            double money = sc.nextDouble();
            //判断当前余额是否充足
            if(LoginAccount.getMoney() >= money){
                if(money > LoginAccount.getLimit()){
                    System.out.println("超出取款额度，您每次最多可取：" + LoginAccount.getLimit());
                }else {
                    LoginAccount.setMoney(LoginAccount.getMoney() - money);
                    System.out.println("您取款"+ money + "取款成功，余额为：" + LoginAccount.getMoney());
                    break;
                }
            }else {
                System.out.println("余额不足，取款失败");
            }
        }
    }

    private void deposit() {//存款
        System.out.println("==存钱操作==");
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();
        LoginAccount.setMoney(LoginAccount.getMoney() + money);
        System.out.println("您存钱"+ money + "成功，存钱后余额为：" + LoginAccount.getMoney());
    }

    //显示菜单
    public void showLoginAccount(){
        System.out.println("====展示当前账户信息=====");
        System.out.println("卡号： " + LoginAccount.getCardId());
        System.out.println("用户名： " + LoginAccount.getUserName());
        System.out.println("密码： " + LoginAccount.getPassWord());
        System.out.println("性别： " + LoginAccount.getSex());
        System.out.println("余额： " + LoginAccount.getMoney());
        System.out.println("每次取现额度： " + LoginAccount.getLimit());
    }
    //完成开户操作
    private void createAccount(){
        System.out.println("===系统开户操作===");
        Account acc = new Account();
        System.out.println("请输入您的账户名:");
        String name = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请输入您的性别：");
            char sex = sc.next().charAt(0);//取第一个字符，避免用户输入多个字符
            if (sex == '男'|| sex == '女'){
                acc.setSex(sex);
                break;
            }else {
                System.out.println("您输入的信息有误，请输入男或女");
            }
        }

        while (true) {
            System.out.println("请您输入您的账户密码：");
            String passWord = sc.next();
            System.out.println("请您输入您的确认密码：");
            String okPassWord = sc.next();
            if (passWord.equals(okPassWord)){
                acc.setPassWord(okPassWord);
                break;
            }else {
                System.out.println("您输入的2次密码不一致，请确认~");
            }
        }

        System.out.println("请输入您的取现额度：");
        double limit = sc.nextDouble();//账户余额,nextDouble()用于获取double类型的数据
        acc.setLimit(limit);
        //创建卡号,随机生成8位的数字，不和旧的卡号重复
        String newCardId = createCardId();
        acc.setCardId(newCardId);

        accounts.add(acc);//添加账户对象到集合中
        System.out.println("恭喜您，" + acc.getUserName() + "开户成功，您的卡号是：" + newCardId);
    }

    private String createCardId(){
        //创建8位卡号
        Random r = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10);
                cardId += data;
            }
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                return cardId;//卡号未使用,返回新卡号
            }
        }
    }
    private Account getAccountByCardId(String cardId){  //该方法查询 账户对象，判断卡号是否被使用
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);//遍历集合中的元素
            if (cardId.equals(acc.getCardId())){
                return acc;//判断账号是否一致，若一致，返回该账户对象
            }
        }
        return null;//遍历集合后，若没有找到，返回null
    }
}
