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
		bancoDePalavras.add(new Theme("Esportes",new String[] {"Arco e Flecha","Artes Marciais","Atletismo","Automobilismo","Badminton","Basquete","Beisebol","Bilhar","Bocha","Bodyboard","Boliche","Boxe","Bumerangue","Ca�a","Ciclismo","Corrida","Esgrima","Esqui Aqu�tico","Frescobol","Frisbee","Futebol","Futebol Americano","Futev�lei","Gin�stica","Golf","Handebol","H�quei","Levantamento de Peso","Luta Livre","Mergulho","Montanhismo","Motociclismo","Nata��o","Navega��o","Paintball","Patina��o","Pesca","P�lo Aqu�tico","Remo","Rugby","Skate","Squash","Surf","Tchoukball","T�nis","T�nis de Mesa","Tourada","Triathlon","V�lei","Wakeboard"}));
		bancoDePalavras.add(new Theme("Filmes",new String[] {"O Poderoso Chef�o","O M�gico de Oz","Cidad�o Kane","Pulp Fiction Tempo de Viol�ncia","Casablanca","2001 Uma Odisseia no Espa�o","A Lista de Schindler","De Volta para o Futuro","Forrest Gump O Contador de Hist�rias","E o Vento Levou","O Sil�ncio dos Inocentes","Tubar�o","A Novi�a Rebelde","Cantando na Chuva","Clube dos Cinco","Blade Runner O Ca�ador de Andr�ides","Star Wars","Beleza Americana","Laranja Mec�nica","Curtindo a Vida Adoidado","O Iluminado","Clube da Luta","Psicose","Alien o 8 Passageiro","Toy Story","Matrix","Titanic","O Resgate do Soldado Ryan","Janela Indiscreta","Jurassic Park","Brilho Eterno de uma Mente sem Lembran�as","Batman O Cavaleiro das Trevas","O Fabuloso Destino de Amelie Poulain","O Rei Le�o","Avatar","Monty Python e o C�lice Sagrado","Gladiador","Um Corpo que Cai","O Segredo de Brokeback Mountain","Os Ca�a Fantasmas","O Senhor dos An�is","Duro de Matar","A Origem","Seven Os Sete Crimes Capitais","A Bela e a Fera","Quem Quer ser um Milion�rio","Amn�sia","Up Altas Aventuras","Contatos Imediatos do Terceiro Grau","O Franco Atirador","O Labirinto do Fauno"}));
		bancoDePalavras.add(new Theme("Frutas",new String[] {"Abacate","Abacaxi","A�a�","Acerola","Ameixa","Am�ndoa","Amora","Anan�s","Atemoia","Avel�","Banana","Bergamota","Cacau","Caj�","Caju","Carambola","Cereja","Ciriguela","Coco","Cranberry","Cupua�u","Damasco","Figo","Framboesa","Fruta do conde","Fruta p�o","Goiaba","Graviola","Groselha","Guaran�","Jabuticaba","Jaca","Jatob�","Jenipapo","Kiwi","Laranja","Lim�o","Lima","Lichia","Ma��","Macad�mia","Mam�o","Manga","Maracuj�","Marmelo","Melancia","Mel�o","Mexerica","Mirtilo","Morango","Nectarina","Pera","P�ssego","Pitanga","Pinha","Pitaia","Pitomba","Pistache","Rom�","Tangerina","Tamarindo","Toranja","Tucum�","Uva"}));
//		bancoDePalavras.add(new Theme("Games",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("G�neros Musicais",new String[] {"Rock","Folk","M�sica Eletr�nica","Jazz","Hip Hop","Rap","Reggae","Sertanejo","Samba","Pagode","Metal"}));
		bancoDePalavras.add(new Theme("Instrumentos Musicais",new String[] {"agog�","atabaque","bateria","baixo","bong�","castanhola","chocalho","cu�ca","flauta","gaita","guitarra","harpa","pandeiro","piano","reco reco","saxofone","surdo","tambor","tamborim","tant�","tri�ngulo","viola","viol�o","violino","violoncelo"}));
//		bancoDePalavras.add(new Theme("Pa�ses",new String[] {"c","d"}));
//		bancoDePalavras.add(new Theme("Praia",new String[] {"c","d"}));
//		bancoDePalavras.add(new Theme("Profiss�es",new String[] {"c","d"}));
//		bancoDePalavras.add(new Theme("Roupas",new String[] {"c","d"}));
//		bancoDePalavras.add(new Theme("Sala de Aula",new String[] {"c","d"}));
//		bancoDePalavras.add(new Theme("S�ries de TV",new String[] {"c","d"}));
		
		return bancoDePalavras;
	}

}
