public class EnumEx{
    
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public static and final
        // since its final you can create child enums
        // type is Week

        Week(){
            System.out.println("Const called for " + this);
        }
        //this is not public or protected, only private or default
        // why? -> Because we dont want to allow creation of new objects 
        // this is not the enum concept, that's why 

        // Internally: public static final Week Monday = new Week(); 
    }
    

    public static void main(String[] args){
        for(Week day : Week.values()){
            System.out.println(day);
        }

        Week day = Week.Sunday;
        System.out.println("Today is " + day);
        System.out.println(day.ordinal());
        System.out.println(Week.valueOf("Friday")); // -> Returns the enum constant
    }
}