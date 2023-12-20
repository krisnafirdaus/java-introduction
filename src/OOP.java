public class OOP {
     static class Hewan {
         void Suara(){
            System.out.println("Suara Terntentu");
        }
    }

   static class Anjing extends Hewan {
        @Override
         void Suara(){
            System.out.println("Wikwikwik");
        }
    }

    public static void main(String[] args) {
        Hewan anjingSaya = new Anjing();
        anjingSaya.Suara();
    }
}
