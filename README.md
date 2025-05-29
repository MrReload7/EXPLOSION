# EXPLOSION
Learn all sorts of exciting things about what would happen if you nuked major urban centers.

This was made possible by the World Cities Database, which can be found in the following link:
https://simplemaps.com/data/world-cities

## Running

To compile and run the program, execute the following command in the terminal:

`mvn clean compile exec:java`

This is a combination of three commands that could each be executed separately if desired:

* `mvn clean` Deletes past compiled output to ensure we start fresh.

* `mvn compile` Compiles the application code.

* `mvn exec:java` Executes the compiled Java application.


From there, you will be asked a number of questions in the following sequence:

* Country: Self-explanatory. Make sure to properly capitalize. For example, type "France" instead of "france."

* City: Once again, self-explanatory. Just type in the name of the city from the country you selected. Only cities with a population greater to or equal to 100,000 will be shown.

* Yeild: This is the power of your bomb in kilotons (thousands of tons) of tnt. Tactical nukes range from 1-100 kilotons, and strategic "city busters" are usually around 1,000 kilotons, but can get all the way up to 50,000, like in the case of the Tzar Bomba.

* Density: In people per square kilometer. Because I don't want to pay $200 or input the population density information for the 14,800 cities in this database, you will put in the city density manually. You can either look up the density of the aformentioned city, or use this rule of thumb: "Sprawl-type" cities range from 2000-3000 people per square kilometer, all the way up to over 100,000, like in the case of New York City. Most cities are around the 5000 people per square kilometer mark. Choose appropriately.

With all of this data, you will be provided with the following statistics:

* Casualties: How many people died instantly, in a flat number.

* Percentage Casualties: How many fatalities there were, as a percentage of the population of the chosen city.

* Homes Destroyed: This assumes that roughly 4 people per house. This will tell you how many houses are lost.

* International Incedents: This will tell you how many international crises you have caused with your wanton destruction.