
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleHTTPServer
{
    public static void main(String[] args)throws IOException
    {
        //创建监听socket,监听80端口
        //一个端口只能属于一个进程，利用端口进行分用
        ServerSocket serverSocket = new ServerSocket(80);
        //创建线程池，提高效率
        ExecutorService pool = Executors.newFixedThreadPool(10);
        while(true) {
            Socket socket = serverSocket.accept();
            pool.execute(new Task(socket));
        }
    }

}
