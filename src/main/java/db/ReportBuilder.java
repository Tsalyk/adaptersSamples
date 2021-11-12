package db;

public class ReportBuilder extends БазаДаних {
    private БазаДаних db;

    public ReportBuilder(БазаДаних db) {
        this.db = db;
    }

    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    public String getStatisticData() {
        return db.отриматиСтатистичніДані();
    }
}
