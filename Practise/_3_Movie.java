class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie " + title + "...");
    }
}

public class _3_Movie {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        one.playIt();
        System.out.println();

        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        System.out.println();

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
        three.playIt();
        System.out.println();

        // test      
        boolean isPowerOn=true;
        boolean isFun = isPowerOn;
        System.out.println(isFun);
        
        // test     
        double ok=5/1;
        System.out.println(ok);
    }
}
