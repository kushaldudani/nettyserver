package com.pelf.nse.requeststructure;

public class GMHeader {

	short transactionCode;
	int logTime;
	String alphaChar; //2 bytes
	int traderId;
	short errorCode;
	String timeStamp; //8 bytes
	String timeStamp1; //8 bytes
	String timeStamp2; //8 bytes
	short messageLen; 
	
	
}
