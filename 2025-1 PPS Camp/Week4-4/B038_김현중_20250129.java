//Baekjoon 16435

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] fruits = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(fruits);

        for (int i = 0; i < N; i++) {
            if (fruits[i] <= L) {
                L++;
            } else {
                break;
            }
        }

        System.out.println(L);
    }
}