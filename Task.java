import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Task implements Runnable {
    private Socket socket;
    public Task(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //获取输入流
            InputStream is = socket.getInputStream();
            //获取输出流
            OutputStream os = socket.getOutputStream();
            //解析请求
            Request request = Request.parse(is);
            System.out.println(request);
            if(request.path.equalsIgnoreCase("/"))
            {
                //拼接响应
                String body = "<h1>成功</h1>";
                byte[] bodyBuffer = body.getBytes("UTF-8");
                StringBuilder response = new StringBuilder();
                response.append("HTTP/1.0 200 OK\r\n");
                response.append("Conttent-Type: text/html; charset=UTF-8\r\n");
                response.append("Content-Length: ");
                response.append(bodyBuffer.length);
                response.append("\r\n");
                response.append("\r\n");
                os.write(response.toString().getBytes("UTF-8"));
                os.write(bodyBuffer);
                //确保写入
                os.flush();
            }
            else if(request.path.equalsIgnoreCase("/hello"))
            {
                //拼接响应
                String body = "你好世界";
                byte[] bodyBuffer = body.getBytes("UTF-8");
                StringBuilder response = new StringBuilder();
                response.append("HTTP/1.0 200 OK\r\n");
                response.append("Conttent-Type: text/plain; charset=utf-8\r\n");
                response.append("Content-Length: ");
                response.append(bodyBuffer.length);
                response.append("\r\n");
                response.append("\r\n");
                os.write(response.toString().getBytes("UTF-8"));
                os.write(bodyBuffer);
                //确保写入
                os.flush();
            }
            else if(request.path.equalsIgnoreCase("/tiaozhuan"))
            {
                StringBuilder response = new StringBuilder();
                response.append("HTTP/1.0 307 Temporary Redirect\r\n");
                response.append("Location: /hello\r\n");
                response.append("\r\n");
                os.write(response.toString().getBytes("UTF-8"));
                os.flush();
            }
            else{
                StringBuilder response = new StringBuilder();
                response.append("HTTP/1.0 404 NotFound\r\n");
                response.append("\r\n");
                os.write(response.toString().getBytes("UTF-8"));
                os.flush();
            }
        }
        catch(Exception e){}
    }
}
