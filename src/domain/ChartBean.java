package domain;

public class ChartBean {
	private String chartId, treatId, docId, patId, chartContents, chartImg;
	
	public void setChatId(String chartId){
		this.chartId = chartId;
	}
	public String getChartId(){
		return chartId;
	}
	public void setTreatId(String treatId){
		this.treatId = treatId;
	}
	public String getTreatId(){
		return treatId;
	}
	public void setDocId(String docId){
		this.docId = docId;
	}
	public String getDocId(){
		return docId;
	}
	public void setPatId(String patId){
		this.patId = patId;
	}
	public String getPatId(){
		return patId;
	}
	public void setChartContents(String chartContents){
		this.chartContents = chartContents;
	}
	public String getChartContents(){
		return chartContents;
	}
	public void setChartImg(String chartImg){
		this.chartImg = chartImg;
	}
	public String getChartImg(){
		return chartImg;
	}
}
