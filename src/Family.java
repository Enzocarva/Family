public class Family {
//======================================================================================================================
    private final int  MAX_FAMILY_SIZE = 10;
//----------------------------------------------------------------------------------------------------------------------
    private int familySize;
    private Person[] Family;
    private int index;
//----------------------------------------------------------------------------------------------------------------------
    public Family() {

        Family = new Person[MAX_FAMILY_SIZE];
        familySize = 0;
    }
//----------------------------------------------------------------------------------------------------------------------
    public void display() {

        for (index = 0; index < familySize; index++) {
            System.out.printf("%s is %d years old\n", Family[index].getNameOfPerson(), Family[index].getAgeOfPerson());
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    public boolean addPerson(String name, int age) {

        boolean MaxPeople = true;

        if (familySize >= MAX_FAMILY_SIZE) {
            MaxPeople = false;
        }

        Family[familySize] = new Person(name, age);
        familySize++;

        return(MaxPeople);
    }
//----------------------------------------------------------------------------------------------------------------------
    public void birthday(String nameOfPerson) {

        for (index = 0; index < familySize; index++) {
            if (Family[index].getNameOfPerson().equalsIgnoreCase(nameOfPerson)) {
                Family[index].setAgeOfPerson();
            }
        }

    }
//----------------------------------------------------------------------------------------------------------------------
    public int getNumberOfPeople() {

        return(familySize);
    }
//----------------------------------------------------------------------------------------------------------------------
    public int getTotalAge() {

        int sum = 0;

        for (index = 0; index < familySize; index++) {
            sum += Family[index].getAgeOfPerson();
        }
        return(sum);
    }
//----------------------------------------------------------------------------------------------------------------------
}
//======================================================================================================================
