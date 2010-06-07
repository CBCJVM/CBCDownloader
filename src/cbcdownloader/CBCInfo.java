package cbcdownloader;

public class CBCInfo {
	public static final String PROJECT_DIRECTORY = "/mnt/user/code";
	private IDownloader downloader = null;
	
	public CBCInfo(IDownloader downloader) {
		this.downloader = downloader;
	}
	
	public String[] getProgramList() throws CommunicationException {
		System.out.println("Fetching program list...");
		String stdout = downloader.executeStdOut("ls -1 " + PROJECT_DIRECTORY);
		return stdout.split("\n");
	}
}