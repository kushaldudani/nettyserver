package com.pelf.nse.listener;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.TimeZone;

public class BroadcastListener {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		
		String ip = "10.211.26.18";
		int port = 9602;
		Socket echoSocket;
		try{
		echoSocket = new Socket(ip, port);
        echoSocket.setReceiveBufferSize(6092);
        echoSocket.setSendBufferSize(1024);
        echoSocket.setTcpNoDelay(true);
        echoSocket.setSoTimeout(15*1000);
        
        InputStream dIn = echoSocket.getInputStream();
        while (true) {
        	byte[] fresh = new byte[10240];
        	int size  = dIn.read(fresh);
        	System.out.println("hi "+size);
        }
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
