package codingInterview.string;

/**
 * StringBuilder는 ArrayList와 같습니다.
 * 단일 항목을 추가하면 비용은 O(1) 입니다.
 * 문자열을 추가하는 것은 addAll()을 호출하는 것과 같습니다.
 * 비용은 문자열의 길이/추가되는 항목 수에 비례합니다.
 * 문자열 1.3
 */
public class ReplaceEmptyToUrl {
    public String replaceToUrl(String s, int l) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        ReplaceEmptyToUrl re = new ReplaceEmptyToUrl();
        String str = re.replaceToUrl("Mr John Smith", 13);

        System.out.println("str = " + str);
    }
}
