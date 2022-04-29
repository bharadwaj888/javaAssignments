package com.company.assign3;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;

class Ping
{
    public static int pingHost(String host) throws IOException
    {
        Long start = System.currentTimeMillis();

        if (!InetAddress.getByName(host).isReachable(2000))
            return -1;

        return (int) (System.currentTimeMillis()-start);

    }

    public static void main(String args[]) throws IOException
    {
        int i=0;
        int value;
        ArrayList<Integer> array = new ArrayList<>();
        while(i<10) {
            value = pingHost("192.168.1.11");
            i++;
            array.add(value);
            System.out.println("Time required to reach Host : "+value);
        }
        Collections.sort(array);
        System.out.println(array.get(4));
    }
}
