package aida.test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Objects;

import org.junit.Test;

import aida.source.book;
import aida.source.cridit;


public class testing {


	
	    

	
	@Test
	 public void creattest() {
		assertEquals(new ArrayList<book> (),cridit.create());
		
		
		
		
	}

	
	@Test
	 public void counttest() {
		cridit.create();
		assertEquals(0,cridit.count());
		
	}
	
	@Test
public	void addtest() {
		
		cridit.create();
		
		 ArrayList<book> temp1=new ArrayList<book>();
		 book b1=new book();
		
		b1.cost=20;b1.name=new String("h1");
			
		temp1 .add(b1);
	ArrayList<book>	 book1=cridit.addbook(20,new String( "h1"));
		assertEquals(temp1.get(0).cost,book1.get(0).cost );
		assertEquals(temp1.get(0).name,book1.get(0).name );
		
		
	}
	@Test
	 public  void count2test() {
		cridit.create();
		cridit.addbook(20, "h1");
		
		assertEquals(1,cridit.count());
		
	}
	@Test
	
public	void prise1test() {
		cridit.create();
		cridit.addbook(20, "h1");
		
		assertEquals(20,cridit.sumofprice1());
		
	}
	
	 public void add2test() {
		cridit.create();
		cridit.addbook(20, "h1");
		
		
		ArrayList<book> temp=new ArrayList<book>();
		book b1=new book();
		book b2=new book();
			b1.cost=20;b2.cost=20;b1.name="h1";b2.name="h2";
			
	temp .add(b1);
	temp.add(b2);
	ArrayList<book>	 book1=cridit.addbook(20,new String( "h2"));
	assertEquals(temp.get(0).cost,book1.get(0).cost );
	assertEquals(temp.get(0).name,book1.get(0).name );
	
	assertEquals(temp.get(1).cost,book1.get(1).cost );
	assertEquals(temp.get(1).name,book1.get(1).name );}
	@Test
 public	void count3test() {
		
		cridit.create();
		cridit.addbook(20, "h1");
		cridit.addbook(20, "h2");
		assertEquals(2,cridit.count());
		
	}
	@Test
	 public void prise2test() {
		
		
		cridit.create();
		cridit.addbook(20, "h1");
		cridit.addbook(20, "h2");
		assertEquals(40,cridit.sumofprice2());
		
	}
	
	
	@Test
	
	 public void add3test() {
	
		
		cridit.create();
		cridit.addbook(20, "h1");
		cridit.addbook(20, "h2");
		
		
		
		ArrayList<book> temp=new ArrayList<book>();
		book b1=new book();
		book b2=new book();
			b1.cost=20;b2.cost=20;b1.name="h1";b2.name="h2";
			book b3=new book();
			
b3.cost=20;
					b3.name="h3";
		temp .add(b1);
	temp.add(b2);
	temp.add(b3);
	ArrayList<book>	 book1=cridit.addbook(20,new String( "h3"));
	assertEquals(temp.get(0).cost,book1.get(0).cost );
	assertEquals(temp.get(0).name,book1.get(0).name );
	assertEquals(temp.get(1).cost,book1.get(1).cost );
	assertEquals(temp.get(1).name,book1.get(1).name );
	assertEquals(temp.get(2).cost,book1.get(2).cost );
	assertEquals(temp.get(2).name,book1.get(2).name );
		
	}
	
	@Test
 public void addt5est() {
		cridit.create();
		cridit.addbook(20, "h1");
		cridit.addbook(20, "h2");
		cridit.addbook(20, "h3");cridit.addbook(20, "h4");
		ArrayList<book> temp=new ArrayList<book>();
		book b1=new book();
		book b2=new book();
		
			b1.cost=20;b2.cost=20;b1.name="h1";b2.name="h2";
			book b3=new book();
			
b3.cost=20;
					b3.name="h3";
					book b4=new book();book b5=new book();
					b4.cost=20;
					b4.name="h4";
					b5.cost=20;
					b5.name="h5";
					
temp .add(b1);
	temp.add(b2);
	temp.add(b3);temp.add(b4);temp.add(b5);
	 cridit.addbook(20, "h5");
	 ArrayList<book>	 book1=cridit.addbook(20,new String( "h5"));
		assertEquals(temp.get(0).cost,book1.get(0).cost );
		assertEquals(temp.get(0).name,book1.get(0).name );
		assertEquals(temp.get(1).cost,book1.get(1).cost );
		assertEquals(temp.get(1).name,book1.get(1).name );
		assertEquals(temp.get(2).cost,book1.get(2).cost );
		assertEquals(temp.get(2).name,book1.get(2).name );
		assertEquals(temp.get(3).cost,book1.get(3).cost );
		assertEquals(temp.get(3).name,book1.get(3).name );	
	}
	@Test
	 public void prise5test() {
		cridit.create();
		cridit.addbook(20, "h1");
		cridit.addbook(20, "h2");
		cridit.addbook(20, "h3");cridit.addbook(20, "h4");cridit.addbook(20, "h5");
		assertEquals(100,cridit. sumofpricegeneral());
		
	}
	
	
	@Test
 public	void count4test() {
		cridit.create();
		cridit.addbook(20, "h1");
		cridit.addbook(20, "h2");
		cridit.addbook(20, "h3");cridit.addbook(20, "h4");cridit.addbook(20, "h5");
	assertEquals(5,cridit.count());
	
}
}
