public class petDetailsController extends petDetails {
   
    public void pet(String name, String type, String breed, int age, String ownerName){
        petName = name;
        petType = type;
        petBreed = breed;
        petAge = age;
        petOwnerName = ownerName;
    }

    public String getPetName(){
        return petName;
    }

    public void setPetName(String name){
        petName = name;
    }

    public String getPetType(){
        return petType;
    }

    public void setPetType(String type){
        petType = type;
    }

    public String getPetBreed(){
        return petBreed;
    }

    public void setPetBreed(String breed){
        petBreed = breed;
    }

    public int getPetAge(){
        return petAge;
    }

    public void setPetAge(int age){
        petAge = age;
    }

    public String getPetOwnerName(){
        return petName;
    }

    public void setPetOwnerName(String ownerName){
        petOwnerName = ownerName;
    }

    // NEEDS DATABSE WORK

}
