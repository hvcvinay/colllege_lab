class a {
    int id;
    String name;
    public void get(int id,String name){
    System.out.println("roll no is :-"+id+"\n"+"Name is :-"+name); 
    }
}
class clg{
public static void main(String args[]){
a a1 = new a();
a1.get(1,"vinay");
}
}