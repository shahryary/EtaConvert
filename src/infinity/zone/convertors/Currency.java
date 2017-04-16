package infinity.zone.convertors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.StrictMode;

public class Currency {

	/**
	 * @param args
	 * @return
	 */
	public String cur(String from, String to, Double Value) {

		// --------------------------------------- calc Angles

		String unit_one = "";
		String unit_two = "";
		String exResult = "";
		String s;
		Double finalValue = Value;

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Euro (EUR)")||from.equalsIgnoreCase("Евро (EUR)")) {
			unit_one = "EUR";

		} else if (from.equalsIgnoreCase("British Pound (GBP)")||from.equalsIgnoreCase("Британский фунт стерлинг (GBP)")) {
			unit_one = "GBP";

		} else if (from.equalsIgnoreCase("United States Dollar (USD)")||from.equalsIgnoreCase("Доллар США (USD)")) {
			unit_one = "USD";

		} else if (from.equalsIgnoreCase("Australian Dollar (AUD)")||from.equalsIgnoreCase("Австралийский доллар (AUD)")) {
			unit_one = "AUD";

		} else if (from.equalsIgnoreCase("Canadian Dollar (CAD)")||from.equalsIgnoreCase("Канадский доллар (CAD)")) {
			unit_one = "CAD";

		} else if (from.equalsIgnoreCase("Swiss Franc (CHF)")||from.equalsIgnoreCase("Шведский франк (CHF)")) {
			unit_one = "CHF";

		} else if (from.equalsIgnoreCase("ChineseYuan (CNY)")||from.equalsIgnoreCase("Китайский юань (CNY)")) {
			unit_one = "CNY";

		} else if (from.equalsIgnoreCase("Hong Kong Dollar (HKD)")||from.equalsIgnoreCase("Гонконгский доллар (HKD)")) {
			unit_one = "HKD";

		} else if (from.equalsIgnoreCase("Indonesian Rupiah (IDR)")||from.equalsIgnoreCase("Индонезийская рупия (IDR)")) {
			unit_one = "IDR";

		} else if (from.equalsIgnoreCase("Indian Rupee(INR)")||from.equalsIgnoreCase("Индийская рупия(INR)")) {

			unit_one = "INR";

		} else if (from.equalsIgnoreCase("Japanese Yen (JPY)")||from.equalsIgnoreCase("Японская иена (JPY)")) {
			unit_one = "JPY";

		} else if (from.equalsIgnoreCase("Thai Baht (THB)")||from.equalsIgnoreCase("Тайский бат (THB)")) {
			unit_one = "THB";

		} else if (from.equalsIgnoreCase("Albanian Lek (ALL)")||from.equalsIgnoreCase("Албанский лек (ALL)")) {

			unit_one = "ALL";

		} else if (from.equalsIgnoreCase("Algerian Dinar (DZD)")||from.equalsIgnoreCase("Алжирский динар (DZD)")) {
			unit_one = "DZD";

		} else if (from.equalsIgnoreCase("Aluminium Ounces (XAL)")||from.equalsIgnoreCase("Алюминиевые унций (XAL)")) {
			unit_one = "XAL";

		} else if (from.equalsIgnoreCase("Argentine Peso (ARS)")||from.equalsIgnoreCase("Аргентинский песо (ARS)")) {

			unit_one = "ARS";

		} else if (from.equalsIgnoreCase("ArubaFlorin (AWG)")||from.equalsIgnoreCase("Флорин Арубы (AWG)")) {

			unit_one = "AWG";
		} else if (from.equalsIgnoreCase("Bahamian Dollar (BSD)")||from.equalsIgnoreCase("Багамский доллар (BSD)")) {

			unit_one = "BSD";

		} else if (from.equalsIgnoreCase("Bahraini Dinar (BHD)")||from.equalsIgnoreCase("Бахрейнский динар (BHD)")) {

			unit_one = "BHD";

		} else if (from.equalsIgnoreCase("Bangladesh Taka(BDT)")||from.equalsIgnoreCase("Бангладеш така(BDT)")) {

			unit_one = "BDT";

		} else if (from.equalsIgnoreCase("Barbados Dollar (BBD)")||from.equalsIgnoreCase("Барбадосский доллар (BBD)")) {

			unit_one = "BBD";

		} else if (from.equalsIgnoreCase("Belarus Ruble (BYR)")||from.equalsIgnoreCase("Белорусский рубль (BYR)")) {

			unit_one = "BYR";

		} else if (from.equalsIgnoreCase("Belize Dollar (BZD)")||from.equalsIgnoreCase("Белизский доллар (BZD)")) {

			unit_one = "BZD";

		} else if (from.equalsIgnoreCase("Bermuda Dollar (BMD)")||from.equalsIgnoreCase("Бермудский доллар (BMD)")) {

			unit_one = "BMD";

		} else if (from.equalsIgnoreCase("Bhutan Ngultrum (BTN)")||from.equalsIgnoreCase("Бутанский Нгултрум (BTN)")) {

			unit_one = "BTN";

		} else if (from.equalsIgnoreCase("Bolivian Boliviano (BOB)")||from.equalsIgnoreCase("Боливийский Боливиано (BOB)")) {

			unit_one = "BOB";

		} else if (from.equalsIgnoreCase("Botswana Pula (BWP)")||from.equalsIgnoreCase("Ботсвана Пула (BWP)")) {

			unit_one = "BWP";

		} else if (from.equalsIgnoreCase("Brazilian Real (BRL)")||from.equalsIgnoreCase("Бразильский реал (BRL)")) {

			unit_one = "BRL";

		} else if (from.equalsIgnoreCase("Brunei Dollar (BND)")||from.equalsIgnoreCase("Брунейский доллар (BND)")) {

			unit_one = "BND";

		} else if (from.equalsIgnoreCase("Bulgarian Lev(BGN)")||from.equalsIgnoreCase("Болгарский лев (BGN)")) {

			unit_one = "BGN";

		} else if (from.equalsIgnoreCase("Burundi Franc (BIF)")||from.equalsIgnoreCase("Бурунди франк (BIF)")) {

			unit_one = "BIF";

		} else if (from.equalsIgnoreCase("Cambodia Riel (KHR)")||from.equalsIgnoreCase("Камбоджийский риель (KHR)")) {

			unit_one = "KHR";

		} else if (from.equalsIgnoreCase("Cape Verde Escudo (CVE)")||from.equalsIgnoreCase("Кабо-Верде Эскудо (CVE)")) {

			unit_one = "CVE";

		} else if (from.equalsIgnoreCase("Cayman Islands Dollar (KYD)")||from.equalsIgnoreCase("Доллар Каймановых островов (KYD)")) {

			unit_one = "KYD";

		} else if (from.equalsIgnoreCase("CFA Franc (BCEAO) (XOF)")||from.equalsIgnoreCase("Франк КФА (BCEAO) (XOF)")) {

			unit_one = "XOF";

		} else if (from.equalsIgnoreCase("CFA Franc (BEAC) (XAF)")||from.equalsIgnoreCase("Франк КФА (BEAC) (XAF)")) {

			unit_one = "XAF";

		} else if (from.equalsIgnoreCase("Chilean Peso (CLP)")||from.equalsIgnoreCase("Чилийское песо (CLP)")) {

			unit_one = "CLP";

		} else if (from.equalsIgnoreCase("Colombian Peso (COP)")||from.equalsIgnoreCase("Колумбийское песо (COP)")) {

			unit_one = "COP";

		} else if (from.equalsIgnoreCase("Comoros Franc (KMF)")||from.equalsIgnoreCase("Франк Коморских островов (KMF)")) {

			unit_one = "KMF";

		} else if (from.equalsIgnoreCase("Copper Pounds(XCP)")||from.equalsIgnoreCase("Медный Фунт (XCP)")) {

			unit_one = "XCP";

		} else if (from.equalsIgnoreCase("Costa Rica Colon (CRC)")||from.equalsIgnoreCase("Коста-Рика Колон (CRC)")) {

			unit_one = "CRC";

		} else if (from.equalsIgnoreCase("Croatian Kuna (HRK)")||from.equalsIgnoreCase("Хорватская куна (HRK)")) {

			unit_one = "HRK";

		} else if (from.equalsIgnoreCase("Cuban Peso (CUP)")||from.equalsIgnoreCase("Кубинское песо (CUP)")) {

			unit_one = "CUP";

		} else if (from.equalsIgnoreCase("Czech Koruna (CZK)")||from.equalsIgnoreCase("Чешская крона (CZK)")) {

			unit_one = "CZK";

		} else if (from.equalsIgnoreCase("Danish Krone (DKK)")||from.equalsIgnoreCase("Датская Крона (DKK)")) {

			unit_one = "DKK";

		} else if (from.equalsIgnoreCase("Dijibouti Franc (DJF)")||from.equalsIgnoreCase("Франк Джибути (DJF)")) {

			unit_one = "DJF";

		} else if (from.equalsIgnoreCase("Dominican Peso(DOP)")||from.equalsIgnoreCase("Доминиканский песо (DOP)")) {

			unit_one = "DOP";

		} else if (from.equalsIgnoreCase("East Caribbean Dollar (XCD)")||from.equalsIgnoreCase("Восточно-карибский доллар (XCD)")) {

			unit_one = "XCD";

		} else if (from.equalsIgnoreCase("Ecuador Sucre (ECS)")||from.equalsIgnoreCase("Эквадорский Сукре (ECS)")) {

			unit_one = "ECS";

		} else if (from.equalsIgnoreCase("Egyptian Pound(EGP)")||from.equalsIgnoreCase("Египетский фунт(EGP)")) {

			unit_one = "EGP";

		} else if (from.equalsIgnoreCase("El Salvador Colon (SVC)")||from.equalsIgnoreCase("Сальвадорский колон (SVC)")) {

			unit_one = "SVC";

		} else if (from.equalsIgnoreCase("Eritrea Nakfa (ERN)")||from.equalsIgnoreCase("Эритрея Накфа (ERN)")) {

			unit_one = "ERN";

		} else if (from.equalsIgnoreCase("Estonian Kroon (EEK)")||from.equalsIgnoreCase("Эстонская крона (EEK)")) {

			unit_one = "EEK";

		} else if (from.equalsIgnoreCase("Ethiopian Birr (ETB)")||from.equalsIgnoreCase("Эфиопский быр (ETB)")) {

			unit_one = "ETB";

		} else if (from.equalsIgnoreCase("Falkland Islands Pound (FKP)")||from.equalsIgnoreCase("Фунт Фолклендских островов (FKP)")) {

			unit_one = "FKP";

		} else if (from.equalsIgnoreCase("Fiji Dollar (FJD)")||from.equalsIgnoreCase("Доллар Фиджи (FJD)")) {

			unit_one = "FJD";

		} else if (from.equalsIgnoreCase("Gambian Dalasi (GMD)")||from.equalsIgnoreCase("Гамбийский даласи (GMD)")) {

			unit_one = "GMD";

		} else if (from.equalsIgnoreCase("Ghanian Cedi (GHC)")||from.equalsIgnoreCase("Ганский седи (GHC)")) {

			unit_one = "GHC";

		} else if (from.equalsIgnoreCase("Gibraltar Pound (GIP)")||from.equalsIgnoreCase("Гибралтарский фунт (GIP)")) {

			unit_one = "GIP";

		} else if (from.equalsIgnoreCase("Gold Ounces(XAU)")||from.equalsIgnoreCase("Унции золота (XAU)")) {

			unit_one = "XAU";

		} else if (from.equalsIgnoreCase("Guatemala Quetzal (GTQ)")||from.equalsIgnoreCase("Гватемальский кетцаль (GTQ)")) {

			unit_one = "GTQ";

		} else if (from.equalsIgnoreCase("Guinea Franc (GNF)")||from.equalsIgnoreCase("Гвинейский франк (GNF)")) {

			unit_one = "GNF";

		} else if (from.equalsIgnoreCase("Guyana Dollar (GYD)")||from.equalsIgnoreCase("Гайанский доллар (GYD)")) {

			unit_one = "GYD";

		} else if (from.equalsIgnoreCase("Haiti Gourde (HTG)")||from.equalsIgnoreCase("Гаитянский гурд (HTG)")) {

			unit_one = "HTG";

		} else if (from.equalsIgnoreCase("Honduras Lempira (HNL)")||from.equalsIgnoreCase("Гондурас лемпира (HNL)")) {

			unit_one = "HNL";

		} else if (from.equalsIgnoreCase("Hungarian Forint (HUF)")||from.equalsIgnoreCase("Венгерский форинт (HUF)")) {

			unit_one = "HUF";

		} else if (from.equalsIgnoreCase("Iceland Krona (ISK)")||from.equalsIgnoreCase("Исландская крона (ISK)")) {

			unit_one = "ISK";

		} else if (from.equalsIgnoreCase("Iran Rial (IRR)")||from.equalsIgnoreCase("Иранский риал (IRR)")) {

			unit_one = "IRR";

		} else if (from.equalsIgnoreCase("Iraqi Dinar (IQD)")||from.equalsIgnoreCase("Иракский Динар (IQD)")) {

			unit_one = "IQD";

		} else if (from.equalsIgnoreCase("Israeli Shekel (ILS)")||from.equalsIgnoreCase("Новый израильский шекель (ILS)")) {

			unit_one = "ILS";

		} else if (from.equalsIgnoreCase("Jamaican Dollar (JMD)")||from.equalsIgnoreCase("Ямайский доллар (JMD)")) {

			unit_one = "JMD";

		} else if (from.equalsIgnoreCase("Jordanian Dinar (JOD)")||from.equalsIgnoreCase("Иорданский динар (JOD)")) {

			unit_one = "JOD";

		} else if (from.equalsIgnoreCase("Kazakhstan Tenge (KZT)")||from.equalsIgnoreCase("Казахстанский тенге (KZT)")) {

			unit_one = "KZT";

		} else if (from.equalsIgnoreCase("Kenyan Shilling (KES)")||from.equalsIgnoreCase("Кенийский шиллинг (KES)")) {

			unit_one = "KES";

		} else if (from.equalsIgnoreCase("South Korean Won (KRW)")||from.equalsIgnoreCase("Южнокорейская вона (KRW)")) {

			unit_one = "KRW";

		} else if (from.equalsIgnoreCase("Kuwaiti Dinar (KWD)")||from.equalsIgnoreCase("Кувейтский динар (KWD)")) {

			unit_one = "KWD";

		} else if (from.equalsIgnoreCase("Lao Kip(LAK)")||from.equalsIgnoreCase("Кип Лаосской НДР (LAK)")) {

			unit_one = "LAK";

		} else if (from.equalsIgnoreCase("Latvian Lat (LVL)")||from.equalsIgnoreCase("Латвийский лат (LVL)")) {

			unit_one = "LVL";

		} else if (from.equalsIgnoreCase("Lebanese Pound (LBP)")||from.equalsIgnoreCase("Ливанский Фунт (LBP)")) {

			unit_one = "LBP";

		} else if (from.equalsIgnoreCase("Lesotho Loti (LSL)")||from.equalsIgnoreCase("Лоти Лесото (LSL)")) {

			unit_one = "LSL";

		} else if (from.equalsIgnoreCase("Liberian Dollar (LRD)")||from.equalsIgnoreCase("Либерийский доллар (LRD)")) {

			unit_one = "LRD";

		} else if (from.equalsIgnoreCase("Libyan Dinar (LYD)")||from.equalsIgnoreCase("Ливийский динар (LYD)")) {

			unit_one = "LYD";

		} else if (from.equalsIgnoreCase("Lithuanian Lita (LTL)")||from.equalsIgnoreCase("Литовский лит (LTL)")) {

			unit_one = "LTL";

		} else if (from.equalsIgnoreCase("Macau Pataca (MOP)")||from.equalsIgnoreCase("Патака Макао (MOP)")) {

			unit_one = "MOP";

		} else if (from.equalsIgnoreCase("Macedonian Denar (MKD)")||from.equalsIgnoreCase("Македонский динар (MKD)")) {

			unit_one = "MKD";

		} else if (from.equalsIgnoreCase("Malawi Kwacha (MWK)")||from.equalsIgnoreCase("Малави квача (MWK)")) {

			unit_one = "MWK";

		} else if (from.equalsIgnoreCase("Malaysian Ringgit(MYR)")||from.equalsIgnoreCase("Малайзийский ринггит(MYR)")) {

			unit_one = "MYR";

		} else if (from.equalsIgnoreCase("Maldives Rufiyaa (MVR)")||from.equalsIgnoreCase("Мальдивская руфия (MVR)")) {

			unit_one = "MVR";

		} else if (from.equalsIgnoreCase("Maltese Lira (MTL)")||from.equalsIgnoreCase("Мальтийская лира (MTL)")) {

			unit_one = "MTL";

		} else if (from.equalsIgnoreCase("Mauritania Ougulya(MRO)")||from.equalsIgnoreCase("Мавританская угия (MRO)")) {

			unit_one = "MRO";

		} else if (from.equalsIgnoreCase("Mauritius Rupee (MUR)")||from.equalsIgnoreCase("Маврикий рупия (MUR)")) {

			unit_one = "MUR";

		} else if (from.equalsIgnoreCase("Mexican Peso (MXN")||from.equalsIgnoreCase("Мексиканское песо (MXN)")) {

			unit_one = "MXN";

		} else if (from.equalsIgnoreCase("Moldovan Leu (MDL)")||from.equalsIgnoreCase("Молдавский лей (MDL)")) {

			unit_one = "MDL";

		} else if (from.equalsIgnoreCase("Mongolian Tugrik (MNT)")||from.equalsIgnoreCase("Монгольский Тугрик (MNT)")) {

			unit_one = "MNT";

		} else if (from.equalsIgnoreCase("Moroccan Dirham (MAD)")||from.equalsIgnoreCase("Марокканский дирхам (MAD)")) {

			unit_one = "MAD";

		} else if (from.equalsIgnoreCase("Myanmar Kyat (MMK)")||from.equalsIgnoreCase("Мьянма Кьят (MMK)")) {

			unit_one = "MMK";

		} else if (from.equalsIgnoreCase("Namibian Dollar (NAD)")||from.equalsIgnoreCase("Доллар Намибии (NAD)")) {

			unit_one = "NAD";

		} else if (from.equalsIgnoreCase("Nepalese Rupee (NPR)")||from.equalsIgnoreCase("Непальская рупия (NPR)")) {

			unit_one = "NPR";

		} else if (from.equalsIgnoreCase("Neth Antilles Guilder (ANG)")||from.equalsIgnoreCase("Антильский гульден (ANG)")) {

			unit_one = "ANG";

		} else if (from.equalsIgnoreCase("Turkish Lira(TRY)")||from.equalsIgnoreCase("Турецкая лира (TRY)")) {

			unit_one = "TRY";

		} else if (from.equalsIgnoreCase("New Zealand Dollar (NZD)")||from.equalsIgnoreCase("Новозеландский доллар (NZD)")) {

			unit_one = "NZD";

		} else if (from.equalsIgnoreCase("Nicaragua Cordoba (NIO)")||from.equalsIgnoreCase("Никарагуа Кордоба (NIO)")) {

			unit_one = "NIO";

		} else if (from.equalsIgnoreCase("Nigerian Naira(NGN)")||from.equalsIgnoreCase("Нигерийская найра (NGN)")) {

			unit_one = "NGN";

		} else if (from.equalsIgnoreCase("North Korean Won (KPW)")||from.equalsIgnoreCase("Северо-корейская вона (KPW)")) {

			unit_one = "KPW";

		} else if (from.equalsIgnoreCase("Norwegian Krone (NOK)")||from.equalsIgnoreCase("Норвежская крона (NOK)")) {

			unit_one = "NOK";

		} else if (from.equalsIgnoreCase("Omani Rial (OMR)")||from.equalsIgnoreCase("Оманский риал (OMR)")) {

			unit_one = "OMR";

		} else if (from.equalsIgnoreCase("Pacific Franc (XPF)")||from.equalsIgnoreCase("Французский тихоокеанский франк (XPF)")) {

			unit_one = "XPF";

		} else if (from.equalsIgnoreCase("Pakistani Rupee (PKR)")||from.equalsIgnoreCase("Пакистанская рупия (PKR)")) {

			unit_one = "PKR";

		} else if (from.equalsIgnoreCase("Palladium Ounces (XPD)")||from.equalsIgnoreCase("Палладий унция (XPD)")) {

			unit_one = "XPD";

		} else if (from.equalsIgnoreCase("Panama Balboa (PAB)")||from.equalsIgnoreCase("Панамский бальбоа (PAB)")) {

			unit_one = "PAB";

		} else if (from.equalsIgnoreCase("Papua New Guinea Kina (PGK)")||from.equalsIgnoreCase("Папуа-Новая Гвинея Кина (PGK)")) {

			unit_one = "PGK";

		} else if (from.equalsIgnoreCase("Paraguayan Guarani (PYG)")||from.equalsIgnoreCase("Парагвайский гуарани (PYG)")) {

			unit_one = "PYG";

		} else if (from.equalsIgnoreCase("Peruvian Nuevo Sol(PEN)")||from.equalsIgnoreCase("Перуанский новый соль (PEN)")) {

			unit_one = "PEN";

		} else if (from.equalsIgnoreCase("Philippine Peso (PHP)")||from.equalsIgnoreCase("Филиппинский песо (PHP)")) {

			unit_one = "PHP";

		} else if (from.equalsIgnoreCase("Platinum Ounces (XPT)")||from.equalsIgnoreCase("Платиновые унции (XPT)")) {

			unit_one = "XPT";

		} else if (from.equalsIgnoreCase("Polish Zloty (PLN)")||from.equalsIgnoreCase("Польский злотый (PLN)")) {

			unit_one = "PLN";

		} else if (from.equalsIgnoreCase("Qatar Rial (QAR)")||from.equalsIgnoreCase("Катарский риал (QAR)")) {

			unit_one = "QAR";

		} else if (from.equalsIgnoreCase("Romanian New Leu (RON)")||from.equalsIgnoreCase("Новый румынский лей (RON)")) {

			unit_one = "RON";

		} else if (from.equalsIgnoreCase("Russian Rouble (RUB)")||from.equalsIgnoreCase("Русский рубль (RUB)")) {

			unit_one = "RUB";

		} else if (from.equalsIgnoreCase("Rwanda Franc (RWF)")||from.equalsIgnoreCase("Руанда франк (RWF)")) {

			unit_one = "RWF";

		} else if (from.equalsIgnoreCase("Samoa Tala (WST)")||from.equalsIgnoreCase("Тала Самоа (WST)")) {

			unit_one = "WST";

		} else if (from.equalsIgnoreCase("Sao Tome Dobra (STD)")||from.equalsIgnoreCase("Добра Сан-Томе (STD)")) {

			unit_one = "STD";

		} else if (from.equalsIgnoreCase("Saudi Arabian Riyal (SAR)")||from.equalsIgnoreCase("Саудовский риял (SAR)")) {

			unit_one = "SAR";

		} else if (from.equalsIgnoreCase("Seychelles Rupee (SCR)")||from.equalsIgnoreCase("Сейшельская рупия (SCR)")) {

			unit_one = "SCR";

		} else if (from.equalsIgnoreCase("Sierra Leone Leone (SLL)")||from.equalsIgnoreCase("Сьерра-Леоне Леоне (SLL)")) {

			unit_one = "SLL";

		} else if (from.equalsIgnoreCase("Silver Ounces (XAG)")||from.equalsIgnoreCase("Серебряный унций (XAG)")) {

			unit_one = "XAG";

		} else if (from.equalsIgnoreCase("Singapore Dollar (SGD)")||from.equalsIgnoreCase("Сингапурский доллар (SGD)")) {

			unit_one = "SGD";

		} else if (from.equalsIgnoreCase("Slovak Koruna (SKK)")||from.equalsIgnoreCase("Словацкая крона (SKK)")) {

			unit_one = "SKK";

		} else if (from.equalsIgnoreCase("Slovenian Tolar (SIT)")||from.equalsIgnoreCase("Словенский толар (SIT)")) {

			unit_one = "SIT";

		} else if (from.equalsIgnoreCase("Solomon Islands Dollar (SBD)")||from.equalsIgnoreCase("Доллар Соломоновых островов (SBD)")) {

			unit_one = "SBD";

		} else if (from.equalsIgnoreCase("Somali Shilling (SOS)")||from.equalsIgnoreCase("Сомалийский шиллинг (SOS)")) {

			unit_one = "SOS";

		} else if (from.equalsIgnoreCase("South African Rand (ZAR)")||from.equalsIgnoreCase("Южноафриканский рэнд (ZAR)")) {

			unit_one = "ZAR";

		} else if (from.equalsIgnoreCase("Sri Lanka Rupee(LKR)")||from.equalsIgnoreCase("Шри-ланкийская рупия (LKR)")) {

			unit_one = "LKR";

		} else if (from.equalsIgnoreCase("St Helena Pound (SHP)")||from.equalsIgnoreCase("Фунт Святой Елены (SHP)")) {

			unit_one = "SHP";

		} else if (from.equalsIgnoreCase("Sudanese Pound (SDG)")||from.equalsIgnoreCase("Суданский фунт (SDG)")) {

			unit_one = "SDG";

		} else if (from.equalsIgnoreCase("Swaziland Lilageni(SZL)<")||from.equalsIgnoreCase("Свазиленд лилангени (SZL)")) {

			unit_one = "SZL";

		} else if (from.equalsIgnoreCase("Swedish Krona (SEK)")||from.equalsIgnoreCase("Шведская крона (SEK)")) {

			unit_one = "SEK";

		} else if (from.equalsIgnoreCase("Syrian Pound (SYP)")||from.equalsIgnoreCase("Сирийские фунты (SYP)")) {

			unit_one = "SYP";

		} else if (from.equalsIgnoreCase("Taiwan Dollar (TWD)")||from.equalsIgnoreCase("Тайваньский доллар (TWD)")) {

			unit_one = "TWD";

		} else if (from.equalsIgnoreCase("Tanzanian Shilling (TZS)")||from.equalsIgnoreCase("Танзанийский шиллинг (TZS)")) {

			unit_one = "TZS";

		} else if (from.equalsIgnoreCase("Tonga Pa\'ang (TOP)")||from.equalsIgnoreCase("Тонга паанга (TOP)")) {

			unit_one = "TOP";

		} else if (from.equalsIgnoreCase("Trinidad and Tobago Dollar (TTD)")||from.equalsIgnoreCase("Доллар Тринидада и Тобаго (TTD)")) {

			unit_one = "TTD";

		} else if (from.equalsIgnoreCase("Tunisian Dinar (TND)")||from.equalsIgnoreCase("Тунисский динар (TND)")) {

			unit_one = "TND";

		} else if (from.equalsIgnoreCase("UAE Dirham (AED)")||from.equalsIgnoreCase("Дирхам ОАЭ (AED)")) {

			unit_one = "AED";

		} else if (from.equalsIgnoreCase("Ugandan Shilling (UGX)")||from.equalsIgnoreCase("Угандийский шиллинг (UGX)")) {

			unit_one = "UGX";

		} else if (from.equalsIgnoreCase("Ukraine Hryvnia (UAH)")||from.equalsIgnoreCase("Гривна Украины (UAH)")) {

			unit_one = "UAH";

		} else if (from.equalsIgnoreCase("Uruguayan New Peso (UYU)")||from.equalsIgnoreCase("Уругвайский песо (UYU)")) {

			unit_one = "UYU";

		} else if (from.equalsIgnoreCase("Vanuatu Vatu (VUV)")||from.equalsIgnoreCase("Вануатский вату (VUV)")) {

			unit_one = "VUV";

		} else if (from.equalsIgnoreCase("Venezuelan Bolivar Fuerte(VEF)")||from.equalsIgnoreCase("Венесуэльский боливар фуэрте (VEF)")) {

			unit_one = "VEF";

		} else if (from.equalsIgnoreCase("Vietnam Dong (VND)")||from.equalsIgnoreCase("Вьетнамский донг (VND)")) {

			unit_one = "VND";

		} else if (from.equalsIgnoreCase("Yemen Riyal (YER)")||from.equalsIgnoreCase("Йеменский риал (YER)")) {

			unit_one = "YER";

		} else if (from.equalsIgnoreCase("Zambian Kwacha (ZMK)")||from.equalsIgnoreCase("Замбия квача (ZMK)")) {

			unit_one = "ZMK";

		} else if (from.equalsIgnoreCase("Zimbabwe dollar (ZWD)")||from.equalsIgnoreCase("Доллар Зимбабве (ZWD)")) {

			unit_one = "ZWD";

		}

