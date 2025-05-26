class Dog{
private int weight;
private String name;
private String breed;

public Dog(String name, String breed, int weight){
    this.name = name;
    this.breed = breed;
    this.weight = weight;
}

public String getName(){
    return this.name;
}

public String getBreed(){
    return this.breed;
}

public int getWeight(){
    return this.weight;
}


public void setName(String name) {
    this.name = name;
}

public void setBreed(String breed){
    this.breed = breed;
}

public void setWeight(int weight){
    this.weight = weight;
}

}