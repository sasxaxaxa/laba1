package pack.lab7.Stroki56;

interface Stroka {
    int lenStr(String s);
    String StrNechet(String s);
    String StrChet(String s);
    String ReverseStr(String s);
}



class ProcessStrings implements Stroka {

    @Override
    public int lenStr(String s) {
        return s.length();
    }

    @Override
    public String StrNechet(String s) {
        StringBuilder s_new = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                char ch = s.charAt(i);
                s_new.append(ch);
            }
        }
        return s_new.toString();
    }

    @Override
    public String StrChet(String s) {
        StringBuilder s_new = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                char ch = s.charAt(i);
                s_new.append(ch);
            }
        }
        return s_new.toString();
    }

    @Override
    public String ReverseStr(String s) {
        StringBuilder ss = new StringBuilder(s).reverse();
        String s_new = ss.toString();
        return s_new;
    }
}