package sweat.like.pro.four;

public class MyDate {
	private String date;
	private String month;
	private String year;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyDate [date=" + date + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
}
