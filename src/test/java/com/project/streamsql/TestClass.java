package com.project.streamsql;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.Tuple;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.UUID;

public class TestClass {
    public static int[][] graph;
    public static int n,x,y,w,h;
    class Point {
        public int x;
        public int y;
    }


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        x = in.nextInt();
        y = in.nextInt();
        w = in.nextInt();
        h = in.nextInt();

        int s = x-w/2;
        int e = x+w/2;
        int u = y-h/2;
        int d = y+h/2;

        System.out.println(n+" "+x+" "+y+" "+w+" "+h+" ");
        System.out.println(s+" "+e+" "+u+" "+d+" ");
        int flag = 0;
        int cnt = 0;
        for(int i = 0;i<2*n;i++) {
            flag = 0;
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            if(x1>=s&&x1<=e&&y1>=u&&y1<=d) flag = 1;
            cnt+=flag;
        }
        System.out.println(cnt);
    }
}
