package edu.banditutorials.beveragebar;

import java.util.Scanner;

/**
 * This App is a simulation created by the 542 team.
 *
 * @author Ajay Bandi
 */
public class App {

    // Specify welcome message
    private static final String GREETING_MESSAGE = "Welcome to our 542 Quenchers!";

    // Specify how to exit message
    private static final String ESCAPE_MESSAGE = "Hit Q to exit.";

    // Specify goodbye string
    private static final String GOODBYE_MESSAGE = "Thank you for visiting!";

    // specify number of  custom types available - UPDATE AS IT GROWS! 
    private static final int NUMBER_CUSTOM_TYPES = 41;

    /**
     * This main() method is the entry point for our application.
     *
     * @param args - inputs provided to the program (none required)
     */
    public static void main(String[] args) {

        // output welcome
        System.out.println(GREETING_MESSAGE);

        // output how to escape
        System.out.println(ESCAPE_MESSAGE);

        try (// construct Scanner and begin interaction
                var scanner = new Scanner(System.in)) {

            // Prompt for topic: ask if they want to see animals
            System.out.println("Do you want to see our specials (y/n)?");
            var interestInput = scanner.next();

            // if yes, show list
            if (interestInput.toUpperCase().startsWith("Y")) {

                // declare an int for the custom type number input
                int typeNumberInput;

                // declare a boolean for isValid
                boolean isValid;

                // do the list prompt for the first time, loop back while valid
                do {
                    // Prompt for type: ask if they want to see our options
                    System.out.println();
                    System.out.println("-------------------------------------");
                    System.out.println("Which beverage would you like to see?");
                    System.out.println("Enter a number to choose, 0 to exit.");
                    // Run UtilityBuildSwitch to get autogenerated switch and menu
                    // Replace the menu below as it grows
                    // Remember to also change the value of NUMBER_CUSTOM_TYPES above.
                    System.out.print(" 1.Coffee              ");
                    System.out.print(" 2.Milk                ");
                    System.out.print(" 3.Tea                 ");
                    System.out.print(" 7.OrangeBreeze              ");
                    System.out.print(" 8.CoconutWaterSlush                ");
                    System.out.print(" 9.RaspberryVanillaSoda                 ");
                     System.out.print(" 10.MelonSorbetFloat                 ");
		    System.out.print(" 11.Apple Juice                 ");
                    System.out.print(" 12.Bananna Juice                 ");
                    System.out.print(" 13.Mango Juice                ");
			System.out.print(" 14.Peach Smoothie                ");
			System.out.print(" 15.Blueberries Smoothie               ");
			System.out.print(" 16. Dragon Fruit Smoothie               ");
			System.out.print(" 17. PineApple Smmothie               ");
			System.out.print("18.PediaLyte            ");
                        System.out.print("19.ORS            ");
                        System.out.print("20.LMNT            ");
                        System.out.print("21.Essentia            ");
			System.out.print("22.Red Bull            ");
			System.out.print("23.Bang Blue Razz            ");
			System.out.print("24.HiBall Energy            ");
			System.out.print("25.Monster Energy            ");
			System.out.print("26.StrawberryShake            ");
			System.out.print("27.ChocolateShakes           ");
			System.out.print("28.OreoShake            ");
			System.out.print("29.ButterscotchShake            ");
			
			System.out.print("30.StrawberryLemonade            ");
			System.out.print("31.MangoLemonade           ");
			System.out.print("32.OrangeLemonade            ");
			System.out.print("33.VanillaLemonade            ");
			
			System.out.print("34.ChocolateLassi            ");
			System.out.print("35.MangoLassi           ");
			System.out.print("36.DryFruitLassi            ");
			System.out.print("37.BananaLassi            ");
			
			System.out.print("38.StrawberryMojito            ");
			System.out.print("39.CoconutMojito           ");
			System.out.print("40.BlackberryMojito            ");
			System.out.print("41.ClassicMintMojito            ");
		
System.out.println(" 30.Strawberry Lemonade                 ");
System.out.print(" 31.Mango Lemonade                 ");
System.out.print(" 32.Orange Lemonade                 ");
System.out.print(" 33.Vanilla Lemonade                 ");
                    
                    // END PASTE - right-click / Format
                    System.out.println();
                    try {
                        typeNumberInput = scanner.nextInt();
                    } catch (Exception ex) {
                        typeNumberInput = 0;
                    }

                    // set isValid if >= 1 and <= number of custom types
                    isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_CUSTOM_TYPES;

                    // switch by custom type - autogenerate with AppBuildSwitch.java
                    switch (typeNumberInput) {

                        // Run UtilityBuildSwitch.java and paste the 
                        // autogenerated switch code here............
                        case 1 -> {
                            var b = new Coffee("Coffee");
                            var n = b.getName();
                            var d = b.getDescription();
                            System.out.println("I'm " + n + ", a " + d + ".");
                        }
                        case 2 -> {
                            var b = new Milk("Milk");
                            var n = b.getName();
                            var d = b.getDescription();
                            System.out.println("I'm " + n + ", a " + d + ".");
                        }
                        case 3 -> {
                            var b = new Tea("Tea");
                            var n = b.getName();
                            var d = b.getDescription();
                            System.out.println("I'm " + n + ", a " + d + ".");
                        }
                        case 4 -> {
                            var coke = new Coke(12.50, "Coke", 12.50, 75.00);
                            System.out.println("I'm " + coke.getName() + ", a " + coke.getDescription() + ".");
                        }
                        case 5 -> {
                            var sprite = new Sprite(15.00, "Sprite", 10.00, 75.00);
                            System.out.println("I'm " + sprite.getName() + ", a " + sprite.getDescription()+ ".");
                        } 
                        case 6 -> {
                            var gingerale = new Gingerale(25.00, "gingerale", 10.00, 65.00);
                            System.out.println("I'm " + gingerale.getName() + ", a " + gingerale.getDescription()+ ".");
                        } 
                            case 7 -> {
                            var b = new OrangeBreeze(10.00,1,"OrangeBreeze");
                            var n = b.getName();
                            var d = b.calculatebill();
                            System.out.println("I'm " + n + ", my price is  " + d + ".");
                        }
                        case 8 -> {
                            var b = new CoconutWaterSlush(20.00,1,"CoconutWaterSlush");
                            var n = b.getName();
                            var d = b.calculatebill();
                            System.out.println("I'm " + n + ", my price is  " + d + ".");
                        }
                        case 9 -> {
                            var b = new RaspberryVanillaSoda(25.00,1,"RaspberryVanillaSoda");
                            var n = b.getName();
                            var d = b.calculatebill();
                            System.out.println("I'm " + n + ", my price is  " + d + ".");
                        }
						case 10 -> {
                            var b = new MelonSorbetFloat(35.00f,1,"MelonSorbetFloat");
                            var n = b.getName();
                            var d = b.calculatebill();
                            System.out.println("I'm " + n + ", my price is  " + d + ".");
                        }
				    case 11 -> {
                            var b = new AppleJuice("Apple Juice");
                            var n = b.getName();
                            var d = b.getDescription();
                            var c = b.juiceCost();
                            System.out.println("I'm " + n + ", a " + d + ".");
                            System.out.println(c);
                        }
                        case 12 -> {
                            var b = new BanannaJuice("bananna");
                            var n = b.getName();
                            var d = b.getDescription();
                            var c = b.juiceCost();
                            System.out.println("I'm " + n + ", a " + d + ".");
                            System.out.println("Cost of Banana Juice is "+c);
                        }
                        case 13 -> {
                            var b = new MangoJuice("Mango Juice");
                            var n = b.getName();
                            var d = b.getDescription();
                            var c = b.juiceCost();
                            System.out.println("I'm " + n + ", a " + d + ".");
                            System.out.println(c);
                        }
			   
                       case 14 -> {
                            var b = new PeachSmoothie(25.5, 9.0, 5, 5, "Peach Smoothie");
                            var n = b.getName();
                            var d = b.getDescription();
                            var e = b.calCost();
                            System.out.println("I'm " + n + " , " + d + ","+e);
                        }
                        
                        case 15 -> {
                            var b = new BlueBerriesSmoothie(45.5, 5.0, 7, 3, "Blueberries Smoothie");
                            var n = b.getName();
                            var d = b.getDescription();
                            var e = b.calCost();
                            System.out.println("I'm " + n + " , " + d + ","+ e);
                        }
                        
                        case 16 -> {
                            var b = new DragonFruitSmoothie(7.0, 10, 6, "Dragon FriutSmoothie");
                            var n = b.getName();
                            var d = b.getDescription();
                            var e = b.calCost();
                            System.out.println("I'm " + n + " , " + d + ","+ e);
                        }
                        
                        case 17 -> {
                            var b = new PineAppleSmoothie(15.5, 8.0, 13, 9, "Pineapple Smoothie");
                            var n = b.getName();
                            var d = b.getDescription();
                            var e = b.calCost();
                            System.out.println("I'm " + n + " , " + d + ","+ e);
                        }
				    case 18 -> {
                            Pedialyte elec = new Pedialyte("Strawberry", "DR.Pedia", "bottle", "Pedialyte");
                            var nam = elec.getName();
                            var des = elec.getDescription();
                            var man = elec.getManufacture();
                            var typ = elec.getType();
                            

                            System.out.println("I'm " + nam + ", " + des + ", manufactured by " + man + " available in  " + typ + " ");
                            System.out.println("Mineral Content==>"+elec.calcMineralContent());
                            System.out.println("Flavour:"+elec.getFlavor());
                        }
                        case 19 -> {
                            ORS elec = new ORS("Strawberry", "DR.Pedia", "packet", "ORS");
                            var nam = elec.getName();
                            var des = elec.getDescription();
                            var man = elec.getManufacture();
                            var typ = elec.getType();
                            

                            System.out.println("I'm " + nam + ", " + des + ", manufactured by " + man + " available in  " + typ + " ");
                            System.out.println("Mineral Content==>"+elec.calcMineralContent());
                            System.out.println("Flavour:"+elec.getFlavor());
                        }
                        case 20 -> {
                            LMNT elec = new LMNT(530.50, "DR.Pedia", "bottle", "LMNT");
                            var nam = elec.getName();
                            var des = elec.getDescription();
                            var man = elec.getManufacture();
                            var typ = elec.getType();
                            

                            System.out.println("I'm " + nam + ", " + des + ", manufactured by " + man + " available in  " + typ + " ");
                            System.out.println("Mineral Content==>"+elec.calcMineralContent());
                            System.out.println("Calories:"+elec.getCalories());
                        }
                        case 21 -> {
                            Essentia elec = new Essentia(55, "DR.Pedia", "packet", "Essentia");
                            var nam = elec.getName();
                            var des = elec.getDescription();
                            var man = elec.getManufacture();
                            var typ = elec.getType();
                            

                            System.out.println("I'm " + nam + ", " + des + ", manufactured by " + man + " available in  " + typ + " ");
                            System.out.println("Mineral Content==>"+elec.calcMineralContent());
                            System.out.println("Price:"+ elec.getPrice());
                        }
		        case 22 -> {
                            var RedBull = new RedBull(30, 56, 41.2, 2, "RedBull");
                            System.out.println("I'm " + RedBull.getName() + ", a " + RedBull.getDescription()+ ".");
                        } 
                        case 23 -> {
                            var bb = new BangBlueRazz(34.5, 10, "BangBlueRazz");
                            System.out.println("I'm " + bb.getName() + ", a " + bb.getDescription()+ ".");
                        }
                        case 24 -> {
                            var hb = new HiBallEnergy(28.9, 5, "HiBallEnergy");
                            System.out.println("I'm " + hb.getName() + ", a " + hb.getDescription()+ ".");
                        }
                        case 25 -> {
                            var mg = new MonsterEnergy(20.6, 6, "MonsterEnergy");
                            System.out.println("I'm " + mg.getName() + ", a " + mg.getDescription()+ ".");
                        }
                         
				    
			case 26 -> {
                            var b = new StrawberryShake(160.8, 26, 40 ,"Strawberry");
                            var n = b.getName();
                            var d = b.getDescription();
			    var e = b.calculatecost();
		            var f = b.getGlucoseContent();
                            System.out.println("I'm " + n + ", a " + d + "and the cost is " + e + ". The GlucoseContent is" + f);
                        }

                        case 27 -> {
                            var b = new ChocolateShakes(150.7, 20, 35 ,"Chocolate");
                            var n = b.getName();
                            var d = b.getDescription();
			    var e = b.calculatecost();
		            var f = b.getProteinCount();
                            System.out.println("I'm " + n + ", a " + d + "and the cost is " + e + ". The ProteinCount is" + f);
                        }

                        case 28 -> {
                            var b = new OreoShakes(200, 15, "Oreo", 25);
                            var n = b.getName();
                            var d = b.getDescription();
			    var e = b.calculatecost();
		            var f = b.getCarbohydrateCount();
                            System.out.println("I'm " + n + ", a " + d + "and the cost is " + e + ". The carbohydrateCount is" + f);
                        }

                        case 29 -> {
                            var b = new ButterscotchShake(250.6, 10, 20 ,"Butterscotch");
                            var n = b.getName();
                            var d = b.getDescription();
			    var e = b.calculatecost();
		            var f = b.getCalorieCount();
                            System.out.println("I'm " + n + ", a " + d + "and the cost is " + e + ". The calorieCount is" + f);
                        }
		 case 30 -> {
                            
                                    var b = new StrawberryLemonade(
                                            "Strawberry Lemonade", 4);
                                    var d = b.getDescription();
                                    var a = b.getQuantityStatement();
                                    System.out.println(d + " and " + a);
                                    var c = b.calculatePrice();
                                    System.out.println(c);
                                }
 case 31 -> {
                            
                                    var b = new MangoLemonade(
                                            "Mango Lemonade", 5);
                                    var d = b.getDescription();
                                    var a = b.getQuantityStatement();
                                    System.out.println(d + " and " + a);
                                    var c = b.calculatePrice();
                                    System.out.println(c);
                                }
 case 32 -> {
                            
                                    var b = new OrangeLemonade(
                                            "Orange Lemonade");
                                    var d = b.getDescription();
                                    var a = b.getQuantityStatement();
                                    System.out.println(d + " and " + a);
                                    var c = b.calculatePrice();
                                    System.out.println(c);
                                }
 case 33 -> {
                            
                                    var b = new VanillaLemonade(
                                            "Vanilla Lemonade", 7);
                                    var d = b.getDescription();
                                    var a = b.getQuantityStatement();
                                    System.out.println(d + " and " + a);
                                    var c = b.calculatePrice();
                                    System.out.println(c);
                                }
					   case 34 -> {
    var c = new ChocolateLassi(2, 1, 2, 100,"ChocolateLassi");
    System.out.println(c.getName() + ", of  price $" + c.calcPrice() + ".");
    }
case 35 -> {
    var m = new MangoLassi(10,150,2.3,1,2,20,"MangoLassi");
    System.out.println(m.getDescription()+ ", "+m.getName() + ", of  price $" + m.calcPrice() + ".");
    } 
case 36 -> {
    var d = new DryFruitLassi(2,1,3,100,"DryFruitLassi");
    System.out.println(d.getName() + ", of  price $" + d.calcPrice() + ".");
    }
case 37 -> {
    var b = new BananaLassi(2,1,5,200,"BananaLassi");
    System.out.println(b.getName() + ", of  price $" + b.calcPrice() + ".");
    }
					    case 38 -> {
                            var b = new StrawberryMojito("Strawberry Mojito",1.0,25.5);
                            var n = b.getName();
                            var d = b.getDescription();
                            var c = b.getTotalPrice();
                            System.out.println("I'm a " + n + " " + d + " "+c+".");
                          
                        }
                        
                        case 39 -> {
                            var b = new CoconutMojito("Coconut Mojito",2.0,35.5);
                            var n = b.getName();
                            var d = b.getDescription();
                            var c = b.getTotalPrice();
                             System.out.println("I'm a " + n + " " + d + " "+c+".");
                           
                        }
                        case 40 -> {
                            var b = new BlackberryMojito("Blackberry Mojito",3.0,15.5);
                            var n = b.getName();
                            var d = b.getDescription();
                            var c = b.getTotalPrice();
                            System.out.println("I'm a " + n + " " + d + " "+c+".");
                            
                        }
                        case 41 -> {
                            var b = new ClassicMintMojito("ClassicMint Mojito",4.0,10.5);
                            var n = b.getName();
                            var d = b.getDescription();
                            var c = b.getTotalPrice();
                           System.out.println("I'm a " + n + " " + d + " "+c+".");
                            
                        }
                        //// END PASTE (right-click and Format )
                        default -> {
                        }

                    }

                    // while the input is valid, we loop back
                } while (isValid);

            }
        }

        // output goodbye
        System.out.println(GOODBYE_MESSAGE);
    }
}
