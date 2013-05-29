public class ParentClass {
    protected String makeString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("h");
        sb.append("e");
        sb.append("ll");
        sb.append("o");
        return sb.toString();
    }
}
