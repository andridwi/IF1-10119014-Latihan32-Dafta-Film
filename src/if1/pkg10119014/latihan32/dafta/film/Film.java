/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan32.dafta.film;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */
public class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println();
        System.out.println("Judul Film\t: ".concat(filmName));
        System.out.println("Genre Film\t: ".concat(filmGenre));
        System.out.println("Rating Film\t: "+ Double.toString(filmRating));
        System.out.println("Rating Film\t: "+ Integer.toString(filmDuration)+ "Duration Film\t: " + " Menit ");
    }
    
}
