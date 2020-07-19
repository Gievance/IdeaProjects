package com.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Practice055 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10005);
        while (true) {
            Socket accept = server.accept();
            new Thread(new ServerThread(accept)).start();
        }
    }
}
