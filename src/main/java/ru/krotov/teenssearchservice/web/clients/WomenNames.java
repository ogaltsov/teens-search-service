package ru.krotov.teenssearchservice.web.clients;

import java.util.Arrays;
import java.util.List;

public class WomenNames {

	private static List<String> names = Arrays.asList(
			"Ава", "Августа", "Августина", "Авдотья", "Аврора", "Агапия", "Агата", "Агафья", "Аглая", "Агния", "Агунда", "Ада", "Аделаида", "Аделина", "Адель", "Адиля",
			"Адриана", "Аза", "Азалия", "Азиза", "Аида", "Аиша", "Айару", "Айгерим", "Айгуль", "Айлин", "Айнагуль", "Айнур", "Айсель", "Айсун", "Айсылу", "Аксинья", "Алёна",
			"Алана", "Алевтина", "Александра", "Алеста", "Алина", "Алиса", "Алия", "Алла", "Алсу", "Альба", "Альбина", "Альфия", "Аля", "Амалия", "Амина", "Амира", "Анаит",
			"Анастасия", "Ангелина", "Анжела", "Анжелика", "Анисья", "Анна", "Антонина", "Анфиса", "Аполлинария", "Арабелла", "Ариана", "Арина", "Асель", "Асия", "Астрид",
			"Ася", "Афина", "Аэлита", "Аяна ", "Б ", "Бажена", "Беатрис", "Бела", "Белинда", "Белла ", "Бэлла", "Берта", "Богдана", "Божена", "Бьянка ", "В ", "Валентина",
			"Валерия", "Ванда", "Ванесса", "Варвара", "Василина", "Василиса", "Венера", "Вера", "Вероника", "Веста", "Вета", "Викторина", "Виктория", "Вилена", "Виола", "Виолетта",
			"Вита", "Виталина ", "Виталия", "Влада", "Владана", "Владислава ", "Г ", "Габриэлла", "Галина", "Галия", "Генриетта", "Глафира", "Гоар", "Грета", "Гульзира", "Гульмира",
			"Гульназ", "Гульнара", "Гульшат", "Гюзель ", "Д ", "Далида", "Дамира", "Дана", "Даниэла", "Дания", "Дара", "Дарина", "Дарья", "Даяна", "Джамиля", "Дженна", "Дженнифер",
			"Джессика", "Джиневра", "Диана", "Дильназ", "Дильнара", "Диля", "Дилярам", "Дина", "Динара", "Долорес", "Доминика", "Домна", "Домника ", "Е ", "Ева", "Евангелина", "Евгения",
			"Евдокия", "Екатерина", "Елена", "Елизавета", "Есения ", "Ж ", "Жаклин", "Жанна", "Жансая", "Жасмин", "Жозефина", "Жоржина ", "З ", "Забава", "Заира", "Залина", "Замира", "Зара",
			"Зарема", "Зарина", "Земфира", "Зинаида", "Зита", "Злата", "Златослава", "Зоряна", "Зоя", "Зульфия", "Зухра ", "И ", "Иветта ", "Ивета", "Изабелла", "Иллирика", "Илона", "Ильзира",
			"Илюза", "Инга", "Индира", "Инесса", "Инна", "Иоанна", "Ира", "Ирада", "Ираида", "Ирина", "Ирма", "Искра", "Ия ", "К ", "Камила", "Камилла", "Кара", "Каре", "Карима", "Карина",
			"Каролина", "Кира", "Клавдия", "Клара", "Кора", "Корнелия", "Кристина", "Ксения ", "Л ", "Лада", "Лана", "Лара", "Лариса", "Лаура", "Лейла", "Леона", "Лера", "Леся", "Лета",
			"Лиана", "Лидия", "Лика", "Лили", "Лилиана", "Лилия", "Лина", "Линда", "Лиора", "Лира", "Лия", "Лола", "Лолита", "Лора", "Луиза", "Лукерья", "Лукия", "Любава", "Любовь", "Людмила",
			"Люсиль", "Люсьена", "Люция", "Люче", "Ляйсан", "Ляля ", "М ", "Мавиле", "Мавлюда", "Магда", "Магдалeна", "Мадина", "Мадлен", "Майя", "Макария", "Малика", "Мара", "Маргарита", "Марианна",
			"Марика", "Марина", "Мария", "Мариям", "Марта", "Марфа", "Мелания", "Мелисса", "Мика", "Мила", "Милада", "Милана", "Милен", "Милена", "Милица", "Милослава", "Мира", "Мирослава",
			"Мирра", "Мия", "Моника", "Муза ", "Н ", "Надежда", "Наиля", "Наима", "Нана", "Наоми", "Наргиза", "Наталья", "Нелли", "Нея", "Ника", "Николь", "Нина", "Нинель", "Номина", "Нора",
			"Нурия ", "О ", "Одетта", "Оксана", "Октябрина", "Олеся", "Оливия", "Ольга", "Офелия ", "П ", "Павлина", "Памела", "Патриция", "Паула", "Пейтон", "Пелагея", "Перизат", "Платонида",
			"Полина", "Прасковья ", "Р ", "Рада", "Разина", "Раиса", "Рамина", "Ребекка", "Регина", "Резеда", "Рена", "Рената", "Риана", "Рианна", "Рикарда", "Римма", "Рина", "Рита", "Рогнеда",
			"Роза", "Рузалия", "Рузанна", "Русалина", "Руслана", "Руфина", "Руфь ", "С ", "Сабина", "Сабрина", "Сажида", "Саида", "Самира", "Сандра", "Сания", "Сара", "Сати", "Сауле", "Сафия",
			"Сафура", "Светлана", "Севара", "Серафима", "Сильвия", "Снежана", "Соня", "Софья", "Стелла", "Стефания", "Сусанна ", "Т ", "Таисия", "Тамара", "Тамила", "Тара", "Татьяна", "Тая",
			"Таяна", "Теона", "Тереза", "Тина", "Томирис", "Тора ", "У ", "Ульяна", "Урсула", "Устинья ", "Ф ", "Фёкла", "Фазиля", "Фаина", "Фарида", "Фариза", "Фатима", "Феруза", "Физалия",
			"Фируза", "Флора", "Флорентина", "Флоренция ", "Флоренс", "Флориана", "Фредерика", "Фрида ", "Х ", "Хадия", "Хилари", "Хлоя ", "Ц ", "Цагана", "Цветана", "Цецилия ", "Сесилия",
			"Циара", "Сиара ", "Ч ", "Челси", "Чеслава", "Чулпан ", "Ш ", "Шакира", "Шарлотта", "Шахина", "Шейла", "Шелли", "Шерил ", "Э ", "Эвелина", "Эвита", "Элеонора", "Элиана", "Элиза",
			"Элина", "Элла", "Эльвина", "Эльвира", "Эльмира", "Эльнара", "Эля", "Эмили", "Эмилия", "Эмма", "Энже", "Эрика", "Эрмина", "Эсмеральда", "Эсмира", "Этель", "Этери ", "Ю ", "Юлианна",
			"Юлия", "Юна", "Юния", "Юнона ", "Я ", "Ядвига", "Яна", "Янина", "Ярина", "Ярослава", "Ясмина"

	);

	public static boolean isWoman(String name) {
		return names.contains(name);
	}

}
