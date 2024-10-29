package TCS_PRACTICE.Amar;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Movie[] movies = new Movie[4];
        for(int i=0;i<4;i++)
        {
            movies[i] = new Movie(input.next(), input.next(), input.next(), input.nextInt());
            input.nextLine();
        }

        String searchGenere = input.nextLine();
        input.close();
        Movie[] result = getMovieByGenre(movies, searchGenere);
        System.out.print(Arrays.toString(result));

        for(int i=0;i<result.length;i++)
        {
            if(result[i].getBudget()>800000){
                System.out.print(result[i].getMovieName()+": High Budget\n");
            }
            else {
                System.out.print(result[i].getMovieName()+": Low Budget\n");
            }
        }
    }

    private static Movie[] getMovieByGenre(Movie[] movies, String searchGenre) {
        Movie[] temp = new Movie[movies.length]; // Temporary array to store matching movies
        int count = 0;
        for (Movie movie : movies) {
            if (movie.getGenere().equalsIgnoreCase(searchGenre)) {
                temp[count++] = movie;
            }
        }
        Movie[] result = new Movie[count];
        System.arraycopy(temp, 0, result, 0, count);
        return result;
    }

}
