package br.com.wes.model;

public class Word {
	private String theme;
	private String word;
	
	// Construtores
	public Word() {}
	
	public Word(String tema, String palavra) {
		setTheme(tema);
		setWord(palavra);
	}
	
	// Getters & Setters
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
}
