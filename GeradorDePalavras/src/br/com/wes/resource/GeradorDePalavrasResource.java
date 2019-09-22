package br.com.wes.resource;

import java.util.ArrayList;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.wes.model.Theme;
import br.com.wes.model.Word;

@Path("/palavra")
public class GeradorDePalavrasResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Word gerarPalavra() {
		ArrayList<Theme> bancoDePalavras = gerarBancoDePalavras();
		
		Random random = new Random();
		int temaIndex = random.nextInt(bancoDePalavras.size());
		int palavraIndex = random.nextInt(bancoDePalavras.get(temaIndex).getWords().length);
		
		Word palavra = new Word();
		palavra.setTheme(bancoDePalavras.get(temaIndex).getTheme());
		palavra.setWord(bancoDePalavras.get(temaIndex).getWords()[palavraIndex]);
		
		return palavra;
	}
	
	private ArrayList<Theme> gerarBancoDePalavras() {
		ArrayList<Theme> bancoDePalavras = new ArrayList<>();
		bancoDePalavras.add(new Theme("Academia",
				new String[] {"Halteres","Barra"}));
		bancoDePalavras.add(new Theme("Acampamento",
				new String[] {"Barraca","Fogueira","Lenha"}));
		bancoDePalavras.add(new Theme("Aeroporto",
				new String[] {"Avi�o","Embarque","Decolagem","Pouso"}));
		bancoDePalavras.add(new Theme("Animais",
				new String[] {"abelha","abutre","�caro","�guia","albatroz","alce","alpaca","andorinha","anta","ant�lope","aranha","arara","asno","avestruz","babu�no","baleia","barata","besouro","bezerro","bicho da seda","bis�o","bode","boi","borboleta","boto","b�falo","burro","cabra","cachorro","c�gado","camale�o","camar�o","camelo","camundongo","canguru","capivara","caracol","caranguejo","carneiro","carrapato","castor","cavalo","cavalo marinho","cegonha","centopeia","chimpanz�","chinchila","cigarra","cisne","coala","cobra","codorna","coelho","coiote","coruja","corvo","crocodilo","cupim","diabo da tasm�nia","dinossauro","dod�","doninha","drag�o de komodo","dromed�rio","�gua","elefante","ema","enguia","escaravelho","escorpi�o","esquilo","estrela do mar","fais�o","falc�o","flamingo","foca","formiga","fuinha","fur�o","gafanhoto","gaivota","galinha","galo","gamb�","ganso","gar�a","gato","gavi�o","gazela","girafa","girino","gnu","golfinho","gorila","gralha","grifo","grilo","guar�","guaxinim","hamster","harpia","hiena","hipop�tamo","iguana","jabuti","jacar�","jacu","jaguar","jamanta","javali","jegue","joaninha","jumento","koala","lacraia","lagarta","lagartixa","lagarto","lagosta","lampreia","le�o","le�o marinho","lebre","l�mure","leopardo","lesma","lhama","lib�lula","lince","lobo","lontra","lula","macaco","mamute","marimbondo","mariposa","marreco","mexilh�o","mico le�o dourado","minhoca","morcego","moreia","morsa","mosca","mosquito","mula","on�a","orangotango","ornitorrinco","ostra","ouri�o","ouri�o do mar","ovelha","panda","pantera","papagaio","pardal","p�ssaro","pato","pav�o","peixe","peixe boi","pelicano","percevejo","perereca","periquito","pernilongo","peru","pica pau","pinguim","piranha","polvo","pombo","p�nei","porco","porco espinho","porquinho da �ndia","pre�","pregui�a","pulga","quati","quero quero","r�","raia","raposa","ratazana","rato","rena","rinoceronte","sagui","salamandra","sanguessuga","sapo","serpente","siri","suricate","tamandu�","tartaruga","tatu","tatu�","texugo","tigre","toupeira","touro","trit�o","tubar�o","tucano","unic�rnio","urso","urubu","vaca","vaga lume","veado","vespa","zang�o","zebra"}));
		bancoDePalavras.add(new Theme("Banheiro",
				new String[] {"Pasta de dente","Escova de dente","Chuveiro","Vaso sanit�rio","Pia","Sabonete","Fio dental"}));
		bancoDePalavras.add(new Theme("Cal�ados",
				new String[] {"T�nis","Chinelo","Sapato social","Tamanco","Rasteirinha","Sand�lia"}));
		bancoDePalavras.add(new Theme("Circo",
				new String[] {"Palha�o","Animais","Trapezista","Trap�zio","M�gica","Palha�ada","Picadeiro","Plat�ia"}));
		bancoDePalavras.add(new Theme("Cores",
				new String[] {"Amarelo","Anil","Azul","Bege","Bord�","Branco","C�qui","Carmesim","Castanho","Ciano","Cinza","Dourado","Escarlate","Esmeralda","F�csia","�ndigo","Laranja","Lil�s","Magenta","Marrom","Prata","Preto","P�rpura","Rosa","Roxo","Rubro","Turquesa","Verde","Vermelho","Vinho","Violeta"}));
		bancoDePalavras.add(new Theme("Cozinha",
				new String[] {"Fog�o","Geladeira","Microondas","Arm�rio","Pratos","Talheres","Panelas"}));
		bancoDePalavras.add(new Theme("Esportes",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("Filmes",new String[] {"a","b"}));
		bancoDePalavras.add(new Theme("Frutas",new String[] {"Abacate","Abacaxi","A�a�","Acerola","Ameixa","Am�ndoa","Amora","Anan�s","Atemoia","Avel�","Banana","Bergamota","Cacau","Caj�","Caju","Carambola","Cereja","Ciriguela","Coco","Cranberry","Cupua�u","Damasco","Figo","Framboesa","Fruta do conde","Fruta p�o","Goiaba","Graviola","Groselha","Guaran�","Jabuticaba","Jaca","Jatob�","Jenipapo","Kiwi","Laranja","Lim�o","Lima","Lichia","Ma��","Macad�mia","Mam�o","Manga","Maracuj�","Marmelo","Melancia","Mel�o","Mexerica","Mirtilo","Morango","Nectarina","Pera","P�ssego","Pitanga","Pinha","Pitaia","Pitomba","Pistache","Rom�","Tangerina","Tamarindo","Toranja","Tucum�","Uva"}));
		bancoDePalavras.add(new Theme("Games",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("G�neros Musicais",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("Hospital",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("Instrumentos Musicais",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("Pa�ses",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("Praia",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("Profiss�es",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("Roupas",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("Sala de Aula",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("S�ries de TV",new String[] {"c","d"}));
		
		return bancoDePalavras;
	}

}
