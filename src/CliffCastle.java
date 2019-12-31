import characters.Enemies;
import items.Equipment;
import characters.player.Hero;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class CliffCastle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,##0");

        //Class selection phase and naming

        Hero hero = new Hero("characters.player.Hero","Warrior");
        hero.setClassAtt("Warrior");
        hero.setClassAtt("Paladin");
        hero.setClassAtt("Barbarian");

        //BOSS ENEMIES

        Enemies actualCannibalLaBeouf = new Enemies(50, 0, 10, 0 ,"The Cannibal");

        Enemies darkKnight = new Enemies(100, 25, 15, 0 ,"Death Knight");

        Enemies vampireLord = new Enemies(200, 50, 20, 0 ,"Lord of The Castle");

        Enemies dragon = new Enemies(300, 0, 25, 0 ,"Dragon");

        Enemies archer = new Enemies(75,25, 5, 20, "Dark Archer");









        System.out.println("          <|\n" +
                "           A             \n" +
                "          /.\\       \n" +
                "     <|  [\"\"M#      \n" +
                "      A   | #              The Castle on the Cliff\n" +
                "     /.\\ [\"\"M#            \n" +
                "    [\"\"M# | #  U\"U#U                 \n" +
                "     | #  | #  \\ .:/    \n" +
                "     | #  | #___| #     \n" +
                "     | \"--'     .-\"     \n" +
                "   |\"-\"-\"-\"-\"-#-#-##    \n" +
                "   |     # ## ######     \n" +
                "    \\       .::::'/     \n" +
                "     \\      ::::'/      \n" +
                "   :8a|    # # ##      \n" +
                "   ::88a      ###       \n" +
                "  ::::888a  8a ##::.    \n" +
                "  ::::::888a88a[]::::\n" +
                " :::::::::SUNDOGa8a::::. ..              \n" +
                " :::::8::::888:Y8888:::::::::...      \n" +
                "::':::88::::888::Y88a______________________________________________________\n" +
                ":: ::::88a::::88a:Y88a                                  __---__-- __\n" +
                "' .: ::Y88a:::::8a:Y88a                            __----_-- -------_-__\n" +
                "  :' ::::8P::::::::::88aa.                   _ _- --  --_ --- __  --- __--\n" +
                ".::  :::::::::::::::::::Y88as88a...s88aa.");

        System.out.println("You see a castle in the distance, something tells you there is treasure and adventure\n");
        System.out.println("Are you ready to start the game? yes or no");
        String userResponse = sc.nextLine();

        System.out.println("Choose your class");
        hero.setClassAtt(sc.nextLine());

        if (userResponse.trim().equalsIgnoreCase("yes")) {
            System.out.println("You are a hero of great standing in the local village, but what is your name?");
            hero.setName(sc.nextLine());
            hero.checkName();
            System.out.println("                             ___\n" +
                    "                            / : \\\n" +
                    "                            |===|\n" +
                    "                            >._.<\n" +
                    "                        .=-<     >-=.\n" +
                    "                       /.'`(`-+-')'`.\\\n" +
                    "                     _/`.__/  :  \\__.'\\_\n" +
                    "                    ( `._/\\`. : .'/\\_.' )\n" +
                    "                     >-(_) \\ `:' / (_)-<\n" +
                    "                     | |  / \\___/ \\  | |\n" +
                    "                     )^( | .' : `. | )^(\n" +
                    "                    |  _\\|`-._:_.-'| \\  |\n" +
                    "                    \"-<\\)| :  |  : |  \"-\"\n" +
                    "                      (\\\\| : / \\ : |\n" +
                    "                        \\\\-:-| |-:-')\n" +
                    "                         \\\\:_/ \\_:_/\n" +
                    "                         |\\\\_| |_:_|\n" +
                    "                         (;\\\\/ \\__;)\n" +
                    "                         |: \\\\  | :|\n" +
                    "                         \\: /\\\\ \\ :/\n" +
                    "                         |==| \\\\|==|\n" +
                    "                        /v-'(  \\\\`-v\\\n" +
                    "                       // .-'   \\\\. \\\\\n" +
                    "                       `-'       \\\\`-'  \n" +
                    "                                  \\|");
        } else {
            System.out.println("Ok, I thought knights were supposed to be brave...");
            System.exit(0);
        }
        System.out.println("You must now approach the castle, the walk is long and has many turns and almost twist your ankle when you slip off of one of the rocks.\n However you've made it. Do you want to cross the drawbridge?");
        String drawBridgeChoice = sc.nextLine();
        if (drawBridgeChoice.trim().equalsIgnoreCase("yes")) {
            System.out.println("         |\n" +
                    "                                                     \\.\n" +
                    "                                                     /|.\n" +
                    "                                                   /  `|.\n" +
                    "                                                 /     |.\n" +
                    "                                               /       |.\n" +
                    "                                             /         |.\n" +
                    "                                           /           |.\n" +
                    "                                         /             `|.\n" +
                    "                                       /                |.\n" +
                    "                                      /                  |.\n" +
                    "                                    /                    |.\n" +
                    "                                  /                      |\\\n" +
                    "              \\#####\\           /                        ||\n" +
                    "            ###########>      /                          ||\n" +
                    "           \\##==      \\    /                            ||\n" +
                    "      ______ =       =|__/___                           ||\n" +
                    "  ,--' ,----`-,__ ___/'  --,-`-=========================##==========>\n" +
                    " \\               '        ##_______ ______   ______,-_,=##,__\n" +
                    "  `,    __==    ___,-,__,--'#'  ==='      `-'         | ##,-/\n" +
                    "    `-,____,---'       \\####\\              |        --\\_##,/\n" +
                    "        #_              |##   \\  _____,---==,__,---'    ##\n" +
                    "         #              ]===--==\\                       ||\n" +
                    "         #,             ]         \\                     ||\n" +
                    "          #_            |           \\                   ||\n" +
                    "           ##_       __/'             \\                 ||\n" +
                    "            ####='     |                \\               |/\n" +
                    "            ###=======]                   \\             |.\n" +
                    "           ///        |                      \\         ,|.\n" +
                    "           //         |                         \\      |.\n" +
                    "                                                   \\  ,|.\n" +
                    "                                                     \\ |.\n" +
                    "                                                       /.\n");
            System.out.println("You must fight an archer!");
            boolean fightResultRangeTest = rangedFight(hero, archer,50);
            if (!fightResultRangeTest) {
                heroDeath();
            } else {
                afterFightScreen(hero, "You have defeated the Archer, as he lays mortally wounded he whispers to you \"Caliburn...\", his cauldron now grows colder has you proceed into the castle. \n");
            }
            System.out.println("                           .-.\n" +
                    "                              \\\\\\V/// (o.o)\n" +
                    "                              #######  |=|\n" +
                    "                             //6 , 6\\\\  Y\n" +
                    "                              \\  =  /   |\n" +
                    "                             .-:---:---'B\n" +
                    "              (             /   `@` ,--'|\n" +
                    "               )  )        ( <|'   '|   |\n" +
                    "           ______(____      \\ \\__.__/   |\n" +
                    "          (___________)      `/<<<<<\\   |\n" +
                    "           /         \\       (>>>>>>>)  |\n" +
                    "          /           \\      `\"|\"|\"|\"`  |\n" +
                    "         |             |       |_| |    |\n" +
                    "     ____\\             /____  _(_| |_   |\n" +
                    "    ()____'.__     __.'____()(___|___)  |\n" +
                    "         .'` .'```'. `-.\n" +
                    "        ().'`       `'.()");
            System.out.println("Before you lays a man with a cauldron, there are arms and legs of his victims spinning around as he mixes.\n He looks up at you and says \"You look delicious!\" You know you must battle the actual cannibal!");
        } else {
            heroDeath("You have slipped and fell off the cliff, You have died!");
        }

        boolean fightResult1 = fight(hero, actualCannibalLaBeouf);
        if (!fightResult1) {
            heroDeath();
        } else {
            afterFightScreen(hero, "You have defeated the cannibal, as he lays mortally wounded he whispers to you \"Caliburn...\", his cauldron now grows colder has you proceed into the castle. \n");
        }
            System.out.println("                   _.--.    .--._\n" +
                    "                 .\"  .\"      \".  \".\n" +
                    "                ;  .\"    /\\    \".  ;\n" +
                    "                ;  '._,-/  \\-,_.`  ;\n" +
                    "                \\  ,`  / /\\ \\  `,  /\n" +
                    "                 \\/    \\/  \\/    \\/\n" +
                    "                 ,=_    \\/\\/    _=,\n" +
                    "                 |  \"_   \\/   _\"  |\n" +
                    "                 |_   '\"-..-\"'   _|\n" +
                    "                 | \"-.        .-\" |\n" +
                    "                 |    \"\\    /\"    |\n" +
                    "                 |      |  |      |\n" +
                    "         ___     |      |  |      |     ___\n" +
                    "     _,-\",  \",   '_     |  |     _'   ,\"  ,\"-,_\n" +
                    "   _(  \\  \\   \\\"=--\"-.  |  |  .-\"--=\"/   /  /  )_\n" +
                    " ,\"  \\  \\  \\   \\      \"-'--'-\"      /   /  /  /  \".\n" +
                    "!     \\  \\  \\   \\                  /   /  /  /     !\n" +
                    ":      \\  \\  \\   \\                /   /  /  /       :");
            System.out.println("Before you lays a knight in black armor, his presence has a dark aura around him and he seems unfazed as you walk closer to him. \n");
            System.out.println("What do you want to say to the knight?");
            String herosChat = sc.nextLine();
            System.out.println("You exclaim to the knight:\"" + herosChat + "\"\n");
            if (herosChat.trim().equalsIgnoreCase("give me caliburn")) {
                System.out.println("The knight seems bewildered \'As you wish, brave one\". He places his sword on the ground and walks out of the castle.\n");
                System.out.println("With Caliburn in your possession, you feel more powerful! You have gained 20 attack power");
                hero.increaseAttack(20);
                afterFightScreen(hero,"The knight is now behind you. You see a hall leading further into the castle.");
                System.out.println("   ,-' ;  ! `-." + "        ,-' ;  ! `-.\n" +
                        "  / :  !  :  . \\" + "      / :  !  :  . \\\n" +
                        " |_ ;   __:  ;  |" + "    |_ ;   __:  ;  |\n" +
                        " )| .  :)(.  !  |" + "    )| .  :)(.  !  |\n" +
                        " |\"    (##)  _  |" + "    |\"    (##)  _  |\n" +
                        " |  :  ;`'  (_) (" + "    |  :  ;`'  (_) (\n" +
                        " |  :  :  .     |" + "    |  :  :  .     |\n" +
                        " )_ !  ,  ;  ;  |" + "    )_ !  ,  ;  ;  |\n" +
                        " || .  .  :  :  |" + "    || .  .  :  :  |\n" +
                        " |\" .  |  :  .  |" + "    |\" .  |  :  .  |\n" +
                        " |XOXXOX_;----._|" + "    |OXOOX_;----.__|");
                System.out.println("There are two paths before you, the doors are labeled with unreadable runes. Which path will you take? Left or Right");
                String pathChoice = sc.nextLine();
                if (pathChoice.trim().equalsIgnoreCase("left")) {
                    System.out.println("                      .      .       .       .\n" +
                            "  .   .       .          .      . .      .         .          .    .\n" +
                            "         .       .         .    .   .         .         .            .\n" +
                            "    .   .    .       .         . . .        .        .     .    .\n" +
                            " .          .   .       .       . .      .        .  .              .\n" +
                            "      .  .    .  .       .     . .    .       . .      .   .        .\n" +
                            " .   .       .    . .      .    . .   .      .     .          .     .\n" +
                            "    .            .    .     .   . .  .     .   .               .\n" +
                            "     .               .  .    .  . . .    .  .                 .\n" +
                            "                        . .  .  . . .  . .\n" +
                            "                            . . . . . .\n" +
                            "                              . . . .\n" +
                            "                               I . I\n" +
                            "                 _______________III_______________\n" +
                            "                /    .       .       .       .    \\\n" +
                            "               ( ~~~ .  ~~~  .  ~~~  .  ~~~  . ~~~ )\n" +
                            "                 \\SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS/\n" +
                            "                    \\ ======================= /\n" +
                            "                        \\SSSSSSSSSSSSSSSSS/\n" +
                            "                     ________\\       /________\n" +
                            "                    (=+=+=+=+=+=+=+=+=+=+=+=+=)\n" +
                            "                     ~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("There is a fountain before you, its water seems to be a light green, do you want to drink from the fountain?");
                    String fountainChoice = sc.nextLine();
                    if (fountainChoice.trim().equalsIgnoreCase("yes")) {
                        System.out.println("You feel revitalized!");
                        hero.setHealth(150);
                    } else {
                        System.out.println("You walk away...");
                    }
                } else if (pathChoice.trim().equalsIgnoreCase("right")) {
                    System.out.println("                    ____...------------...____\n" +
                            "               _.-\"` /o/__ ____ __ __  __ \\o\\_`\"-._\n" +
                            "             .'     / /                    \\ \\     '.\n" +
                            "             |=====/o/======================\\o\\=====|\n" +
                            "             |____/_/________..____..________\\_\\____|\n" +
                            "             /   _/ \\_     <_o#\\__/#o_>     _/ \\_   \\\n" +
                            "             \\_________________\\####/_______________/\n" +
                            "              |===\\!/========================\\!/===|\n" +
                            "              |   |=|          .---.         |=|   |\n" +
                            "              |===|o|=========/     \\========|o|===|\n" +
                            "              |   | |         \\() ()/        | |   |\n" +
                            "              |===|o|======{'-.) A (.-'}=====|o|===|\n" +
                            "              | __/ \\__     '-.\\uuu/.-'    __/ \\__ |\n" +
                            "              |============= .'.'^'.'.=============|\n" +
                            "              |  _\\o/   __  {.' __  '.} _   _\\o/  _|\n" +
                            "              `\"\"\"\"-\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"-\"\"\"\"`");

                    System.out.println("There is a chest with spikes and a skull on it, do you wish to open it?");
                    String chestChoice = sc.nextLine();
                    if (chestChoice.trim().equalsIgnoreCase("yes")) {
                        System.out.println("              _..-..     \n" +
                                "            ,'      `.\n" +
                                "           /'       \\ \\\n" +
                                "          /:         \\ \\\n" +
                                "        ,;':._______...-'\\\n" +
                                "        \\:/-.._______..-_|\n" +
                                "         : :\\   `----'|'-;\n" +
                                "          \\ :\\    : : ;:/\n" +
                                "           \\ ``.   ; /;/\n" +
                                "            )   `.  /,'\n" +
                                "          ,'      `-' \\\n" +
                                "         /  .--.       )\n" +
                                "        /_.---._`._   /\n" +
                                "                `.__.'");
                        System.out.println("You see a helmet, it looks better than the one you are currently wearing however it is glowing strangely, do you want to wear it?");
                        String helmetChoice = sc.nextLine();
                        if (helmetChoice.trim().equalsIgnoreCase("yes")) {
                            hero.setHeadSlot(Equipment.cursedHelm);
                            System.out.println("You feel more protected!");
                        } else if (helmetChoice.trim().equalsIgnoreCase("no")) {
                            System.out.println("You walk away...");
                        }

                    } else if (chestChoice.trim().equalsIgnoreCase("no")) {
                        System.out.println("You walk away...");
                    }
                }

//                after Forked path
                afterFightScreen(hero,"You feel an evil presence ahead...");
                System.out.println("                                  _.-.\n" +
                        "                                 ._.-.\\\n" +
                        "                    .^         _.-'=. \\\\\n" +
                        "                  .'  )    .-._.-=-..' \\'.\n" +
                        "               .'   .'   _.--._-='.'   |  `.  ^.\n" +
                        "             .'   .'    _`.-.`=-./'.-. / .-.\\ `. `.\n" +
                        "           .'    /      _.-=-=-/ | '._)`(_.'|   \\  `.\n" +
                        "          /    /|       _.--=.'  `. (.-v-.)/    |\\   \\\n" +
                        "        .'    / \\       _.-.' \\-.' `-..-..'     / \\   `.\n" +
                        "       /     /   `-.._ .-.'      `.'  \" \". _..-'  |    |\n" +
                        "      '      |    |   /   )        \\  /   \\   \\    \\    `.\n" +
                        "     /      /    /   /   /\\                \\   \\   |      \\\n" +
                        "    /      /    /  .'  .'\\ `.        .'     \\   |   \\      \\\n" +
                        "   /      /    /  /   /   \\  `-    -' .`.    .  \\    \\     |\n" +
                        "  |      /    / .''\\.'    | `.      .'   `.   \\  |    |    |\n" +
                        " .'     /    / /   |      |      .'/       `.- `./    /    |\n" +
                        " |     /    .-|   /--.    / `.    |    _.-''\\   |     |    \\\n" +
                        ".'    /  .-'  |  /    `-.|       .'\\_.'      `. |`.   |    |\n" +
                        "|    |.-'     / /       /           \\          \\ \\ `. \\     \\\n" +
                        "|    /       /  |      /             \\         |  `. `.|    |\n" +
                        "|   |       /   `.     |      `   .'  \\        /    \\  \\    /\n" +
                        "|   |      ///.-'.\\    |       \\ /    `\\      / /-.  \\ |    |\n" +
                        "|   /      \\\\\\\\    `    \\.-     |    `-.\\     |/   \\\\\\\\'.   |\n" +
                        " \\ |        \\\\\\|        |      / \\      |          //// |  /\n" +
                        " | |         '''        |     /   \\     |          |//  |  \\\n" +
                        " \\ |                    |.-  |     \\  .-|          ''   |  /\n" +
                        "  \\|                    /    |    / ` ../               / /\n" +
                        "                        |'   /    |    /               | /\n" +
                        "                        \\.'  |    | `./                |/\n" +
                        "                       | | | \\   .'  `.. \\\n" +
                        "                      / / / ._`. \\.'-. \\`/\n" +
                        "                      |/ / /  `'  `  |/|/\n" +
                        "                       \\|\\|\n");
                System.out.println("You have arrived in the Throne Room, there is a large winged figured in front of you, it is much scarier than your previous opponents.\n");
                System.out.println("\"Prepare yourself human, I have killed more people then you've ever met\" The winged figure says.");
                boolean fightResult2x = fight(hero,vampireLord);
                if (!fightResult2x) {
                    heroDeath();

                } else {
                    System.out.println("            ^^                   @@@@@@@@@\n" +
                            "       ^^       ^^            @@@@@@@@@@@@@@@\n" +
                            "                            @@@@@@@@@@@@@@@@@@              ^^\n" +
                            "                           @@@@@@@@@@@@@@@@@@@@\n" +
                            " ~~~~ ~~ ~~~~~ ~~~~~~~~ ~~ &&&&&&&&&&&&&&&&&&&& ~~~~~~~ ~~~~~~~~~~~ ~~~\n" +
                            " ~         ~~   ~  ~       ~~~~~~~~~~~~~~~~~~~~ ~       ~~     ~~ ~\n" +
                            "   ~      ~~      ~~ ~~ ~~  ~~~~~~~~~~~~~ ~~~~  ~     ~~~    ~ ~~~  ~ ~~\n" +
                            "   ~  ~~     ~         ~      ~~~~~~  ~~ ~~~       ~~ ~ ~~  ~~ ~\n" +
                            " ~  ~       ~ ~      ~           ~~ ~~~~~~  ~      ~~  ~             ~~\n" +
                            "       ~             ~        ~      ~      ~~   ~             ~");
                    System.out.printf("You have defeated your enemies and the castle lays empty. You have earned your place as lord of the castle.\n The treasure is yours, the throne is yours. All hail Lord %s\n\n", hero.getName());
                    if (hero.getHeadSlot().getName().equalsIgnoreCase("Bright Helmet")) {
                        System.out.println("Caliburn whispers to you. \"You must toss the cursed helmet to sea or you'll never be free.\"");
                        System.out.println("Do you want to throw the helmet?");
                        String helmThrow = sc.nextLine();
                        if (helmThrow.trim().equalsIgnoreCase("yes")) {
                            System.out.println("You toss the helmet, you wouldn't want to upset Caliburn... You feel rejuvenated!");
                            hero.setHealth(175);
                            System.out.println("                                               _   __,----'~~~~~~~~~`-----.__\n" +
                                    "                                        .  .    `//====-              ____,-'~`\n" +
                                    "                        -.            \\_|// .   /||\\\\  `~~~~`---.___./\n" +
                                    "                  ______-==.       _-~o  `\\/    |||  \\\\           _,'`\n" +
                                    "            __,--'   ,=='||\\=_    ;_,_,/ _-'|-   |`\\   \\\\        ,'\n" +
                                    "         _-'      ,='    | \\\\`.    '',/~7  /-   /  ||   `\\.     /\n" +
                                    "       .'       ,'       |  \\\\  \\_  \"  /  /-   /   ||      \\   /\n" +
                                    "      / _____  /         |     \\\\.`-_/  /|- _/   ,||       \\ /\n" +
                                    "     ,-'     `-|--'~~`--_ \\     `==-/  `| \\'--===-'       _/`\n" +
                                    "               '         `-|      /|    )-'\\~'      _,--\"'\n" +
                                    "                           '-~^\\_/ |    |   `\\_   ,^             /\\\n" +
                                    "                                /  \\     \\__   \\/~               `\\__\n" +
                                    "                            _,-' _/'\\ ,-'~____-'`-/                 ``===\\\n" +
                                    "                           ((->/'    \\|||' `.     `\\.  ,                _||\n" +
                                    "             ./                       \\_     `\\      `~---|__i__i__\\--~'_/\n" +
                                    "            <_n_                     __-^-_    `)  \\-.______________,-~'\n" +
                                    "             `B'\\)                  ///,-'~`__--^-  |-------~~~~^'\n" +
                                    "             /^>                           ///,--~`-\\\n" +
                                    "            `  `                                       ");
                            System.out.println("The ground shakes and you are suddenly staring at a 25 foot tall reptile with wings. You must fight to survive!");
                            boolean fightResult3x = fight(hero,dragon);
                            if (!fightResult3x) {
                                heroDeath();

                            } else {
                                System.out.println("     __/)     (\\__\n" +
                                        "  ,-'~~(   _   )~~`-.\n" +
                                        " /      \\/'_`\\/      \\\n" +
                                        "|       /_(_)_\\       |\n" +
                                        "|     _(/(\\_/)\\)_     |\n" +
                                        "|    / // \\yes / \\\\ \\    |\n" +
                                        " \\  | ``  / \\ ''  |  /\n" +
                                        "  \\  )   /   \\   (  /\n" +
                                        "   )/   /     \\   \\(\n" +
                                        "   '    `-`-'-'    `");
                                System.out.printf("\"You have defeated a great evil today and have earned our divine gratitude.\nLive the rest of your days in your castle.\nWell see you when you pass to the next realm, Great characters.player.Hero %s\"", hero.getName());
                                System.exit(0);
                            }
                        } else {
                            System.out.println("You choose to ignore Caliburn and your soul is cursed for all of eternity");
                            System.exit(0);
                        }
                    }
                    System.exit(0);
                }

            }
            System.out.println("\"Silence fool!\" He responds has he raises his blade.\n");
            boolean fight2a = fight(hero,darkKnight);
            if (!fight2a) {
                heroDeath();
            } else {
                afterFightScreen(hero,"The knight is now behind you. You see a hall leading further into the castle.");
                System.out.println("   ,-' ;  ! `-." + "        ,-' ;  ! `-.\n" +
                        "  / :  !  :  . \\" + "      / :  !  :  . \\\n" +
                        " |_ ;   __:  ;  |" + "    |_ ;   __:  ;  |\n" +
                        " )| .  :)(.  !  |" + "    )| .  :)(.  !  |\n" +
                        " |\"    (##)  _  |" + "    |\"    (##)  _  |\n" +
                        " |  :  ;`'  (_) (" + "    |  :  ;`'  (_) (\n" +
                        " |  :  :  .     |" + "    |  :  :  .     |\n" +
                        " )_ !  ,  ;  ;  |" + "    )_ !  ,  ;  ;  |\n" +
                        " || .  .  :  :  |" + "    || .  .  :  :  |\n" +
                        " |\" .  |  :  .  |" + "    |\" .  |  :  .  |\n" +
                        " |XOXXOX_;----._|" + "    |OXOOX_;----.__|");
                System.out.println("There are two paths before you, the doors are labeled with unreadable runes. Which path will you take? Left or Right");
                String pathChoice = sc.nextLine();
                if (pathChoice.trim().equalsIgnoreCase("left")) {
                    System.out.println("                      .      .       .       .\n" +
                            "  .   .       .          .      . .      .         .          .    .\n" +
                            "         .       .         .    .   .         .         .            .\n" +
                            "    .   .    .       .         . . .        .        .     .    .\n" +
                            " .          .   .       .       . .      .        .  .              .\n" +
                            "      .  .    .  .       .     . .    .       . .      .   .        .\n" +
                            " .   .       .    . .      .    . .   .      .     .          .     .\n" +
                            "    .            .    .     .   . .  .     .   .               .\n" +
                            "     .               .  .    .  . . .    .  .                 .\n" +
                            "                        . .  .  . . .  . .\n" +
                            "                            . . . . . .\n" +
                            "                              . . . .\n" +
                            "                               I . I\n" +
                            "                 _______________III_______________\n" +
                            "                /    .       .       .       .    \\\n" +
                            "               ( ~~~ .  ~~~  .  ~~~  .  ~~~  . ~~~ )\n" +
                            "                 \\SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS/\n" +
                            "                    \\ ======================= /\n" +
                            "                        \\SSSSSSSSSSSSSSSSS/\n" +
                            "                     ________\\       /________\n" +
                            "                    (=+=+=+=+=+=+=+=+=+=+=+=+=)\n" +
                            "                     ~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("There is a fountain before you, its water seems to be a light green, do you want to drink from the fountain?");
                    String fountainChoice = sc.nextLine();
                    if (fountainChoice.trim().equalsIgnoreCase("yes")) {
                        System.out.println("You feel revitalized!");
                        hero.setHealth(150);
                    } else {
                        System.out.println("You walk away...");
                    }
                } else if (pathChoice.trim().equalsIgnoreCase("right")) {
                    System.out.println("                    ____...------------...____\n" +
                            "               _.-\"` /o/__ ____ __ __  __ \\o\\_`\"-._\n" +
                            "             .'     / /                    \\ \\     '.\n" +
                            "             |=====/o/======================\\o\\=====|\n" +
                            "             |____/_/________..____..________\\_\\____|\n" +
                            "             /   _/ \\_     <_o#\\__/#o_>     _/ \\_   \\\n" +
                            "             \\_________________\\####/_______________/\n" +
                            "              |===\\!/========================\\!/===|\n" +
                            "              |   |=|          .---.         |=|   |\n" +
                            "              |===|o|=========/     \\========|o|===|\n" +
                            "              |   | |         \\() ()/        | |   |\n" +
                            "              |===|o|======{'-.) A (.-'}=====|o|===|\n" +
                            "              | __/ \\__     '-.\\uuu/.-'    __/ \\__ |\n" +
                            "              |============= .'.'^'.'.=============|\n" +
                            "              |  _\\o/   __  {.' __  '.} _   _\\o/  _|\n" +
                            "              `\"\"\"\"-\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"-\"\"\"\"`");

                    System.out.println("There is a chest with spikes and a skull on it, do you wish to open it?");
                    String chestChoice = sc.nextLine();
                    if (chestChoice.trim().equalsIgnoreCase("yes")) {
                        System.out.println("              _..-..     \n" +
                                "            ,'      `.\n" +
                                "           /'       \\ \\\n" +
                                "          /:         \\ \\\n" +
                                "        ,;':._______...-'\\\n" +
                                "        \\:/-.._______..-_|\n" +
                                "         : :\\   `----'|'-;\n" +
                                "          \\ :\\    : : ;:/\n" +
                                "           \\ ``.   ; /;/\n" +
                                "            )   `.  /,'\n" +
                                "          ,'      `-' \\\n" +
                                "         /  .--.       )\n" +
                                "        /_.---._`._   /\n" +
                                "                `.__.'");
                        System.out.println("You see a helmet, it looks better than the one you are currently wearing however it is glowing strangely, do you want to wear it?");
                        String helmetChoice = sc.nextLine();
                        if (helmetChoice.trim().equalsIgnoreCase("yes")) {
                            System.out.println("You feel more protected!");
                            hero.setHeadSlot(Equipment.cursedHelm);
                        } else if (helmetChoice.trim().equalsIgnoreCase("no")) {
                            System.out.println("You walk away...");
                        }

                    } else if (chestChoice.trim().equalsIgnoreCase("no")) {
                        System.out.println("You walk away...");
                    }
                }

//                after Forked path
                afterFightScreen(hero,"You feel an evil presence ahead...");
                System.out.println("                                  _.-.\n" +
                        "                                 ._.-.\\\n" +
                        "                    .^         _.-'=. \\\\\n" +
                        "                  .'  )    .-._.-=-..' \\'.\n" +
                        "               .'   .'   _.--._-='.'   |  `.  ^.\n" +
                        "             .'   .'    _`.-.`=-./'.-. / .-.\\ `. `.\n" +
                        "           .'    /      _.-=-=-/ | '._)`(_.'|   \\  `.\n" +
                        "          /    /|       _.--=.'  `. (.-v-.)/    |\\   \\\n" +
                        "        .'    / \\       _.-.' \\-.' `-..-..'     / \\   `.\n" +
                        "       /     /   `-.._ .-.'      `.'  \" \". _..-'  |    |\n" +
                        "      '      |    |   /   )        \\  /   \\   \\    \\    `.\n" +
                        "     /      /    /   /   /\\                \\   \\   |      \\\n" +
                        "    /      /    /  .'  .'\\ `.        .'     \\   |   \\      \\\n" +
                        "   /      /    /  /   /   \\  `-    -' .`.    .  \\    \\     |\n" +
                        "  |      /    / .''\\.'    | `.      .'   `.   \\  |    |    |\n" +
                        " .'     /    / /   |      |      .'/       `.- `./    /    |\n" +
                        " |     /    .-|   /--.    / `.    |    _.-''\\   |     |    \\\n" +
                        ".'    /  .-'  |  /    `-.|       .'\\_.'      `. |`.   |    |\n" +
                        "|    |.-'     / /       /           \\          \\ \\ `. \\     \\\n" +
                        "|    /       /  |      /             \\         |  `. `.|    |\n" +
                        "|   |       /   `.     |      `   .'  \\        /    \\  \\    /\n" +
                        "|   |      ///.-'.\\    |       \\ /    `\\      / /-.  \\ |    |\n" +
                        "|   /      \\\\\\\\    `    \\.-     |    `-.\\     |/   \\\\\\\\'.   |\n" +
                        " \\ |        \\\\\\|        |      / \\      |          //// |  /\n" +
                        " | |         '''        |     /   \\     |          |//  |  \\\n" +
                        " \\ |                    |.-  |     \\  .-|          ''   |  /\n" +
                        "  \\|                    /    |    / ` ../               / /\n" +
                        "                        |'   /    |    /               | /\n" +
                        "                        \\.'  |    | `./                |/\n" +
                        "                       | | | \\   .'  `.. \\\n" +
                        "                      / / / ._`. \\.'-. \\`/\n" +
                        "                      |/ / /  `'  `  |/|/\n" +
                        "                       \\|\\|\n");
                System.out.println("You have arrived in the Throne Room, there is a large winged figured in front of you, it is much scarier than your previous opponents.\n");
                System.out.println("\"Prepare yourself human, I have killed more people then you've ever met\" The winged figure says.");
                boolean fightResult3a = fight(hero,vampireLord);
                if (!fightResult3a) {
                    heroDeath();

                } else {
                    System.out.println("            ^^                   @@@@@@@@@\n" +
                            "       ^^       ^^            @@@@@@@@@@@@@@@\n" +
                            "                            @@@@@@@@@@@@@@@@@@              ^^\n" +
                            "                           @@@@@@@@@@@@@@@@@@@@\n" +
                            " ~~~~ ~~ ~~~~~ ~~~~~~~~ ~~ &&&&&&&&&&&&&&&&&&&& ~~~~~~~ ~~~~~~~~~~~ ~~~\n" +
                            " ~         ~~   ~  ~       ~~~~~~~~~~~~~~~~~~~~ ~       ~~     ~~ ~\n" +
                            "   ~      ~~      ~~ ~~ ~~  ~~~~~~~~~~~~~ ~~~~  ~     ~~~    ~ ~~~  ~ ~~\n" +
                            "   ~  ~~     ~         ~      ~~~~~~  ~~ ~~~       ~~ ~ ~~  ~~ ~\n" +
                            " ~  ~       ~ ~      ~           ~~ ~~~~~~  ~      ~~  ~             ~~\n" +
                            "       ~             ~        ~      ~      ~~   ~             ~");
                    System.out.printf("You have defeated your enemies and the castle lays empty. You have earned your place as lord of the castle.\n The treasure is yours, the throne is yours. All hail Lord %s", hero.getName());

                }
            }
        }

    public static int[] drinkPotion(int potion, int health) {

        if (health < 100 && potion > 0) {
            health += 15;
            potion -= 1;
            System.out.println("You have regained 15 HP");
        }
        if (potion == 0) {
            System.out.println("You are out of potions");
        }
        return new int[]{health, potion};
    }

//    This method is for fights between two melee fighters with no range

    public static boolean fight(Hero hero, Enemies enemies) {
        Scanner sc = new Scanner(System.in);
        while (hero.getHealth() > 0 && enemies.getHealth() > 0) {
            System.out.println(hero.getName() + "'s Health: " + hero.getHealth() +", Potions: " + hero.getPotion());
            System.out.println(enemies.getName() + "'s Health: " + enemies.getHealth() + ", Items.Armor: " + enemies.getArmor());
            System.out.println("Attack, Drink Potion, Run");
            String choice = sc.nextLine();
            if (choice.trim().equalsIgnoreCase("attack")) {
                int[] updatedEnemyStats = hero.attack(enemies.getHealth(), enemies.getArmor());
                System.out.println("You hit the enemy for: " + (updatedEnemyStats[2]));
                enemies.setHealth(updatedEnemyStats[0]);
                enemies.setArmor(updatedEnemyStats[1]);
            } else if (choice.trim().equalsIgnoreCase("potion") || choice.trim().equalsIgnoreCase("drink potion")) {
                int[] updatedHeroStats = drinkPotion(hero.getPotion(), hero.getHealth());
                hero.setHealth(updatedHeroStats[0]);
                hero.setPotion(updatedHeroStats[1]);
            } else if (choice.trim().equalsIgnoreCase("run")) {
                hero.setHealth(0);
                System.out.println("                      ,____\n" +
                        "                      |---.\\\n" +
                        "              ___     |    `\n" +
                        "             / .-\\  ./=)\n" +
                        "            |  |\"|_/\\/|\n" +
                        "            ;  |-;| /_|\n" +
                        "           / \\_| |/ \\ |\n" +
                        "          /      \\/\\( |\n" +
                        "          |   /  |` ) |\n" +
                        "          /   \\ _/    |\n" +
                        "         /--._/  \\    |\n" +
                        "         `/|)    |    /\n" +
                        "           /     |   |\n" +
                        "         .'      |   |\n" +
                        "        /         \\  |\n" +
                        "       (_.-.__.__./  /");
                System.out.println("You are dead!");
            } else {
                continue;
            }

            double[] updatedHeroStats = enemies.meleeAttack(hero.getHealth(), hero.getArmorRating());
            System.out.println("The enemy has hit you for: " + (updatedHeroStats[1]));
            hero.setHealth((int) updatedHeroStats[0]);
        }
        return hero.getHealth() > 0;

    }

//    this fight takes place if either the enemy or the hero has ranged combat capabilities

    public static boolean rangedFight(Hero hero, Enemies enemy,int enemyDistance) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,##0");
        Random random = new Random();
        int currentDistance = enemyDistance;
        while(currentDistance > 0 ){
            System.out.println(hero.getName() + "'s Health: " + hero.getHealth() +", Potions: " + hero.getPotion());
            System.out.println(enemy.getName() + "'s Health: " + enemy.getHealth() + ", Items.Armor: " + enemy.getArmor());
            System.out.printf("The enemy is current %d paces away!%n",currentDistance);
            System.out.println("Move in, Defend, Run");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("move in")){
                currentDistance -= hero.getMovementSpeed();
                double[] updatedHeroStats = enemy.rangeAttack(hero.getHealth(),hero.getArmorRating());
                hero.setHealth((int) updatedHeroStats[0]);
                System.out.printf("The arrow hits you for %s damage!%n",df.format(updatedHeroStats[1]));
                System.out.printf("You move up %d paces!%n",hero.getMovementSpeed());
            }else if(choice.equalsIgnoreCase("defend")){
                int dodge = random.nextInt(4)+1;
                int halfSpeed = hero.getMovementSpeed()/2;
                currentDistance -= halfSpeed;
                if (dodge > 2){
                    System.out.println("The arrow misses you!");
                    System.out.printf("You move up %d paces.%n",halfSpeed);
                }
                else{
                    double[] updatedHeroStats = enemy.rangeAttack(hero.getHealth(),hero.getArmorRating());
                    hero.setHealth((int) updatedHeroStats[0]);
                    System.out.printf("The arrow hits you for %s damage!",df.format(updatedHeroStats[1]));
                    System.out.printf("You move up %d paces.\n",halfSpeed);
                }
            }else if(choice.equalsIgnoreCase("run")){
                System.out.println("You can't run away!");
            }else{
                System.out.printf("I don't know how to %s.%n",choice);
            }
        }
        if(hero.getHealth() < 1){
            heroDeath();
        }
        return fight(hero,enemy);

    }

        public static void heroDeath () {
            System.out.println("                      ,____\n" +
                    "                      |---.\\\n" +
                    "              ___     |    `\n" +
                    "             / .-\\  ./=)\n" +
                    "            |  |\"|_/\\/|\n" +
                    "            ;  |-;| /_|\n" +
                    "           / \\_| |/ \\ |\n" +
                    "          /      \\/\\( |\n" +
                    "          |   /  |` ) |\n" +
                    "          /   \\ _/    |\n" +
                    "         /--._/  \\    |\n" +
                    "         `/|)    |    /\n" +
                    "           /     |   |\n" +
                    "         .'      |   |\n" +
                    "        /         \\  |\n" +
                    "       (_.-.__.__./  /");
            System.out.println("You are dead!");
            System.exit(0);
        }

        public static void heroDeath (String message){
            System.out.println("                      ,____\n" +
                    "                      |---.\\\n" +
                    "              ___     |    `\n" +
                    "             / .-\\  ./=)\n" +
                    "            |  |\"|_/\\/|\n" +
                    "            ;  |-;| /_|\n" +
                    "           / \\_| |/ \\ |\n" +
                    "          /      \\/\\( |\n" +
                    "          |   /  |` ) |\n" +
                    "          /   \\ _/    |\n" +
                    "         /--._/  \\    |\n" +
                    "         `/|)    |    /\n" +
                    "           /     |   |\n" +
                    "         .'      |   |\n" +
                    "        /         \\  |\n" +
                    "       (_.-.__.__./  /");
            System.out.println(message);
            System.exit(0);
        }

        public static void afterFightScreen(Hero hero,String message){
            Scanner sc = new Scanner(System.in);
            System.out.println("88.._|      | `-.  | `.  -_-_ _-_  _-  _- -_ -  .'|   |.'|     |  _..88\n" +
                    "88   `-.._  |    |`!  |`.  -_ -__ -_ _- _-_-  .'  |.;'   |   _.!-'|  88\n" +
                    "88      | `-!._  |  `;!  ;. _______________ ,'| .-' |   _!.i'     |  88\n" +
                    "88..__  |     |`-!._ | `.| |_______________||.\"'|  _!.;'   |     _|..88\n" +
                    "88   |``\"..__ |    |`\";.| i|_|MMMMMMMMMMM|_|'| _!-|   |   _|..-|'    88\n" +
                    "88   |      |``--..|_ | `;!|l|MMoMMMMoMMM|1|.'j   |_..!-'|     |     88\n" +
                    "88   |      |    |   |`-,!_|_|MMMMP'YMMMM|_||.!-;'  |    |     |     88\n" +
                    "88___|______|____!.,.!,.!,!|d|MMMo * loMM|p|,!,.!.,.!..__|_____|_____88\n" +
                    "88      |     |    |  |  | |_|MMMMb,dMMMM|_|| |   |   |    |      |  88\n" +
                    "88      |     |    |..!-;'i|r|MPYMoMMMMoM|r| |`-..|   |    |      |  88\n" +
                    "88      |    _!.-j'  | _!,\"|_|M)(MMMMoMMM|_||!._|  `i-!.._ |      |  88\n" +
                    "88     _!.-'|    | _.\"|  !;|1|MbdMMoMMMMM|l|`.| `-._|    |``-.._  |  88\n" +
                    "88..-i'     |  _.''|  !-| !|_|MMMoMMMMoMM|_|.|`-. | ``._ |     |``\"..88\n" +
                    "88   |      |.|    |.|  !| |u|MoMMMMoMMMM|n||`. |`!   | `\".    |     88\n" +
                    "88   |  _.-'  |  .'  |.' |/|_|MMMMoMMMMoM|_|! |`!  `,.|    |-._|     88\n" +
                    "88  _!\"'|     !.'|  .'| .'|[@]MMMMMMMMMMM[@] \\|  `. | `._  |   `-._  88\n" +
                    "88-'    |   .'   |.|  |/| /                 \\|`.  |`!    |.|      |`-88\n" +
                    "88      |_.'|   .' | .' |/                   \\  \\ |  `.  | `._    |  88\n" +
                    "88     .'   | .'   |/|  /                     \\ |`!   |`.|    `.  |  88\n" +
                    "88  _.'     !'|   .' | /                       \\|  `  |  `.    |`.|  88");
            System.out.println(message);
            System.out.println("Would you like to check your current status?");
            String statusCheck = sc.nextLine();
            if (statusCheck.trim().equalsIgnoreCase("yes")) {
                System.out.println(hero.getName() + "'s Health: " + hero.getHealth() + ", Potions: " + hero.getPotion());
            }
            System.out.println("Drink a potion before proceeding?");
            String potionCheck = sc.nextLine();
            if (potionCheck.trim().equalsIgnoreCase("yes")) {
                int[] updatedHeroStats = drinkPotion(hero.getPotion(), hero.getHealth());
                hero.setHealth(updatedHeroStats[0]);
                hero.setPotion(updatedHeroStats[1]);
                System.out.println(hero.getName() + "'s Health: " + hero.getHealth() + ", Potions: " + hero.getPotion());
            }
        }


}
