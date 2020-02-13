package com.wu.test;

import java.util.*;

public class Mytest12 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        List<String> play = new ArrayList<>();
        List<String> di = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        if(player>18 && player<12){
            System.out.println("超出游戏人数范围");
        }else{
            init(all);
            pai(all,player);
            all.remove("盗贼");
            play.add("盗贼");
            di(all,di);
            play.addAll(all);
            Collections.shuffle(play);
            System.out.println("手牌："+play);
            System.out.println("底牌："+di);
        }
    }
    //初始化牌库
    public static void init(List<String> list){
        for(int i = 0;i < 4;i++){
            list.add("狼人");
        }
        for(int i = 0;i < 4;i++){
            list.add("村民");
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("守护");
        list.add("猎人");
        list.add("村长");
        list.add("盗贼");
    }
    //设置每种玩法的牌库
    public static void pai(List<String> list,int n){
        if(n>12)
            list.add("村民");
        if(n>13)
            list.add("替罪羊");
        if(n>14)
            list.add("狼人");
        if(n>15)
            list.add("村民");
        if(n>16)
            list.add("村民");
        if(n>17)
            list.add("吹笛者");
    }
    //随机三张底牌，最多有一张狼人
    public static void di(List<String> list,List<String> list1){
        Random random = new Random();
        while(list1.size()<3){
            int index = random.nextInt(list.size());
            if(list1.contains("狼人") && list.get(index).equals("狼人"))
                continue;
            else
                list1.add(list.remove(index));
        }

    }
}
