package  service;

// Create a class called PersonalityCalculator
class PersonalityCalculator{

    // PersonalityCalculator has two methods findAnswers and findYourBrainType
    public int[] findAnswers(String option){
        String a[]=options.split(",");
        int n=a.length();
       int c[]=new int[n];
       int sum=0,count=1;
       for(int i=0;i<=n-1;i++)
       {
           c[i]=Integer.parseInt(a[i]);
           count=count+i;
           System.out.println("The answer for question - "+count+" is "+c[i]+".");
       }
       
       return c;	
   }

    public String findYourBrainType(){
        Scanner s=new Scanner(System.in);
        String options=s.next();
        int[] arrint=new int[options.length()];
        int a=0;
        int b=0;   
       arrint =findAnswers(options);
       for(int i=0;i<options.length();i++){
            if ((i==0)||(i==1)||(i==2)||(i==4)||(i==7)||(i==9)
            ||(i==10)||(i==11)||(i==13)||(i==17)||(i==19)) {
                a=a+arrint[i];
            }
            else if((i==3)||(i==5)||(i==6)||(i==8)||(i==12)||(i==14)||(i==15)
            ||(i==16)||(i==18)){
                b=b+arrint[i];
            }
       }
       int x=66-a-b;
       if(x>=20 && x<=55){
           return "leftbrained";
       }
        if (x>=56 && x<=64) {
        return "No clear preference";

       } 
       if (x>=56 && x<=64) {
        return "rightbrained";

       } 
       else {
        return false;

       }
    }
}
// int[] findAnswers(String options) and String findYourBrainType(String options) is the method prototype
// findAnswer() accepts String as an argument and returns integer array as an output
// findYourBrainType accepts String as an argument and returns String as an output
// option is a string which contains all the options selected as a string
// Use the split method to segregate the options and store it in a string array.
// Convert the string array into an integer array.
// return the entire integer array to findyourBrainType
