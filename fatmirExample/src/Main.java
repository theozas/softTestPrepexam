public class Main {
    public static void main(String[] args) {

        R8 r8 = new R8(

                "Black",
                2020,
                (float) 201.1,
                "R8",
                "Fatmir",
                (float)123.1,
                "V10",
                2000,
                (float) 213.1);

        System.out.println("Car Colour : " + r8.getColour());

        System.out.println("Car Year : " + r8.getYear());

        System.out.println("Car Top Speed : " + r8.getTopSpeed());

        System.out.println("Car Make : " + r8.getMake());

        System.out.println("Car Owner : " + r8.getOwner());

        System.out.println("Car cost : " + r8.getCost());

        System.out.println("Car KM : " + r8.getKm());

        System.out.println("Car Engine : " + r8.getEngine());

        System.out.println("Car light cost : " + r8.getLightcost());




    }

}
