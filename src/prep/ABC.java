/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prep;

/**
 *
 * @author motamedi
 */
public class ABC {

    public String createString(int n, int k) {
        if (k > (n * (n - 1) / 2)) {
            return "";
        }
        boolean done = false;
        int a_cnt = -1;
        int b_cnt = -1;
        int c_cnt = -1;

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
//                int c = k-a-b;
                    if (a + b + c > n) {
                        break;
                    }
                    int pairs = (a * b) + (a * c) + (b * c);
                    if (pairs == k) {
                        a_cnt = a;
                        b_cnt = b;
                        c_cnt = c;
                        break;
                    }
                }
                if (a_cnt != -1) {
                    break;
                }
            }
            if (a_cnt != -1) {
                break;
            }
        }

        if (a_cnt != -1) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < a_cnt; i++) {
                s.append("A");
            }
            for (int i = 0; i < b_cnt; i++) {
                s.append("B");
            }
            for (int i = 0; i < c_cnt; i++) {
                s.append("C");
            }
            int rem = n-a_cnt-b_cnt-c_cnt;
            for (int i = 0; i < rem; i++) {
                s.append("A");
            }            
            return s.toString();
        } else {
            return "";
        }
    }
    
    public static void main(String[] args) {
        ABC a = new ABC();
        System.err.println( a.createString(3, 1) );
    }
    
}
