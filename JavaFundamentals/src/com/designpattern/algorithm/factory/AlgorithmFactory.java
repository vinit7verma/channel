package com.designpattern.algorithm.factory;

import com.designpattern.algorithm.Algorithm;
import com.designpattern.algorithm.impl.AdditonAlgorithm;
import com.designpattern.algorithm.impl.DivisionAlgorithm;
import com.designpattern.algorithm.impl.MultiplicationAlgorithm;
import com.designpattern.algorithm.impl.SubtractionAlgorithm;

public abstract class AlgorithmFactory
{
   public static Algorithm getAlgorithm(String type)
   {
      Algorithm algorithm = null;

      if(type.equals("ADD"))
      {
         algorithm = new AdditonAlgorithm();
      }
      else if(type.equals("SUB"))
      {
         algorithm = new SubtractionAlgorithm();
      }
      else if(type.equals("DIV"))
      {
         algorithm = new DivisionAlgorithm();
      }
      else if(type.equals("MUL"))
      {
         algorithm = new MultiplicationAlgorithm();
      }

      return algorithm;
   }
}
