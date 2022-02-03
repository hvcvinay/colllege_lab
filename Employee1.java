 class Employee {
    int id;
    String name;
    float salary;
    void get(int i,String n,float s){
        id=i;
        name=n;
        salary=s;
    }
    void put(){
    System.out.println("Employee id is:-"+id+"\n"+"Name is :-"+name+" "+salary); 
    }
  
}

class Employee1{
      public static void main(String args[]){
    Employee e1 = new Employee();
    e1.get(01,"priyesh",150000f);
    e1.put();
}
}

