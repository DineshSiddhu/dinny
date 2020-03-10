package org.Lanng;

public class StateDetails{
public void south() {
	// TODO Auto-generated method stub
System.out.println("India");
}
public void north() {
	// TODO Auto-generated method stub
System.out.println("state");
}
public static void main(String[] args) {
	
StateDetails d=new StateDetails();
langInfo c = new langInfo();
d.south();
d.north();
c.tamilLang();
c.engLang();
c.hindhLang();


}
}
