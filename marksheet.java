class marksheet{

    public static void main(String args[]){
        int sub1=80;
        int sub2=50;
        int sub3=40;
        int sub4=80;
    float sum=sub1+sub2+sub3+sub4;
    float average=float(sum)/4;
    boolean a=true;
   
        System.out.println(sum);
        System.out.println(average);
         if(average>34)
    {
         a=true;
        System.out.println("pass \n"+a);

    }
    else{
       a=false;
        System.out.println("fail \n"+a);

    }
    


    }
}