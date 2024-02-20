
public class patterns{
    public void pattern1(){
        System.out.println("Pattern 1 from questions");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void pattern2(){
        System.out.println("Pattern 2 from questions");
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void pattern3(){
        System.out.println("Pattern 3 from questions");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    public void pattern4(){
        System.out.println("Pattern 3 from questions");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    } 
    public static void main(String args[]){
        System.out.println("Patterns: ");
        String question = "https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/";
        patterns pattern =  new patterns();
        pattern.pattern4();
    }
}