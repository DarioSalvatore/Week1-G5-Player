package componenti;

public class ElementoAudio extends ElementoMultimediale implements Playable {
	
	private int volume;
	
	private int durata;
	
	public ElementoAudio(String titolo, int durata, int volume) {
		setTitolo(titolo);
		this.durata = durata;
		this.volume = volume;
	}
		
	public int getVolume() {
			return volume;
		}
		
	public void setVolume(int volume2) {
			this.volume = volume2;
		}
		
	public void abbassaVolume() {
			this.volume = volume--;
		}
	
	public void aumentaVolume() {
		this.volume = volume++;
	}
		
	@Override
	public int getDurata() {
		return durata;
	}
	
	@Override
	public void setDurata(int durata) {
		this.durata = durata;
	
	}
	
	@Override
	public void play() {
		for (int i = 0; i < durata; i++) {
			String segnoEsclamativo = new String(new char[volume]).replace("\0", "!");
			System.out.println(getTitolo()+ " " + segnoEsclamativo);
		}
	}	
}
