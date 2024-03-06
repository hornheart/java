
public class Music {
	
	private String artist;
	private String titlel;
	
	public Music () {
		super();
	}
	@Override
	public String toString() {
		return "Music [artist=" + artist + ", titlel=" + titlel + "]";
	}
	public Music(String artist, String titlel) {
		super();
		this.artist = artist;
		this.titlel = titlel;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitlel() {
		return titlel;
	}
	public void setTitlel(String titlel) {
		this.titlel = titlel;
	}
	
	

}
