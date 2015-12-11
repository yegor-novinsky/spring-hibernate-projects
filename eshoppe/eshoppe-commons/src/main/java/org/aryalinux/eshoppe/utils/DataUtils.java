package org.aryalinux.eshoppe.utils;

public class DataUtils {
	public static String[] firstNames = { "James", "Josephine", "Art", "Lenna", "Donette", "Simona", "Mitsue", "Leota",
			"Sage", "Kris", "Minna", "Abel", "Kiley", "Graciela", "Cammy", "Mattie", "Meaghan", "Gladys", "Yuki",
			"Fletcher", "Bette", "Veronika", "Willard", "Maryann", "Alisha", "Allene", "Chanel", "Ezekiel", "Willow",
			"Bernardo", "Ammie", "Francine", "Ernie", "Albina", "Alishia", "Solange", "Jose", "Rozella", "Valentine",
			"Kati", "Youlanda", "Dyan", "Roxane", "Lavera", "Erick", "Fatima", "Jina", "Kanisha", "Emerson", "Blair",
			"Brock", "Lorrie", "Sabra", "Marjory", "Karl", "Tonette", "Amber", "Shenika", "Delmy", "Deeanna",
			"Blondell", "Jamal", "Cecily", "Carmelina", "Maurine", "Tawna", "Penney", "Elly", "Ilene", "Vallie",
			"Kallie", "Johnetta", "Bobbye", "Micaela", "Tamar", "Moon", "Laurel", "Delisa", "Viva", "Elza", "Devorah",
			"Timothy", "Arlette", "Dominque", "Lettie", "Myra", "Stephaine", "Lai", "Stephen", "Tyra", "Tammara",
			"Cory", "Danica", "Wilda", "Elvera", "Carma", "Malinda", "Natalie", "Lisha", "Arlene", "Alease", "Louisa",
			"Angella", "Cyndy", "Rosio", "Celeste", "Twana", "Estrella", "Donte", "Tiffiny", "Edna", "Sue", "Jesusa",
			"Rolland", "Pamella", "Glory", "Shawna", "Brandon", "Scarlet", "Oretha", "Ty", "Xuan", "Lindsey", "Devora",
			"Herman", "Rory", "Talia", "Van", "Lucina", "Bok", "Rolande", "Howard", "Kimbery", "Thurman", "Becky",
			"Beatriz", "Marti", "Nieves", "Leatha", "Valentin", "Melissa", "Sheridan", "Bulah", "Audra", "Daren",
			"Fernanda", "Gearldine", "Chau", "Theola", "Cheryl", "Laticia", "Carissa", "Lezlie", "Ozell", "Arminda",
			"Reita", "Yolando", "Lizette", "Gregoria", "Carin", "Chantell", "Dierdre", "Larae", "Latrice", "Kerry",
			"Dorthy", "Fannie", "Evangelina", "Novella", "Clay", "Jennifer", "Irma", "Eun", "Sylvia", "Nana", "Layla",
			"Joesph", "Annabelle", "Stephaine", "Nelida", "Marguerita", "Carmela", "Junita", "Claribel", "Benton",
			"Hillary", "Merilyn", "Teri", "Merlyn", "Georgene", "Jettie", "Lemuel", "Melodie", "Candida", "Karan",
			"Andra", "Felicidad", "Belen", "Gracia", "Jolanda", "Barrett", "Helga", "Ashlyn", "Fausto", "Ronny",
			"Marge", "Norah", "Aliza", "Mozell", "Viola", "Franklyn", "Willodean", "Beckie", "Rebecka", "Frederica",
			"Glen", "Freeman", "Vincent", "Rima", "Glendora", "Avery", "Cristy", "Nicolette", "Tracey", "Virgina",
			"Tiera", "Alaine", "Earleen", "Leonida", "Ressie", "Justine", "Eladia", "Chaya", "Gwenn", "Salena", "Yoko",
			"Taryn", "Katina", "Rickie", "Alex", "Lashon", "Lauran", "Ceola", "My", "Lorrine", "Peggie", "Marvel",
			"Daron", "An", "Portia", "Rhea", "Benedict", "Alyce", "Heike", "Carey", "Dottie", "Deandrea", "Kimberlie",
			"Martina", "Skye", "Jade", "Charlene", "Geoffrey", "Stevie", "Pamella", "Harrison", "Johnna", "Buddy",
			"Dalene", "Jerry", "Haydee", "Joseph", "Deonna", "Raymon", "Alecia", "Ma", "Detra", "Terrilyn", "Salome",
			"Garry", "Matthew", "Theodora", "Noah", "Carmen", "Lavonda", "Junita", "Herminia", "Casie", "Reena",
			"Mirta", "Cathrine", "Filiberto", "Raul", "Sarah", "Lucy", "Judy", "Yvonne", "Kayleigh", "Felix", "Tresa",
			"Kristeen", "Jenelle", "Renea", "Olive", "Ligia", "Christiane", "Goldie", "Loreta", "Fabiola", "Amie",
			"Raina", "Erinn", "Cherry", "Kattie", "Lilli", "Whitley", "Barbra", "Hermila", "Jesusita", "Caitlin",
			"Roosevelt", "Helaine", "Lorean", "France", "Justine", "Adelina", "Derick", "Jerry", "Leota", "Jutta",
			"Aja", "Kirk", "Leonora", "Winfred", "Tarra", "Corinne", "Dulce", "Kate", "Kaitlyn", "Sherita", "Lashawnda",
			"Ernest", "Nobuko", "Lavonna", "Lashaunda", "Mariann", "Helene", "Roselle", "Samira", "Margart",
			"Kristofer", "Weldon", "Shalon", "Denise", "Louvenia", "Audry", "Kristel", "Vincenza", "Elouise", "Venita",
			"Kasandra", "Xochitl", "Maile", "Krissy", "Pete", "Linn", "Paris", "Wynell", "Quentin", "Regenia", "Sheron",
			"Izetta", "Rodolfo", "Zona", "Serina", "Paz", "Markus", "Jaclyn", "Cyril", "Gayla", "Erick", "Jennie",
			"Mitsue", "Ciara", "Galen", "Truman", "Gail", "Dalene", "Gertude", "Lizbeth", "Glenn", "Lashandra", "Lenna",
			"Laurel", "Mireya", "Annelle", "Dean", "Levi", "Sylvie", "Sharee", "Cordelia", "Mollie", "Brett", "Teddy",
			"Tasia", "Hubert", "Arthur", "Vilma", "Billye", "Glenna", "Mitzie", "Bernardine", "Staci", "Nichelle",
			"Janine", "Ettie", "Eden", "Lynelle", "Merissa", "Golda", "Catarina", "Virgie", "Jolene", "Keneth", "Rikki",
			"Elke", "Hoa", "Trinidad", "Mari", "Selma", "Antione", "Luisa", "Clorinda", "Dick", "Ahmed", "Iluminada",
			"Joanna", "Caprice", "Stephane", "Quentin", "Annmarie", "Shonda", "Cecil", "Jeanice", "Josphine", "Daniel",
			"Cassi", "Britt", "Adell", "Jacqueline", "Lonny", "Lonna", "Cristal", "Kenneth", "Elli", "Alline",
			"Sharika", "Nu", "Daniela", "Cecilia", "Leslie", "Nan", "Izetta", "Tegan", "Ruthann", "Joni", "Vi",
			"Colette", "Malcolm", "Ryan", "Jess", "Sharen", "Nickolas", "Gary", "Diane", "Roslyn", "Glory", "Rasheeda",
			"Alpha", "Refugia", "Shawnda", "Mona", "Gilma", "Janey", "Lili", "Loren", "Dorothy", "Gail", "Catalina",
			"Lawrence", "Carlee", "Thaddeus", "Jovita", "Alesia", "Lai", "Brittni", "Raylene", "Flo", "Jani",
			"Chauncey" };
	public static String[] lastNames = { "Butt", "Darakjy", "Venere", "Paprocki", "Foller", "Morasca", "Tollner",
			"Dilliard", "Wieser", "Marrier", "Amigon", "Maclead", "Caldarera", "Ruta", "Albares", "Poquette", "Garufi",
			"Rim", "Whobrey", "Flosi", "Nicka", "Inouye", "Kolmetz", "Royster", "Slusarski", "Iturbide", "Caudy",
			"Chui", "Kusko", "Figeroa", "Corrio", "Vocelka", "Stenseth", "Glick", "Sergi", "Shinko", "Stockham",
			"Ostrosky", "Gillian", "Rulapaugh", "Schemmer", "Oldroyd", "Campain", "Perin", "Ferencz", "Saylors",
			"Briddick", "Waycott", "Bowley", "Malet", "Bolognia", "Nestle", "Uyetake", "Mastella", "Klonowski",
			"Wenner", "Monarrez", "Seewald", "Ahle", "Juhas", "Pugh", "Vanausdal", "Hollack", "Lindall", "Yglesias",
			"Buvens", "Weight", "Morocco", "Eroman", "Mondella", "Blackwood", "Abdallah", "Rhym", "Rhymes", "Hoogland",
			"Parlato", "Reitler", "Crupi", "Toelkes", "Lipke", "Chickering", "Mulqueen", "Honeywell", "Dickerson",
			"Isenhower", "Munns", "Barfield", "Gato", "Emigh", "Shields", "Wardrip", "Gibes", "Bruschke", "Giguere",
			"Benimadho", "Vanheusen", "Hochard", "Fern", "Centini", "Klusman", "Buemi", "Cronauer", "Cetta",
			"Goldammer", "Cork", "Korando", "Felger", "Samu", "Kines", "Steffensmeier", "Miceli", "Kownacki", "Shin",
			"Francescon", "Schmierer", "Kulzer", "Palaspas", "Callaro", "Cartan", "Menter", "Smith", "Rochin",
			"Dilello", "Perez", "Demesa", "Papasergi", "Riopelle", "Shire", "Lary", "Isaacs", "Spickerman", "Paulas",
			"Madarang", "Manno", "Mirafuentes", "Corrington", "Maybury", "Gotter", "Hagele", "Klimek", "Wiklund",
			"Zane", "Padilla", "Kohnert", "Weirather", "Jillson", "Gellinger", "Kitzman", "Frey", "Haroldson", "Merced",
			"Batman", "Craghead", "Shealy", "Parvis", "Leto", "Luczki", "Stem", "Pawlowicz", "Deleo", "Maynerich",
			"Yum", "Gudroe", "Tolfree", "Theodorov", "Hidvegi", "Lungren", "Radde", "Degroot", "Hoa", "Fallick",
			"Wolfgramm", "Coody", "Cousey", "Wrinkles", "Springe", "Degonia", "Boord", "Vinning", "Sawchuk", "Hiatt",
			"Cookey", "Brideau", "Varriano", "Skursky", "Skulski", "Bayless", "Ennaco", "Lawler", "Montezuma",
			"Mconnell", "Latzke", "Knipp", "Corbley", "Karpin", "Scheyer", "Poullion", "Strassner", "Melnyk", "Hanafan",
			"Toyama", "Fredicks", "Pinilla", "Agramonte", "Caiafa", "Limmel", "Waymire", "Baltimore", "Pelkowski",
			"Bitsuie", "Emard", "Konopacki", "Silvestrini", "Gesick", "Blunk", "Bartolet", "Gochal", "Meinerding",
			"Bevelacqua", "Sarbacher", "Steier", "Lother", "Brossart", "Modzelewski", "Tegarden", "Frankel", "Bergesen",
			"Mai", "Gobern", "Auffrey", "Mugnolo", "Saulter", "Malvin", "Suffield", "Karpel", "Fishburne", "Moyd",
			"Polidori", "Plumer", "Loader", "Vizarro", "Burnard", "Setter", "Rantanen", "Worlds", "Sturiale", "Raymo",
			"Dinos", "Fritz", "Stimmel", "Aredondo", "Sama", "Arias", "Berganza", "Dopico", "Hellickson", "Hughey",
			"Duenas", "Staback", "Fillingim", "Farrar", "Hamilton", "Acey", "Westerbeck", "Fortino", "Haufler",
			"Engelberg", "Cloney", "Riden", "Zurcher", "Denooyer", "Cryer", "Kippley", "Calvaresi", "Bubash", "Layous",
			"Coyier", "Rodeigues", "Lacovara", "Keetch", "Neither", "Restrepo", "Kalafatis", "Sweigard", "Hengel",
			"Stoltzman", "Nicolozakes", "Good", "Maisto", "Mallett", "Pontoriero", "Tawil", "Upthegrove", "Candlish",
			"Treston", "Aquas", "Tjepkema", "Lace", "Hirpara", "Sweely", "Turinetti", "Regusters", "Monterrubio",
			"Matuszak", "Reiber", "Eschberger", "Schirpke", "Timenez", "Hauenstein", "Perigo", "Brachle", "Canlas",
			"Lietz", "Vonasek", "Scriven", "Tomasulo", "Adkin", "Thyberg", "Flister", "Julia", "Hoffis", "Halter",
			"Martabano", "Buzick", "Ferrario", "Nabours", "Dhamer", "Dallen", "Ragel", "Amyot", "Gehrett", "Herritt",
			"Mauson", "Brucato", "Nachor", "Loder", "Labreche", "Keneipp", "Ogg", "Saras", "Stuer", "Syrop", "Halsey",
			"Wolny", "Lizama", "Bilden", "Rodenberger", "Estell", "Heintzman", "Meisel", "Bennick", "Acuff", "Shadrick",
			"Patak", "Beech", "Yaw", "Ehmann", "Zepp", "Gwalthney", "Maillard", "Semidey", "Discipio", "Linahan",
			"Rauser", "Dubaldi", "Paa", "Wide", "Dorshorst", "Birkner", "Kannady", "Louissant", "Funnell", "Butzen",
			"Colla", "Zagen", "Sahagun", "Lukasik", "Bachman", "Daufeldt", "Schnitzler", "Nievas", "Drymon", "Scipione",
			"Ventura", "Cantres", "Feichtner", "Kitty", "Schoeneck", "Witten", "Kohl", "Berray", "Klang", "Newville",
			"Pagliuca", "Frerking", "Tagala", "Ketelsen", "Munis", "Ryser", "Maile", "Storment", "Mcdoniel", "Mccullan",
			"Pedrozo", "Andreason", "Walthall", "Farrow", "Berlanga", "Miro", "Slayton", "Hudnall", "Rodefer",
			"Schmaltz", "Meteer", "Rhoden", "Hoopengardner", "Jayson", "Auber", "Tomblin", "Kaniecki", "Gleich", "Kiel",
			"Ostolaza", "Borgman", "Nayar", "Sengbusch", "Sarao", "Mcrae", "Lueckenbach", "Husser", "Onofrio", "Jurney",
			"Heimann", "Wenzinger", "Angalich", "Ohms", "Leinenbach", "Suell", "Myricks", "Swayze", "Castros",
			"Greenbush", "Lapage", "Claucherty", "Villanueva", "Perruzza", "Wildfong", "Galam", "Lipkin", "Rowling",
			"Weglarz", "Diestel", "Samara", "Grenet", "Mclaird", "Jeanty", "Eanes", "Mcnease", "Comnick", "Colaizzo",
			"Threets", "Koppinger", "Dewar", "Arceo", "Keener", "Breland", "Rentfro", "Kardas", "Tromblay", "Harnos",
			"Chaffins", "Bourbon", "Juvera", "Nunlee", "Devreese", "Chavous", "Schieler", "Sayaphon", "Palaia",
			"Jacobos", "Yori", "Delasancha", "Liukko", "Gabisi", "Paskin", "Asar", "Chesterfield", "Similton",
			"Tillotson", "Lorens", "Boulter", "Ankeny", "Oles", "Hixenbaugh", "Harabedian", "Gillaspie", "Kampa",
			"Bookamer", "Biddy", "Motley" };
}
