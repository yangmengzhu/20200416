import java.util.Scanner;
import java.util.Arrays;
 /**
 * @program: 20200413
 * @description
 * @author: mrs.yang
 * @create: 2020 -04 -13 15 :22
 */

/**
 *
 */


public class TestDemo {
    /*public static void main(String[] args) {//冒泡排序
       int[] arr={8,2,4,1,5,3,9};
       bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag=false;
            for (int j = 0; j< arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flag=true;
                }
            }
            if(flag=false){
                break;
            }
        }
    }*/
    /*public static void main(String[] args) {//数组转字符串
        int[] arr={1,2,3,4,5,6};
        String ret=string(arr);
        System.out.println(ret);
    }
    public static String string(int[] arr){
        String ret= "[";
        for (int i = 0; i < arr.length; i++) {
            ret = ret + arr[i];
            if (arr[i]!=arr[arr.length-1]){
                ret+=",";
            }
        }
        ret+="]";
        return ret;
    }*/
    /*public static void main(String[] args) {//Arrays.sort的使用
        int[] arr={4,8,5,6,8,0,15};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }*/
    /*public static void main(String[] args) {//Arrays.fill局部填充左闭右开
        int[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.fill(arr, 2, 5, 7);
        System.out.println(Arrays.toString(arr));
    }*/
    /*public static void main(String[] args) {//Arrays.fill全部填充
        int[] arr={1,2,3,4,5,6};
        Arrays.fill(arr,7);
        System.out.println(Arrays.toString(arr));
    }*/
    /*public static void main(String[] args) {//判断是否有序
        int[] arr={1,2,4,6,8};
        boolean ret = isUp(arr);
        System.out.println(ret);
    }
    public static boolean isUp(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){

            }else{
                return false;
            }
        }
        return true;
    }*/
    /*public static void main(String[] args) {//给定一个整型数组, 判定数组是否有序（递增）
        int[] arr={1,2,8,4,5,6};
        boolean ret =isUp(arr);
        System.out.println(ret);
    }
    public static boolean isUp(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] < arr[i + 1]) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }*/
    /*public static void main(String[] args) {//二分查找，必须是有序数组
        int[] arr = {1, 5, 8, 9, 10, 12};//递增（有序）
        int key = 10;
        int ret = binarySearch(arr, key);
        System.out.println("下标是：" + ret);
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (arr[mid] > key) {
                right = mid - 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }*/
    /*public static void main(String[] args) {//顺序查找数组中找到一个指定的元素
       int[] arr={1,2,3,4,5,6,7};
       int key = 5;
       int ret=find(arr,key);
        System.out.println("下标是："+ret);
    }
    public static int find(int[] arr,int key){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }*/
    /*public static void main(String[] args) {//找数组中的最大值
        int[] arr={1,2,8,5,4,10};
        int ret =find(arr);
        System.out.println(ret);
    }
    public static int find(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
               max=arr[i];
            }
        }
        return max;
    }*/
    /*public static void main(String[] args) {//arr.clone  克隆方法
        int[] arr={1,2,3,4};
        int[] ret=arr.clone();
        System.out.println(Arrays.toString(ret));
    }*/
    /*public static void main(String[] args) {//System.arraycopy，用c/c++实现速度快
        int[] arr = {1,2,3,4};
        int[] ret = new int[arr.length];
        System.arraycopy(arr,0,ret,0,arr.length);
        System.out.println(Arrays.toString(ret));
    }*/
    /*public static void main(String[] args) {//使用Arrays.copyOf复制，返回一个新的对象
        int[] arr={1,2,3,4};
        int[] ret = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(ret));
    }*/
    /*public static void main(String[] args) {//for循环  复制数组
        int[] arr={1,2,3,4};
        int[] ret =copyOf(arr);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] copyOf(int[] arr){
        int[] tmp=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i]=arr[i];
        }
        return tmp;
    }*/

