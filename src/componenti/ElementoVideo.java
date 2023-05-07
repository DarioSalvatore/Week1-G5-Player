package componenti;

public class ElementoVideo extends ElementoAudio implements Playable, Lightness {
	private int lightness;
	
	public ElementoVideo(String titolo, int durata, int volume, int lightness) {
		super(titolo, durata, volume);
		this.lightness = lightness;
	}
	
	@Override
	public int getLightness() {
		return lightness;
	}
	
	@Override
	public void setLightness(int lightness) {
		this.lightness = lightness;
	}
	
	@Override
	public void aumentaLuminosita() {
		this.lightness = lightness++;
	}
	
	@Override
	public void decrementaLuminosita() {
		this.lightness = lightness--;
	}
	
	@Override
	public void play() {
		for(int i = 0; i <getDurata(); i++) {
			String segnoEsclamativo = new String(new char[getVolume()]).replace("\0", "!");
			String segnoAsterisco = new String(new char[lightness]).replace("\0", "*");
			System.out.println(getTitolo() + " " + segnoEsclamativo + " " + segnoAsterisco);
		}
	}
}
