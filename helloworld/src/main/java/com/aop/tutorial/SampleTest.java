package com.aop.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.tutorial.beans.Devices;
import com.aop.tutorial.beans.Laptop;
import com.aop.tutorial.beans.Mobile;

public class SampleTest {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * Mobile mob = (Mobile)context.getBean("mobile"); mob.setName("Lenova");
		 * mob.getName();
		 */
		/*
		 * Laptop lap = (Laptop)context.getBean("laptop");
		 * System.out.println(lap.getName());
		 */
		//System.out.println("From git Repository....");
		Devices devices = context.getBean("devices",Devices.class);
		//devices.getMobile().setName("Manikandan...");
		System.out.println(devices.getMobile().getName());
		//devices.getLaptop().setName("IBM");
		devices.getLaptop().setMethod("Dhinesh");
	}

}
