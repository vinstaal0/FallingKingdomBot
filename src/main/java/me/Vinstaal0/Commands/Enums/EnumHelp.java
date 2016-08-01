package me.Vinstaal0.Commands.Enums;

public static class EnumHelp {
  
  public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
    int x = random.nextInt(clazz.getEnumConstants().length);
    return clazz.getEnumConstants()[x];
  }

}
