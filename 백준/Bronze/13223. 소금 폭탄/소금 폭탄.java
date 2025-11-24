import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] before = br.readLine().split(":");
        String[] after = br.readLine().split(":");
        int beforeTotalSeconds = Integer.parseInt(before[0]) * 3600 + Integer.parseInt(before[1]) * 60 + Integer.parseInt(before[2]);;
        int afterTotalSeconds = Integer.parseInt(after[0]) * 3600 + Integer.parseInt(after[1]) * 60 + Integer.parseInt(after[2]);
        int needTime = 0;
        if (beforeTotalSeconds < afterTotalSeconds) {
            needTime = afterTotalSeconds - beforeTotalSeconds;
        } else if (beforeTotalSeconds > afterTotalSeconds) {
            needTime = (3600 * 24) - (beforeTotalSeconds - afterTotalSeconds);
        } else {
            needTime = 3600 * 24 * 60;
            bw.write("24:00:00");
        }
        int needHours = needTime / 3600;
        int needMinutes = (needTime % 3600) / 60;
        int needSeconds = (needTime % 3600) % 60;
        if (needHours < 10 && needMinutes < 10 && needSeconds < 10) {
            bw.write("0" + String.valueOf(needHours) + ":" + "0" + String.valueOf(needMinutes) + ":" + "0" + String.valueOf(needSeconds));
        } else if (needHours < 10 && needMinutes < 10 && (needSeconds >= 10 && needSeconds < 60)) {
            bw.write("0" + String.valueOf(needHours) + ":" + "0" + String.valueOf(needMinutes) + ":" + String.valueOf(needSeconds));
        } else if (needHours < 10 && (needMinutes >= 10 && needMinutes < 60) && needSeconds < 10) {
            bw.write("0" + String.valueOf(needHours) + ":" + String.valueOf(needMinutes) + ":" + "0" + String.valueOf(needSeconds));
        } else if (needHours < 10 && (needMinutes >= 10 && needMinutes < 60) && (needSeconds >= 10 && needSeconds < 60)) {
            bw.write("0" + String.valueOf(needHours) + ":" + String.valueOf(needMinutes) + ":" + String.valueOf(needSeconds));
        } else if ((needHours >= 10 && needHours < 24) && needMinutes < 10 && needSeconds < 10) {
            bw.write(String.valueOf(needHours) + ":" + "0" + String.valueOf(needMinutes) + ":" + "0" + String.valueOf(needSeconds));
        } else if ((needHours >= 10 && needHours < 24) && needMinutes < 10 && (needSeconds >= 10 && needSeconds < 60)) {
            bw.write(String.valueOf(needHours) + ":" + "0" + String.valueOf(needMinutes) + ":" + String.valueOf(needSeconds));
        } else if ((needHours >= 10 && needHours < 24) && (needMinutes >= 10 && needMinutes < 60) && needSeconds >= 10) {
            bw.write(String.valueOf(needHours) + ":" + String.valueOf(needMinutes) + ":" + String.valueOf(needSeconds));
        } else if ((needHours >= 10 && needHours < 24) && (needMinutes >= 10 && needMinutes < 60) && (needSeconds >= 10 && needSeconds < 60)) {
            bw.write(String.valueOf(needHours) + ":" + String.valueOf(needMinutes) + ":" + "0" + String.valueOf(needSeconds));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}