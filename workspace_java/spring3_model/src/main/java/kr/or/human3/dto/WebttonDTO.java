package kr.or.human3.dto;

import javax.print.event.PrintJobAttributeEvent;

public class WebttonDTO {
	private int number;
	private String img_link;
	private String title;
	private String author;
	private String explanation;
	
	public String getImg_link() {
		return img_link;
	}
	public void setImg_link(String img_link) {
		this.img_link = img_link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "WebttonDTO [number=" + number + ", img_link=" + img_link + ", title=" + title + ", author=" + author
				+ ", explanation=" + explanation + "]";
	}
	
	
	
}
