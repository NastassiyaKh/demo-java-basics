public class NewsPage {
    private static final int NUMBER_OF_NEWS_ON_PAGE = 10;

    public static void countNumberOfPages(int numberOfNews) {
        if (numberOfNews / NUMBER_OF_NEWS_ON_PAGE < 1) {
            System.out.println(1);
        } else {
            System.out.println(numberOfNews / NUMBER_OF_NEWS_ON_PAGE + 1);
        }
    }

}
