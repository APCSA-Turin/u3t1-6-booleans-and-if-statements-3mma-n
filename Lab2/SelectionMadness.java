package Lab2;

public class SelectionMadness {

    // no instance variables //
    
    public SelectionMadness() { }
  
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
        /* implement this method */
        int answer = (int) (Math.random() * 5) + 1;
        String str;
        if (answer == 1) {
            str = "Your future couldn't be brighter!";
        } else if (answer == 2) {
            str = "Good things will likely come your way.";
        } else if (answer == 3) {
            str = "Your luck seems neutral, the day is in your hands.";
        } else if (answer == 4) {
            str = "You may soon face more hardship than you expect.";
        } else {
            str = "Be cautious, your future looks grim...";
        }
        return str;
    }
  
    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
        /* implement this method */
        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        return greatest;
    }

    public boolean rightTriangle(int side1, int side2, int side3) {
        int hyp = largest(side1, side2, side3);
        int newSide1;
        int newSide2;
        if (hyp == side1) {
            newSide1 = side2;
            newSide2 = side3;
        } else if (hyp == side2) {
            newSide1 = side1;
            newSide2 = side3;
        } else {
            newSide1 = side1;
            newSide2 = side2;
        }
        if (hyp == Math.sqrt(Math.pow(newSide1, 2) + Math.pow(newSide2, 2))) {
            return true;
        }
        return false;
    }
}
  