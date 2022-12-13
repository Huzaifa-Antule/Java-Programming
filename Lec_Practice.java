import java.util.Scanner;

class Lec_Practice {
    public static void main(String args[]) {
        Scanner Num = new Scanner(System.in);

        System.out.print("What do you want to run :\n1 - Area of Rectangle.\n2 - Area of Circle.\n3 - Area of Triangle.\n4 - Students Marks & Percentage.\n Enter The Number Only : ");
        int User_Inp = Num.nextInt();
        
        if(User_Inp == 1){
            // Area of rectangle.
            
            System.out.print("Enter Length of Rectangle : ");
            float Length = Num.nextFloat();
            System.out.print("Enter Length of width : ");
            float Width = Num.nextFloat();
            float Area = Length * Width;
            System.out.print("Area of Rectangle is : "+Area);
        }
        else if(User_Inp==2){
             // Area of circle.
        
            System.out.print("Enter The Length of Radius : ");
            float Radius = Num.nextFloat();
            float Pi = 3.141592653f;
            float Area = Pi * (Radius*Radius);
            System.out.print("Area of Circle is : "+Area);

        }
        else if(User_Inp==3){
            // Area of Triangle.
        
            System.out.print("Enter The Base: ");
            float Base = Num.nextFloat();
            System.out.print("Enter The Height: ");
            float Height = Num.nextFloat();
            float Area = (Base * Height)/2;
            System.out.print("Area of Triangle is : "+Area);
        }
        else if(User_Inp==4){

            // Students Marks & Percentage.
            
            Scanner Marks = new Scanner(System.in);

            System.out.print("Enter Science Marks : ");
            float Science = Num.nextFloat();
            System.out.print("Enter Maths Marks : ");
            float Maths = Num.nextFloat();
            System.out.print("Enter Geography Marks : ");
            float Geography = Num.nextFloat();
            System.out.print("Enter History Marks : ");
            float History = Num.nextFloat();
            System.out.print("Enter English Marks : ");
            float English = Num.nextFloat();
            
            float total = Science + Maths + Geography + History + English ; // Total
            float Percentage = (float)((total/500.0) * 100);  // Percentage formula
            
            System.out.println("Total Marks are : "+total+" / 500.0");  
            System.out.print("Your Percentage is : "+Percentage+" %");
        }
        else{
            System.out.print("Wrooong Input, try again.");
            
        }

        
    }
}