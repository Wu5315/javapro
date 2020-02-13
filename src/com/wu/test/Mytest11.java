package com.wu.test;

import java.util.*;

public class Mytest11 {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        List<String> play = new ArrayList<>();
        List<String> di = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        if(player>18||player<12){
            System.out.println("超出游戏人数范围");
        }else{
            System.out.println("准备发牌：");
            init(all);
            pai(all,player);
            play.add("盗贼");
            all.remove("盗贼");
            di(all,di);
            //其他牌都放到play中
            play.addAll(all);
            //打乱顺序，洗牌
            Collections.shuffle(play);
            System.out.println("手牌："+play);
            System.out.println("底牌："+di);
        }
    }
    //初始化牌，就是十二个人的时候的牌
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
    //根据不同的人数，更新牌库
    public static void pai(List<String> list,int player){
        if(player>12)
            list.add("村民");
        if(player>13)
            list.add("替罪羊");
        if(player>14)
            list.add("狼人");
        if(player>15)
            list.add("村民");
        if(player>16)
            list.add("村民");
        if(player>17)
            list.add("吹笛者");
    }
    //底牌狼人的个数 <= 1，
    public static void di(List<String> list,List<String> di){
        while(di.size()<3){//当不知道确切的循环次数的时候，用while。
            Random random = new Random();
            int index = random.nextInt(list.size());
            if(di.contains("狼人") && list.get(index).equals("狼人"))
                continue;
            else
                di.add(list.remove(index));
        }
    }
}
