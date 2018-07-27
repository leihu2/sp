package com.explam;

import org.junit.Test;
import java.util.*;

public class Demo1 {
    //lamba表达
    @Test
    public void test1(){
      new Thread(() -> System.out.print("22"));
        List<Integer> players = new ArrayList<Integer>();
        players.add(4);
        players.add(3);
        players.add(13);
        players.add(1);
        Integer d=players.stream().filter(s->s>1).min((Integer s1,Integer s2)->s1-(s2)).get();
        System.out.print("players中max:"+d);
        players.forEach((s)->System.out.println(s));
        players.sort((Integer s1, Integer s2) -> s1 - (s2));
        players.forEach((s)->System.out.printf("%s,%s",s,"\\n"));
    }
}
