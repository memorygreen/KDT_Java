package self240126;

public class SongDTO {

	
	private String title = ""; 
	private String singer = ""; 
	private String path = ""; 
	
	
	// getter method
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public String getPath() {
		return path;
	}
	
	
	// 생성자
	public SongDTO(String singer, String title, String path) {
		this.singer = singer;
		this.title = title;
		this.path = path;
	}	
	
	
}
