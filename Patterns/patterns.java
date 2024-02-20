
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
        System.out.println("Pattern 4 from questions");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
    public void pattern5(){
        System.out.println("Pattern 5 from questions");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void pattern6(){
        System.out.println("Pattern 6 from questions");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public void pattern7(){
        int space = 4;
        int star = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int j=0;j<i-1;j++){
                System.out.print("*");
            }
            space--;
            star++;
            System.out.println("");
        }

    }

    public void pattern8(){
        int leftSpace = 0;
        int rightSpace = 0;
        int star = 9;
        for(int i=1;i<=5;i++){
            for(int j=0;j<leftSpace;j++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int j=0;j<rightSpace;j++){
                System.out.print(" ");
            }
            leftSpace++;
            rightSpace++;
            star-=2;
            System.out.println("");
        }

    } 

    public void pattern9(){
        pattern7();
        pattern8();
    }
    public void pattern10(){
        int space = 4;
        int star =1;
        boolean isReachedHalf = false;
        for(int i=0;i<9;i++){
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            if(star==5){
                isReachedHalf=true;

            }
            if(isReachedHalf){
                star--;
                space++;
            } else {
                star++;
                space--;
            }
            System.out.println("");
        }
        
    }
    public static void main(String args[]){
        System.out.println("Patterns: ");
        String question = "https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/";
        patterns pattern =  new patterns();
        pattern.pattern10();
    }
}