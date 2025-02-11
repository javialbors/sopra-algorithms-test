package questions;

public class SecondQuestion {

    private static class Persona {
        private int age;
        private boolean maleNotFemale;

        public Persona(int age, boolean maleNotFemale) {
            this.age = age;
            this.maleNotFemale = maleNotFemale;
        }

        public int getAge() { return age; }
        public boolean isMale() { return maleNotFemale; }
        public boolean isFemale() { return !maleNotFemale; }
    }

    public static void run() {
        Persona[] personas = leerPersonas();

        int a = 0, b = 0, c = 0, d = 0;
        float e, f = 0;

        for (Persona persona: personas) {
            if (persona.getAge() >= 18) {
                a++;

                if (persona.isMale()) c++;
                else f++;
            } else {
                b++;

                if (persona.isFemale()) {
                    d++;
                    f++;
                }
            }
        }

        e = ((float) a / (float) personas.length) * 100;
        f = ((float) f / (float) personas.length) * 100;

        System.out.println("Cantidad de personas mayores de edad: " + a);
        System.out.println("Cantidad de personas menores de edad: " + b);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + c);
        System.out.println("Cantidad de personas femeninas menores de edad: " + d);
        System.out.println("Porcentaje de personas mayores de edad: " + e + " %");
        System.out.println("Porcentaje de mujeres: " + f + " %");
    }

    private static Persona[] leerPersonas() {
        // También podría haberlo generado usando valores randoms en un loop, pero así se pueden ir cambiando valores para ir testeando
        Persona[] personas = new Persona[]{
            new Persona(1, true),   // 1
            new Persona(3, false),  // 2
            new Persona(5, false),  // 3
            new Persona(7, true),   // 4
            new Persona(8, true),   // 5
            new Persona(11, false), // 6
            new Persona(12, false), // 7
            new Persona(14, true),  // 8
            new Persona(15, true),  // 9
            new Persona(16, false), // 10
            new Persona(17, false), // 11
            new Persona(17, true),  // 12
            new Persona(17, true),  // 13
            new Persona(18, true),  // 14
            new Persona(25, false), // 15
            new Persona(27, false), // 16
            new Persona(28, false), // 17
            new Persona(30, true),  // 18
            new Persona(32, true),  // 19
            new Persona(33, true),  // 20
            new Persona(35, false), // 21
            new Persona(37, false), // 22
            new Persona(40, true),  // 23
            new Persona(41, false), // 24
            new Persona(42, true),  // 25
            new Persona(45, false), // 26
            new Persona(48, false), // 27
            new Persona(49, true),  // 28
            new Persona(50, true),  // 29
            new Persona(53, true),  // 30
            new Persona(55, false), // 31
            new Persona(57, false), // 32
            new Persona(58, false), // 33
            new Persona(60, true),  // 34
            new Persona(63, true),  // 35
            new Persona(65, false), // 36
            new Persona(68, false), // 37
            new Persona(70, true),  // 38
            new Persona(73, true),  // 39
            new Persona(75, false), // 40
            new Persona(78, false), // 41
            new Persona(80, true),  // 42
            new Persona(83, true),  // 43
            new Persona(85, false), // 44
            new Persona(88, false), // 45
            new Persona(90, true),  // 46
            new Persona(93, true),  // 47
            new Persona(95, true), // 48
            new Persona(98, true), // 49
            new Persona(100, true)  // 50
        };

        return personas;
    }
}
