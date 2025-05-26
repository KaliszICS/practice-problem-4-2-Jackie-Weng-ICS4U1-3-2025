/** Jackie Weng **/
/**  Problem Set 4-2 **/
/**  J.Kalisz **/

//**  creates a "dog" with paramters such as its weight, name, and breed. also with getters and setters **/
//* @param breed of the dog */
//* @param Name of the dog */
//* @param weight of the dog */

class Dog{
private int weight;
private String name;
private String breed;

public Dog(String name, String breed, int weight){
    this.name = name;
    this.breed = breed;
    this.weight = weight;
}

//* gets name of the pooch */
//* @return return name of pooch as string */
public String getName(){
    return this.name;
}

//* gets breed of the pooch */
//* @return return breed of pooch as string */
public String getBreed(){
    return this.breed;
}

//* gets weight of the pooch */
//* @return return weight of pooch as string */
public int getWeight(){
    return this.weight;
}


//* set name to provided string */
//* @param the name that the current name is replaced with*/
public void setName(String name) {
    this.name = name;
}


//* set breed to provided string */
//* @param the breed that the current breed is replaced with*/

public void setBreed(String breed){
    this.breed = breed;
}

//* almost the exact same thing */
//* set weight to provided string */
//* @param the weight that the current weight is replaced with*/
public void setWeight(int weight){
    this.weight = weight;
}

}