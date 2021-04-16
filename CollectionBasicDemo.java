package day8.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import day5.task1.*;
import day6.task2.Employee;

public class CollectionBasicDemo {

	public static void main(String[] args) {
		CollectionBasicDemo obj = new CollectionBasicDemo();
		obj.listDemo();
	}

	public void listDemo() {
		List list = new ArrayList<>();
		list.add(new Exception());
		list.add(new Integer(78));
		list.add(45); // its an Integer not int
		list.add(new Thread("MyThread"));
		list.add("hello java");
		list.add(true);
		list.add(new Dog());

		System.out.println(list); // toString method of ArrayList invoked
		System.out.println(list.get(4));
		list.remove(0);
		System.out.println(list);
		boolean x = list.contains(145);
		System.out.println(x);

		doIterateList(list);
	}

	
	public void listDemoForEmployee()
	{
		List<Employee> empList = new ArrayList<>();
		
		// empList.add(45); // error becoz 45 is Integer not employee
		
		List<Animal> animalList = new ArrayList<>();
		animalList.add(new Dog());
		animalList.add(new Cat(4,6f));
		//animalList.add(new SuperAnimal()); // error becoz only Animal and Animal child are allowed
		animalList.add(new Animal());
		animalList.remove(1);
		
		
		for (Animal a : animalList) {
			a.doFeed(45); // call business methods
			
			if(a instanceof Dog)
			{
				 // whole code for dog
			}
		}
		
		Iterator<Animal> itr = animalList.iterator();
		
		while(itr.hasNext())
		{
			Animal x = itr.next();
			// business operations over {x}
		}
		
		
			
	}
	
	
	
	
	public void doIterateList(List list) {
		// approach 1
		System.out.println(" ----------- apporach 1 ------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// approach 2
		System.out.println(" ----------- apporach 2 ------------");
		for (Object object : list) {
			System.out.println(object);
		}

		// appraoch 3 using Iterator( it is the Interface in collection)
		System.out.println(" ----------- apporach 3 ------------");
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Object element = itr.next();
			// we can call any business method over that object
			System.out.println(element);
			if(element instanceof Dog)
			{
				Dog d = (Dog)element;
				d.doPlayGames();
			}
						
		}
		

	}

}//end class





