    /*public static void main(String[] args) {//升序
        int[] arr={1,2,3,10,5,6};
        isUp(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void isUp(int[] arr){
        int i=0;
        while(i<arr.length) {
            if(arr[i]<=arr[i+1]){
                i++;
            }
            else {
                int tmp=arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=tmp;
            }
        }
    }*/
    /*public static void main(String[] args) {//二分查找
     int[] arr={1,2,3,4,5,6,7,8,9,10};
     int key = 7;
     int ret = binarySearch(arr,key);
     System.out.println("下标是：" + ret);
    }
    public static int binarySearch(int[] arr, int key){
        int left=0;
        int right = arr.length-1;
        while(left<=right) {
            int mid= (left+right)/2;
            if (arr[mid] > key) {
                right = mid - 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }*/
    /*public static void main(String[] args) {//找到指定的数字返回下标
        int[] arr= {1,2,3,4,5,8};
        int key= 5;
        int ret=find(arr,key);
        System.out.println("下标是："+ ret);
    }
    public static int find(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }*/
    /*public static void main(String[] args) {//找数组中最大的数
        int[] arr= {1,2,3,4,5,6,7,8};
        int ret=maxArray(arr);
        System.out.println(ret);
    }
    public static int maxArray(int[] arr){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }*/
    /*public static void main(String[] args) {//复制数组for
        int[] arr= {1,2,3,4,5,6,7};
        int[] ret=copyArray(arr);
        System.out.println(Arrays.toString(ret));
    }
    public static  int[] copyArray(int[] arr){
        int[] tmp= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i]=arr[i];
        }
        return tmp;
    }*/

    /*public static void main(String[] args) {
        int[] arr= new int[100];
        reSet(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void reSet(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
    }*/
    /*public static void main(String[] args) {//打印数组
        int[] arr = {2, 3, 4, 6, 7, 8};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }*/
    /*public static void main(String[] args) {//改变原有数组元素的值*2
        int[] arr = {1,2,3};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           arr[i]= arr[i]*2;
        }
    }*/
    /*public static void main(String[] args) {//求数组中所有元素的平均值
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        double ret = avg(arr);
        int ret = sum(arr);
        System.out.println(ret);
    }
    public static  int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }*/
    /*public static double avg(int[] arr){
        double sum = 0;
        double avg = 1.0;
        for (int i = 0; i <arr.length ; i++) {
            sum = sum+arr[i];
            avg = sum/arr.length;
        }
        return avg;
    }*/
    /*public static void main(String[] args) {//分别定义求两个整数的方法 和 三个小数之和
        int n1 = 1;
        int n2 = 2;
        double n3 = 1.0;
        double n4 = 2.0;
        double n5 = 3.0;
        sum1(n1, n2);
        sum2(n3,n4,n5);
        System.out.println(sum1(n1, n2));
        System.out.println(sum2(n3,n4,n5));
    }
    public static int  sum1(int num1, int num2){
       return num1+num2;
    }
    public static double sum2(double num1, double num2, double num3){
        return num1+num2+num3;
    }*/
    /*public static void main(String[] args) {//要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
     int m = 3;
     int n = 4;
     double a = 1.0;
     double b = 2.0;
     double c = 3.0;
     System.out.print(max1(n,n)+" ");
        System.out.println();
     System.out.print(max2(a,b)+" ");
        System.out.println();
     System.out.print(max3(a,b,m)+" ");
    }
    public static int max1(int n1, int n2){
        return n1>n2?n1:n2;
    }
    public static double max2(double n1, double n2){
       return n1>n2?n1:n2;
    }
    public static double max3(double n1, double n2, int n3){
        return max2(max2(n1,n2),n3);
    }*/
    /*public static void main(String[] args) {//调整数组顺序使得奇数位于偶数之前
        int[] arr = {1,2,3,4,5,6,7,8,9};
        adjust(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void adjust(int[] arr){
        int i = 0;
        int len = arr.length;
        while(i<len-1) {
            if (arr[i] % 2 == 1) {
                i++;
            }
            if (arr[len - 1] % 2 == 0) {
                len--;
            }
            if ((arr[i] % 2 == 0 || arr[len - 1] % 2 == 1) && (i < len - 1)) {
                int tmp = 0;
                tmp = arr[i];
                arr[i] = arr[len - 1];
                arr[len - 1] = tmp;
            }
        }
    }*/
    /*public static void main(String[] args) {//求最大值
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int ret=maxNum(n1,n2);
        int sum= max3(n1,n2,n3);
        System.out.println(ret);
        System.out.println(sum);
    }
    public static int max3(int num1, int num2, int num3){
        return maxNum(maxNum(num1,num2),num3);
    }
    public static int maxNum(int num1, int num2){
       return num1 > num2 ? num1 : num2;
    }*/

