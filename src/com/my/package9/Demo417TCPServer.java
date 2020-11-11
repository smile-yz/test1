package com.my.package9;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo417TCPServer {
    public static void main(String[] args) throws IOException {
        //服务器ServerSocket对象，系统要指定的端口号
        ServerSocket server = new ServerSocket(8080);
        //accept获取请求的客户端对象（浏览器）
        Socket socket = server.accept();
        //使用Socket对象中的方法getInputStream,获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //使用网络字节输入流InputStream对象中的方法read，读取客户端的请求信息
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = is.read(bytes)) != -1) {
//            System.out.println(new String(bytes,0,len));
//        }
        //把is网络字节输入流对象，转换为字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //把客户端请求信息第一行读出来
        String line = br.readLine();
        //读取的信息进行切割
        String[] arr = line.split(" ");
        //路径前面的/去掉
        String htmlpath = arr[1].substring(1);
        //创建本地字节输入流，构造方法中绑定要读取得html路径
        FileInputStream fis = new FileInputStream(htmlpath);
        //使用Socket中得方法getOutputStream获取网络字节输出流
        OutputStream os = socket.getOutputStream();
        //写入HTTP协议响应头，固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        //必须写入空行，否则浏览器不解析
        os.write("\r\n".getBytes());

        //一读一写复制文件，把服务器读取的html文件会写到客户端
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes,0,len);
        }
        fis.close();
        socket.close();
        server.close();

    }
}
