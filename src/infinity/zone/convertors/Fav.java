package infinity.zone.convertors;

public class Fav {

	/**
	 * @param args
	 * @return
	 */
	public String fav(String from) {

		String codeCateguary = "0";

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Foot per second squared")
				|| from.equalsIgnoreCase("Фунт на секунду в квадрате")) {
			codeCateguary = "1";

		} else if (from.equalsIgnoreCase("Inch per second squared")
				|| from.equalsIgnoreCase("Дюйм на секунду в квадрате")) {
			codeCateguary = "1";

		} else if (from.equalsIgnoreCase("Kilometer per second squared")
				|| from.equalsIgnoreCase("Километр на секунду в квадрате")) {
			codeCateguary = "1";

		} else if (from.equalsIgnoreCase("Meter per second squared")
				|| from.equalsIgnoreCase("Метр на секунду в квадрате")) {
			codeCateguary = "1";

		} else if (from.equalsIgnoreCase("Mile per second squared")
				|| from.equalsIgnoreCase("Миля на секунду в квадрате")) {
			codeCateguary = "1";

		} else if (from.equalsIgnoreCase("Millimeter per second squared")
				|| from.equalsIgnoreCase("Миллиметр на секунду в квадрате")) {
			codeCateguary = "1";

		} else if (from.equalsIgnoreCase("Seconds from 0 to 100 km/h")
				|| from.equalsIgnoreCase("Секунд от 0 до 100 км/ч")) {
			codeCateguary = "1";

		} else if (from.equalsIgnoreCase("Seconds from 0 to 100 mph")
				|| from.equalsIgnoreCase("Секунд от 0 до 100 миль в час")) {
			codeCateguary = "1";

		} else if (from.equalsIgnoreCase("Seconds from 0 to 200 mph")
				|| from.equalsIgnoreCase("Секунд от 0 до 200 миль в час")) {
			codeCateguary = "1";

		} else if (from.equalsIgnoreCase("Seconds from 0 to 60 mph")
				|| from.equalsIgnoreCase("Секунд от 0 до 60 миль в час")) {

			codeCateguary = "1";
			// ------------------------------------------------------
		} else if (from.equalsIgnoreCase("Digree")
				|| from.equalsIgnoreCase("Градус")) {
			codeCateguary = "2";

		} else if (from.equalsIgnoreCase("Radian")
				|| from.equalsIgnoreCase("Радиан")) {
			codeCateguary = "2";

		} else if (from.equalsIgnoreCase("Circle")
				|| from.equalsIgnoreCase("Окружность")) {
			codeCateguary = "2";

		} else if (from.equalsIgnoreCase("Grad")
				|| from.equalsIgnoreCase("Град")) {
			codeCateguary = "2";

		} else if (from.equalsIgnoreCase("Sextant")
				|| from.equalsIgnoreCase("Секстант")) {
			codeCateguary = "2";

		} else if (from.equalsIgnoreCase("Minute")
				|| from.equalsIgnoreCase("Минута")) {
			codeCateguary = "2";

		} else if (from.equalsIgnoreCase("Second")
				|| from.equalsIgnoreCase("Секунда")) {
			codeCateguary = "2";

		}
		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Acre") || from.equalsIgnoreCase("Акр")) {
			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("Are") || from.equalsIgnoreCase("Ар")) {
			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("Barn")
				|| from.equalsIgnoreCase("Барн")) {
			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("Decare")
				|| from.equalsIgnoreCase("Декар")) {
			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("Hectare")
				|| from.equalsIgnoreCase("Гектар")) {
			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("Homestead")
				|| from.equalsIgnoreCase("Хомстед")) {
			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("Perch")
				|| from.equalsIgnoreCase("Перч")) {
			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("Rude")
				|| from.equalsIgnoreCase("Руд")) {
			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("Square")
				|| from.equalsIgnoreCase("Квадрат")) {
			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("SquareCentimeter")
				|| from.equalsIgnoreCase("Квадратный сантиметр")) {

			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("SquareDecimeter")
				|| from.equalsIgnoreCase("Квадратный дециметр")) {

			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("SquareFt")
				|| from.equalsIgnoreCase("Квадратный фут")) {

			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("SquareInch")
				|| from.equalsIgnoreCase("Квадратный дюйм")) {

			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("SquareKilometer")
				|| from.equalsIgnoreCase("Квадратный километр")) {

			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("SquareMeter")
				|| from.equalsIgnoreCase("Квадратный метр")) {

			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("SquareMile")
				|| from.equalsIgnoreCase("Квадратная миля")) {

			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("SquareMillimeter")
				|| from.equalsIgnoreCase("Квадратный миллиметр")) {

			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("SquareRod")
				|| from.equalsIgnoreCase("Квадратный род")) {

			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("SquareYard")
				|| from.equalsIgnoreCase("Квадратный ярд")) {

			codeCateguary = "3";

		} else if (from.equalsIgnoreCase("Township")
				|| from.equalsIgnoreCase("Тауншип")) {

			codeCateguary = "3";

		}

		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Euro (EUR)")
				|| from.equalsIgnoreCase("Евро (EUR)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("British Pound (GBP)")
				|| from.equalsIgnoreCase("Британский фунт стерлинг (GBP)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("United States Dollar (USD)")
				|| from.equalsIgnoreCase("Доллар США (USD)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Australian Dollar (AUD)")
				|| from.equalsIgnoreCase("Австралийский доллар (AUD)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Canadian Dollar (CAD)")
				|| from.equalsIgnoreCase("Канадский доллар (CAD)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Swiss Franc (CHF)")
				|| from.equalsIgnoreCase("Шведский франк (CHF)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("ChineseYuan (CNY)")
				|| from.equalsIgnoreCase("Китайский юань (CNY)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Hong Kong Dollar (HKD)")
				|| from.equalsIgnoreCase("Гонконгский доллар (HKD)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Indonesian Rupiah (IDR)")
				|| from.equalsIgnoreCase("Индонезийская рупия (IDR)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Indian Rupee(INR)")
				|| from.equalsIgnoreCase("Индийская рупия(INR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Japanese Yen (JPY)")
				|| from.equalsIgnoreCase("Японская иена (JPY)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Thai Baht (THB)")
				|| from.equalsIgnoreCase("Тайский бат (THB)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Albanian Lek (ALL)")
				|| from.equalsIgnoreCase("Албанский лек (ALL)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Algerian Dinar (DZD)")
				|| from.equalsIgnoreCase("Алжирский динар (DZD)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Aluminium Ounces (XAL)")
				|| from.equalsIgnoreCase("Алюминиевые унций (XAL)")) {
			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Argentine Peso (ARS)")
				|| from.equalsIgnoreCase("Аргентинский песо (ARS)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("ArubaFlorin (AWG)")
				|| from.equalsIgnoreCase("Флорин Арубы (AWG)")) {

			codeCateguary = "4";
		} else if (from.equalsIgnoreCase("Bahamian Dollar (BSD)")
				|| from.equalsIgnoreCase("Багамский доллар (BSD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Bahraini Dinar (BHD)")
				|| from.equalsIgnoreCase("Бахрейнский динар (BHD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Bangladesh Taka(BDT)")
				|| from.equalsIgnoreCase("Бангладеш така(BDT)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Barbados Dollar (BBD)")
				|| from.equalsIgnoreCase("Барбадосский доллар (BBD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Belarus Ruble (BYR)")
				|| from.equalsIgnoreCase("Белорусский рубль (BYR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Belize Dollar (BZD)")
				|| from.equalsIgnoreCase("Белизский доллар (BZD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Bermuda Dollar (BMD)")
				|| from.equalsIgnoreCase("Бермудский доллар (BMD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Bhutan Ngultrum (BTN)")
				|| from.equalsIgnoreCase("Бутанский Нгултрум (BTN)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Bolivian Boliviano (BOB)")
				|| from.equalsIgnoreCase("Боливийский Боливиано (BOB)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Botswana Pula (BWP)")
				|| from.equalsIgnoreCase("Ботсвана Пула (BWP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Brazilian Real (BRL)")
				|| from.equalsIgnoreCase("Бразильский реал (BRL)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Brunei Dollar (BND)")
				|| from.equalsIgnoreCase("Брунейский доллар (BND)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Bulgarian Lev(BGN)")
				|| from.equalsIgnoreCase("Болгарский лев (BGN)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Burundi Franc (BIF)")
				|| from.equalsIgnoreCase("Бурунди франк (BIF)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Cambodia Riel (KHR)")
				|| from.equalsIgnoreCase("Камбоджийский риель (KHR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Cape Verde Escudo (CVE)")
				|| from.equalsIgnoreCase("Кабо-Верде Эскудо (CVE)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Cayman Islands Dollar (KYD)")
				|| from.equalsIgnoreCase("Доллар Каймановых островов (KYD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("CFA Franc (BCEAO) (XOF)")
				|| from.equalsIgnoreCase("Франк КФА (BCEAO) (XOF)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("CFA Franc (BEAC) (XAF)")
				|| from.equalsIgnoreCase("Франк КФА (BEAC) (XAF)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Chilean Peso (CLP)")
				|| from.equalsIgnoreCase("Чилийское песо (CLP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Colombian Peso (COP)")
				|| from.equalsIgnoreCase("Колумбийское песо (COP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Comoros Franc (KMF)")
				|| from.equalsIgnoreCase("Франк Коморских островов (KMF)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Copper Pounds(XCP)")
				|| from.equalsIgnoreCase("Медный Фунт (XCP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Costa Rica Colon (CRC)")
				|| from.equalsIgnoreCase("Коста-Рика Колон (CRC)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Croatian Kuna (HRK)")
				|| from.equalsIgnoreCase("Хорватская куна (HRK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Cuban Peso (CUP)")
				|| from.equalsIgnoreCase("Кубинское песо (CUP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Czech Koruna (CZK)")
				|| from.equalsIgnoreCase("Чешская крона (CZK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Danish Krone (DKK)")
				|| from.equalsIgnoreCase("Датская Крона (DKK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Dijibouti Franc (DJF)")
				|| from.equalsIgnoreCase("Франк Джибути (DJF)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Dominican Peso(DOP)")
				|| from.equalsIgnoreCase("Доминиканский песо (DOP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("East Caribbean Dollar (XCD)")
				|| from.equalsIgnoreCase("Восточно-карибский доллар (XCD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Ecuador Sucre (ECS)")
				|| from.equalsIgnoreCase("Эквадорский Сукре (ECS)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Egyptian Pound(EGP)")
				|| from.equalsIgnoreCase("Египетский фунт(EGP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("El Salvador Colon (SVC)")
				|| from.equalsIgnoreCase("Сальвадорский колон (SVC)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Eritrea Nakfa (ERN)")
				|| from.equalsIgnoreCase("Эритрея Накфа (ERN)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Estonian Kroon (EEK)")
				|| from.equalsIgnoreCase("Эстонская крона (EEK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Ethiopian Birr (ETB)")
				|| from.equalsIgnoreCase("Эфиопский быр (ETB)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Falkland Islands Pound (FKP)")
				|| from.equalsIgnoreCase("Фунт Фолклендских островов (FKP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Fiji Dollar (FJD)")
				|| from.equalsIgnoreCase("Доллар Фиджи (FJD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Gambian Dalasi (GMD)")
				|| from.equalsIgnoreCase("Гамбийский даласи (GMD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Ghanian Cedi (GHC)")
				|| from.equalsIgnoreCase("Ганский седи (GHC)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Gibraltar Pound (GIP)")
				|| from.equalsIgnoreCase("Гибралтарский фунт (GIP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Gold Ounces(XAU)")
				|| from.equalsIgnoreCase("Унции золота (XAU)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Guatemala Quetzal (GTQ)")
				|| from.equalsIgnoreCase("Гватемальский кетцаль (GTQ)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Guinea Franc (GNF)")
				|| from.equalsIgnoreCase("Гвинейский франк (GNF)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Guyana Dollar (GYD)")
				|| from.equalsIgnoreCase("Гайанский доллар (GYD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Haiti Gourde (HTG)")
				|| from.equalsIgnoreCase("Гаитянский гурд (HTG)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Honduras Lempira (HNL)")
				|| from.equalsIgnoreCase("Гондурас лемпира (HNL)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Hungarian Forint (HUF)")
				|| from.equalsIgnoreCase("Венгерский форинт (HUF)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Iceland Krona (ISK)")
				|| from.equalsIgnoreCase("Исландская крона (ISK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Iran Rial (IRR)")
				|| from.equalsIgnoreCase("Иранский риал (IRR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Iraqi Dinar (IQD)")
				|| from.equalsIgnoreCase("Иракский Динар (IQD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Israeli Shekel (ILS)")
				|| from.equalsIgnoreCase("Новый израильский шекель (ILS)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Jamaican Dollar (JMD)")
				|| from.equalsIgnoreCase("Ямайский доллар (JMD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Jordanian Dinar (JOD)")
				|| from.equalsIgnoreCase("Иорданский динар (JOD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Kazakhstan Tenge (KZT)")
				|| from.equalsIgnoreCase("Казахстанский тенге (KZT)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Kenyan Shilling (KES)")
				|| from.equalsIgnoreCase("Кенийский шиллинг (KES)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("South Korean Won (KRW)")
				|| from.equalsIgnoreCase("Южнокорейская вона (KRW)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Kuwaiti Dinar (KWD)")
				|| from.equalsIgnoreCase("Кувейтский динар (KWD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Lao Kip(LAK)")
				|| from.equalsIgnoreCase("Кип Лаосской НДР (LAK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Latvian Lat (LVL)")
				|| from.equalsIgnoreCase("Латвийский лат (LVL)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Lebanese Pound (LBP)")
				|| from.equalsIgnoreCase("Ливанский Фунт (LBP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Lesotho Loti (LSL)")
				|| from.equalsIgnoreCase("Лоти Лесото (LSL)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Liberian Dollar (LRD)")
				|| from.equalsIgnoreCase("Либерийский доллар (LRD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Libyan Dinar (LYD)")
				|| from.equalsIgnoreCase("Ливийский динар (LYD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Lithuanian Lita (LTL)")
				|| from.equalsIgnoreCase("Литовский лит (LTL)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Macau Pataca (MOP)")
				|| from.equalsIgnoreCase("Патака Макао (MOP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Macedonian Denar (MKD)")
				|| from.equalsIgnoreCase("Македонский динар (MKD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Malawi Kwacha (MWK)")
				|| from.equalsIgnoreCase("Малави квача (MWK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Malaysian Ringgit(MYR)")
				|| from.equalsIgnoreCase("Малайзийский ринггит(MYR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Maldives Rufiyaa (MVR)")
				|| from.equalsIgnoreCase("Мальдивская руфия (MVR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Maltese Lira (MTL)")
				|| from.equalsIgnoreCase("Мальтийская лира (MTL)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Mauritania Ougulya(MRO)")
				|| from.equalsIgnoreCase("Мавританская угия (MRO)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Mauritius Rupee (MUR)")
				|| from.equalsIgnoreCase("Маврикий рупия (MUR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Mexican Peso (MXN")
				|| from.equalsIgnoreCase("Мексиканское песо (MXN)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Moldovan Leu (MDL)")
				|| from.equalsIgnoreCase("Молдавский лей (MDL)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Mongolian Tugrik (MNT)")
				|| from.equalsIgnoreCase("Монгольский Тугрик (MNT)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Moroccan Dirham (MAD)")
				|| from.equalsIgnoreCase("Марокканский дирхам (MAD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Myanmar Kyat (MMK)")
				|| from.equalsIgnoreCase("Мьянма Кьят (MMK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Namibian Dollar (NAD)")
				|| from.equalsIgnoreCase("Доллар Намибии (NAD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Nepalese Rupee (NPR)")
				|| from.equalsIgnoreCase("Непальская рупия (NPR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Neth Antilles Guilder (ANG)")
				|| from.equalsIgnoreCase("Антильский гульден (ANG)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Turkish Lira(TRY)")
				|| from.equalsIgnoreCase("Турецкая лира (TRY)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("New Zealand Dollar (NZD)")
				|| from.equalsIgnoreCase("Новозеландский доллар (NZD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Nicaragua Cordoba (NIO)")
				|| from.equalsIgnoreCase("Никарагуа Кордоба (NIO)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Nigerian Naira(NGN)")
				|| from.equalsIgnoreCase("Нигерийская найра (NGN)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("North Korean Won (KPW)")
				|| from.equalsIgnoreCase("Северо-корейская вона (KPW)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Norwegian Krone (NOK)")
				|| from.equalsIgnoreCase("Норвежская крона (NOK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Omani Rial (OMR)")
				|| from.equalsIgnoreCase("Оманский риал (OMR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Pacific Franc (XPF)")
				|| from.equalsIgnoreCase("Французский тихоокеанский франк (XPF)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Pakistani Rupee (PKR)")
				|| from.equalsIgnoreCase("Пакистанская рупия (PKR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Palladium Ounces (XPD)")
				|| from.equalsIgnoreCase("Палладий унция (XPD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Panama Balboa (PAB)")
				|| from.equalsIgnoreCase("Панамский бальбоа (PAB)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Papua New Guinea Kina (PGK)")
				|| from.equalsIgnoreCase("Папуа-Новая Гвинея Кина (PGK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Paraguayan Guarani (PYG)")
				|| from.equalsIgnoreCase("Парагвайский гуарани (PYG)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Peruvian Nuevo Sol(PEN)")
				|| from.equalsIgnoreCase("Перуанский новый соль (PEN)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Philippine Peso (PHP)")
				|| from.equalsIgnoreCase("Филиппинский песо (PHP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Platinum Ounces (XPT)")
				|| from.equalsIgnoreCase("Платиновые унции (XPT)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Polish Zloty (PLN)")
				|| from.equalsIgnoreCase("Польский злотый (PLN)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Qatar Rial (QAR)")
				|| from.equalsIgnoreCase("Катарский риал (QAR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Romanian New Leu (RON)")
				|| from.equalsIgnoreCase("Новый румынский лей (RON)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Russian Rouble (RUB)")
				|| from.equalsIgnoreCase("Русский рубль (RUB)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Rwanda Franc (RWF)")
				|| from.equalsIgnoreCase("Руанда франк (RWF)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Samoa Tala (WST)")
				|| from.equalsIgnoreCase("Тала Самоа (WST)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Sao Tome Dobra (STD)")
				|| from.equalsIgnoreCase("Добра Сан-Томе (STD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Saudi Arabian Riyal (SAR)")
				|| from.equalsIgnoreCase("Саудовский риял (SAR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Seychelles Rupee (SCR)")
				|| from.equalsIgnoreCase("Сейшельская рупия (SCR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Sierra Leone Leone (SLL)")
				|| from.equalsIgnoreCase("Сьерра-Леоне Леоне (SLL)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Silver Ounces (XAG)")
				|| from.equalsIgnoreCase("Серебряный унций (XAG)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Singapore Dollar (SGD)")
				|| from.equalsIgnoreCase("Сингапурский доллар (SGD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Slovak Koruna (SKK)")
				|| from.equalsIgnoreCase("Словацкая крона (SKK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Slovenian Tolar (SIT)")
				|| from.equalsIgnoreCase("Словенский толар (SIT)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Solomon Islands Dollar (SBD)")
				|| from.equalsIgnoreCase("Доллар Соломоновых островов (SBD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Somali Shilling (SOS)")
				|| from.equalsIgnoreCase("Сомалийский шиллинг (SOS)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("South African Rand (ZAR)")
				|| from.equalsIgnoreCase("Южноафриканский рэнд (ZAR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Sri Lanka Rupee(LKR)")
				|| from.equalsIgnoreCase("Шри-ланкийская рупия (LKR)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("St Helena Pound (SHP)")
				|| from.equalsIgnoreCase("Фунт Святой Елены (SHP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Sudanese Pound (SDG)")
				|| from.equalsIgnoreCase("Суданский фунт (SDG)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Swaziland Lilageni(SZL)<")
				|| from.equalsIgnoreCase("Свазиленд лилангени (SZL)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Swedish Krona (SEK)")
				|| from.equalsIgnoreCase("Шведская крона (SEK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Syrian Pound (SYP)")
				|| from.equalsIgnoreCase("Сирийские фунты (SYP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Taiwan Dollar (TWD)")
				|| from.equalsIgnoreCase("Тайваньский доллар (TWD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Tanzanian Shilling (TZS)")
				|| from.equalsIgnoreCase("Танзанийский шиллинг (TZS)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Tonga Pa\'ang (TOP)")
				|| from.equalsIgnoreCase("Тонга паанга (TOP)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Trinidad and Tobago Dollar (TTD)")
				|| from.equalsIgnoreCase("Доллар Тринидада и Тобаго (TTD)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Tunisian Dinar (TND)")
				|| from.equalsIgnoreCase("Тунисский динар (TND)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("UAE Dirham (AED)")
				|| from.equalsIgnoreCase("Дирхам ОАЭ (AED)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Ugandan Shilling (UGX)")
				|| from.equalsIgnoreCase("Угандийский шиллинг (UGX)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Ukraine Hryvnia (UAH)")
				|| from.equalsIgnoreCase("Гривна Украины (UAH)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Uruguayan New Peso (UYU)")
				|| from.equalsIgnoreCase("Уругвайский песо (UYU)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Vanuatu Vatu (VUV)")
				|| from.equalsIgnoreCase("Вануатский вату (VUV)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Venezuelan Bolivar Fuerte(VEF)")
				|| from.equalsIgnoreCase("Венесуэльский боливар фуэрте (VEF)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Vietnam Dong (VND)")
				|| from.equalsIgnoreCase("Вьетнамский донг (VND)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Yemen Riyal (YER)")
				|| from.equalsIgnoreCase("Йеменский риал (YER)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Zambian Kwacha (ZMK)")
				|| from.equalsIgnoreCase("Замбия квача (ZMK)")) {

			codeCateguary = "4";

		} else if (from.equalsIgnoreCase("Zimbabwe dollar (ZWD)")
				|| from.equalsIgnoreCase("Доллар Зимбабве (ZWD)")) {

			codeCateguary = "4";

		}
		// ------------------------------------------------------
		if (from.equalsIgnoreCase("Bit") || from.equalsIgnoreCase("Бит")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Byte")
				|| from.equalsIgnoreCase("Байт")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Exabit")
				|| from.equalsIgnoreCase("Эксабит")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Exabyte")
				|| from.equalsIgnoreCase("Эксабайт")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Gigabit")
				|| from.equalsIgnoreCase("Гигабит")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Gigabyte")
				|| from.equalsIgnoreCase("Гигабайт")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Kilobit")
				|| from.equalsIgnoreCase("Килобит")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Kilobyte")
				|| from.equalsIgnoreCase("Килобайт")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Megabit")
				|| from.equalsIgnoreCase("Мегабит")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Megabyte")
				|| from.equalsIgnoreCase("Мегабайт")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Petabit")
				|| from.equalsIgnoreCase("Петабит")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Petabyte")
				|| from.equalsIgnoreCase("Петабайт")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("Trabit")
				|| from.equalsIgnoreCase("Терабит")) {
			codeCateguary = "5";

		} else if (from.equalsIgnoreCase("TraByte")
				|| from.equalsIgnoreCase("Терабайт")) {
			codeCateguary = "5";

		}
		// ------------------------------------------------------

		else if (from.equalsIgnoreCase("Bit(P/s)")
				|| from.equalsIgnoreCase("Бит в секунду")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Byte(P/S)")
				|| from.equalsIgnoreCase("Байт в секунду")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Gigabit(P/S)")
				|| from.equalsIgnoreCase("Гигабит в секунду")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Gigabyte(P/S)")
				|| from.equalsIgnoreCase("Гигабайт в секунду")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Hour(P/Gigabyte)")
				|| from.equalsIgnoreCase("Час на гигабайт")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Hour(P/Megabyte)")
				|| from.equalsIgnoreCase("Час на мегабайт")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Kilobit(P/S)")
				|| from.equalsIgnoreCase("Килобит в секунду")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Kilobyte(P/S)")
				|| from.equalsIgnoreCase("Калобайт в секунду")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Megabit(P/S)")
				|| from.equalsIgnoreCase("Мегабит в секунду")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Megabyte(P/S)")
				|| from.equalsIgnoreCase("Мегабайт в секунду")) {

			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Minute(P/Gigabyte)")
				|| from.equalsIgnoreCase("Минута на гигабайт")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Minute(P/Megabyte)")
				|| from.equalsIgnoreCase("Минута на мегабайт")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Second(P/Gigabyte)")
				|| from.equalsIgnoreCase("Секунда на гигабайт")) {

			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Second(P/Megabyte)")
				|| from.equalsIgnoreCase("Секунда на мегабайт")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Terabit(P/S)")
				|| from.equalsIgnoreCase("Терабит в секунду")) {
			codeCateguary = "6";

		} else if (from.equalsIgnoreCase("Terabyte(P/S)")
				|| from.equalsIgnoreCase("Терабайт в секунду")) {

			codeCateguary = "6";

		}
		// ------------------------------------------------------
		if (from.equalsIgnoreCase("British Pounds(per gallon)")
				|| from.equalsIgnoreCase("Фунты на британский галлон")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Grams per cubic meter")
				|| from.equalsIgnoreCase("Грамм на кубометр")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Grams per liter")
				|| from.equalsIgnoreCase("Грамм на литр")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Grams per milliliter")
				|| from.equalsIgnoreCase("Грамм на миллилитр")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Kilogram per liter")
				|| from.equalsIgnoreCase("Килограмм на литр")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Kilograms per cubic meter")
				|| from.equalsIgnoreCase("Килограмм на кубометр")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Milligrams per cubic meter")
				|| from.equalsIgnoreCase("Миллиграм на кубометр")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Ounce per British gallon")
				|| from.equalsIgnoreCase("Унции на британский галлон")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Ounce per cubic foot (oz/ft3)")
				|| from.equalsIgnoreCase("Унции на кубический фунт")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Ounce per cubic inch (oz/in3)")
				|| from.equalsIgnoreCase("Унции на кубический дюйм")) {

			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Ounce per cubic yard (oz/yd3)")
				|| from.equalsIgnoreCase("Унции на кубический ярд")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Ounce per U.S. bushel")
				|| from.equalsIgnoreCase("Унции на бушель США")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Ounce per U.S. gallon (oz/gal)")
				|| from.equalsIgnoreCase("Унции на галлон США")) {

			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Pound per U.S. bushel")
				|| from.equalsIgnoreCase("Фунты на бушель США")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Pounds per cubic foot")
				|| from.equalsIgnoreCase("Фунты на кубический фут")) {
			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Pounds per cubic inch")
				|| from.equalsIgnoreCase("Фунты на кубический дюйм")) {

			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Pounds per cubic yard")
				|| from.equalsIgnoreCase("Фунты на кубический ярд")) {

			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Pounds per U.S. gallon")
				|| from.equalsIgnoreCase("Фунты на галлон США")) {

			codeCateguary = "7";

		} else if (from.equalsIgnoreCase("Ton per cubic meter")
				|| from.equalsIgnoreCase("Тонна на кубометр")) {

			codeCateguary = "7";

		}
		// -------------------------------------------------------------
		if (from.equalsIgnoreCase("Angstrom")
				|| from.equalsIgnoreCase("Ангстрем")) {
			codeCateguary = "8";

		} else if (from.equalsIgnoreCase("Barleycorn")
				|| from.equalsIgnoreCase("Барлейкорн")) {
			codeCateguary = "8";

		} else if (from.equalsIgnoreCase("Centimeter")
				|| from.equalsIgnoreCase("Сантиметр")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Chain")
				|| from.equalsIgnoreCase("Чейн")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Cubit")
				|| from.equalsIgnoreCase("Кубит")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Decimeter")
				|| from.equalsIgnoreCase("Дециметр")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Digit")
				|| from.equalsIgnoreCase("Диджит")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Ell") || from.equalsIgnoreCase("Эль")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Fathom")
				|| from.equalsIgnoreCase("Фантом")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Finger")
				|| from.equalsIgnoreCase("Фингер (палец)")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Foot")
				|| from.equalsIgnoreCase("Фут")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Furlong")
				|| from.equalsIgnoreCase("Фарлонг")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Hand")
				|| from.equalsIgnoreCase("Хенд (рука)")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Inch")
				|| from.equalsIgnoreCase("Дюйм")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Kilometer")
				|| from.equalsIgnoreCase("Километр")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("League")
				|| from.equalsIgnoreCase("Лига, лье")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Line")
				|| from.equalsIgnoreCase("Линия")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Link")
				|| from.equalsIgnoreCase("Линк")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Meter")
				|| from.equalsIgnoreCase("Метр")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Microinch")
				|| from.equalsIgnoreCase("Микродюйм")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Mikrometer")
				|| from.equalsIgnoreCase("Микрометр")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Mil") || from.equalsIgnoreCase("Мил")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Mile")
				|| from.equalsIgnoreCase("Миля")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Millimeter")
				|| from.equalsIgnoreCase("Миллиметр")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Nail")
				|| from.equalsIgnoreCase("Ноготь")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Nanometer")
				|| from.equalsIgnoreCase("Нанометр")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Palm")
				|| from.equalsIgnoreCase("Палм (ладонь)")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Perch")
				|| from.equalsIgnoreCase("Перчь")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Rod") || from.equalsIgnoreCase("Род")) {
			codeCateguary = "8";
		} else if (from.equalsIgnoreCase("Yard")
				|| from.equalsIgnoreCase("Ярд")) {
			codeCateguary = "8";
		}

		// ---------------------------------------------------------------
		if (from.equalsIgnoreCase("megajoule (MJ)")
				|| from.equalsIgnoreCase("Мегаджоуль (МДж)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("kilojoule (kJ)")
				|| from.equalsIgnoreCase("Килоджоуль (кДж)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("joule (J)")
				|| from.equalsIgnoreCase("Джоуль (Дж)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("megacalorie (Mcal)")
				|| from.equalsIgnoreCase("Мегаколория (МКал)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("kilocalorie (kcal)")
				|| from.equalsIgnoreCase("Килокалория (кКал)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("metre-kilogram (mkg)")
				|| from.equalsIgnoreCase("Метр-килограмм (м*кг)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("calorie (cal)")
				|| from.equalsIgnoreCase("Калория (Кал)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("kilowatt hour (kW*h)")
				|| from.equalsIgnoreCase("Киловатт час (кВт*час)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("watt hour (W*h)")
				|| from.equalsIgnoreCase("Ватт час (Вт*час)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("watt second (W*s)")
				|| from.equalsIgnoreCase("Ватт секунда (Вт*сек)")) {

			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("erg") || from.equalsIgnoreCase("Эрг")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("electronvolt (eV)")
				|| from.equalsIgnoreCase("Электронвольт (эВ)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("quad")
				|| from.equalsIgnoreCase("Квад")) {

			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("therm")
				|| from.equalsIgnoreCase("Терм")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("British Thermal Unit (BTU)")
				|| from.equalsIgnoreCase("Британская термальная единица (BTU)")) {
			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("Million BTU")
				|| from.equalsIgnoreCase("Миллион BTU")) {

			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("Foot-Pound")
				|| from.equalsIgnoreCase("Фут-фунт")) {

			codeCateguary = "9";
		} else if (from.equalsIgnoreCase("tonne (metric) of TNT")
				|| from.equalsIgnoreCase("Тонна тротила (метрич)")) {

			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("ton of TNT")
				|| from.equalsIgnoreCase("Тонна тротила (США)")) {

			codeCateguary = "9";

		} else if (from.equalsIgnoreCase("kilogram of TNT")
				|| from.equalsIgnoreCase("Килограмм тротила")) {

			codeCateguary = "9";

		}
		// ---------------------------------------------------------------
		if (from.equalsIgnoreCase("Gram-force")
				|| from.equalsIgnoreCase("Грамм-сила")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Grave-force (Gf)")
				|| from.equalsIgnoreCase("Грейв-сила (Gf)")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Gravet-force (gf)")
				|| from.equalsIgnoreCase("Гравет-сила (gf)")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Kilogram-force (kgf)")
				|| from.equalsIgnoreCase("Килограмм-сила (kgf)")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Kilonewton")
				|| from.equalsIgnoreCase("Килоньютон")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Kilopond (kp)")
				|| from.equalsIgnoreCase("Килофунт (kp)")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Meganewton")
				|| from.equalsIgnoreCase("Меганьютон")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Micronewton")
				|| from.equalsIgnoreCase("Микроньютон")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Milligram-force")
				|| from.equalsIgnoreCase("Миллиграмм-сила")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Milligrave-force (mGf)")
				|| from.equalsIgnoreCase("Миллигрейв-сила (mGf)")) {

			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Millinewton")
				|| from.equalsIgnoreCase("Миллиньютон")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Newton")
				|| from.equalsIgnoreCase("Ньютон")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Ounce-force (ozf)")
				|| from.equalsIgnoreCase("Унция-сила (ozf)")) {

			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Pound-force (lbf)")
				|| from.equalsIgnoreCase("Фунт-сила (lbf)")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Ton-force (tnf)")
				|| from.equalsIgnoreCase("Тонна-сила (tnf)")) {
			codeCateguary = "10";

		} else if (from.equalsIgnoreCase("Tonne-force")
				|| from.equalsIgnoreCase("Тонна-сила (тс)")) {

			codeCateguary = "10";

		}
		// ---------------------------------------------------------------
		if (from.equalsIgnoreCase("megawatt")
				|| from.equalsIgnoreCase("Мегаватт")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("kilowatt")
				|| from.equalsIgnoreCase("Киловатт")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("watt")
				|| from.equalsIgnoreCase("Ватт")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("volt-ampere (VA)")
				|| from.equalsIgnoreCase("Вольт-Ампер (ВА)")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("gigacalories per second")
				|| from.equalsIgnoreCase("Гигакалорий в секунду")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("kilocalories per second")
				|| from.equalsIgnoreCase("Килокалорий в секунду")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("calories per second")
				|| from.equalsIgnoreCase("Калорий в секунду")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("gigacalories per hour")
				|| from.equalsIgnoreCase("Гигакалорий в час")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("kilocalories per hour")
				|| from.equalsIgnoreCase("Килокалорий в час")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("calories per hour")
				|| from.equalsIgnoreCase("Калорий в час")) {

			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("horsepower,boiler")
				|| from.equalsIgnoreCase("Котловая лошадиная сила")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("horsepower,electric")
				|| from.equalsIgnoreCase("Электрическая лошадиная сила")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("horsepower,hydraulic")
				|| from.equalsIgnoreCase("Гидравлическая лошадиная сила")) {

			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("horsepower,mechanical (imperial)")
				|| from.equalsIgnoreCase("Механическая лошадиная сила")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("horsepower,metric")
				|| from.equalsIgnoreCase("Метрическая лошадиная сила")) {
			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("kilogramm-force meter per second")
				|| from.equalsIgnoreCase("Килограмм-сила метр в секунду")) {

			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("joule per second")
				|| from.equalsIgnoreCase("Джоуль в секунду")) {

			codeCateguary = "11";
		} else if (from.equalsIgnoreCase("joule per hour")
				|| from.equalsIgnoreCase("Джоуль в час")) {

			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("erg per second")
				|| from.equalsIgnoreCase("Эрг в секунду")) {

			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("metric refrigeration ton (RT)")
				|| from.equalsIgnoreCase("Метрическая тонна охлаждения")) {

			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("U.S. refrigeration ton (USRT)")
				|| from.equalsIgnoreCase("Американская тонна охлаждения")) {

			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("British Thermal Unit per second")
				|| from.equalsIgnoreCase("Британская термальная единица в секунду")) {

			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("British Thermal Unit per minute")
				|| from.equalsIgnoreCase("Британская термальная единица в минуту")) {

			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("British Thermal Unit per hour")
				|| from.equalsIgnoreCase("Британская термальная единица в час")) {

			codeCateguary = "11";

		} else if (from.equalsIgnoreCase("foot pound-force per second")
				|| from.equalsIgnoreCase("Фут фунт-сила в секунду")) {

			codeCateguary = "11";

		}
		// ---------------------------------------------------------------
		if (from.equalsIgnoreCase("Bar") || from.equalsIgnoreCase("Бар")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Centimeter of mercury")
				|| from.equalsIgnoreCase("Сантиметр ртутного столба")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("hectopascal (hPa)")
				|| from.equalsIgnoreCase("Гектопаскаль (гПа)")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Inch of mercury")
				|| from.equalsIgnoreCase("Дюйм ртутного столба")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Kilogram per square centimeter")
				|| from.equalsIgnoreCase("Килограмм силы на квадратный сантиметр")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Kilogram per square meter")
				|| from.equalsIgnoreCase("Килограмм силы на квадратный метр")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Kilonewton per square meter")
				|| from.equalsIgnoreCase("Килоньютон на квадратный метр")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Kilopascal (kPa)")
				|| from.equalsIgnoreCase("Килопаскаль (кПа)")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Long ton (U.K.) per square foot")
				|| from.equalsIgnoreCase("Британская тонна силы на квадратный  фут")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Long ton (U.K.) per square inch")
				|| from.equalsIgnoreCase("Британская тонна силы на квадратный дюйм")) {

			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("meganewton per square meter")
				|| from.equalsIgnoreCase("Меганьютон на квадратный метр")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Megapascal (MPa)")
				|| from.equalsIgnoreCase("Мегапаскаль (МПа)")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Millibar")
				|| from.equalsIgnoreCase("Миллибар")) {

			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Millimeter of mercury (torr)")
				|| from.equalsIgnoreCase("Миллиметр ртутного столба (торр)")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Newton per square centimeter")
				|| from.equalsIgnoreCase("Ньютон на квадратный сантиметр")) {
			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Newton per square meter")
				|| from.equalsIgnoreCase("Ньютон на квадратный метр")) {

			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Newton per square millimeter")
				|| from.equalsIgnoreCase("Ньютон на квадратный миллиметр")) {

			codeCateguary = "12";
		} else if (from.equalsIgnoreCase("Pascal (Pa)")
				|| from.equalsIgnoreCase("Паскаль (Па)")) {

			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Physical atmosphere (atm)")
				|| from.equalsIgnoreCase("Физическая атмосфера")) {

			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Pound per square foot")
				|| from.equalsIgnoreCase("Фунт на квадратный фут")) {

			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Pound per square inch")
				|| from.equalsIgnoreCase("Фунт на квадратный дюйм")) {

			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("technical atmosphere")
				|| from.equalsIgnoreCase("Техническая атмосфера")) {

			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Thousand pounds per square inch")
				|| from.equalsIgnoreCase("1000 фунтов на квадратный дюйм")) {

			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Ton (U.S.) per square foot")
				|| from.equalsIgnoreCase("Тонна силы на квадратный фут (США)")) {

			codeCateguary = "12";

		} else if (from.equalsIgnoreCase("Ton (U.S.) per square inch")
				|| from.equalsIgnoreCase("Тонна силы на квадратный дюйм")) {

			codeCateguary = "12";

		}
		// ---------------------------------------------------------------
		if (from.equalsIgnoreCase("Foot per minute")
				|| from.equalsIgnoreCase("Фут в минуту")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Foot per second")
				|| from.equalsIgnoreCase("Фут в секунду")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("kilometer per hour")
				|| from.equalsIgnoreCase("Километр в час (км/ч)")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Kilometer per second (km/s)")
				|| from.equalsIgnoreCase("Километр в секунду (км/с)")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Knot")
				|| from.equalsIgnoreCase("Узел")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Meter per minute")
				|| from.equalsIgnoreCase("Метр в минуту")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Meter per second (m/s)")
				|| from.equalsIgnoreCase("Метр в секунду (м/с)")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Mile per hour (mph)")
				|| from.equalsIgnoreCase("Миля в час")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Mile per second")
				|| from.equalsIgnoreCase("Миля в секунду")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Minute per kilometer")
				|| from.equalsIgnoreCase("Минута на километр")) {

			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Minute per mile")
				|| from.equalsIgnoreCase("Минута на милю")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Sea mile per hour")
				|| from.equalsIgnoreCase("Морская миля в час")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Second per 100 metres")
				|| from.equalsIgnoreCase("Секунда на стометровку")) {

			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Second per 100 yards")
				|| from.equalsIgnoreCase("Секунда на сто ярдов")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Second per kilometer")
				|| from.equalsIgnoreCase("Секунда на километр")) {
			codeCateguary = "13";

		} else if (from.equalsIgnoreCase("Second per mile")
				|| from.equalsIgnoreCase("Секунда на милю")) {

			codeCateguary = "13";

		}
		// ---------------------------------------------------------------
		if (from.equalsIgnoreCase("Degrees Celsius")
				|| from.equalsIgnoreCase("Градус Цельсия")) {
			codeCateguary = "14";

		} else if (from.equalsIgnoreCase("Degrees Delisle")
				|| from.equalsIgnoreCase("Градус Делиля")) {
			codeCateguary = "14";

		} else if (from.equalsIgnoreCase("Degrees Fahrenheit")
				|| from.equalsIgnoreCase("Градус Фаренгейта")) {
			codeCateguary = "14";

		} else if (from.equalsIgnoreCase("Degrees Newton")
				|| from.equalsIgnoreCase("Градус Ньютона")) {
			codeCateguary = "14";

		} else if (from.equalsIgnoreCase("Degrees Rankine)")
				|| from.equalsIgnoreCase("Градус Ранкина")) {
			codeCateguary = "14";

		} else if (from.equalsIgnoreCase("Degrees Reaumur")
				|| from.equalsIgnoreCase("Градус Реомюра")) {
			codeCateguary = "14";

		} else if (from.equalsIgnoreCase("Degrees Rømer")
				|| from.equalsIgnoreCase("Градус Рёмера")) {
			codeCateguary = "14";

		} else if (from.equalsIgnoreCase("Kelvin")
				|| from.equalsIgnoreCase("Кельвин")) {
			codeCateguary = "14";

		}
		// ---------------------------------------------------------------
		if (from.equalsIgnoreCase("Anomalistic month")
				|| from.equalsIgnoreCase("Аномалистический месяц")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Anomalistic year")
				|| from.equalsIgnoreCase("Аномалистический год")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Calendar month")
				|| from.equalsIgnoreCase("Календарный месяц")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Century")
				|| from.equalsIgnoreCase("Век")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Day")
				|| from.equalsIgnoreCase("День")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Dracontic month")
				|| from.equalsIgnoreCase("Драконический месяц")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Dracontic year")
				|| from.equalsIgnoreCase("Драконический год")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Gregorian year")
				|| from.equalsIgnoreCase("Грегорианский год")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Hour")
				|| from.equalsIgnoreCase("Час")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Julian year")
				|| from.equalsIgnoreCase("Юлианский год")) {

			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Minute")
				|| from.equalsIgnoreCase("Минута")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Second")
				|| from.equalsIgnoreCase("Секунда")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Syderic month")
				|| from.equalsIgnoreCase("Сидерический месяц")) {

			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Syderic year")
				|| from.equalsIgnoreCase("Сидерический год")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Synodic month")
				|| from.equalsIgnoreCase("Синодический месяц")) {
			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Tropic year")
				|| from.equalsIgnoreCase("Тропический год")) {

			codeCateguary = "15";

		} else if (from.equalsIgnoreCase("Week")
				|| from.equalsIgnoreCase("Неделя")) {

			codeCateguary = "15";
		}
		// ---------------------------------------------------------------
		if (from.equalsIgnoreCase("AcreFoot")
				|| from.equalsIgnoreCase("Акр-фут")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Barrel") || from.equalsIgnoreCase("Баррель")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Centiliter")
				|| from.equalsIgnoreCase("Сантилитр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("CubicCentimeter")
				|| from.equalsIgnoreCase("Кубический сантиметр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("CubicDecimeter")
				|| from.equalsIgnoreCase("Кубический дециметр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("CubicFoot")
				|| from.equalsIgnoreCase("Кубический фут")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("CubicInch")
				|| from.equalsIgnoreCase("Кубический дюйм")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("CubicKilometer")
				|| from.equalsIgnoreCase("Кубический километр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("CubicMeter")
				|| from.equalsIgnoreCase("Кубический метр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("CubicMillimeter")
				|| from.equalsIgnoreCase("Кубический миллиметр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("CubicYard")
				|| from.equalsIgnoreCase("Кубический ярд")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Cup") || from.equalsIgnoreCase("Стакан")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Decaliter")
				|| from.equalsIgnoreCase("Декалитр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Deciliter")
				|| from.equalsIgnoreCase("Децилитр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("FluidDram")
				|| from.equalsIgnoreCase("Жидкая драхма")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("FluidOunce")
				|| from.equalsIgnoreCase("Жидкая унция")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Gallon") || from.equalsIgnoreCase("Галлон")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Gill") || from.equalsIgnoreCase("Гилл")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Hectoliter")
				|| from.equalsIgnoreCase("Гектолитр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Liter") || from.equalsIgnoreCase("Литр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Microliter")
				|| from.equalsIgnoreCase("Микролитр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Milliliter")
				|| from.equalsIgnoreCase("Миллилитр")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Minim") || from.equalsIgnoreCase("Миним")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Pint") || from.equalsIgnoreCase("Пинта")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Quart") || from.equalsIgnoreCase("Кварта")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Tablespoon")
				|| from.equalsIgnoreCase("Столовая ложка")) {
			codeCateguary = "16";

		}
		if (from.equalsIgnoreCase("Teaspoon")
				|| from.equalsIgnoreCase("Чайная ложка")) {
			codeCateguary = "16";

		}
		// ---------------------------------------------------------------
		if (from.equalsIgnoreCase("Atomic mass unit")
				|| from.equalsIgnoreCase("Единица атомной массы")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Carat")
				|| from.equalsIgnoreCase("Карат")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Centigram")
				|| from.equalsIgnoreCase("Центиграмм")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Centner")
				|| from.equalsIgnoreCase("Центнер")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Dram")
				|| from.equalsIgnoreCase("Драхма")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Grain")
				|| from.equalsIgnoreCase("Гран")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Gram")
				|| from.equalsIgnoreCase("Грамм")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Kilogram")
				|| from.equalsIgnoreCase("Килограмм")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Kilonewton (on Earth surface)")
				|| from.equalsIgnoreCase("Килоньютон (на поверхности земли)")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Kilotonne")
				|| from.equalsIgnoreCase("Килотонна")) {

			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Long hundredweight (UK)")
				|| from.equalsIgnoreCase("Длинный центнер (брит)")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Long ton (UK)")
				|| from.equalsIgnoreCase("Длинная тонна (брит)")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Microgram")
				|| from.equalsIgnoreCase("Микрограмм")) {

			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Milligram")
				|| from.equalsIgnoreCase("Миллиграмм")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Newton (on Earth surface)")
				|| from.equalsIgnoreCase("Ньютон (на поверхности земли)")) {
			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Ounce")
				|| from.equalsIgnoreCase("Унция")) {

			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Pound")
				|| from.equalsIgnoreCase("Фунт")) {

			codeCateguary = "17";
		} else if (from.equalsIgnoreCase("Short hundredweight (US)")
				|| from.equalsIgnoreCase("Короткий центнер (США)")) {

			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Short ton (US)")
				|| from.equalsIgnoreCase("Короткая тонна (США)")) {

			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Stone")
				|| from.equalsIgnoreCase("Стоун")) {

			codeCateguary = "17";

		} else if (from.equalsIgnoreCase("Tonne")
				|| from.equalsIgnoreCase("Тонна")) {

			codeCateguary = "17";

		}
		// ---------------------------------------------------------------

		return codeCateguary;
	}
}