		// ----------------------------------------------------------------------- Convert To
		
		if (to.equalsIgnoreCase("Euro (EUR)")||to.equalsIgnoreCase("Евро (EUR)")) {
			unit_two = "EUR";

		} else if (to.equalsIgnoreCase("British Pound (GBP)")||to.equalsIgnoreCase("Британский фунт стерлинг (GBP)")) {
			unit_two = "GBP";

		} else if (to.equalsIgnoreCase("United States Dollar (USD)")||to.equalsIgnoreCase("Доллар США (USD)")) {
			unit_two = "USD";

		} else if (to.equalsIgnoreCase("Australian Dollar (AUD)")||to.equalsIgnoreCase("Австралийский доллар (AUD)")) {
			unit_two = "AUD";

		} else if (to.equalsIgnoreCase("Canadian Dollar (CAD)")||to.equalsIgnoreCase("Канадский доллар (CAD)")) {
			unit_two = "CAD";

		} else if (to.equalsIgnoreCase("Swiss Franc (CHF)")||to.equalsIgnoreCase("Шведский франк (CHF)")) {
			unit_two = "CHF";

		} else if (to.equalsIgnoreCase("ChineseYuan (CNY)")||to.equalsIgnoreCase("Китайский юань (CNY)")) {
			unit_two = "CNY";

		} else if (to.equalsIgnoreCase("Hong Kong Dollar (HKD)")||to.equalsIgnoreCase("Гонконгский доллар (HKD)")) {
			unit_two = "HKD";

		} else if (to.equalsIgnoreCase("Indonesian Rupiah (IDR)")||to.equalsIgnoreCase("Индонезийская рупия (IDR)")) {
			unit_two = "IDR";

		} else if (to.equalsIgnoreCase("Indian Rupee(INR)")||to.equalsIgnoreCase("Индийская рупия(INR)")) {

			unit_two = "INR";

		} else if (to.equalsIgnoreCase("Japanese Yen (JPY)")||to.equalsIgnoreCase("Японская иена (JPY)")) {
			unit_two = "JPY";

		} else if (to.equalsIgnoreCase("Thai Baht (THB)")||to.equalsIgnoreCase("Тайский бат (THB)")) {
			unit_two = "THB";

		} else if (to.equalsIgnoreCase("Albanian Lek (ALL)")||to.equalsIgnoreCase("Албанский лек (ALL)")) {

			unit_two = "ALL";

		} else if (to.equalsIgnoreCase("Algerian Dinar (DZD)")||to.equalsIgnoreCase("Алжирский динар (DZD)")) {
			unit_two = "DZD";

		} else if (to.equalsIgnoreCase("Aluminium Ounces (XAL)")||to.equalsIgnoreCase("Алюминиевые унций (XAL)")) {
			unit_two = "XAL";

		} else if (to.equalsIgnoreCase("Argentine Peso (ARS)")||to.equalsIgnoreCase("Аргентинский песо (ARS)")) {

			unit_two = "ARS";

		} else if (to.equalsIgnoreCase("ArubaFlorin (AWG)")||to.equalsIgnoreCase("Флорин Арубы (AWG)")) {

			unit_two = "AWG";
		} else if (to.equalsIgnoreCase("Bahamian Dollar (BSD)")||to.equalsIgnoreCase("Багамский доллар (BSD)")) {

			unit_two = "BSD";

		} else if (to.equalsIgnoreCase("Bahraini Dinar (BHD)")||to.equalsIgnoreCase("Бахрейнский динар (BHD)")) {

			unit_two = "BHD";

		} else if (to.equalsIgnoreCase("Bangladesh Taka(BDT)")||to.equalsIgnoreCase("Бангладеш така(BDT)")) {

			unit_two = "BDT";

		} else if (to.equalsIgnoreCase("Barbados Dollar (BBD)")||to.equalsIgnoreCase("Барбадосский доллар (BBD)")) {

			unit_two = "BBD";

		} else if (to.equalsIgnoreCase("Belarus Ruble (BYR)")||to.equalsIgnoreCase("Белорусский рубль (BYR)")) {

			unit_two = "BYR";

		} else if (to.equalsIgnoreCase("Belize Dollar (BZD)")||to.equalsIgnoreCase("Белизский доллар (BZD)")) {

			unit_two = "BZD";

		} else if (to.equalsIgnoreCase("Bermuda Dollar (BMD)")||to.equalsIgnoreCase("Бермудский доллар (BMD)")) {

			unit_two = "BMD";

		} else if (to.equalsIgnoreCase("Bhutan Ngultrum (BTN)")||to.equalsIgnoreCase("Бутанский Нгултрум (BTN)")) {

			unit_two = "BTN";

		} else if (to.equalsIgnoreCase("Bolivian Boliviano (BOB)")||to.equalsIgnoreCase("Боливийский Боливиано (BOB)")) {

			unit_two = "BOB";

		} else if (to.equalsIgnoreCase("Botswana Pula (BWP)")||to.equalsIgnoreCase("Ботсвана Пула (BWP)")) {

			unit_two = "BWP";

		} else if (to.equalsIgnoreCase("Brazilian Real (BRL)")||to.equalsIgnoreCase("Бразильский реал (BRL)")) {

			unit_two = "BRL";

		} else if (to.equalsIgnoreCase("Brunei Dollar (BND)")||to.equalsIgnoreCase("Брунейский доллар (BND)")) {

			unit_two = "BND";

		} else if (to.equalsIgnoreCase("Bulgarian Lev(BGN)")||to.equalsIgnoreCase("Болгарский лев (BGN)")) {

			unit_two = "BGN";

		} else if (to.equalsIgnoreCase("Burundi Franc (BIF)")||to.equalsIgnoreCase("Бурунди франк (BIF)")) {

			unit_two = "BIF";

		} else if (to.equalsIgnoreCase("Cambodia Riel (KHR)")||to.equalsIgnoreCase("Камбоджийский риель (KHR)")) {

			unit_two = "KHR";

		} else if (to.equalsIgnoreCase("Cape Verde Escudo (CVE)")||to.equalsIgnoreCase("Кабо-Верде Эскудо (CVE)")) {

			unit_two = "CVE";

		} else if (to.equalsIgnoreCase("Cayman Islands Dollar (KYD)")||to.equalsIgnoreCase("Доллар Каймановых островов (KYD)")) {

			unit_two = "KYD";

		} else if (to.equalsIgnoreCase("CFA Franc (BCEAO) (XOF)")||to.equalsIgnoreCase("Франк КФА (BCEAO) (XOF)")) {

			unit_two = "XOF";

		} else if (to.equalsIgnoreCase("CFA Franc (BEAC) (XAF)")||to.equalsIgnoreCase("Франк КФА (BEAC) (XAF)")) {

			unit_two = "XAF";

		} else if (to.equalsIgnoreCase("Chilean Peso (CLP)")||to.equalsIgnoreCase("Чилийское песо (CLP)")) {

			unit_two = "CLP";

		} else if (to.equalsIgnoreCase("Colombian Peso (COP)")||to.equalsIgnoreCase("Колумбийское песо (COP)")) {

			unit_two = "COP";

		} else if (to.equalsIgnoreCase("Comoros Franc (KMF)")||to.equalsIgnoreCase("Франк Коморских островов (KMF)")) {

			unit_two = "KMF";

		} else if (to.equalsIgnoreCase("Copper Pounds(XCP)")||to.equalsIgnoreCase("Медный Фунт (XCP)")) {

			unit_two = "XCP";

		} else if (to.equalsIgnoreCase("Costa Rica Colon (CRC)")||to.equalsIgnoreCase("Коста-Рика Колон (CRC)")) {

			unit_two = "CRC";

		} else if (to.equalsIgnoreCase("Croatian Kuna (HRK)")||to.equalsIgnoreCase("Хорватская куна (HRK)")) {

			unit_two = "HRK";

		} else if (to.equalsIgnoreCase("Cuban Peso (CUP)")||to.equalsIgnoreCase("Кубинское песо (CUP)")) {

			unit_two = "CUP";

		} else if (to.equalsIgnoreCase("Czech Koruna (CZK)")||to.equalsIgnoreCase("Чешская крона (CZK)")) {

			unit_two = "CZK";

		} else if (to.equalsIgnoreCase("Danish Krone (DKK)")||to.equalsIgnoreCase("Датская Крона (DKK)")) {

			unit_two = "DKK";

		} else if (to.equalsIgnoreCase("Dijibouti Franc (DJF)")||to.equalsIgnoreCase("Франк Джибути (DJF)")) {

			unit_two = "DJF";

		} else if (to.equalsIgnoreCase("Dominican Peso(DOP)")||to.equalsIgnoreCase("Доминиканский песо (DOP)")) {

			unit_two = "DOP";

		} else if (to.equalsIgnoreCase("East Caribbean Dollar (XCD)")||to.equalsIgnoreCase("Восточно-карибский доллар (XCD)")) {

			unit_two = "XCD";

		} else if (to.equalsIgnoreCase("Ecuador Sucre (ECS)")||to.equalsIgnoreCase("Эквадорский Сукре (ECS)")) {

			unit_two = "ECS";

		} else if (to.equalsIgnoreCase("Egyptian Pound(EGP)")||to.equalsIgnoreCase("Египетский фунт(EGP)")) {

			unit_two = "EGP";

		} else if (to.equalsIgnoreCase("El Salvador Colon (SVC)")||to.equalsIgnoreCase("Сальвадорский колон (SVC)")) {

			unit_two = "SVC";

		} else if (to.equalsIgnoreCase("Eritrea Nakfa (ERN)")||to.equalsIgnoreCase("Эритрея Накфа (ERN)")) {

			unit_two = "ERN";

		} else if (to.equalsIgnoreCase("Estonian Kroon (EEK)")||to.equalsIgnoreCase("Эстонская крона (EEK)")) {

			unit_two = "EEK";

		} else if (to.equalsIgnoreCase("Ethiopian Birr (ETB)")||to.equalsIgnoreCase("Эфиопский быр (ETB)")) {

			unit_two = "ETB";

		} else if (to.equalsIgnoreCase("Falkland Islands Pound (FKP)")||to.equalsIgnoreCase("Фунт Фолклендских островов (FKP)")) {

			unit_two = "FKP";

		} else if (to.equalsIgnoreCase("Fiji Dollar (FJD)")||to.equalsIgnoreCase("Доллар Фиджи (FJD)")) {

			unit_two = "FJD";

		} else if (to.equalsIgnoreCase("Gambian Dalasi (GMD)")||to.equalsIgnoreCase("Гамбийский даласи (GMD)")) {

			unit_two = "GMD";

		} else if (to.equalsIgnoreCase("Ghanian Cedi (GHC)")||to.equalsIgnoreCase("Ганский седи (GHC)")) {

			unit_two = "GHC";

		} else if (to.equalsIgnoreCase("Gibraltar Pound (GIP)")||to.equalsIgnoreCase("Гибралтарский фунт (GIP)")) {

			unit_two = "GIP";

		} else if (to.equalsIgnoreCase("Gold Ounces(XAU)")||to.equalsIgnoreCase("Унции золота (XAU)")) {

			unit_two = "XAU";

		} else if (to.equalsIgnoreCase("Guatemala Quetzal (GTQ)")||to.equalsIgnoreCase("Гватемальский кетцаль (GTQ)")) {

			unit_two = "GTQ";

		} else if (to.equalsIgnoreCase("Guinea Franc (GNF)")||to.equalsIgnoreCase("Гвинейский франк (GNF)")) {

			unit_two = "GNF";

		} else if (to.equalsIgnoreCase("Guyana Dollar (GYD)")||to.equalsIgnoreCase("Гайанский доллар (GYD)")) {

			unit_two = "GYD";

		} else if (to.equalsIgnoreCase("Haiti Gourde (HTG)")||to.equalsIgnoreCase("Гаитянский гурд (HTG)")) {

			unit_two = "HTG";

		} else if (to.equalsIgnoreCase("Honduras Lempira (HNL)")||to.equalsIgnoreCase("Гондурас лемпира (HNL)")) {

			unit_two = "HNL";

		} else if (to.equalsIgnoreCase("Hungarian Forint (HUF)")||to.equalsIgnoreCase("Венгерский форинт (HUF)")) {

			unit_two = "HUF";

		} else if (to.equalsIgnoreCase("Iceland Krona (ISK)")||to.equalsIgnoreCase("Исландская крона (ISK)")) {

			unit_two = "ISK";

		} else if (to.equalsIgnoreCase("Iran Rial (IRR)")||to.equalsIgnoreCase("Иранский риал (IRR)")) {

			unit_two = "IRR";

		} else if (to.equalsIgnoreCase("Iraqi Dinar (IQD)")||to.equalsIgnoreCase("Иракский Динар (IQD)")) {

			unit_two = "IQD";

		} else if (to.equalsIgnoreCase("Israeli Shekel (ILS)")||to.equalsIgnoreCase("Новый израильский шекель (ILS)")) {

			unit_two = "ILS";

		} else if (to.equalsIgnoreCase("Jamaican Dollar (JMD)")||to.equalsIgnoreCase("Ямайский доллар (JMD)")) {

			unit_two = "JMD";

		} else if (to.equalsIgnoreCase("Jordanian Dinar (JOD)")||to.equalsIgnoreCase("Иорданский динар (JOD)")) {

			unit_two = "JOD";

		} else if (to.equalsIgnoreCase("Kazakhstan Tenge (KZT)")||to.equalsIgnoreCase("Казахстанский тенге (KZT)")) {

			unit_two = "KZT";

		} else if (to.equalsIgnoreCase("Kenyan Shilling (KES)")||to.equalsIgnoreCase("Кенийский шиллинг (KES)")) {

			unit_two = "KES";

		} else if (to.equalsIgnoreCase("South Korean Won (KRW)")||to.equalsIgnoreCase("Южнокорейская вона (KRW)")) {

			unit_two = "KRW";

		} else if (to.equalsIgnoreCase("Kuwaiti Dinar (KWD)")||to.equalsIgnoreCase("Кувейтский динар (KWD)")) {

			unit_two = "KWD";

		} else if (to.equalsIgnoreCase("Lao Kip(LAK)")||to.equalsIgnoreCase("Кип Лаосской НДР (LAK)")) {

			unit_two = "LAK";

		} else if (to.equalsIgnoreCase("Latvian Lat (LVL)")||to.equalsIgnoreCase("Латвийский лат (LVL)")) {

			unit_two = "LVL";

		} else if (to.equalsIgnoreCase("Lebanese Pound (LBP)")||to.equalsIgnoreCase("Ливанский Фунт (LBP)")) {

			unit_two = "LBP";

		} else if (to.equalsIgnoreCase("Lesotho Loti (LSL)")||to.equalsIgnoreCase("Лоти Лесото (LSL)")) {

			unit_two = "LSL";

		} else if (to.equalsIgnoreCase("Liberian Dollar (LRD)")||to.equalsIgnoreCase("Либерийский доллар (LRD)")) {

			unit_two = "LRD";

		} else if (to.equalsIgnoreCase("Libyan Dinar (LYD)")||to.equalsIgnoreCase("Ливийский динар (LYD)")) {

			unit_two = "LYD";

		} else if (to.equalsIgnoreCase("Lithuanian Lita (LTL)")||to.equalsIgnoreCase("Литовский лит (LTL)")) {

			unit_two = "LTL";

		} else if (to.equalsIgnoreCase("Macau Pataca (MOP)")||to.equalsIgnoreCase("Патака Макао (MOP)")) {

			unit_two = "MOP";

		} else if (to.equalsIgnoreCase("Macedonian Denar (MKD)")||to.equalsIgnoreCase("Македонский динар (MKD)")) {

			unit_two = "MKD";

		} else if (to.equalsIgnoreCase("Malawi Kwacha (MWK)")||to.equalsIgnoreCase("Малави квача (MWK)")) {

			unit_two = "MWK";

		} else if (to.equalsIgnoreCase("Malaysian Ringgit(MYR)")||to.equalsIgnoreCase("Малайзийский ринггит(MYR)")) {

			unit_two = "MYR";

		} else if (to.equalsIgnoreCase("Maldives Rufiyaa (MVR)")||to.equalsIgnoreCase("Мальдивская руфия (MVR)")) {

			unit_two = "MVR";

		} else if (to.equalsIgnoreCase("Maltese Lira (MTL)")||to.equalsIgnoreCase("Мальтийская лира (MTL)")) {

			unit_two = "MTL";

		} else if (to.equalsIgnoreCase("Mauritania Ougulya(MRO)")||to.equalsIgnoreCase("Мавританская угия (MRO)")) {

			unit_two = "MRO";

		} else if (to.equalsIgnoreCase("Mauritius Rupee (MUR)")||to.equalsIgnoreCase("Маврикий рупия (MUR)")) {

			unit_two = "MUR";

		} else if (to.equalsIgnoreCase("Mexican Peso (MXN")||to.equalsIgnoreCase("Мексиканское песо (MXN)")) {

			unit_two = "MXN";

		} else if (to.equalsIgnoreCase("Moldovan Leu (MDL)")||to.equalsIgnoreCase("Молдавский лей (MDL)")) {

			unit_two = "MDL";

		} else if (to.equalsIgnoreCase("Mongolian Tugrik (MNT)")||to.equalsIgnoreCase("Монгольский Тугрик (MNT)")) {

			unit_two = "MNT";

		} else if (to.equalsIgnoreCase("Moroccan Dirham (MAD)")||to.equalsIgnoreCase("Марокканский дирхам (MAD)")) {

			unit_two = "MAD";

		} else if (to.equalsIgnoreCase("Myanmar Kyat (MMK)")||to.equalsIgnoreCase("Мьянма Кьят (MMK)")) {

			unit_two = "MMK";

		} else if (to.equalsIgnoreCase("Namibian Dollar (NAD)")||to.equalsIgnoreCase("Доллар Намибии (NAD)")) {

			unit_two = "NAD";

		} else if (to.equalsIgnoreCase("Nepalese Rupee (NPR)")||to.equalsIgnoreCase("Непальская рупия (NPR)")) {

			unit_two = "NPR";

		} else if (to.equalsIgnoreCase("Neth Antilles Guilder (ANG)")||to.equalsIgnoreCase("Антильский гульден (ANG)")) {

			unit_two = "ANG";

		} else if (to.equalsIgnoreCase("Turkish Lira(TRY)")||to.equalsIgnoreCase("Турецкая лира (TRY)")) {

			unit_two = "TRY";

		} else if (to.equalsIgnoreCase("New Zealand Dollar (NZD)")||to.equalsIgnoreCase("Новозеландский доллар (NZD)")) {

			unit_two = "NZD";

		} else if (to.equalsIgnoreCase("Nicaragua Cordoba (NIO)")||to.equalsIgnoreCase("Никарагуа Кордоба (NIO)")) {

			unit_two = "NIO";

		} else if (to.equalsIgnoreCase("Nigerian Naira(NGN)")||to.equalsIgnoreCase("Нигерийская найра (NGN)")) {

			unit_two = "NGN";

		} else if (to.equalsIgnoreCase("North Korean Won (KPW)")||to.equalsIgnoreCase("Северо-корейская вона (KPW)")) {

			unit_two = "KPW";

		} else if (to.equalsIgnoreCase("Norwegian Krone (NOK)")||to.equalsIgnoreCase("Норвежская крона (NOK)")) {

			unit_two = "NOK";

		} else if (to.equalsIgnoreCase("Omani Rial (OMR)")||to.equalsIgnoreCase("Оманский риал (OMR)")) {

			unit_two = "OMR";

		} else if (to.equalsIgnoreCase("Pacific Franc (XPF)")||to.equalsIgnoreCase("Французский тихоокеанский франк (XPF)")) {

			unit_two = "XPF";

		} else if (to.equalsIgnoreCase("Pakistani Rupee (PKR)")||to.equalsIgnoreCase("Пакистанская рупия (PKR)")) {

			unit_two = "PKR";

		} else if (to.equalsIgnoreCase("Palladium Ounces (XPD)")||to.equalsIgnoreCase("Палладий унция (XPD)")) {

			unit_two = "XPD";

		} else if (to.equalsIgnoreCase("Panama Balboa (PAB)")||to.equalsIgnoreCase("Панамский бальбоа (PAB)")) {

			unit_two = "PAB";

		} else if (to.equalsIgnoreCase("Papua New Guinea Kina (PGK)")||to.equalsIgnoreCase("Папуа-Новая Гвинея Кина (PGK)")) {

			unit_two = "PGK";

		} else if (to.equalsIgnoreCase("Paraguayan Guarani (PYG)")||to.equalsIgnoreCase("Парагвайский гуарани (PYG)")) {

			unit_two = "PYG";

		} else if (to.equalsIgnoreCase("Peruvian Nuevo Sol(PEN)")||to.equalsIgnoreCase("Перуанский новый соль (PEN)")) {

			unit_two = "PEN";

		} else if (to.equalsIgnoreCase("Philippine Peso (PHP)")||to.equalsIgnoreCase("Филиппинский песо (PHP)")) {

			unit_two = "PHP";

		} else if (to.equalsIgnoreCase("Platinum Ounces (XPT)")||to.equalsIgnoreCase("Платиновые унции (XPT)")) {

			unit_two = "XPT";

		} else if (to.equalsIgnoreCase("Polish Zloty (PLN)")||to.equalsIgnoreCase("Польский злотый (PLN)")) {

			unit_two = "PLN";

		} else if (to.equalsIgnoreCase("Qatar Rial (QAR)")||to.equalsIgnoreCase("Катарский риал (QAR)")) {

			unit_two = "QAR";

		} else if (to.equalsIgnoreCase("Romanian New Leu (RON)")||to.equalsIgnoreCase("Новый румынский лей (RON)")) {

			unit_two = "RON";

		} else if (to.equalsIgnoreCase("Russian Rouble (RUB)")||to.equalsIgnoreCase("Русский рубль (RUB)")) {

			unit_two = "RUB";

		} else if (to.equalsIgnoreCase("Rwanda Franc (RWF)")||to.equalsIgnoreCase("Руанда франк (RWF)")) {

			unit_two = "RWF";

		} else if (to.equalsIgnoreCase("Samoa Tala (WST)")||to.equalsIgnoreCase("Тала Самоа (WST)")) {

			unit_two = "WST";

		} else if (to.equalsIgnoreCase("Sao Tome Dobra (STD)")||to.equalsIgnoreCase("Добра Сан-Томе (STD)")) {

			unit_two = "STD";

		} else if (to.equalsIgnoreCase("Saudi Arabian Riyal (SAR)")||to.equalsIgnoreCase("Саудовский риял (SAR)")) {

			unit_two = "SAR";

		} else if (to.equalsIgnoreCase("Seychelles Rupee (SCR)")||to.equalsIgnoreCase("Сейшельская рупия (SCR)")) {

			unit_two = "SCR";

		} else if (to.equalsIgnoreCase("Sierra Leone Leone (SLL)")||to.equalsIgnoreCase("Сьерра-Леоне Леоне (SLL)")) {

			unit_two = "SLL";

		} else if (to.equalsIgnoreCase("Silver Ounces (XAG)")||to.equalsIgnoreCase("Серебряный унций (XAG)")) {

			unit_two = "XAG";

		} else if (to.equalsIgnoreCase("Singapore Dollar (SGD)")||to.equalsIgnoreCase("Сингапурский доллар (SGD)")) {

			unit_two = "SGD";

		} else if (to.equalsIgnoreCase("Slovak Koruna (SKK)")||to.equalsIgnoreCase("Словацкая крона (SKK)")) {

			unit_two = "SKK";

		} else if (to.equalsIgnoreCase("Slovenian Tolar (SIT)")||to.equalsIgnoreCase("Словенский толар (SIT)")) {

			unit_two = "SIT";

		} else if (to.equalsIgnoreCase("Solomon Islands Dollar (SBD)")||to.equalsIgnoreCase("Доллар Соломоновых островов (SBD)")) {

			unit_two = "SBD";

		} else if (to.equalsIgnoreCase("Somali Shilling (SOS)")||to.equalsIgnoreCase("Сомалийский шиллинг (SOS)")) {

			unit_two = "SOS";

		} else if (to.equalsIgnoreCase("South African Rand (ZAR)")||to.equalsIgnoreCase("Южноафриканский рэнд (ZAR)")) {

			unit_two = "ZAR";

		} else if (to.equalsIgnoreCase("Sri Lanka Rupee(LKR)")||to.equalsIgnoreCase("Шри-ланкийская рупия (LKR)")) {

			unit_two = "LKR";

		} else if (to.equalsIgnoreCase("St Helena Pound (SHP)")||to.equalsIgnoreCase("Фунт Святой Елены (SHP)")) {

			unit_two = "SHP";

		} else if (to.equalsIgnoreCase("Sudanese Pound (SDG)")||to.equalsIgnoreCase("Суданский фунт (SDG)")) {

			unit_two = "SDG";

		} else if (to.equalsIgnoreCase("Swaziland Lilageni(SZL)<")||to.equalsIgnoreCase("Свазиленд лилангени (SZL)")) {

			unit_two = "SZL";

		} else if (to.equalsIgnoreCase("Swedish Krona (SEK)")||to.equalsIgnoreCase("Шведская крона (SEK)")) {

			unit_two = "SEK";

		} else if (to.equalsIgnoreCase("Syrian Pound (SYP)")||to.equalsIgnoreCase("Сирийские фунты (SYP)")) {

			unit_two = "SYP";

		} else if (to.equalsIgnoreCase("Taiwan Dollar (TWD)")||to.equalsIgnoreCase("Тайваньский доллар (TWD)")) {

			unit_two = "TWD";

		} else if (to.equalsIgnoreCase("Tanzanian Shilling (TZS)")||to.equalsIgnoreCase("Танзанийский шиллинг (TZS)")) {

			unit_two = "TZS";

		} else if (to.equalsIgnoreCase("Tonga Pa\'ang (TOP)")||to.equalsIgnoreCase("Тонга паанга (TOP)")) {

			unit_two = "TOP";

		} else if (to.equalsIgnoreCase("Trinidad and Tobago Dollar (TTD)")||to.equalsIgnoreCase("Доллар Тринидада и Тобаго (TTD)")) {

			unit_two = "TTD";

		} else if (to.equalsIgnoreCase("Tunisian Dinar (TND)")||to.equalsIgnoreCase("Тунисский динар (TND)")) {

			unit_two = "TND";

		} else if (to.equalsIgnoreCase("UAE Dirham (AED)")||to.equalsIgnoreCase("Дирхам ОАЭ (AED)")) {

			unit_two = "AED";

		} else if (to.equalsIgnoreCase("Ugandan Shilling (UGX)")||to.equalsIgnoreCase("Угандийский шиллинг (UGX)")) {

			unit_two = "UGX";

		} else if (to.equalsIgnoreCase("Ukraine Hryvnia (UAH)")||to.equalsIgnoreCase("Гривна Украины (UAH)")) {

			unit_two = "UAH";

		} else if (to.equalsIgnoreCase("Uruguayan New Peso (UYU)")||to.equalsIgnoreCase("Уругвайский песо (UYU)")) {

			unit_two = "UYU";

		} else if (to.equalsIgnoreCase("Vanuatu Vatu (VUV)")||to.equalsIgnoreCase("Вануатский вату (VUV)")) {

			unit_two = "VUV";

		} else if (to.equalsIgnoreCase("Venezuelan Bolivar Fuerte(VEF)")||to.equalsIgnoreCase("Венесуэльский боливар фуэрте (VEF)")) {

			unit_two = "VEF";

		} else if (to.equalsIgnoreCase("Vietnam Dong (VND)")||to.equalsIgnoreCase("Вьетнамский донг (VND)")) {

			unit_two = "VND";

		} else if (to.equalsIgnoreCase("Yemen Riyal (YER)")||to.equalsIgnoreCase("Йеменский риал (YER)")) {

			unit_two = "YER";

		} else if (to.equalsIgnoreCase("Zambian Kwacha (ZMK)")||to.equalsIgnoreCase("Замбия квача (ZMK)")) {

			unit_two = "ZMK";

		} else if (to.equalsIgnoreCase("Zimbabwe dollar (ZWD)")||to.equalsIgnoreCase("Доллар Зимбабве (ZWD)")) {

			unit_two = "ZWD";

		}

		try {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);
			s = getJson("http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22"
					+ unit_one
					+ unit_two
					+ "%22)&format=json&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=");
			JSONObject jObj;
			jObj = new JSONObject(s);
			exResult = jObj.getJSONObject("query").getJSONObject("results")
					.getJSONObject("rate").getString("Rate");
				
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ----------
		finalValue = finalValue * (Double.valueOf(exResult));
		// -----------------------
		return String.valueOf(finalValue);
	}

	public String getJson(String url) throws ClientProtocolException,
			IOException {

		StringBuilder build = new StringBuilder();
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		HttpResponse response = client.execute(httpGet);
		HttpEntity entity = response.getEntity();
		InputStream content = entity.getContent();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				content));
		String con;
		while ((con = reader.readLine()) != null) {
			build.append(con);
		}
		return build.toString();
	}
}
