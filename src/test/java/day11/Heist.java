package day11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Heist {
    public static void main(String[] args) throws Exception {

        Vault federalVault = new Vault();

        //  приватные поля через рефлексию
        Class<Vault> clazz = Vault.class;

        Field fDollars = clazz.getDeclaredField("dollars");
        Field fEuros = clazz.getDeclaredField("euros");
        Field fGold  = clazz.getDeclaredField("tonsOfGold");
        Field fCodes = clazz.getDeclaredField("pentagonNukesCodes");
        fDollars.setAccessible(true);
        fEuros.setAccessible(true);
        fGold.setAccessible(true);
        fCodes.setAccessible(true);

        int    stolenDollars = fDollars.getInt(federalVault);
        int    stolenEuros   = fEuros.getInt(federalVault);
        double stolenGold    = fGold.getDouble(federalVault);
        String stolenCodes   = (String) fCodes.get(federalVault);

        fDollars.setInt(federalVault, 0);
        fEuros.setInt(federalVault, 0);
        fGold.setDouble(federalVault, 0.0);
        fCodes.set(federalVault, "");

        Constructor<Vault> ctor = clazz.getDeclaredConstructor(int.class, int.class, double.class, String.class);
        ctor.setAccessible(true);
        Vault myVault = ctor.newInstance(stolenDollars, stolenEuros, stolenGold, stolenCodes);

        // Проверка
        System.out.println("Federal vault after heist: dollars=" + fDollars.getInt(federalVault)
                + ", euros=" + fEuros.getInt(federalVault)
                + ", gold=" + fGold.getDouble(federalVault)
                + ", codes='" + fCodes.get(federalVault) + "'");

        System.out.println("My vault: dollars=" + fDollars.getInt(myVault)
                + ", euros=" + fEuros.getInt(myVault)
                + ", gold=" + fGold.getDouble(myVault)
                + ", codes='" + fCodes.get(myVault) + "'");
    }
}