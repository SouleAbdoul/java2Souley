public class Person {
    private int ssn;
    protected String firsName = "";
    protected String lastName = "";
    protected byte age;
    private int count;
    public Person(){
        this.count++;
    };
    public Person(String firsName,String lastName){
        this.firsName = firsName;
        this.lastName = lastName;
        this.count++;
    }
    public Person(String firsName,String lastName,byte age,int ssn){
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.count++;
    }

    public String speak(){
        if(this.firsName.isEmpty() && this.lastName.isEmpty()){
            return "I don't have a name";

        }else if(this.age == 0){
            return "My name is "+ " " + this.firsName + " " + this.lastName + ".";
        }else{
            return "My name is " + " " + this.firsName + " " + this.lastName+ " " + "and i am " + " " + this.age + " " + "years" + " " + "old";
        }
    }



    public  int getPersonCount(){
        return this.count;
    }

    @Override
    public String toString() {
        if(this.firsName.isEmpty() && this.lastName.isEmpty()){
            return "N/A";
        }else if(this.ssn > 0){

            return firsName + " " + lastName + " " + String.valueOf(this.ssn).substring(5);
        }
        return "";
    }
}
