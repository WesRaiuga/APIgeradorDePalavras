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
				new String[] {"Avião","Embarque","Decolagem","Pouso"}));
		bancoDePalavras.add(new Theme("Animais",
				new String[] {"abelha","abutre","ácaro","águia","albatroz","alce","alpaca","andorinha","anta","antílope","aranha","arara","asno","avestruz","babuíno","baleia","barata","besouro","bezerro","bicho da seda","bisão","bode","boi","borboleta","boto","búfalo","burro","cabra","cachorro","cágado","camaleão","camarão","camelo","camundongo","canguru","capivara","caracol","caranguejo","carneiro","carrapato","castor","cavalo","cavalo marinho","cegonha","centopeia","chimpanzé","chinchila","cigarra","cisne","coala","cobra","codorna","coelho","coiote","coruja","corvo","crocodilo","cupim","diabo da tasmânia","dinossauro","dodô","doninha","dragão de komodo","dromedário","égua","elefante","ema","enguia","escaravelho","escorpião","esquilo","estrela do mar","faisão","falcão","flamingo","foca","formiga","fuinha","furão","gafanhoto","gaivota","galinha","galo","gambá","ganso","garça","gato","gavião","gazela","girafa","girino","gnu","golfinho","gorila","gralha","grifo","grilo","guará","guaxinim","hamster","harpia","hiena","hipopótamo","iguana","jabuti","jacaré","jacu","jaguar","jamanta","javali","jegue","joaninha","jumento","koala","lacraia","lagarta","lagartixa","lagarto","lagosta","lampreia","leão","leão marinho","lebre","lêmure","leopardo","lesma","lhama","libélula","lince","lobo","lontra","lula","macaco","mamute","marimbondo","mariposa","marreco","mexilhão","mico leão dourado","minhoca","morcego","moreia","morsa","mosca","mosquito","mula","onça","orangotango","ornitorrinco","ostra","ouriço","ouriço do mar","ovelha","panda","pantera","papagaio","pardal","pássaro","pato","pavão","peixe","peixe boi","pelicano","percevejo","perereca","periquito","pernilongo","peru","pica pau","pinguim","piranha","polvo","pombo","pônei","porco","porco espinho","porquinho da índia","preá","preguiça","pulga","quati","quero quero","rã","raia","raposa","ratazana","rato","rena","rinoceronte","sagui","salamandra","sanguessuga","sapo","serpente","siri","suricate","tamanduá","tartaruga","tatu","tatuí","texugo","tigre","toupeira","touro","tritão","tubarão","tucano","unicórnio","urso","urubu","vaca","vaga lume","veado","vespa","zangão","zebra"}));
		bancoDePalavras.add(new Theme("Banheiro",
				new String[] {"Pasta de dente","Escova de dente","Chuveiro","Vaso sanitário","Pia","Sabonete","Fio dental"}));
		bancoDePalavras.add(new Theme("Calçados",
				new String[] {"Tênis","Chinelo","Sapato social","Tamanco","Rasteirinha","Sandália"}));
		bancoDePalavras.add(new Theme("Circo",
				new String[] {"Palhaço","Animais","Trapezista","Trapézio","Mágica","Palhaçada","Picadeiro","Platéia"}));
		bancoDePalavras.add(new Theme("Cores",
				new String[] {"Amarelo","Anil","Azul","Bege","Bordô","Branco","Cáqui","Carmesim","Castanho","Ciano","Cinza","Dourado","Escarlate","Esmeralda","Fúcsia","Índigo","Laranja","Lilás","Magenta","Marrom","Prata","Preto","Púrpura","Rosa","Roxo","Rubro","Turquesa","Verde","Vermelho","Vinho","Violeta"}));
		bancoDePalavras.add(new Theme("Cozinha",
				new String[] {"Fogão","Geladeira","Microondas","Armário","Pratos","Talheres","Panelas"}));
		bancoDePalavras.add(new Theme("Esportes",new String[] {"Arco e Flecha","Artes Marciais","Atletismo","Automobilismo","Badminton","Basquete","Beisebol","Bilhar","Bocha","Bodyboard","Boliche","Boxe","Bumerangue","Caça","Ciclismo","Corrida","Esgrima","Esqui Aquático","Frescobol","Frisbee","Futebol","Futebol Americano","Futevôlei","Ginástica","Golf","Handebol","Hóquei","Levantamento de Peso","Luta Livre","Mergulho","Montanhismo","Motociclismo","Natação","Navegação","Paintball","Patinação","Pesca","Pólo Aquático","Remo","Rugby","Skate","Squash","Surf","Tchoukball","Tênis","Tênis de Mesa","Tourada","Triathlon","Vôlei","Wakeboard"}));
		bancoDePalavras.add(new Theme("Filmes",new String[] {"O Poderoso Chefão","O Mágico de Oz","Cidadão Kane","Pulp Fiction Tempo de Violência","Casablanca","2001 Uma Odisseia no Espaço","A Lista de Schindler","De Volta para o Futuro","Forrest Gump O Contador de Histórias","E o Vento Levou","O Silêncio dos Inocentes","Tubarão","A Noviça Rebelde","Cantando na Chuva","Clube dos Cinco","Blade Runner O Caçador de Andróides","Star Wars","Beleza Americana","Laranja Mecânica","Curtindo a Vida Adoidado","O Iluminado","Clube da Luta","Psicose","Alien o 8 Passageiro","Toy Story","Matrix","Titanic","O Resgate do Soldado Ryan","Janela Indiscreta","Jurassic Park","Brilho Eterno de uma Mente sem Lembranças","Batman O Cavaleiro das Trevas","O Fabuloso Destino de Amelie Poulain","O Rei Leão","Avatar","Monty Python e o Cálice Sagrado","Gladiador","Um Corpo que Cai","O Segredo de Brokeback Mountain","Os Caça Fantasmas","O Senhor dos Anéis","Duro de Matar","A Origem","Seven Os Sete Crimes Capitais","A Bela e a Fera","Quem Quer ser um Milionário","Amnésia","Up Altas Aventuras","Contatos Imediatos do Terceiro Grau","O Franco Atirador","O Labirinto do Fauno"}));
		bancoDePalavras.add(new Theme("Frutas",new String[] {"Abacate","Abacaxi","Açaí","Acerola","Ameixa","Amêndoa","Amora","Ananás","Atemoia","Avelã","Banana","Bergamota","Cacau","Cajá","Caju","Carambola","Cereja","Ciriguela","Coco","Cranberry","Cupuaçu","Damasco","Figo","Framboesa","Fruta do conde","Fruta pão","Goiaba","Graviola","Groselha","Guaraná","Jabuticaba","Jaca","Jatobá","Jenipapo","Kiwi","Laranja","Limão","Lima","Lichia","Maçã","Macadâmia","Mamão","Manga","Maracujá","Marmelo","Melancia","Melão","Mexerica","Mirtilo","Morango","Nectarina","Pera","Pêssego","Pitanga","Pinha","Pitaia","Pitomba","Pistache","Romã","Tangerina","Tamarindo","Toranja","Tucumã","Uva"}));
//		bancoDePalavras.add(new Theme("Games",new String[] {"c","d"}));
		bancoDePalavras.add(new Theme("Gêneros Musicais",new String[] {"Rock","Folk","Música Eletrônica","Jazz","Hip Hop","Rap","Reggae","Sertanejo","Samba","Pagode","Metal"}));
		bancoDePalavras.add(new Theme("Instrumentos Musicais",new String[] {"agogô","atabaque","bateria","baixo","bongô","castanhola","chocalho","cuíca","flauta","gaita","guitarra","harpa","pandeiro","piano","reco reco","saxofone","surdo","tambor","tamborim","tantã","triângulo","viola","violão","violino","violoncelo"}));
//		bancoDePalavras.add(new Theme("Países",new String[] {"c","d"}));
//		bancoDePalavras.add(new Theme("Praia",new String[] {"c","d"}));
//		bancoDePalavras.add(new Theme("Profissões",new String[] {"c","d"}));
//		bancoDePalavras.add(new Theme("Roupas",new String[] {"c","d"}));
//		bancoDePalavras.add(new Theme("Sala de Aula",new String[] {"c","d"}));
//		bancoDePalavras.add(new Theme("Séries de TV",new String[] {"c","d"}));
		
		return bancoDePalavras;
	}

}
