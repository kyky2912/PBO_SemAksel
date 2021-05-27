package main.tugaspertemuan2;
import java.text.DecimalFormat;


public class Calculations {
    DecimalFormat formatting = new DecimalFormat("#.0");
    float surfaceArea,Volume;
    
    public void rectangularPrismCalcs(int length,int width,int height){
        surfaceArea = 2*length*width + 2*length*height + 2*height*width;
        Volume = length*width*height;
        System.out.println("The surface area is " + formatting.format(surfaceArea) + " and the volume is " + formatting.format(Volume) );
    }
        public void coneCalcs(int radius,int height){
        surfaceArea = (float) (Math.PI*radius*(radius+Math.sqrt(height*height+radius*radius)));
        Volume = (float) (Math.PI*radius*radius*height/3);
        System.out.println("The surface area is " +formatting.format (surfaceArea) + " and the volume is " + formatting.format(Volume) );
    }
      public void sphereCalcs(int radius){
        surfaceArea = (float) (4*Math.PI*radius*radius);
        Volume = (float) (4*Math.PI*Math.pow(radius, 3)/4);
        System.out.println("The surface area is " + formatting.format(surfaceArea) + " and the volume is " + formatting.format(Volume) );
    }
      public void cylinderCalcs(int radius, int height){
        surfaceArea = (float) (2*Math.PI*radius*(radius+height));
        Volume = (float) (Math.PI*radius*radius*height);
        System.out.println("The surface area is " + formatting.format(surfaceArea) + " and the volume is " + formatting.format(Volume) );
    }
}