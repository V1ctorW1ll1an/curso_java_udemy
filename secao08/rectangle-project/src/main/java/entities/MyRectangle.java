package entities;

public class MyRectangle {

  public MyRectangle() {
    super();
  }

  public double width;
  public double height;

  public double area() {

    return 10.0;
  }

  public double perimeter(){

    return 10.0;
  }

  public double diagonal(){
    
    return 10.0;
  }

  public String toString(){
    return "Area = "+
      String.format("%.2f", area()) +
      "\nPerimeter = "+
      String.format("%.2f", perimeter()) +
      "\nDiagonal = " + 
      String.format("%.2f", diagonal());
  }
}

