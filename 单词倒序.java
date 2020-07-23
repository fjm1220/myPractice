//链接：https://www.nowcoder.com/questionTerminal/81544a4989df4109b33c2d65037c5836
//来源：牛客网
//对字符串中的所有单词进行倒排。
//说明：
//1、构成单词的字符只有26个大写或小写英文字母；
//2、非构成单词的字符均视为单词间隔符；
//3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
//4、每个单词最长20个字母；

//示例1
//输入
//I am a student
//输出
//student a am I
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            //利用正则表达式进行分割
            //[^a-zA-Z]表示匹配字符串中非a-z和非A-Z的字符
            //^[a-zA-Z]表示匹配字符串中a-z或者A-Z开头的字符
            String[] strs = str.split("[^a-zA-Z]");
            String res = "";
            for(int i = strs.length-1;i >= 2;i--){
                    res+=strs[i];
                    res+=" ";
            }
            if(strs[0].length() == 0){
                res+=strs[1];
            }
            else{
                res=res+strs[1]+" "+strs[0];
            }
            System.out.println(res);
        }
    }
}
