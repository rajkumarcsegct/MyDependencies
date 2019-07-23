public abstract class Animal {
  public abstract void Speak();
}

public class Cat: Animal {
  public override void Speak() {
     Console.WriteLine("Meow");
  }
}

public class Dog: Animal {
  public override void Speak() {
     Console.WriteLine("Woof");
  }
}

public class Training {
  public void TrainCatToSpeak(Cat aCat) {
     aCat.Speak();
  }

  public void TrainDogToSpeak(Dog aDog) {
     aDog.Speak();
  }
}

/////////////////////////////////////////////////

public class Training {
  public void TrainAnimalToSpeak(Animal anAnimal) {
     anAnimal.Speak();
  }
}

