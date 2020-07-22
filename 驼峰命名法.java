//链接：https://www.nowcoder.com/questionTerminal/aed1c7bbc2604e7c9661a2348b0541b8?pos=46&mutiTagIds=579&orderByHotValue=1
//来源：牛客网

//从C/C++转到Java的程序员，一开始最不习惯的就是变量命名方式的改变。C语言风格使用下划线分隔多个单词，例如“hello_world”；而Java则采用一种叫骆驼命名法的规则：除首个单词以外，所有单词的首字母大写，例
//如“helloWorld”。
//请你帮可怜的程序员们自动转换变量名。
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            String[] s = str.split("_");
            String res = s[0];
            for(int i = 1;i < s.length;i++){
                res+=(char)(s[i].charAt(0)-32);
                for(int j = 1;j < s[i].length();j++){
                    res+=s[i].charAt(j);
                }
            }
            System.out.println(res);
        }
    }
}
