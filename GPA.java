import java.util.Scanner;
class GPA{
    public static void main(String args[]){
        System.out.println("MUET GPA CALCULATOR");
        Scanner input = new Scanner(System.in);
        double subNum ,subNum2, marks=0;
        double gpa, tch, ch=0, credit=0,Tqp=0, Pqp=0,tqp=0, pqp=0, qualityPoints=0, qp=0, A1=4.0, A=3.5, B1=3.0, B=2.5, C1=2.0, C=1.0;
        String subject, grade;
        System.out.println("=================================\n");
        System.out.print("Enter the number of Theory subjects: ");
        subNum = input.nextDouble();
        System.out.println("=================================\n");
        System.out.println("Enter Data: \n");
        for(int i=1; i<=subNum; i++){
            System.out.print("Subject " + i + "=> ");
            subject = input.next();
            System.out.print("Credit hours: ");
            ch = input.nextDouble();
            System.out.print("Your Grade: ");
            grade = input.next();
            if(grade.equals("A+") ){
                tqp = ch*A1;
            }
            else if(grade.equals("A")){
                tqp = ch*A;
            }
            
            else if(grade.equals("B+")){
                tqp = ch*B1;
            }

            else if(grade.equals("B")){
                tqp = ch*B;
            }

            else if(grade.equals("C+")){
                tqp = ch*C1;
            }

            else if(grade.equals("C")){
                tqp = ch*C;
            }
            Tqp = Tqp + tqp;
            credit = credit+ch;
            System.out.println("");
            
        }
        System.out.print("Enter the number of Practicals: ");
        subNum2 = input.nextDouble();
        System.out.println("=================================\n");
        System.out.println("Enter Data: \n");
        for(int i=1; i<=subNum2; i++){
            System.out.print("Subject " + i + "=> ");
            subject = input.next();
            System.out.print("Your Grade: ");
            grade = input.next();
            if(grade.equals("A+")){
                pqp = A1;
            }
            else if(grade.equals("A")){
                pqp = A;
            }
            
            else if(grade.equals("B+")){
                pqp = B1;
            }

            else if(grade.equals("B")){
                pqp = B;
            }

            else if(grade.equals("C+")){
                pqp = C1;
            }

            else if(grade.equals("C")){
                pqp = C;
            }
            Pqp = Pqp + pqp;
            System.out.println("");
            
        }
        tch = credit+subNum2;
        qualityPoints = Pqp+Tqp;
        gpa = qualityPoints/tch;
        System.out.println("The total credit hours for this semester are: " +(tch));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Your total Quality Points for this semester are: " +qualityPoints);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Your GPA is: " +gpa);
        
        
    }
}