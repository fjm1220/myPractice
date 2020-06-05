
//输入多行，先输入要排序的人的个数，然后输入排序方法0（降序）或者1（升序）再分别输入他们的名字和成绩，以一个空格隔开。
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
        int num = in.nextInt();
        int flag = in.nextInt();
        List<Student> stuList = new ArrayList<>();
        for(int i = 0;i < num;i++)
        {
            stuList.add(new Student(in.next(),in.nextInt()));
        }
            if(flag == 0)
            {
                //降序
                stuList.sort((o1,o2) -> o2.score-o1.score);
            }
            else{
                //升序
                stuList.sort((o1,o2) -> o1.score-o2.score);
            }
            for(Student student:stuList)
            {
                System.out.println(student.name + " "+student.score);
            }
        }
    }
}
    class Student{
        String name;
        int score;
        public Student(String name,int score)
        {
            this.name = name;
            this.score = score;
        }
    }
