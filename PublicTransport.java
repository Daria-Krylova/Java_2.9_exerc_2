// Создаем пакет для общественного транспорта
package publictransport;

// Интерфейс для общественного транспорта
public interface PublicTransport {
    void start();
    void stop();
}

// Класс автобуса, который является общественным транспортом
package publictransport;

public class Bus implements PublicTransport {
    @Override
    public void start() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус остановился");
    }
}

// Класс троллейбуса, который также является общественным транспортом
package publictransport;

public class Trolleybus implements PublicTransport {
    @Override
    public void start() {
        System.out.println("Троллейбус начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Троллейбус остановился");
    }
}

// Создаем пакет для военной техники
package military;

// Интерфейс для военной техники
public interface MilitaryVehicle {
    void deploy();
    void retreat();
}

// Класс танка, который является военной техникой
package military;

public class Tank implements MilitaryVehicle {
    @Override
    public void deploy() {
        System.out.println("Танк отправился в наступление");
    }

    @Override
    public void retreat() {
        System.out.println("Танк отступает");
    }
}

// Класс истребителя, также военной техники
package military;

public class FighterJet implements MilitaryVehicle {
    @Override
    public void deploy() {
        System.out.println("Истребитель взлетел для миссии");
    }

    @Override
    public void retreat() {
        System.out.println("Истребитель возвращается с миссии");
    }
}

// Создаем пакет для паровой техники
package steam;

// Интерфейс для паровой техники
public interface SteamPowered {
    void startSteamEngine();
    void stopSteamEngine();
}

// Класс паровоза, который работает на пару
package steam;

public class SteamLocomotive implements SteamPowered {
    @Override
    public void startSteamEngine() {
        System.out.println("Паровоз запустил паровую машину");
    }

    @Override
    public void stopSteamEngine() {
        System.out.println("Паровоз остановил паровую машину");
    }
}

// Класс парохода, также работает на пару
package steam;

public class Steamship implements SteamPowered {
    @Override
    public void startSteamEngine() {
        System.out.println("Пароход запустил паровую машину");
    }

    @Override
    public void stopSteamEngine() {
        System.out.println("Пароход остановил паровую машину");
    }
}
