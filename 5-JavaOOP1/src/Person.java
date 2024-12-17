public class Person {

    private String firstName;
    private String lastName;
    private int age;

    //Get fields values
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    //Set fields values
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if( age<0 || age>100){
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen(){
        if( getAge() > 12 && getAge() < 20){
            return true;
        }else {
            return false;
        }
    }
    public String getFullName(){
        String name1 = getFirstName();
        String name2 = getLastName();
        String fullName;

        if( name1.isEmpty() ){
            if(name2.isEmpty()){
                return "";
            }else {
                return fullName = name2;
            }
        }else {
            return fullName = name1 +" "+ name2;
        }
    }

}
