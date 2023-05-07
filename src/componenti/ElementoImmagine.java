package componenti;

public class ElementoImmagine extends ElementoMultimediale implements Lightness {
	private int lightness;
	
	public ElementoImmagine(String titolo, int lightness) {
		setTitolo(titolo);
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
	
	public void show() {
		String segnoAsterisco = new String(new char[lightness]).replace("\0", "*");
		System.out.println(getTitolo() + " " + segnoAsterisco);
	}
}
