package me.Vinstaal0.Commands.Enums;

import java.util.Random;

public class EnumHelp {
	
	static Random random = new Random();
	
	public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
		int x = random.nextInt(clazz.getEnumConstants().length);
		return clazz.getEnumConstants()[x];
	}

}
