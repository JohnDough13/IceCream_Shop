package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable{
   private Flavor[] balls;
   public enum Flavor {
      STRAWBERRY,
      BANANA,
      CHOCOLATE,
      VANILLA,
      LEMON,
      STRACIATELLA,
      MOKKA,
      PISTACHE;
   }

   public Cone(){
      this(new Flavor[]{Flavor.PISTACHE});
   }

   public Cone(Flavor[] flavor){
      balls = new Flavor[flavor.length];
      for (int i = 0; i < flavor.length; i++){
         balls[i] = flavor[i];
      }
   }

   @Override
   public void eat() {
      StringBuilder stringBuilder = new StringBuilder("eating cone with:");
      for (Flavor flavor : balls){
         stringBuilder.append(flavor).append(" - ");
      }
      System.out.println(stringBuilder);
   }
}
