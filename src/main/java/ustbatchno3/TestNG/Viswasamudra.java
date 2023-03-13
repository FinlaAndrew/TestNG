package ustbatchno3.TestNG;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Viswasamudra {
		public static void main(String[] args){
			Vishwadetails v1=new Vishwadetails("Hyderabad", 2000, 900);
			Vishwadetails v2=new Vishwadetails("Chennai", 1800, 1000);
			Vishwadetails v3=new Vishwadetails("Thiruvananthapuram", 1600, 800);
			Vishwadetails v4=new Vishwadetails("Cochin", 1800, 1200);
			Vishwadetails v5=new Vishwadetails("Mumbai", 2500, 900);
			
			
			Scanner sc=new Scanner(System.in);
			
			List<Vishwadetails> details=Arrays.asList(v1,v2,v3,v4,v5);
			System.out.println("Enter square feet");
			//int sq=3,price=0;
			int sq=sc.nextInt();
			System.out.println("Enter city");
			String city=sc.next();
			String cityy=city.toLowerCase();
			int choice=0;
			System.out.println("Enter choice\n1-Price without material\n2-Price with material");
			choice=sc.nextInt();
			sc.close();
			int price= construction(details, choice, cityy,sq);
			
			System.out.println("Total price : "+price);
			
		}
		public static int  construction(List<Vishwadetails> details,int choice,String city,int sq) {
			List<Vishwadetails> result=details.stream().filter(t->((t.getTest().toLowerCase()).equals(city))).toList();
			
			int price=0;
			switch(choice) {
			case 1:for(Vishwadetails p:result) 
						price=(p.getPricewithmaterial()*sq);
						break;
			case 2:for(Vishwadetails p:result) 
						price=(p.getPricewithout()*sq);
						break;}
			return price;
		}
}