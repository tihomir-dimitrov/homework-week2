public class zadacha3 {
    public static void main(String[] args) {
        switchCase();
    }
    public static void switchCase() {
        int loverFloor = 0;
        String lover;

        switch (loverFloor) {
            case 8:
                lover = "Здравей Нели!";
                break;

            case 7:
                lover = "Здравей Тони!";
                break;

            case 6:
                lover = "Здравей Таня!";
                break;

            case 5:
                lover = "Здравей Алекс!";
                break;

            case 4:
                lover = "Здравей Митко!";
                break;

            case 3:
                lover = "Здравей Валя!";
                break;

            case 2:
                lover = "Здравей Петя!";
                break;

            case 1:
                lover = "Здравей Гопе!";
                break;
            case 0:
                lover= "Ауч!";
                break;

            default:
                lover = "Няма такъв етаж";
                break;
        }
        System.out.println("Любовник: " + lover);
    }
}
