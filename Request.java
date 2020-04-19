import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Request {
    String method;
    String path;
    String version;
    Map<String,String> headers = new HashMap<>();

    public static Request parse(InputStream is)
    {
        Request request = new Request();
        //is是字节流，不容易一行一行读，可以用Scanner处理，
        // 并将字节可是转为字符格式，"UTF-8"
        Scanner scanner = new Scanner(is,"UTF-8");
        //解析请求行
        String requestLine = scanner.nextLine();
        String[] arr = requestLine.split(" ");
        request.method = arr[0];
        request.path = arr[1];
        request.version = arr[2];
        //解析请求头
        String line;
        while(!(line = scanner.nextLine()).isEmpty())
        {
            String[] kv = line.split(":");
            String key = kv[0];
            String value = kv[1].trim();  //去掉前面的空格
            request.headers.put(key,value);
        }
        return request;
    }

    @Override
    public String toString() {
        return "Request{" +
                "method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", version='" + version + '\'' +
                ", headers=" + headers +
                '}';
    }
}
