package dome_StringBuffer;

public class dome_Stringbuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello");
        System.out.println(stringBuffer.hashCode());
        stringBuffer.append("world");
        System.out.println(stringBuffer.hashCode());
    }
}
