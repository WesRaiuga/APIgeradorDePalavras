package br.com.wes.model;

import java.util.List;

public class Theme {
	private String theme;
	private String[] words;
	
	// Construtores
	public Theme() {
		super();
	}
	public Theme(String theme, String[] words) {
		super();
		setTheme(theme);
		setWords(words);
	}
	
	// Getters & Setters
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String[] getWords() {
		return words;
	}
	public void setWords(String[] words) {
		this.words = words;
	}
}
