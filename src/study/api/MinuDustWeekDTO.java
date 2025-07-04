package study.api;

public class MinuDustWeekDTO {

	int totalCount;
	String frcstOneCn;
	String frcstTwoCn;
	
	String presnatnDt;
	
	String frcstOneDt;
	String frcstTwoDt;
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public String getFrcstOneCn() {
		return frcstOneCn;
	}
	public void setFrcstOneCn(String frcstOneCn) {
		this.frcstOneCn = frcstOneCn;
	}
	public String getFrcstTwoCn() {
		return frcstTwoCn;
	}
	public void setFrcstTwoCn(String frcstTwoCn) {
		this.frcstTwoCn = frcstTwoCn;
	}
	public String getFrcstOneDt() {
		return frcstOneDt;
	}
	public void setFrcstOneDt(String frcstOneDt) {
		this.frcstOneDt = frcstOneDt;
	}
	public String getFrcstTwoDt() {
		return frcstTwoDt;
	}
	public void setFrcstTwoDt(String frcstTwoDt) {
		this.frcstTwoDt = frcstTwoDt;
	}
	public String getPresnatnDt() {
		return presnatnDt;
	}
	public void setPresnatnDt(String presnatnDt) {
		this.presnatnDt = presnatnDt;
	}
	@Override
	public String toString() {
		return "MinuDustWeekDTO [totalCount=" + totalCount + ", frcstOneCn=" + frcstOneCn + ", frcstTwoCn=" + frcstTwoCn
				+ ", frcstOneDt=" + frcstOneDt + ", frcstTwoDt=" + frcstTwoDt + ", presnatnDt=" + presnatnDt + "]";
	}
	
	
	
	
}
