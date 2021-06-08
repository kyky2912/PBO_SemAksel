package main.updated.pertemuan4;

import java.util.Scanner;
import java.lang.Math;
public class App extends Calculations {
    

    
  public App (){
  }

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    boolean restart = false;
   
    //Sajikan fitur (Tugas 3 = do->while)
    do{
      System.out.println("What 3D Shape would you like to try?");
      System.out.println("(1).Cone \n(2).RectangualrPrism \n(3).Sphere \n(4).Cylinder");
    }
    //User Input
    while (restart);{
      while (!scan.hasNextInt()){
          System.out.println("Please enter a valid number");
          scan.next();}
      int Shape = scan.nextInt();
      switch(Shape){
      

      //Tugas 4 (Tugas 2 + 3 Bangun Ruang = Total jumlah 4 Bangun Ruang)
      //Cone (Kerucut) (Tugas 2 = 1 Bangun Ruang)
      case 1:
      System.out.println("Enter the radius and height of the cone");
      int coneRadius = scan.nextInt();
      int coneHeight = scan.nextInt();
      App cone = new App();
      cone.coneCalcs(coneRadius,coneHeight);
      break;
      
      //Prism (Prisma)
      case 2:
      System.out.println("Enter the length, width and height of the rectangular prism");
      int RPLength = scan.nextInt();
      int RPWidth = scan.nextInt();
      int RPHeight = scan.nextInt();
      App rectangularPrism = new App();
      rectangularPrism.rectangularPrismCalcs(RPLength,RPWidth,RPHeight);
      break;
      
      //Sphere (Bola)
      case 3:
      System.out.println("Enter the radius of the sphere");
      int sphereRadius = scan.nextInt();
      App sphere = new App();
      sphere.sphereCalcs(sphereRadius);
      break;
      
      //Cylinder (Silinder)
      case 4:
      System.out.println("Enter the radius and height of the cylinder");
      int cylinderHeight = scan.nextInt();
      int cylinderRadius = scan.nextInt();
      App cylinder = new App();
      cylinder.cylinderCalcs(cylinderHeight,cylinderRadius);
      break;
      
      default:
      System.out.println("Invalid Input");
    }
   System.out.println("Would you like to try again(yes/no)");
   String again = scan.next();
   if ("no".equalsIgnoreCase(again)){
       restart = false;           
   }
   
   }  
  }
}
