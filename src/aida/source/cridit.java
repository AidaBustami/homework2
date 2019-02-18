package aida.source;

import java.util.ArrayList;


public class cridit {

	
public  static  ArrayList<book> book1=null;
	
	public  static  ArrayList<book>   create() {
		
	
	book1= new ArrayList<book> ();
	return book1;
	}
	
	public  static ArrayList<book>   addbook(int cost1,String name1) {

	book m=new book();
	m.cost=cost1;
	 m.name=name1;
	
		book1.add(m);
		return book1;
	}
	
	public   static int  count() {
		if(book1==null )
			return -1;
	return book1.size()	;
	
	}
	
public  static  int  sumofprice1()
	
	{
	if(book1==null )
	return -1;
	
	 return book1.get(0).cost;
}

public  static  int sumofprice2()

{
	if(book1==null )
		return -1;
 return book1.get(1).cost+book1.get(0).cost;
 

}

	public  static  int sumofprice3()
	
	{
		
		 return book1.get(1).cost+book1.get(0).cost+book1.get(2).cost;
	
}
public  static  int sumofpricegeneral()
	
	{
	if(book1==null )
		return -1;
	int sum=0;
	
	
	for(int i=0;i<book1.size();i++) {
		
	sum+=book1.get(i).cost;
	
	
	}
	return sum;
	}
	
}
