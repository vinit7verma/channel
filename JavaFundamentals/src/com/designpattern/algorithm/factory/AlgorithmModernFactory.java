package com.designpattern.algorithm.factory;

import com.designpattern.algorithm.Algorithm;
import com.designpattern.algorithm.impl.AdditonAlgorithm;
import com.designpattern.algorithm.impl.DivisionAlgorithm;
import com.designpattern.algorithm.impl.MultiplicationAlgorithm;
import com.designpattern.algorithm.impl.SubtractionAlgorithm;

public enum AlgorithmModernFactory
{
   ADD("ADD")
   {

      @Override
      public Algorithm getAlgorithm()
      {
         return new AdditonAlgorithm();
      }

   },
   SUB("SUB")
   {

      @Override
      public Algorithm getAlgorithm()
      {
         return new SubtractionAlgorithm();
      }

   },
   MUL("MUL")
   {

      @Override
      public Algorithm getAlgorithm()
      {
         return new MultiplicationAlgorithm();
      }

   },
   DIV("DIV")
   {

      @Override
      public Algorithm getAlgorithm()
      {
         return new DivisionAlgorithm();
      }

   };

   private AlgorithmModernFactory(String type)
   {
      this.type = type;
   }

   private String type;

   public abstract Algorithm getAlgorithm();

   public String getType()
   {
      return type;
   }

   @Override
   public String toString()
   {
      return "TYPE CODE -> " + type;
   }
}
