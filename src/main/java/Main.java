public class Main {
    public static void main(String[] args) {
        Apartment apartmentOne = new Apartment();
        apartmentOne.numberOfRooms = 1;
        apartmentOne.area = 31.2;
        apartmentOne.floor = 9;
        apartmentOne.price = 4_046_000;
        apartmentOne.residentialComplex = "ЖК Станция Спортивная";
        apartmentOne.address = "пр.Детский, д. 1.2";
        apartmentOne.district = "р-н Приволжский";
        apartmentOne.realEstateAgency = "Агенство";
        System.out.println(apartmentOne);

        Apartment apartmentTwo = new Apartment();
        apartmentTwo.numberOfRooms = 1;
        apartmentTwo.area = 33;
        apartmentTwo.floor = 17;
        apartmentTwo.price = 4_350_000;
        apartmentTwo.residentialComplex = "ЖК Казань XXI век";
        apartmentTwo.address = "пр-т Альберта Камалеева, д. 32Б";
        apartmentTwo.metroStation = "Горки";
        apartmentTwo.distanceToMetro = 2.5;
        apartmentTwo.realEstateAgency = "Агенство недвижимости Ключ";
        System.out.println(apartmentTwo);

        Apartment apartmentThree = new Apartment();
        apartmentThree.numberOfRooms = 3;
        apartmentThree.area = 132.1;
        apartmentThree.floor = 4;
        apartmentThree.price = 21_150_000;
        apartmentThree.verification = "Проверена в ЕГРН";
        apartmentThree.address = "ул. Карла Маркса, 39А";
        apartmentThree.metroStation = "Площадь Тукая";
        apartmentThree.distanceToMetro = 1.1;
        apartmentThree.realEstateAgency = "Агенство недвижимости Ключ";
        System.out.println(apartmentThree);


    }
}
