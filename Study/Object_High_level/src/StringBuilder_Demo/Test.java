package StringBuilder_Demo;

public class Test {
    public static void main(String[] args) {
        System.out.println(getArrayData(new int[]{11,22,33}));
    }
    public static String getArrayData(int[] arr) {
        if (arr == null)
        {
            return null;//空值检查
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            //遍历数组，添加逗号，最后一个元素后不添加逗号和空格
            sb.append(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        sb.append("]");
        return sb.toString();
        //StringBuilder 对象本身不是 String 类型
        //需要通过 toString() 方法获取其中存储的字符串内容
    }
}

