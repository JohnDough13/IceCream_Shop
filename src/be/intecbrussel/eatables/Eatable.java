package be.intecbrussel.eatables;


//1.1 Eatables /5
//Bovenstaand schema stelt de eatables package voor. We beschrijven hier de verschillende ijsjes die
//we later zullen verkopen. Belangrijke implementatiedetails:
//- De eat methode print af wat je aan het eten bent. Bij een Magnum is dit dus afhankelijk van
//het magnumtype, bij een Cone zijn het alle verschillende soorten bollen, bij de IceRocket
//gaat het gewoon over het eten van een raketijsje.
//- De enums zijn genest binnen de Magnum en Cone klassen. Zij stellen de soorten
//magnumtypen en de smaken van de bolletjes ijs voor.


public interface Eatable {

    public void eat();

}
