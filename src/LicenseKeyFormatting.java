public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;

        String output = formatKey(s, k);
        System.out.println(output);
    }

    private static String formatKey(String s, int k) {
        s = s.replaceAll("-", "")
                .toUpperCase();

        StringBuilder sb = new StringBuilder();

        if (!(s.length() % k == 0)) {
            sb.append(s, 0, s.length() % k);
            if(s.length() > 1) {
                sb.append("-");
            }
            s = s.substring(s.length() % k);
        }

        for (int i = 0; i < s.length(); i++) {

            if (i % k == 0 && i > 0) {
                sb.append("-");
                sb.append(s.charAt(i));
            } else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
