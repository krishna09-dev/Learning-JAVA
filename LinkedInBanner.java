public class LinkedInBanner {
    public static void printBanner(String text) {
        int bannerSize = 100;
        int textLength = text.length();
        
        if (textLength > bannerSize) {
            System.out.println("Text too long to fit in the banner.");
            return;
        }
        
        int padding = (bannerSize - textLength);
        
        StringBuilder banner = new StringBuilder();
        for (int i = 0; i < textLength; i++) {
            for (int j = 0; j < padding; j++) {
                if (j == i) {
                    banner.append(text.charAt(i));
                } else {
                    banner.append("-");
                }
            }
            banner.append("\n");
        }
        
        System.out.println(banner.toString());
    }

    public static void main(String[] args) {
        printBanner("Krishna");
    }
}
