// This is a started code snipet for the notebook 03-Creating_a_Class. 
// To complete it, follow the notebook step by step!

public class Triangle {
    // create instance variables 
    double base; 
    double height; 
    double sideLenOne; 
    double sideLenTwo; 
    double sideLenThree;

    // add constructor and inputs
    public Triangle(double base, double height, 
                    double sideLenOne, double sideLenTwo,
                    double sideLenThree) {

        // access attributes
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    // Add another method
    public double findArea() {
        return (this.base * this.height)/2 ;
    }

}