    /*public static void main(String[] args) {//非递归迭代实现第n个斐波那契数列
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = fib(n);
        System.out.println(ret);
    }
    public static int fib(int n){//递归求第n个斐波那契数列
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }*/
//    public static int fib(int n){
//        int a = 1;
//        int b = 1;
//        int c = 1;
//        while(n>2){
//            c = a+b;
//            a = b;
//            b = c;
//            n--;
//        }
//        return c;
//    }
    /*public static void main(String[] args) {//递归按顺序打印一个整数的每一位
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     func(n);
    }
    public static void func(int n){
        if(n>9){
            func(n/10);
        }
        System.out.print(n%10+ " ");
    }*/
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret =fac(n);
        System.out.println(ret);
    }
    public static int fac(int n){//递归求n的阶乘
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }*/
    /*public static int fac(int n){//非递归求n的阶乘
        int ret = 1;
        for (int i = 1; i <=n; i++) {
            ret*=i;
        }
        return ret;
    }*/
    /*public static void main(String[] args) {//求n的阶乘之和
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = sum(n);
        System.out.println(ret);
    }
    public static int sum(int n){
        int ret = 1;
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            ret = ret*i;
            sum+=ret;
        }
        return sum;
    }*/
    /*public static void main(String[] args) {//找出一个数组中只出现一次的数字
      int[] arr = {1,2,3,4,1,2,4};
      int ret =find(arr);
      System.out.println(ret);
    }
    public static int find(int[] arr){
        int ret = 0;
       for(int i=0;i<arr.length;i++){
           ret= ret^arr[i];
       }
       return ret;
    }*/
    /*public static void main(String[] args) {//青蛙跳台阶有多少种跳法
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = frog(n);
        System.out.println(ret);
    }
    public static int frog(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return frog(n-1)+frog(n-2);
        }
    }*/
    /*public static void main(String[] args) {//汉诺塔的移动路径
        hano(3, 'A', 'B', 'C');
    }
    public static void move(char pos1, char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hano(int n, char pos1, char pos2, char pos3){
        if(n==1){
            move(pos1,pos3);
        }else{
            hano(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hano(n-1,pos2,pos1,pos3);
        }
    }*/
    /*public static String myToString(int[] arr){
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
        }
        if(i!=len-1) {
            ret += ",";
        }
        return ret;
    }
    public static void main(String[] args) {//将数组以字符串的形式输出
        int[] arr = {1,2,3,4,5,6};
        String ret = myToString(arr);
        System.out.println(myToString(arr));
    }*/
    /*public static int hano(int n){
        if(n==1){
            return 1;
        }
        return 2*hano(n-1)+1;
    }
    public static void main(String[] args) {//递归汉诺塔移动次数2*f(n-1)+1
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = hano(n);
        System.out.println(ret);
    }*/
    /*public static int func(int n){
        if(n<10){
            return n;
        }
        return n%10+func(n/10);
    }
    public static void main(String[] args) {//输入一个非负整数，返回组成它的数字之和
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = func(n);
        System.out.println(ret);
    }*/
    /*public static void printnum(int n){
        if(n>9){
            printnum(n/10);
        }
        System.out.print(n%10 + " ");
    }
    public static void main(String[] args) { //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printnum(n);*/
    //}
    /*public static int sum(int n){//方法递归求 1 + 2 + 3 + ... + 10
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int ret = sum(n);
        System.out.println(ret);
    }*/
}
