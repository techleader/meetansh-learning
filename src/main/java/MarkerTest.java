public class MarkerTest {

    public static void main(String[] args) {

        Marker m1= new Marker();
        m1.draw("--------------------------");
        Marker m2= new Marker("RED");
        m2.draw("--------------------------");

    }


}

class Marker {

    private String color;

    public Marker(){
        color = "BLUE";
    }

    public Marker(String c){
        this.color = c;
    }

    public void draw(String message){
        System.out.println("Drawing :" + message  + " ;in color: " + color);
    }

    @Override
    public String toString() {
        return "Marker{" +
                "color='" + color + '\'' +
                '}';
    }
}

