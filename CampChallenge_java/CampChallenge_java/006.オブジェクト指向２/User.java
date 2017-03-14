/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class User extends Human{
        @Override
        public Integer Open(){
            int total=0;
            for(int i=0;i<myCards.size();i++){
                total+=myCards.get(i);        //保有している枚数分要素を足す
            }
            for(int i=0;i<myCards.size();i++){
            if(myCards.get(i)==1){
                if(Open()<=21){
                    myCards.set(myCards.get(i),11);         //11が二個あっても21より大きくなるので、二枚目以降のAも11にはならない
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
