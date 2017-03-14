/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author guest1Day
 */
public class Dealer extends Human{
        
            ArrayList<Integer> cards =new ArrayList<>();//52枚のカードを用意
            Dealer(){
             for(int ii=0;ii<4;ii++){                //1~10が4倍あるので4回繰り返す
             for(int i=1;i<=10;i++){                 //BJにスートは関係ない
             cards.add(i);
        }
        }
             for(int i=0;i<12;i++){                  //10を12枚用意
             cards.add(10);                          //BJではJ,Q,Kは10
        }
    }
            Random ram=new Random();
            
        public ArrayList<Integer> deal(){
            ArrayList<Integer>dealCard=new ArrayList<>();
            for(int i=0;i<2;i++){                    //2枚返す為
            Integer Index=ram.nextInt(cards.size()); //size()はよく知らない（笑）
            dealCard.add(cards.get(Index));           //ランダムなカード一枚を抜き出す
            cards.remove(Index);
        } return dealCard;
        }
         public ArrayList<Integer> hit(){
            ArrayList<Integer>hitCard=new ArrayList<>();
            Integer Index=ram.nextInt(cards.size());
            hitCard.add(cards.get(Index));
            cards.remove(Index);
            return hitCard;
        }
        
        @Override
        public Integer Open(){
            int total=0;
            for(int i=0;i<myCards.size();i++){
                total+=myCards.get(i);        //保有している枚数分要素を足す
            }
            for(int i=0;i<myCards.size();i++){
            if(myCards.get(i)==1){
                if(Open()<=21){
                    myCards.set(myCards.get(i),11);        //11が二個あっても21より大きくなるので、二枚目以降のAも11にはならない
                }
            }
            }
            return total;
        }
         @Override
        public boolean checkSum(){
            
            int total=Open();
            return total<=16;
        }
        @Override
        public void setCard(ArrayList<Integer> sCard){
             for(int i=0;i<sCard.size();i++){
             myCards.add(sCard.get(i));
        }
        }
    }
