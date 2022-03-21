public class Strings {
    String[] list;

    public Strings(String[] list) {
        this.list = list;
    }

    public void append(String newWord) {
        String[] out = new String[list.length + 1];
        if (list.length == 0) {
            out[0] = newWord;
            list = out;
            return;
        }
        if (list[0].length() >= newWord.length()) {
            out[0] = newWord;
            System.arraycopy(list, 0, out, 1, list.length);
            list = out;
            return;
        }
        if (list[list.length - 1].length() <= newWord.length()) {
            System.arraycopy(list, 0, out, 0, list.length);
            out[out.length - 1] = newWord;
            list = out;
            return;
        }
        for (int i = 0; i < list.length-1; i++) {
            if (list[i].length() <= newWord.length() & list[i+1].length() >= newWord.length()) {
                out[i] = list[i];
                out[i+1] = newWord;
                System.arraycopy(list, i+1, out, i+2, list.length);
                list = out;
                return;
            }
        }
    }

    public void show() {
        for (String element : list) {
            System.out.println(element);
        }
    }

    public String max() {
        return list[list.length - 1];
    }

    public double mean() {
        int sum = 0;
        for (String element : list) {
            sum += element.length();
        }
        return sum / list.length;
    }
}
