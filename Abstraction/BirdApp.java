package Abstraction;

public class BirdApp {
public static void main(String[] args) {
	Sky sky = new Sky();
	GoldenEagle goldenEagle=new GoldenEagle();
	sky.getInstance(goldenEagle);
	MountainEagle mountainEagle= new MountainEagle();
	sky.getInstance(mountainEagle);
	SerpantEagle serpantEagle= new SerpantEagle();
	sky.getInstance(serpantEagle);
	VegSparrow vegSparrow =new VegSparrow();
	sky.getInstance(vegSparrow);
	NonVegSparrow nonVegSparrow= new NonVegSparrow();
	sky.getInstance(nonVegSparrow);
	}
}
