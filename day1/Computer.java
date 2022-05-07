package sai.week.day1;

public class Computer {
String computerName="Dell";
char firstletter ='D';
short ramsize=8;
boolean isdamaged=false; 
int memory=250;
long ipaddress=123456789l;
float freqencyrange=2.54f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Computer com=new Computer();
System.out.println(com.computerName);
System.out.println(com.firstletter);
System.out.println(com.memory);
System.out.println(com.ipaddress);
System.out.println(com.isdamaged);
System.out.println(com.ramsize);
System.out.println(com.freqencyrange);
	}

}
