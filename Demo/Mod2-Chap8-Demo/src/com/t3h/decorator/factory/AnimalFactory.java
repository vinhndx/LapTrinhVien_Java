package com.t3h.decorator.factory;

public class AnimalFactory {

//	public static final String CAT = "cat";
//	public static final String DOG = "dog";
//	public static final String BIRD = "bird";
	
	public enum AnimalType {
		CAT, DOG, BIRD
	}
	
	private AnimalFactory(){
		
	}

	public static Animal getAnimal(AnimalType animalType) {
		if (animalType == null) {
			return null;
		}
		if (animalType.equals(AnimalType.CAT)) {
			return new Cat();

		} else if (animalType.equals(AnimalType.DOG)) {
			return new Dog();

		} else if (animalType.equals(AnimalType.BIRD)) {
			return new Bird();
		}

		return null;
	}
}