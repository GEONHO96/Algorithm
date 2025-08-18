import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int y = Integer.parseInt(br.readLine());
        if (y == 1995) bw.write("ITMO");
        if (y == 1996) bw.write("SPbSU");
        if (y == 1997) bw.write("SPbSU");
        if (y == 1998) bw.write("ITMO");
        if (y == 1999) bw.write("ITMO");
        if (y == 2000) bw.write("SPbSU");
        if (y == 2001) bw.write("ITMO");
        if (y == 2002) bw.write("ITMO");
        if (y == 2003) bw.write("ITMO");
        if (y == 2004) bw.write("ITMO");
        if (y == 2005) bw.write("ITMO");
        if (y == 2006) bw.write("PetrSU, ITMO");
        if (y == 2007) bw.write("SPbSU");
        if (y == 2008) bw.write("SPbSU");
        if (y == 2009) bw.write("ITMO");
        if (y == 2010) bw.write("ITMO");
        if (y == 2011) bw.write("ITMO");
        if (y == 2012) bw.write("ITMO");
        if (y == 2013) bw.write("SPbSU");
        if (y == 2014) bw.write("ITMO");
        if (y == 2015) bw.write("ITMO");
        if (y == 2016) bw.write("ITMO");
        if (y == 2017) bw.write("ITMO");
        if (y == 2018) bw.write("SPbSU");
        if (y == 2019) bw.write("ITMO");
        bw.flush();
        bw.close();
        br.close();
    }
}