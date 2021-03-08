public class Main {
    public static void main(String[] args) {
        Apartment apartmentOne = new Apartment();
        apartmentOne.id = 1904629472;
        apartmentOne.url = "https://www.avito.ru/kazan/kvartiry/1-k._kvartira_31_m1219_et._1904629472";
        apartmentOne.image = "https://16.img.avito.st/image/1/Zbt64rayyVJMSwtXPNNSnYFByVTaQ8s";
        apartmentOne.numberOfRooms = 1;
        apartmentOne.area = 31.2;
        apartmentOne.floor = 9;
        apartmentOne.totalFloor = 19;
        apartmentOne.price = 4_046_000;
        apartmentOne.residentialComplex = "ЖК 'Станция Спортивная'";
        apartmentOne.address = "пр.Детский, д. 1.2";
        apartmentOne.district = "р-н Приволжский";
        apartmentOne.realEstateAgency = "Агенство";
        apartmentOne.like = false;
        apartmentOne.created = 1;
        System.out.println(apartmentOne);
        System.out.println();


        Apartment apartmentTwo = new Apartment();
        apartmentTwo.id = 2023270958;
        apartmentTwo.url = "https://www.avito.ru/kazan/kvartiry/1-k._kvartira_33_m_1719_et._2023270958";
        apartmentTwo.image = "https://93.img.avito.st/image/1/bCnGNbaywMDwnALFknRqBDqWwMZmlMI";
        apartmentTwo.numberOfRooms = 1;
        apartmentTwo.area = 33;
        apartmentTwo.floor = 17;
        apartmentTwo.totalFloor = 19;
        apartmentTwo.price = 4_350_000;
        apartmentTwo.residentialComplex = "ЖК 'Казань XXI век'";
        apartmentTwo.address = "пр-т Альберта Камалеева, д. 32Б";
        apartmentTwo.metroStation = "м. Горки";
        apartmentTwo.distanceToMetro = 2.5;
        apartmentTwo.realEstateAgency = "Агенство недвижимости 'Ключ'";
        apartmentTwo.like = false;
        apartmentTwo.created = 2;
        System.out.println(apartmentTwo);
        System.out.println();

        Apartment apartmentThree = new Apartment();
        apartmentThree.id = 2023291230;
        apartmentThree.url = "https://www.avito.ru/kazan/kvartiry/3-k._kvartira_1321_m_45_et._2023291230";
        apartmentThree.image = "https://90.img.avito.st/image/1/-yjDVrayV8H1_5XEuW3sdjz1V8dj91U";
        apartmentThree.numberOfRooms = 3;
        apartmentThree.area = 132.1;
        apartmentThree.floor = 4;
        apartmentThree.totalFloor = 5;
        apartmentThree.price = 21_150_000;
        apartmentThree.verification = "Проверена в ЕГРН";
        apartmentThree.address = "ул. Карла Маркса, 39А";
        apartmentThree.metroStation = "м. Площадь Тукая";
        apartmentThree.distanceToMetro = 1.1;
        apartmentThree.realEstateAgency = "Агенство недвижимости 'Ключ'";
        apartmentThree.like = false;
        apartmentThree.created = 3;
        System.out.println(apartmentThree);


    }
}
