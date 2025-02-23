package com.example.demo;

import com.example.poly.Animal;
import com.example.poly.cat;
import com.example.poly.dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Animal animal = new Animal();
		Animal animal1 = new cat();
		Animal animal2 = new dog();

		cat cat = new cat();
		dog dog = new dog();

		animal = animal1;

		Animal[] animals = new Animal[]{dog, cat};

		for(int i=0; i < animals.length; i++){
			animals[i].eat();
			dog temp = (dog) animals[i];
		}
	}

}
