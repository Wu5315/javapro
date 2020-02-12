package com.wu.work3a;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lang {
    private static Map<String,String> shoupai = new HashMap<>();
    private static Map<String,String> dipai = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("请输入游戏人数（12-18人）：");
        Scanner scanner = new Scanner(System.in);
        int person = scanner.nextInt();
        if(person==12){
            shier();
        }else if(person==13){
            shisan();
        }else if(person==14){
            shisi();
        }else if(person==15){
            shiwu();
        }else if(person==16){
            shiliu();
        }else if(person==17){
            shiqi();
        }else {
            shiba();
        }
    }
    //十二个人的发牌配置
    public static void shier(){
        int[] pai = {13,13,13,13,13,13,13,13,13,13,13,13};
        //预言家 女巫 丘比特 守护 猎人 村长 盗贼 七选四
        String[] shen = {"预言家","女巫","丘比特","守护","猎人","村长","盗贼"};
        int size = 0;
        //七选四放在shen1里。
        String[] shen1 = {"1","2","3","4"};
        int b = 4;
        for(int i = 1;i <= b;i++){
            int random = (int)(Math.random()*7);
            boolean flag = true;
            for(int j = 0;j < 4;j++){
                if(!shen1[j].equals(shen[random])){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                for (int l = size; l < size+1;l++){
                    shen1[l] = shen[random];
                }
                size++;
            }else{
                b++;
            }
        }
        //随机四个人，将上面随机的身份分给四个人
        int size1 = 0;
        int c = 4;
        for(int i = 1;i <= c;i++){
            int random = (int)(Math.random()*12);
            boolean flag = true;
            for(int j = 0;j < 12;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                for(int j = size1;j < size1+1;j++){
                    Person person = new Person(""+(random+1)+"",shen1[j]);
                    shoupai.put(person.getNum(),person.getPai());
                }
                size1++;
            }else{
                c++;
            }
        }
        //随机四个人，定为狼人
        int n = 4;
        for(int i = 1;i <= n;i++){
            int random = (int)(Math.random()*12);
            boolean flag = true;
            for(int j = 0;j < 12;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                Person person = new Person(""+(random+1)+"","狼人");
                shoupai.put(person.getNum(),person.getPai());
            }else{
                n++;
            }
        }
//        //村民
//        int a = 4;
//        for(int i = 1;i <= a;i++){
//            int random = (int)(Math.random()*11);
//            boolean flag = true;
//            for(int j = 0;j < 11;j++){
//                if(pai[j]!=random){
//                }else{
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag == true){
//                pai[random] = random;
//                Person person = new Person(""+random+"","村民");
//                shoupai.put(person.getNum(),person.getPai());
//            }else{
//                a++;
//            }
//        }

//      获取目前的key
//      获取剩下的key，全部是村民。
        Set<String> d = shoupai.keySet();
        String[] okpai = new String[8];
        String[] array = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        int size2 = 0;
        for(String i : d){
            for(int j = size2;j < size2+1;j++){
                okpai[j] = i;
            }
            size2++;
        }
       for(int i = 0; i < 12;i++){
           boolean flag = true;
           for(int j = 0;j < 8;j++){
               if(!array[i].equals(okpai[j])){

               }else{
                   flag = false;
                   break;
               }
           }
           if(flag){
               Person person = new Person(array[i],"村民");
               shoupai.put(person.getNum(),person.getPai());
           }
       }
       //手牌除了盗贼都可以有，且最多有一张狼人，
        String[] dipai1 = {"预言家","女巫","丘比特","守护","猎人","村长","村民","狼人"};;
        int a = 3;
        int size3 = 0;
        for(int i = 0;i < a;i++){
            boolean flag = true;
            int random = (int)(Math.random()*8);
            if(random==7){
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
                flag = false;
            }else{
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
            }
            if(!flag){
                int random1 = (int)(Math.random()*7);
                random = random1;
            }
            if(flag){
                for(int k = size3;k < size3+1;k++){
                    dipai1[k] = dipai1[random];
                }
                size3++;
            }
        }

        System.out.println("玩家手牌为：");
        System.out.println(shoupai);
        System.out.println("盗贼底牌为：");
        System.out.println(dipai);
    }
    //十三个人的发牌配置
    public static void shisan(){
        int[] pai = {14,14,14,14,14,14,14,14,14,14,14,14,14};
        //预言家 女巫 丘比特 守护 猎人 村长 盗贼 七选四
        String[] shen = {"预言家","女巫","丘比特","守护","猎人","村长","盗贼"};
        int size = 0;
        //七选四放在shen1里。
        String[] shen1 = {"1","2","3","4"};
        int b = 4;
        for(int i = 1;i <= b;i++){
            int random = (int)(Math.random()*7);
            boolean flag = true;
            for(int j = 0;j < 4;j++){
                if(!shen1[j].equals(shen[random])){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                for (int l = size; l < size+1;l++){
                    shen1[l] = shen[random];
                }
                size++;
            }else{
                b++;
            }
        }
        //随机四个人，将上面随机的身份分给四个人
        int size1 = 0;
        int c = 4;
        for(int i = 1;i <= c;i++){
            int random = (int)(Math.random()*13);
            boolean flag = true;
            for(int j = 0;j < 13;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                for(int j = size1;j < size1+1;j++){
                    Person person = new Person(""+(random+1)+"",shen1[j]);
                    shoupai.put(person.getNum(),person.getPai());
                }
                size1++;
            }else{
                c++;
            }
        }
        //随机四个人，定为狼人
        int n = 4;
        for(int i = 1;i <= n;i++){
            int random = (int)(Math.random()*13);
            boolean flag = true;
            for(int j = 0;j < 13;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                Person person = new Person(""+(random+1)+"","狼人");
                shoupai.put(person.getNum(),person.getPai());
            }else{
                n++;
            }
        }
//      获取目前的key
//      获取剩下的key，全部是村民。
        Set<String> d = shoupai.keySet();
        String[] okpai = new String[8];
        String[] array = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
        int size2 = 0;
        for(String i : d){
            for(int j = size2;j < size2+1;j++){
                okpai[j] = i;
            }
            size2++;
        }
        for(int i = 0; i < 13;i++){
            boolean flag = true;
            for(int j = 0;j < 8;j++){
                if(!array[i].equals(okpai[j])){

                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                Person person = new Person(array[i],"村民");
                shoupai.put(person.getNum(),person.getPai());
            }
        }
        //手牌除了盗贼都可以有，且最多有一张狼人，
        String[] dipai1 = {"预言家","女巫","丘比特","守护","猎人","村长","村民","狼人"};;
        int a = 3;
        int size3 = 0;
        for(int i = 0;i < a;i++){
            boolean flag = true;
            int random = (int)(Math.random()*8);
            if(random==7){
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
                flag = false;
            }else{
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
            }
            if(!flag){
                int random1 = (int)(Math.random()*7);
                random = random1;
            }
            if(flag){
                for(int k = size3;k < size3+1;k++){
                    dipai1[k] = dipai1[random];
                }
                size3++;
            }
        }
        System.out.println("玩家手牌为：");
        System.out.println(shoupai);
        System.out.println("盗贼底牌为：");
        System.out.println(dipai);
    }
    //十四个人的发牌配置
    public static void shisi(){
        int[] pai = {15,15,15,15,15,15,15,15,15,15,15,15,15,15};
        //预言家 女巫 丘比特 守护 猎人 村长 盗贼 七选四
        String[] shen = {"预言家","女巫","丘比特","守护","猎人","村长","盗贼","替罪羊"};
        int size = 0;
        //8选5放在shen1里。
        String[] shen1 = {"1","2","3","4","5"};
        int b = 5;
        for(int i = 1;i <= b;i++){
            int random = (int)(Math.random()*8);
            boolean flag = true;
            for(int j = 0;j < 5;j++){
                if(!shen1[j].equals(shen[random])){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                for (int l = size; l < size+1;l++){
                    shen1[l] = shen[random];
                }
                size++;
            }else{
                b++;
            }
        }
        //随机四个人，将上面随机的身份分给四个人
        int size1 = 0;
        int c = 5;
        for(int i = 1;i <= c;i++){
            int random = (int)(Math.random()*14);
            boolean flag = true;
            for(int j = 0;j < 14;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                for(int j = size1;j < size1+1;j++){
                    Person person = new Person(""+(random+1)+"",shen1[j]);
                    shoupai.put(person.getNum(),person.getPai());
                }
                size1++;
            }else{
                c++;
            }
        }
        //随机四个人，定为狼人
        int n = 4;
        for(int i = 1;i <= n;i++){
            int random = (int)(Math.random()*14);
            boolean flag = true;
            for(int j = 0;j < 14;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                Person person = new Person(""+(random+1)+"","狼人");
                shoupai.put(person.getNum(),person.getPai());
            }else{
                n++;
            }
        }
//      获取目前的key
//      获取剩下的key，全部是村民。
        Set<String> d = shoupai.keySet();
        String[] okpai = new String[9];
        String[] array = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14"};
        int size2 = 0;
        for(String i : d){
            for(int j = size2;j < size2+1;j++){
                okpai[j] = i;
            }
            size2++;
        }
        for(int i = 0; i < 14;i++){
            boolean flag = true;
            for(int j = 0;j < 9;j++){
                if(!array[i].equals(okpai[j])){

                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                Person person = new Person(array[i],"村民");
                shoupai.put(person.getNum(),person.getPai());
            }
        }
        //手牌除了盗贼都可以有，且最多有一张狼人，
        String[] dipai1 = {"预言家","女巫","丘比特","守护","猎人","村长","村民","狼人","替罪羊"};
        int a = 3;
        int size3 = 0;
        for(int i = 0;i < a;i++){
            boolean flag = true;
            int random = (int)(Math.random()*9);
            if(random==7){
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
                flag = false;
            }else{
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
            }
            if(!flag){
                int random1 = (int)(Math.random()*7);
                random = random1;
            }
            if(flag){
                for(int k = size3;k < size3+1;k++){
                    dipai1[k] = dipai1[random];
                }
                size3++;
            }
        }
        System.out.println("玩家手牌为：");
        System.out.println(shoupai);
        System.out.println("盗贼底牌为：");
        System.out.println(dipai);
    }
    //十五个人的发牌配置
    public static void shiwu(){
        int[] pai = {16,16,16,16,16,16,16,16,16,16,16,16,16,16,16};
        //预言家 女巫 丘比特 守护 猎人 村长 盗贼 七选四
        String[] shen = {"预言家","女巫","丘比特","守护","猎人","村长","盗贼","替罪羊"};
        int size = 0;
        //8选5放在shen1里。
        String[] shen1 = {"1","2","3","4","5"};
        int b = 5;
        for(int i = 1;i <= b;i++){
            int random = (int)(Math.random()*8);
            boolean flag = true;
            for(int j = 0;j < 5;j++){
                if(!shen1[j].equals(shen[random])){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                for (int l = size; l < size+1;l++){
                    shen1[l] = shen[random];
                }
                size++;
            }else{
                b++;
            }
        }
        //随机四个人，将上面随机的身份分给四个人
        int size1 = 0;
        int c = 5;
        for(int i = 1;i <= c;i++){
            int random = (int)(Math.random()*15);
            boolean flag = true;
            for(int j = 0;j < 15;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                for(int j = size1;j < size1+1;j++){
                    Person person = new Person(""+(random+1)+"",shen1[j]);
                    shoupai.put(person.getNum(),person.getPai());
                }
                size1++;
            }else{
                c++;
            }
        }
        //随机四个人，定为狼人
        int n = 5;
        for(int i = 1;i <= n;i++){
            int random = (int)(Math.random()*15);
            boolean flag = true;
            for(int j = 0;j < 15;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                Person person = new Person(""+(random+1)+"","狼人");
                shoupai.put(person.getNum(),person.getPai());
            }else{
                n++;
            }
        }
//      获取目前的key
//      获取剩下的key，全部是村民。
        Set<String> d = shoupai.keySet();
        String[] okpai = new String[10];
        String[] array = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        int size2 = 0;
        for(String i : d){
            for(int j = size2;j < size2+1;j++){
                okpai[j] = i;
            }
            size2++;
        }
        for(int i = 0; i < 15;i++){
            boolean flag = true;
            for(int j = 0;j < 10;j++){
                if(!array[i].equals(okpai[j])){

                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                Person person = new Person(array[i],"村民");
                shoupai.put(person.getNum(),person.getPai());
            }
        }
        //手牌除了盗贼都可以有，且最多有一张狼人，
        String[] dipai1 = {"预言家","女巫","丘比特","守护","猎人","村长","村民","狼人","替罪羊"};
        int a = 3;
        int size3 = 0;
        for(int i = 0;i < a;i++){
            boolean flag = true;
            int random = (int)(Math.random()*10);
            if(random==7){
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
                flag = false;
            }else{
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
            }
            if(!flag){
                int random1 = (int)(Math.random()*7);
                random = random1;
            }
            if(flag){
                for(int k = size3;k < size3+1;k++){
                    dipai1[k] = dipai1[random];
                }
                size3++;
            }
        }
        System.out.println("玩家手牌为：");
        System.out.println(shoupai);
        System.out.println("盗贼底牌为：");
        System.out.println(dipai);
    }
    //十六个人的发牌配置
    public static void shiliu(){
        int[] pai = {17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17};
        //预言家 女巫 丘比特 守护 猎人 村长 盗贼 七选四
        String[] shen = {"预言家","女巫","丘比特","守护","猎人","村长","盗贼","替罪羊"};
        int size = 0;
        //8选5放在shen1里。
        String[] shen1 = {"1","2","3","4","5"};
        int b = 5;
        for(int i = 1;i <= b;i++){
            int random = (int)(Math.random()*8);
            boolean flag = true;
            for(int j = 0;j < 5;j++){
                if(!shen1[j].equals(shen[random])){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                for (int l = size; l < size+1;l++){
                    shen1[l] = shen[random];
                }
                size++;
            }else{
                b++;
            }
        }
        //随机四个人，将上面随机的身份分给四个人
        int size1 = 0;
        int c = 5;
        for(int i = 1;i <= c;i++){
            int random = (int)(Math.random()*16);
            boolean flag = true;
            for(int j = 0;j < 16;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                for(int j = size1;j < size1+1;j++){
                    Person person = new Person(""+(random+1)+"",shen1[j]);
                    shoupai.put(person.getNum(),person.getPai());
                }
                size1++;
            }else{
                c++;
            }
        }
        //随机四个人，定为狼人
        int n = 5;
        for(int i = 1;i <= n;i++){
            int random = (int)(Math.random()*16);
            boolean flag = true;
            for(int j = 0;j < 16;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                Person person = new Person(""+(random+1)+"","狼人");
                shoupai.put(person.getNum(),person.getPai());
            }else{
                n++;
            }
        }
//      获取目前的key
//      获取剩下的key，全部是村民。
        Set<String> d = shoupai.keySet();
        String[] okpai = new String[10];
        String[] array = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
        int size2 = 0;
        for(String i : d){
            for(int j = size2;j < size2+1;j++){
                okpai[j] = i;
            }
            size2++;
        }
        for(int i = 0; i < 16;i++){
            boolean flag = true;
            for(int j = 0;j < 10;j++){
                if(!array[i].equals(okpai[j])){

                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                Person person = new Person(array[i],"村民");
                shoupai.put(person.getNum(),person.getPai());
            }
        }
        //手牌除了盗贼都可以有，且最多有一张狼人，
        String[] dipai1 = {"预言家","女巫","丘比特","守护","猎人","村长","村民","狼人","替罪羊"};
        int a = 3;
        int size3 = 0;
        for(int i = 0;i < a;i++){
            boolean flag = true;
            int random = (int)(Math.random()*10);
            if(random==7){
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
                flag = false;
            }else{
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
            }
            if(!flag){
                int random1 = (int)(Math.random()*7);
                random = random1;
            }
            if(flag){
                for(int k = size3;k < size3+1;k++){
                    dipai1[k] = dipai1[random];
                }
                size3++;
            }
        }
        System.out.println("玩家手牌为：");
        System.out.println(shoupai);
        System.out.println("盗贼底牌为：");
        System.out.println(dipai);
    }
    //十七个人的发牌配置
    public static void shiqi(){
        int[] pai = {21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21};
        //预言家 女巫 丘比特 守护 猎人 村长 盗贼 替罪羊 8选6
        String[] shen = {"预言家","女巫","丘比特","守护","猎人","村长","盗贼","替罪羊"};
        int size = 0;
        //8选6放在shen1里。
        String[] shen1 = {"1","2","3","4","5","6"};
        int b = 6;
        for(int i = 1;i <= b;i++){
            int random = (int)(Math.random()*8);
            boolean flag = true;
            for(int j = 0;j < 6;j++){
                if(!shen1[j].equals(shen[random])){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                for (int l = size; l < size+1;l++){
                    shen1[l] = shen[random];
                }
                size++;
            }else{
                b++;
            }
        }
        //随机四个人，将上面随机的身份分给四个人
        int size1 = 0;
        int c = 6;
        for(int i = 1;i <= c;i++){
            int random = (int)(Math.random()*17);
            boolean flag = true;
            for(int j = 0;j < 17;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                for(int j = size1;j < size1+1;j++){
                    Person person = new Person(""+(random+1)+"",shen1[j]);
                    shoupai.put(person.getNum(),person.getPai());
                }
                size1++;
            }else{
                c++;
            }
        }
        //随机四个人，定为狼人
        int n = 5;
        for(int i = 1;i <= n;i++){
            int random = (int)(Math.random()*17);
            boolean flag = true;
            for(int j = 0;j < 17;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                Person person = new Person(""+(random+1)+"","狼人");
                shoupai.put(person.getNum(),person.getPai());
            }else{
                n++;
            }
        }
//      获取目前的key
//      获取剩下的key，全部是村民。
        Set<String> d = shoupai.keySet();
        String[] okpai = new String[11];
        String[] array = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17"};
        int size2 = 0;
        for(String i : d){
            for(int j = size2;j < size2+1;j++){
                okpai[j] = i;
            }
            size2++;
        }
        for(int i = 0; i < 17;i++){
            boolean flag = true;
            for(int j = 0;j < 11;j++){
                if(!array[i].equals(okpai[j])){

                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                Person person = new Person(array[i],"村民");
                shoupai.put(person.getNum(),person.getPai());
            }
        }
        //手牌除了盗贼都可以有，且最多有一张狼人，
        String[] dipai1 = {"预言家","女巫","丘比特","守护","猎人","村长","村民","狼人","替罪羊"};
        int a = 3;
        int size3 = 0;
        for(int i = 0;i < a;i++){
            boolean flag = true;
            int random = (int)(Math.random()*10);
            if(random==7){
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
                flag = false;
            }else{
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
            }
            if(!flag){
                int random1 = (int)(Math.random()*7);
                random = random1;
            }
            if(flag){
                for(int k = size3;k < size3+1;k++){
                    dipai1[k] = dipai1[random];
                }
                size3++;
            }
        }
        System.out.println("玩家手牌为：");
        System.out.println(shoupai);
        System.out.println("盗贼底牌为：");
        System.out.println(dipai);
    }
    //十八个人的发牌配置
    public static void shiba(){
        int[] pai = {21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21};
        //预言家 女巫 丘比特 守护 猎人 村长 盗贼 替罪羊 吹笛者9选6
        String[] shen = {"预言家","女巫","丘比特","守护","猎人","村长","盗贼","替罪羊","吹笛者"};
        int size = 0;
        //8选5放在shen1里。
        String[] shen1 = {"1","2","3","4","5","6"};
        int b = 6;
        for(int i = 1;i <= b;i++){
            int random = (int)(Math.random()*9);
            boolean flag = true;
            for(int j = 0;j < 6;j++){
                if(!shen1[j].equals(shen[random])){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                for (int l = size; l < size+1;l++){
                    shen1[l] = shen[random];
                }
                size++;
            }else{
                b++;
            }
        }
        //随机四个人，将上面随机的身份分给四个人
        int size1 = 0;
        int c = 6;
        for(int i = 1;i <= c;i++){
            int random = (int)(Math.random()*18);
            boolean flag = true;
            for(int j = 0;j < 18;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                for(int j = size1;j < size1+1;j++){
                    Person person = new Person(""+(random+1)+"",shen1[j]);
                    shoupai.put(person.getNum(),person.getPai());
                }
                size1++;
            }else{
                c++;
            }
        }
        //随机四个人，定为狼人
        int n = 5;
        for(int i = 1;i <= n;i++){
            int random = (int)(Math.random()*18);
            boolean flag = true;
            for(int j = 0;j < 18;j++){
                if(pai[j]!=random){
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                pai[random] = random;
                Person person = new Person(""+(random+1)+"","狼人");
                shoupai.put(person.getNum(),person.getPai());
            }else{
                n++;
            }
        }
//      获取目前的key
//      获取剩下的key，全部是村民。
        Set<String> d = shoupai.keySet();
        String[] okpai = new String[11];
        String[] array = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18"};
        int size2 = 0;
        for(String i : d){
            for(int j = size2;j < size2+1;j++){
                okpai[j] = i;
            }
            size2++;
        }
        for(int i = 0; i < 18;i++){
            boolean flag = true;
            for(int j = 0;j < 11;j++){
                if(!array[i].equals(okpai[j])){

                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                Person person = new Person(array[i],"村民");
                shoupai.put(person.getNum(),person.getPai());
            }
        }
        //手牌除了盗贼都可以有，且最多有一张狼人，
        String[] dipai1 = {"预言家","女巫","丘比特","守护","猎人","村长","村民","狼人","替罪羊","吹笛者"};
        int a = 3;
        int size3 = 0;
        for(int i = 0;i < a;i++){
            boolean flag = true;
            int random = (int)(Math.random()*11);
            if(random==7){
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
                flag = false;
            }else{
                Person person1 = new Person(""+(i+1)+"",dipai1[random]);
                dipai.put(person1.getNum(),person1.getPai());
            }
            if(!flag){
                int random1 = (int)(Math.random()*7);
                random = random1;
            }
            if(flag){
                for(int k = size3;k < size3+1;k++){
                    dipai1[k] = dipai1[random];
                }
                size3++;
            }
        }
        System.out.println("玩家手牌为：");
        System.out.println(shoupai);
        System.out.println("盗贼底牌为：");
        System.out.println(dipai);
    }
}
