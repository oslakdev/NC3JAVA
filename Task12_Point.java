

public class Task12_Point {

    

    private double x;
    private double y;
   
    public Task12_Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
   
    
    public void scale() {
        this.x = this.x / 2;
        this.y = this.y / 2;
    }

public static void main(String[] args) {
        Task12_Point p = new Task12_Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
}      

}






