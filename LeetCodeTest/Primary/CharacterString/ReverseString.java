package CharacterString;

/**
 * 
 * 编写一个函数，其作用是将输入的字符串反转过来。

	示例 1:
	
	输入: "hello"
	输出: "olleh"
	
	示例 2:
	
	输入: "A man, a plan, a canal: Panama"
	输出: "amanaP :lanac a ,nalp a ,nam A"
 *
 **/

public class ReverseString {

	public String reverseString(String s) {
        String str = "";
        for ( int i=s.length()-1; i>=0; i-- )
        {
        	if ( s.charAt(i)!='\r'  )
        	{
        		str = str+s.charAt(i);
        	}
        }
		return str;
    }
	
	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		String s = "\"A man\r\n" + 
				"a plan\r\n" + 
				"a cameo\r\n" + 
				"Zena\r\n" + 
				"Bird\r\n" + 
				"Mocha\r\n" + 
				"Prowel\r\n" + 
				"a rave\r\n" + 
				"Uganda\r\n" + 
				"Wait\r\n" + 
				"a lobola\r\n" + 
				"Argo\r\n" + 
				"Goto\r\n" + 
				"Koser\r\n" + 
				"Ihab\r\n" + 
				"Udall\r\n" + 
				"a revocation\r\n" + 
				"Ebarta\r\n" + 
				"Muscat\r\n" + 
				"eyes\r\n" + 
				"Rehm\r\n" + 
				"a cession\r\n" + 
				"Udella\r\n" + 
				"E-boat\r\n" + 
				"OAS\r\n" + 
				"a mirage\r\n" + 
				"IPBM\r\n" + 
				"a caress\r\n" + 
				"Etam\r\n" + 
				"FCA\r\n" + 
				"a mica\r\n" + 
				"Ojai\r\n" + 
				"Lebowa\r\n" + 
				"Yaeger\r\n" + 
				"a barge\r\n" + 
				"Rab\r\n" + 
				"Alsatian\r\n" + 
				"a mod\r\n" + 
				"Adv\r\n" + 
				"a rps\r\n" + 
				"Ileane\r\n" + 
				"Valeta\r\n" + 
				"Grenada\r\n" + 
				"Hetty\r\n" + 
				"Fayme\r\n" + 
				"REME\r\n" + 
				"HCM\r\n" + 
				"Tsan\r\n" + 
				"Owena\r\n" + 
				"Tamar\r\n" + 
				"Yompur\r\n" + 
				"Isa\r\n" + 
				"Nil\r\n" + 
				"Lorrin\r\n" + 
				"Riksdag\r\n" + 
				"Mona\r\n" + 
				"Ronn\r\n" + 
				"O'Conner\r\n" + 
				"Kirk\r\n" + 
				"an okay\r\n" + 
				"Nafl\r\n" + 
				"Lira\r\n" + 
				"Robi\r\n" + 
				"Rame\r\n" + 
				"FIFA\r\n" + 
				"a need\r\n" + 
				"Rodi\r\n" + 
				"Muharram\r\n" + 
				"Ober\r\n" + 
				"a coma\r\n" + 
				"carri\r\n" + 
				"Hwang\r\n" + 
				"Taos\r\n" + 
				"Salado\r\n" + 
				"Olfe\r\n" + 
				"Camag\r\n" + 
				"Kdar\r\n" + 
				"a hdkf\r\n" + 
				"Jemina\r\n" + 
				"Nadler\r\n" + 
				"Ehud\r\n" + 
				"Rutan\r\n" + 
				"a baster\r\n" + 
				"Ebn\r\n" + 
				"aedegi\r\n" + 
				"a gals\r\n" + 
				"Ira\r\n" + 
				"Tepper\r\n" + 
				"a minim\r\n" + 
				"a gowd\r\n" + 
				"Ulda\r\n" + 
				"Ogawa\r\n" + 
				"TSgt\r\n" + 
				"Callida\r\n" + 
				"Rodl\r\n" + 
				"Ewart\r\n" + 
				"seraphs\r\n" + 
				"Ain\r\n" + 
				"Newgate\r\n" + 
				"Vaden\r\n" + 
				"navettes\r\n" + 
				"Sabah\r\n" + 
				"Swat\r\n" + 
				"Luci\r\n" + 
				"Pam\r\n" + 
				"Arda\r\n" + 
				"pools\r\n" + 
				"a boar\r\n" + 
				"Akira\r\n" + 
				"Gally\r\n" + 
				"CSC\r\n" + 
				"Avalon\r\n" + 
				"a tuba\r\n" + 
				"AAM\r\n" + 
				"Artima\r\n" + 
				"AFB\r\n" + 
				"Selah\r\n" + 
				"wellies\r\n" + 
				"Ronald\r\n" + 
				"BArch\r\n" + 
				"nullos\r\n" + 
				"Uni\r\n" + 
				"an aet\r\n" + 
				"Nadabus\r\n" + 
				"Tyree\r\n" + 
				"Poop\r\n" + 
				"Sennar\r\n" + 
				"CAB\r\n" + 
				"a nanny\r\n" + 
				"Let\r\n" + 
				"Efahan\r\n" + 
				"Dasya\r\n" + 
				"Moon\r\n" + 
				"Ikaria\r\n" + 
				"Nam\r\n" + 
				"Lamar\r\n" + 
				"Egor\r\n" + 
				"Rover\r\n" + 
				"Tanana\r\n" + 
				"Loki\r\n" + 
				"MIP\r\n" + 
				"PharD\r\n" + 
				"endia\r\n" + 
				"rates\r\n" + 
				"Punan\r\n" + 
				"Eba\r\n" + 
				"Alva\r\n" + 
				"Paine\r\n" + 
				"BEF\r\n" + 
				"Fagan\r\n" + 
				"nugae\r\n" + 
				"taws\r\n" + 
				"Una\r\n" + 
				"Woll\r\n" + 
				"a tab\r\n" + 
				"CSE\r\n" + 
				"Kamerad\r\n" + 
				"YCL\r\n" + 
				"a melt\r\n" + 
				"Diehl\r\n" + 
				"Lewellen\r\n" + 
				"Sacci\r\n" + 
				"Reggi\r\n" + 
				"RFA\r\n" + 
				"BSA\r\n" + 
				"naoi\r\n" + 
				"Kuyp\r\n" + 
				"Oceanic\r\n" + 
				"Sipple\r\n" + 
				"Yalu\r\n" + 
				"Kosey\r\n" + 
				"nota\r\n" + 
				"talers\r\n" + 
				"Frida\r\n" + 
				"a wab\r\n" + 
				"Musset\r\n" + 
				"Aoede\r\n" + 
				"Erick\r\n" + 
				"a reign\r\n" + 
				"Attica\r\n" + 
				"Marge\r\n" + 
				"Leta\r\n" + 
				"Mat\r\n" + 
				"Naboth\r\n" + 
				"Saphra\r\n" + 
				"Gila\r\n" + 
				"Arany\r\n" + 
				"Costa\r\n" + 
				"Fasta\r\n" + 
				"Mabel\r\n" + 
				"Udine\r\n" + 
				"Derte\r\n" + 
				"Medill\r\n" + 
				"Erotes\r\n" + 
				"RuPaul\r\n" + 
				"Uzzi\r\n" + 
				"Waler\r\n" + 
				"Omak\r\n" + 
				"a kaif\r\n" + 
				"Freed\r\n" + 
				"a doc\r\n" + 
				"a marga\r\n" + 
				"Nilla\r\n" + 
				"Dole\r\n" + 
				"USPO\r\n" + 
				"Ogata\r\n" + 
				"tubas\r\n" + 
				"somata\r\n" + 
				"Dash\r\n" + 
				"Danika\r\n" + 
				"Salida\r\n" + 
				"Fiji\r\n" + 
				"Emili\r\n" + 
				"Kazak\r\n" + 
				"Oder\r\n" + 
				"CAC\r\n" + 
				"Ilocanos\r\n" + 
				"Nudd\r\n" + 
				"Uda\r\n" + 
				"Susette\r\n" + 
				"Diskin\r\n" + 
				"Numitor\r\n" + 
				"Munn\r\n" + 
				"a tsarina\r\n" + 
				"Valle\r\n" + 
				"Soraya\r\n" + 
				"Masan\r\n" + 
				"Ezaria\r\n" + 
				"Teri\r\n" + 
				"Luks\r\n" + 
				"UNDRO\r\n" + 
				"Naida\r\n" + 
				"Wal\r\n" + 
				"a major\r\n" + 
				"Stelu\r\n" + 
				"OGO\r\n" + 
				"Dilan\r\n" + 
				"Iapetus\r\n" + 
				"an areg\r\n" + 
				"a jacal\r\n" + 
				"Nessi\r\n" + 
				"R. Bayer\r\n" + 
				"Wotan\r\n" + 
				"a tip\r\n" + 
				"Tabb\r\n" + 
				"a stonk\r\n" + 
				"a habu\r\n" + 
				"Salli\r\n" + 
				"Major\r\n" + 
				"Berosus\r\n" + 
				"a tepal\r\n" + 
				"Layla\r\n" + 
				"Gitana\r\n" + 
				"Cold\r\n" + 
				"Ogun\r\n" + 
				"Sadie\r\n" + 
				"Bowen\r\n" + 
				"Rock\r\n" + 
				"Cila\r\n" + 
				"Wey\r\n" + 
				"a halo\r\n" + 
				"Omari\r\n" + 
				"Albniz\r\n" + 
				"Osana\r\n" + 
				"Illimani\r\n" + 
				"Laura\r\n" + 
				"Mitzi\r\n" + 
				"Dacey\r\n" + 
				"a grill\r\n" + 
				"Enyo\r\n" + 
				"Leno\r\n" + 
				"Snashall\r\n" + 
				"a moot\r\n" + 
				"an amt\r\n" + 
				"a tike\r\n" + 
				"Lamaism\r\n" + 
				"Ygerne\r\n" + 
				"Gainer\r\n" + 
				"ilia\r\n" + 
				"Vala\r\n" + 
				"Alia\r\n" + 
				"Keli\r\n" + 
				"Codie\r\n" + 
				"Bikini\r\n" + 
				"Taliesin\r\n" + 
				"Eyde\r\n" + 
				"Baiel\r\n" + 
				"DAgr\r\n" + 
				"Obara\r\n" + 
				"Caracas\r\n" + 
				"Niven\r\n" + 
				"Airlie\r\n" + 
				"Vadim\r\n" + 
				"Seda\r\n" + 
				"a rata\r\n" + 
				"Utas\r\n" + 
				"Olathe\r\n" + 
				"Pohai\r\n" + 
				"Tatum\r\n" + 
				"obli\r\n" + 
				"Nadab\r\n" + 
				"a nook\r\n" + 
				"Corabel\r\n" + 
				"a cercus\r\n" + 
				"Levona\r\n" + 
				"Sida\r\n" + 
				"Sapir\r\n" + 
				"Otilia\r\n" + 
				"MSIE\r\n" + 
				"Mbm\r\n" + 
				"ILS\r\n" + 
				"Opis\r\n" + 
				"Sudra\r\n" + 
				"Lea\r\n" + 
				"Grieg\r\n" + 
				"a robalo\r\n" + 
				"Pack\r\n" + 
				"an amp\r\n" + 
				"Otaru\r\n" + 
				"Savil\r\n" + 
				"Spoor\r\n" + 
				"Tarapoto\r\n" + 
				"Kadner\r\n" + 
				"Everard\r\n" + 
				"Fleur\r\n" + 
				"Nita\r\n" + 
				"Palos\r\n" + 
				"origamis\r\n" + 
				"Lina\r\n" + 
				"Naoma\r\n" + 
				"Lananna\r\n" + 
				"Erdei\r\n" + 
				"trymata\r\n" + 
				"Paza\r\n" + 
				"Mano\r\n" + 
				"Musa\r\n" + 
				"Toy\r\n" + 
				"Raff\r\n" + 
				"U-boat\r\n" + 
				"Neiman\r\n" + 
				"Illampu\r\n" + 
				"Osanna\r\n" + 
				"Dinah\r\n" + 
				"Pittel\r\n" + 
				"a valor\r\n" + 
				"Itonia\r\n" + 
				"Tamra\r\n" + 
				"Kamal\r\n" + 
				"Edana\r\n" + 
				"Cly\r\n" + 
				"Redd\r\n" + 
				"a tin\r\n" + 
				"Gaza\r\n" + 
				"CNS\r\n" + 
				"Ultan\r\n" + 
				"a haik\r\n" + 
				"Nedra\r\n" + 
				"Hyo\r\n" + 
				"FRCS\r\n" + 
				"orgies\r\n" + 
				"a tub\r\n" + 
				"Rabaul\r\n" + 
				"Canea\r\n" + 
				"Calva\r\n" + 
				"Koren\r\n" + 
				"Elgon\r\n" + 
				"a trf\r\n" + 
				"Aesir\r\n" + 
				"Tema\r\n" + 
				"Leda\r\n" + 
				"Tica\r\n" + 
				"DJS\r\n" + 
				"Roe\r\n" + 
				"Lanam\r\n" + 
				"Haida\r\n" + 
				"Bezwada\r\n" + 
				"a grub\r\n" + 
				"Lawry\r\n" + 
				"Sarge\r\n" + 
				"Lelah\r\n" + 
				"Cimon\r\n" + 
				"a vote\r\n" + 
				"Naor\r\n" + 
				"Alcatraz\r\n" + 
				"O'Malley\r\n" + 
				"Ivis\r\n" + 
				"IADB\r\n" + 
				"Roswell\r\n" + 
				"Eboh\r\n" + 
				"Tosca\r\n" + 
				"Sik\r\n" + 
				"Naylor\r\n" + 
				"a kore\r\n" + 
				"IPY\r\n" + 
				"Al Pacino\r\n" + 
				"valses\r\n" + 
				"a cesura\r\n" + 
				"ducs\r\n" + 
				"a kale\r\n" + 
				"Bald\r\n" + 
				"Etta\r\n" + 
				"Verena\r\n" + 
				"RCS\r\n" + 
				"Etan\r\n" + 
				"an ova\r\n" + 
				"Shira\r\n" + 
				"Bar\r\n" + 
				"CCP\r\n" + 
				"Murat\r\n" + 
				"Somnus\r\n" + 
				"Mahren\r\n" + 
				"Rubens\r\n" + 
				"IAS\r\n" + 
				"Berk\r\n" + 
				"a bod\r\n" + 
				"cates\r\n" + 
				"a yam\r\n" + 
				"a ten\r\n" + 
				"a zakat\r\n" + 
				"a jazy\r\n" + 
				"Roca\r\n" + 
				"a den\r\n" + 
				"Sum\r\n" + 
				"Edris\r\n" + 
				"a berg\r\n" + 
				"Ona\r\n" + 
				"Melli\r\n" + 
				"Wran\r\n" + 
				"Dobro\r\n" + 
				"Niagara\r\n" + 
				"Hopis\r\n" + 
				"LaSorella\r\n" + 
				"Backer\r\n" + 
				"Ragnar\r\n" + 
				"Okla\r\n" + 
				"Anitra\r\n" + 
				"Neddra\r\n" + 
				"hamli\r\n" + 
				"Snapp\r\n" + 
				"Ellyn\r\n" + 
				"Iva\r\n" + 
				"Des\r\n" + 
				"Behar\r\n" + 
				"OFris\r\n" + 
				"a puce\r\n" + 
				"Yenan\r\n" + 
				"Averell\r\n" + 
				"Eufaula\r\n" + 
				"LBP\r\n" + 
				"Wiak\r\n" + 
				"Bob\r\n" + 
				"a kaiak\r\n" + 
				"a susu\r\n" + 
				"Shani\r\n" + 
				"Bib\r\n" + 
				"Laon\r\n" + 
				"a teacup\r\n" + 
				"Gond\r\n" + 
				"Yahgans\r\n" + 
				"a loop\r\n" + 
				"Virgo\r\n" + 
				"Sina\r\n" + 
				"an one\r\n" + 
				"Wina\r\n" + 
				"a jake\r\n" + 
				"Kanaka\r\n" + 
				"a site\r\n" + 
				"Ball\r\n" + 
				"Orkhon\r\n" + 
				"Sung\r\n" + 
				"IPA\r\n" + 
				"a col\r\n" + 
				"anni\r\n" + 
				"a tramline\r\n" + 
				"Bello\r\n" + 
				"Cindy\r\n" + 
				"OLLA\r\n" + 
				"Leibniz\r\n" + 
				"Erbil\r\n" + 
				"Apulia\r\n" + 
				"Pammi\r\n" + 
				"Rgen\r\n" + 
				"Yard\r\n" + 
				"Lad\r\n" + 
				"Tera\r\n" + 
				"a dan\r\n" + 
				"Ito\r\n" + 
				"Rashi\r\n" + 
				"Ewald\r\n" + 
				"Omer\r\n" + 
				"Cagle\r\n" + 
				"byre-men\r\n" + 
				"Say\r\n" + 
				"Gilud\r\n" + 
				"Omar\r\n" + 
				"Omaha\r\n" + 
				"RPO\r\n" + 
				"Likasi\r\n" + 
				"Putnem\r\n" + 
				"Lohman\r\n" + 
				"Irus\r\n" + 
				"PYT\r\n" + 
				"a bor\r\n" + 
				"Baber\r\n" + 
				"Ohare\r\n" + 
				"Fallon\r\n" + 
				"Egan\r\n" + 
				"a dinar\r\n" + 
				"Aloke\r\n" + 
				"Kyra\r\n" + 
				"Ranie\r\n" + 
				"Norty\r\n" + 
				"Lena\r\n" + 
				"Pip\r\n" + 
				"a grebe\r\n" + 
				"Ino\r\n" + 
				"LCT\r\n" + 
				"Ialysus\r\n" + 
				"a spa\r\n" + 
				"Curt\r\n" + 
				"a mall\r\n" + 
				"Ard\r\n" + 
				"Calen\r\n" + 
				"Outhe\r\n" + 
				"Parke\r\n" + 
				"Bubalo\r\n" + 
				"Tamanaha\r\n" + 
				"Manado\r\n" + 
				"opai\r\n" + 
				"Gart\r\n" + 
				"Ziv\r\n" + 
				"a bit\r\n" + 
				"a roof\r\n" + 
				"masais\r\n" + 
				"lekanai\r\n" + 
				"Latia\r\n" + 
				"Watt\r\n" + 
				"Utley\r\n" + 
				"a glia\r\n" + 
				"Tait\r\n" + 
				"an odd\r\n" + 
				"Logan\r\n" + 
				"Airedale\r\n" + 
				"Bamako\r\n" + 
				"Rianna\r\n" + 
				"Bruyn\r\n" + 
				"a z-axis\r\n" + 
				"OPA\r\n" + 
				"kakapos\r\n" + 
				"a gid\r\n" + 
				"Neff\r\n" + 
				"a radar\r\n" + 
				"Ewold\r\n" + 
				"crases\r\n" + 
				"Ibiza\r\n" + 
				"RMA\r\n" + 
				"Tula\r\n" + 
				"Essen\r\n" + 
				"Ulane\r\n" + 
				"Guedalla\r\n" + 
				"Baroda\r\n" + 
				"Maren\r\n" + 
				"Naman\r\n" + 
				"Nina\r\n" + 
				"a stir\r\n" + 
				"a mary\r\n" + 
				"Tia\r\n" + 
				"Baese\r\n" + 
				"Onega\r\n" + 
				"Duhl\r\n" + 
				"Uball\r\n" + 
				"a tsade\r\n" + 
				"Mahla\r\n" + 
				"Dayle\r\n" + 
				"Eno\r\n" + 
				"a buhr\r\n" + 
				"Apl\r\n" + 
				"a bag\r\n" + 
				"Evita\r\n" + 
				"Garbo\r\n" + 
				"Calli\r\n" + 
				"Rema\r\n" + 
				"Tama\r\n" + 
				"a cera\r\n" + 
				"Nast\r\n" + 
				"Rahab\r\n" + 
				"MeV\r\n" + 
				"Ola\r\n" + 
				"a cod\r\n" + 
				"Uele\r\n" + 
				"a fartlek\r\n" + 
				"a dig\r\n" + 
				"Irbil\r\n" + 
				"a madame\r\n" + 
				"Nika\r\n" + 
				"Arne\r\n" + 
				"Mada\r\n" + 
				"Carey\r\n" + 
				"Gehenna\r\n" + 
				"Idabel\r\n" + 
				"Ganny\r\n" + 
				"Lyman\r\n" + 
				"Y-level\r\n" + 
				"Elora\r\n" + 
				"Pahl\r\n" + 
				"IHS\r\n" + 
				"Taka\r\n" + 
				"Naga\r\n" + 
				"Ethe\r\n" + 
				"YWCA\r\n" + 
				"Nes\r\n" + 
				"Billie\r\n" + 
				"Nos\r\n" + 
				"Laetitia\r\n" + 
				"Hedy\r\n" + 
				"E.H. Moore\r\n" + 
				"Lasala\r\n" + 
				"Tina Arena\r\n" + 
				"a lug\r\n" + 
				"Ade\r\n" + 
				"Ens\r\n" + 
				"Sumo\r\n" + 
				"Cons\r\n" + 
				"an aider\r\n" + 
				"a wallow\r\n" + 
				"Estron\r\n" + 
				"Sang\r\n" + 
				"Isadora\r\n" + 
				"Heda\r\n" + 
				"Cranaus\r\n" + 
				"a tahr\r\n" + 
				"Riba\r\n" + 
				"Dina\r\n" + 
				"Mas\r\n" + 
				"deti\r\n" + 
				"Nuri\r\n" + 
				"Marr\r\n" + 
				"a floss\r\n" + 
				"a milady\r\n" + 
				"a rfb\r\n" + 
				"Solley\r\n" + 
				"lares\r\n" + 
				"a mog\r\n" + 
				"Ladew\r\n" + 
				"a coll\r\n" + 
				"Ebba\r\n" + 
				"Algeria\r\n" + 
				"LCVP\r\n" + 
				"Minabe\r\n" + 
				"Zobe\r\n" + 
				"Sassari\r\n" + 
				"Dasi\r\n" + 
				"caca\r\n" + 
				"Mrike\r\n" + 
				"Rajab\r\n" + 
				"a sacaton\r\n" + 
				"IMF\r\n" + 
				"CSA\r\n" + 
				"an aug\r\n" + 
				"Ina\r\n" + 
				"Sacco\r\n" + 
				"Napa\r\n" + 
				"Nahama\r\n" + 
				"Rechaba\r\n" + 
				"Roos\r\n" + 
				"Asar\r\n" + 
				"a dor\r\n" + 
				"EHFA\r\n" + 
				"John\r\n" + 
				"Imitt\r\n" + 
				"EDC\r\n" + 
				"Eraste\r\n" + 
				"Donella\r\n" + 
				"Cmon\r\n" + 
				"Rosol\r\n" + 
				"Rafaela\r\n" + 
				"Derina\r\n" + 
				"Ubald\r\n" + 
				"Siwash\r\n" + 
				"Ariew\r\n" + 
				"a gale\r\n" + 
				"pis\r\n" + 
				"Sibel\r\n" + 
				"Patsis\r\n" + 
				"Erasme\r\n" + 
				"Edan\r\n" + 
				"Nireus\r\n" + 
				"Sita\r\n" + 
				"Ion\r\n" + 
				"Matsys\r\n" + 
				"Tebet\r\n" + 
				"IHD\r\n" + 
				"Lihue\r\n" + 
				"Morie\r\n" + 
				"Doi\r\n" + 
				"R. Ravi\r\n" + 
				"varia\r\n" + 
				"Davon\r\n" + 
				"a moror\r\n" + 
				"Epp\r\n" + 
				"Arcaro\r\n" + 
				"Tabor\r\n" + 
				"Paros\r\n" + 
				"Netaji\r\n" + 
				"Gannes\r\n" + 
				"a fit\r\n" + 
				"a load\r\n" + 
				"Aruba\r\n" + 
				"Bebel\r\n" + 
				"Gabel\r\n" + 
				"BAg\r\n" + 
				"Nepal\r\n" + 
				"LBJ\r\n" + 
				"SbW\r\n" + 
				"Oralie\r\n" + 
				"Waki\r\n" + 
				"Sadler\r\n" + 
				"egesta\r\n" + 
				"INH\r\n" + 
				"Orton\r\n" + 
				"a jello\r\n" + 
				"Iviza\r\n" + 
				"Nader\r\n" + 
				"Flessel\r\n" + 
				"Tamas\r\n" + 
				"Sirach\r\n" + 
				"a tafia\r\n" + 
				"Brunn\r\n" + 
				"EKG\r\n" + 
				"Ogdan\r\n" + 
				"Ogaden\r\n" + 
				"Ralph\r\n" + 
				"Bacis\r\n" + 
				"a bane\r\n" + 
				"MEPA\r\n" + 
				"Sulla\r\n" + 
				"Griz\r\n" + 
				"Takao\r\n" + 
				"Blighty\r\n" + 
				"Soble\r\n" + 
				"Grass\r\n" + 
				"Averyl\r\n" + 
				"a giron\r\n" + 
				"Aia\r\n" + 
				"buddies\r\n" + 
				"Repeal\r\n" + 
				"a bat\r\n" + 
				"Samala\r\n" + 
				"a thana\r\n" + 
				"Lanni\r\n" + 
				"Viva\r\n" + 
				"Hazard\r\n" + 
				"Erfurt\r\n" + 
				"Sinatra\r\n" + 
				"Buatti\r\n" + 
				"Malta\r\n" + 
				"Zama\r\n" + 
				"Sirois\r\n" + 
				"Orson\r\n" + 
				"a rennin\r\n" + 
				"a gel\r\n" + 
				"Goda\r\n" + 
				"Neri\r\n" + 
				"a denier\r\n" + 
				"Kari\r\n" + 
				"Orem\r\n" + 
				"Oran\r\n" + 
				"Ugo\r\n" + 
				"Puck\r\n" + 
				"Camarata\r\n" + 
				"Nammu\r\n" + 
				"DVS\r\n" + 
				"EMet\r\n" + 
				"a mar\r\n" + 
				"a labrid\r\n" + 
				"a galah\r\n" + 
				"Catie\r\n" + 
				"HRIP\r\n" + 
				"Utgard\r\n" + 
				"an arak\r\n" + 
				"Nassir\r\n" + 
				"Roldan\r\n" + 
				"Emarie\r\n" + 
				"Weiler\r\n" + 
				"UAW\r\n" + 
				"a ballet\r\n" + 
				"Sirkin\r\n" + 
				"a lupus\r\n" + 
				"a raw\r\n" + 
				"a jouk\r\n" + 
				"Dew\r\n" + 
				"Sulu\r\n" + 
				"Mahanadi\r\n" + 
				"AMT\r\n" + 
				"an aph\r\n" + 
				"Inanna\r\n" + 
				"Malissa\r\n" + 
				"Cotter\r\n" + 
				"Bilac\r\n" + 
				"Irena\r\n" + 
				"Oka\r\n" + 
				"Nahum\r\n" + 
				"Nea\r\n" + 
				"Negros\r\n" + 
				"Erny\r\n" + 
				"LFO\r\n" + 
				"Tamaru\r\n" + 
				"Cami\r\n" + 
				"Damek\r\n" + 
				"Ipoh\r\n" + 
				"a layup\r\n" + 
				"Udale\r\n" + 
				"Hsu\r\n" + 
				"Toma\r\n" + 
				"Dine\r\n" + 
				"Dalston\r\n" + 
				"Nanak\r\n" + 
				"a selenite\r\n" + 
				"Menam\r\n" + 
				"Rafat\r\n" + 
				"a setter\r\n" + 
				"Giana\r\n" + 
				"AAA\r\n" + 
				"a cicala\r\n" + 
				"Sab\r\n" + 
				"Barabas\r\n" + 
				"Iole\r\n" + 
				"Elger\r\n" + 
				"a min\r\n" + 
				"a yad\r\n" + 
				"a loe\r\n" + 
				"Sorata\r\n" + 
				"Ocala\r\n" + 
				"Caracalla\r\n" + 
				"Gaddi\r\n" + 
				"Baraca\r\n" + 
				"ENE\r\n" + 
				"NABAC\r\n" + 
				"Aella\r\n" + 
				"Vogel\r\n" + 
				"an art\r\n" + 
				"IMCO\r\n" + 
				"Ramsden\r\n" + 
				"a rip\r\n" + 
				"Aida\r\n" + 
				"a del\r\n" + 
				"a villa\r\n" + 
				"Roid\r\n" + 
				"Nidia\r\n" + 
				"a robe\r\n" + 
				"Dailey\r\n" + 
				"Manaus\r\n" + 
				"Ena\r\n" + 
				"Per\r\n" + 
				"a dey\r\n" + 
				"a sicle\r\n" + 
				"Karas\r\n" + 
				"Aimil\r\n" + 
				"a kaput\r\n" + 
				"Sudan\r\n" + 
				"a vahana\r\n" + 
				"Klemm\r\n" + 
				"Ocana\r\n" + 
				"Wsan\r\n" + 
				"Hach\r\n" + 
				"a dresser\r\n" + 
				"Oyama\r\n" + 
				"Uruk\r\n" + 
				"Andes\r\n" + 
				"bassi\r\n" + 
				"Rattan\r\n" + 
				"a dairy\r\n" + 
				"Marra\r\n" + 
				"Base\r\n" + 
				"Revere\r\n" + 
				"Brabant\r\n" + 
				"Sikang\r\n" + 
				"a long\r\n" + 
				"a pup\r\n" + 
				"Garett\r\n" + 
				"Estren\r\n" + 
				"Hahnke\r\n" + 
				"Monagan\r\n" + 
				"Terra\r\n" + 
				"Gari\r\n" + 
				"Kolima\r\n" + 
				"an ore\r\n" + 
				"venae\r\n" + 
				"Jessen\r\n" + 
				"Garin\r\n" + 
				"Neb\r\n" + 
				"Nis\r\n" + 
				"a hoodoo\r\n" + 
				"Katie\r\n" + 
				"Cedalion\r\n" + 
				"a revel\r\n" + 
				"a neep\r\n" + 
				"Adlare\r\n" + 
				"Mena\r\n" + 
				"Air\r\n" + 
				"a secretin\r\n" + 
				"Dian\r\n" + 
				"an aga\r\n" + 
				"Paola\r\n" + 
				"Gram\r\n" + 
				"SbE\r\n" + 
				"Deccan\r\n" + 
				"a bib\r\n" + 
				"Deb\r\n" + 
				"Nette\r\n" + 
				"Naji\r\n" + 
				"Kass\r\n" + 
				"Laertes\r\n" + 
				"a tire\r\n" + 
				"Nitro\r\n" + 
				"Cahan\r\n" + 
				"Natie\r\n" + 
				"H-steel\r\n" + 
				"a munga\r\n" + 
				"Maril\r\n" + 
				"Otti\r\n" + 
				"Danilo\r\n" + 
				"Vinita\r\n" + 
				"BASc\r\n" + 
				"Remsen\r\n" + 
				"Names\r\n" + 
				"Oca\r\n" + 
				"a tad\r\n" + 
				"a sig\r\n" + 
				"Uskub\r\n" + 
				"Bida\r\n" + 
				"Anna\r\n" + 
				"Orin\r\n" + 
				"Osi\r\n" + 
				"perca\r\n" + 
				"Avo\r\n" + 
				"traps\r\n" + 
				"a gig\r\n" + 
				"Oland\r\n" + 
				"Rona\r\n" + 
				"Udele\r\n" + 
				"Tarawa\r\n" + 
				"Demmy\r\n" + 
				"Peggi\r\n" + 
				"Feller\r\n" + 
				"Rad\r\n" + 
				"Dee\r\n" + 
				"Maseru\r\n" + 
				"Melesa\r\n" + 
				"HCF\r\n" + 
				"Ieso\r\n" + 
				"Malaga\r\n" + 
				"Waaf\r\n" + 
				"Fatshan\r\n" + 
				"Gadmon\r\n" + 
				"Evars\r\n" + 
				"Urd\r\n" + 
				"McDade\r\n" + 
				"Loss\r\n" + 
				"a brunet\r\n" + 
				"Lobel\r\n" + 
				"a salt\r\n" + 
				"baths\r\n" + 
				"a reb\r\n" + 
				"Lahti\r\n" + 
				"Mina\r\n" + 
				"Nial\r\n" + 
				"Paula\r\n" + 
				"Kamet\r\n" + 
				"Saharan\r\n" + 
				"Obe\r\n" + 
				"Timaeus\r\n" + 
				"Sinaloa\r\n" + 
				"Gaya\r\n" + 
				"KCMG\r\n" + 
				"Nobel\r\n" + 
				"a hamal\r\n" + 
				"a lahar\r\n" + 
				"Alcazar\r\n" + 
				"Bride\r\n" + 
				"PMA\r\n" + 
				"Janis\r\n" + 
				"Takara\r\n" + 
				"Llyr\r\n" + 
				"a cuss\r\n" + 
				"Orella\r\n" + 
				"Eda\r\n" + 
				"Tab\r\n" + 
				"Munafo\r\n" + 
				"Lowis\r\n" + 
				"Sisqo\r\n" + 
				"Barram\r\n" + 
				"Izanagi\r\n" + 
				"Lapeer\r\n" + 
				"Calama\r\n" + 
				"holi\r\n" + 
				"hsien\r\n" + 
				"Urbannal\r\n" + 
				"an emf\r\n" + 
				"Ruth\r\n" + 
				"salts\r\n" + 
				"Rao\r\n" + 
				"Haile\r\n" + 
				"dildos\r\n" + 
				"a sell\r\n" + 
				"Artair\r\n" + 
				"Ezara\r\n" + 
				"Lomax\r\n" + 
				"Eridanus\r\n" + 
				"Tihwa\r\n" + 
				"Mickie\r\n" + 
				"Rorie\r\n" + 
				"Valley\r\n" + 
				"Rocco\r\n" + 
				"DMS\r\n" + 
				"Linette\r\n" + 
				"Roche\r\n" + 
				"Jessie\r\n" + 
				"nuts\r\n" + 
				"a dil\r\n" + 
				"Mika\r\n" + 
				"Hasa\r\n" + 
				"Gonave\r\n" + 
				"Lau\r\n" + 
				"Tiran\r\n" + 
				"Ibagu\r\n" + 
				"Damodar\r\n" + 
				"Arran\r\n" + 
				"Gitt\r\n" + 
				"Erna\r\n" + 
				"NYP\r\n" + 
				"Teheran\r\n" + 
				"Salas\r\n" + 
				"Ree\r\n" + 
				"Valer\r\n" + 
				"Red\r\n" + 
				"Sale\r\n" + 
				"Mari\r\n" + 
				"Vladi\r\n" + 
				"Tak\r\n" + 
				"a deftness\r\n" + 
				"Ida\r\n" + 
				"Karon\r\n" + 
				"an ant\r\n" + 
				"canli\r\n" + 
				"Kalila\r\n" + 
				"Kidder\r\n" + 
				"Flanna\r\n" + 
				"Naara\r\n" + 
				"Saire\r\n" + 
				"BSEE\r\n" + 
				"Wedgie\r\n" + 
				"Wera\r\n" + 
				"Taxila\r\n" + 
				"Ras\r\n" + 
				"ECU\r\n" + 
				"Na-Dene\r\n" + 
				"Ring\r\n" + 
				"Fareham\r\n" + 
				"Linus\r\n" + 
				"a tat\r\n" + 
				"a yapp\r\n" + 
				"Rahm\r\n" + 
				"Slav\r\n" + 
				"Lissie\r\n" + 
				"Hts\r\n" + 
				"Elinore\r\n" + 
				"Rota\r\n" + 
				"Iden\r\n" + 
				"a mora\r\n" + 
				"Naldo\r\n" + 
				"Jori\r\n" + 
				"Helle\r\n" + 
				"zombis\r\n" + 
				"Amory\r\n" + 
				"Billat\r\n" + 
				"Malaya\r\n" + 
				"Lampert\r\n" + 
				"Sabir\r\n" + 
				"a keg\r\n" + 
				"a yardage\r\n" + 
				"Maced\r\n" + 
				"Liana\r\n" + 
				"IFC\r\n" + 
				"AAF\r\n" + 
				"ged\r\n" + 
				"a hard\r\n" + 
				"Essa\r\n" + 
				"Cull\r\n" + 
				"AAAA\r\n" + 
				"Ledeen\r\n" + 
				"Davene\r\n" + 
				"BSAgE\r\n" + 
				"Issus\r\n" + 
				"Sima\r\n" + 
				"Alas\r\n" + 
				"Pupin\r\n" + 
				"a yelk\r\n" + 
				"Rabia\r\n" + 
				"BBA\r\n" + 
				"ILO\r\n" + 
				"Cini\r\n" + 
				"an alarum\r\n" + 
				"an engr\r\n" + 
				"Evette\r\n" + 
				"VanAtta\r\n" + 
				"Patty\r\n" + 
				"Hrolf\r\n" + 
				"Teer\r\n" + 
				"Gavin\r\n" + 
				"Ben\r\n" + 
				"Edson\r\n";
		System.out.println(r.reverseString(s));
	}

}
