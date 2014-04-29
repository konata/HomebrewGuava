package cn.beriru;
import java.util.List;
import java.util.Map;

import cn.beriru.trd.Collections2;
import cn.beriru.trd.Ints;
import cn.beriru.trd.Iterables;
import cn.beriru.trd.Joiner;
import cn.beriru.trd.Lists;
import cn.beriru.trd.Maps;
import cn.beriru.trd.Predicate;
import cn.beriru.trd.Sets;
import cn.beriru.trd.Splitter;

public class HomeBrewGuava {
  
  public static void main(String[] arg){
    System.out.println("xxxxx");
    
    
    p("======begin test======");
    
    
    //Collections2 
    List<Integer> items = Lists.newArrayList(1,2,9,4,5,6,9,19,3);
    
    Predicate<Integer> allFalse = new Predicate<Integer>() {
      @Override
      public boolean apply(Integer input) {
        return false;
      }
    };
    
    Predicate<Integer> greatThanFive = new Predicate<Integer>() {
      @Override
      public boolean apply(Integer input) {
        return input > 5;
      }
    };
    
    List<Integer> shouldEmpty = (List<Integer>) Collections2.filter(items, allFalse);
    p("should be 0",shouldEmpty.size());
    
    
    List<Integer> shouldBeFour =  (List<Integer>) Collections2.filter(items, greatThanFive);
    p("should be 4", shouldBeFour.size());
    p("should be 9,6,9,13",Joiner.on(",").join(shouldBeFour));
        
    //Ints 
    p("begin Ints...");
    
    int[] m = new int[]{3,4,6,7,1,2,6};
    p("should false for contain 9",Ints.contains(m, 9));
    p("should true for contain 6",Ints.contains(m, 6));
    p("should true for contain 3",Ints.contains(m, 3));
    
    p("should be 3,4,6,7,1,2,6",Ints.asList(m));
    p("should be 3,4,6,7,1,2,6",Ints.asList(Ints.toArray(Ints.asList(m))));
    
    p("begin Iterables...");
    
    
    List<String> strList = Lists.newArrayList(Splitter.on(" ").split("this is an nice artible"));
    Predicate<String> longThan8 = new Predicate<String>() {
      @Override
      public boolean apply(String input) {
        return input.length() > 8;
      }
    };
    
    Predicate<String> longThan4 = new Predicate<String>() {
      
      @Override
      public boolean apply(String input) {
        return input.length() > 4;
      }
    };
    
    p("should true for > 4" , Iterables.any(strList, longThan4));
    p("should false for > 8" , Iterables.any(strList, longThan8));
    
    
    
    
    p("begin joiner and splitter...");
    String s = Joiner.on(",").join(Sets.newHashSet(Splitter.on(" ").split("this is an nice test")));
    p("should this,is,an,nice,test with random position",s);
    String _ = Joiner.on(",").join(Lists.newArrayList(Splitter.on(" ").split("this is an nice test")));
    p("should this,is,an,nice,test",_);
    
    
    p("begin maps");
    Map<String,String> maps = Maps.newHashMap("guanguan", "shabu").add("daguanguan", "dashabu").commit();
    p("length should be 2: " , maps.size());
    
    
    p("====end====");
    
  }
  
  public static void p(Object...  o) {
    String s = Joiner.on(" : ").join(o);
    System.out.println(s);
  }
  
  
  
}

