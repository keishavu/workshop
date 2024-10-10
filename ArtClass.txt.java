//Kean University
//Fall 2024
//Course: CPS*2231 - Computer Programming
//Author: Keisha Vu, Section 06 
//Unit 5 Assignment 
package fall2024;
//October 10 2024 
//Class will store characteristics of famous artworks 
public class ArtClass {
	//data fields 
	private String title; 
	private String artist;
	private String media;
	private int year;  
	private double price;

	//default constructors
	public ArtClass() {
		title = "unnamed";
		artist = "anonymous";
		media = "multimedia";
		year = 2024;
		price = 0.00;
	}
	//overloaded 
	public ArtClass(String newTitle, String newArtist, String newMedia, int newYear, double newPrice) {
		title = newTitle;
		artist = newArtist;
		media = newMedia;
		year = newYear;
		price = newPrice;
	}
	//getters and setters
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String newArtist) {
		artist = newArtist;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String newMedia) {
		media = naewMedia;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int newYear) {
		year = newYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	//string method
	
	public String toString() {
		return"[title:" + title + "| artist: " + artist + "| media: " + media + "| year: " +year +"| price: "+price+"]";
	}
public static void main(String[]args) {
	ArtClass a0 = new ArtClass();
	ArtClass a1 = new ArtClass("Mona Lisa","Leonardo da Vinci","Oil",1503,870000000);
	System.out.println(a0.toString());
	System.out.println(a1.toString());
}
	
}
