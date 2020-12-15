package entities;

public class MyRectangle {

  public MyRectangle() {
    super();
  }

  private double width;
  private double height;

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double area() {
    return width * height;
  }

  public double perimeter(){
    return 2 * (width + height);
  }

  public double diagonal(){
    double hypotenuse = (Math.pow(width, 2)) + (Math.pow(height, 2));
    return Math.sqrt(hypotenuse);
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

