public class regPentagon{
  private double sideA, perimeter, area;
  public regPentagon(double sideLel){
    sideA = sideLel;
  }
  public String getArea(){
    area = 5*(((Math.pow(3, 0.5)*sideA*sideA)/4));
    return ("The area of your triangle is "+area);
  }
  public String getPerimeter(){
    perimeter = 5*sideA;
    return ("The perimeter of your triangle is "+perimeter);
  }
}