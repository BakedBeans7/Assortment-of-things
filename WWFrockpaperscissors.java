import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scottsteiner = new Scanner(System.in);

        String p1 = "";
        String p2 = "";
        String p1attack = "";
        String p2attack = "";

        int p1champion = 0;
        int p2champion = 0;


System.out.println("                                         .;..;;;c,':c;';c;';c;,;,.'::;'.;'.;;'':,':,,:::'':,.                ");                                         
System.out.println("                                         ,Odokox0l;kk;.:xl.;kc,xl.'xk:.'OdoOkcoOdckdodxx;lOd,.':;..      ");                                             
System.out.println("                                         .:'';;cl:;coc;:ll,;c;,loc;coc,;l,.;ccccccc::cll:ccl;.;c:,.       ");                                            
System.out.println("           ,oollllcllcllccllllllcllllclllccllllllcllcclllllllcllccllclllllccllllllllcllllllllllllcclccclllccclcclccllccccllcllcllol'  ");                
System.out.println("          .dO;..;::::::::;',:::::::::;..;::::::::;..;::::::::;.'::::..  ..     ..;:::::::::..;::::::::,..;:::::::::'.,:::::::::'.lKc   ");               
System.out.println("          .d0,.oNNNKOkkkOd,cOOKNNNX0Od,lXNNX0OOOOx,lXNWX0OkkOd,lNNN0;           cKNNX0OOOOx;cKWWX00NNN0;cKNWN0Okkkx;:KNNN0kkkkk; cKc   ");               
System.out.println("          .d0,.dWWWKkdxxxl. ..dWWWK;. .oWWWXOdxxxo,oWWWXOddxxo,oNWWK;           lNWWK:.... .lNWWKcoNWWK:lNWWKolxxdo;cXWWNOxxxxd, cKc    ");              
System.out.println("          .dO' ;dxxxk0NWW0,  .dWWW0,  .oWWWXOxxkko,oWWWNOxxxxd,oNWWK;           lNWWK;      lNWWXxkNWWKclNWWKol0WWXccNWWN0kxxxx; cKc    ");              
System.out.println("          .dO'.ckkkkOKNWWO'  .dWWW0,  .oNWNXOkkkkd,lNWWXOkkkkd,oNWWXOkkkkd'     cXWWNOkkxkd;lXWWXkkNWWK:cKWWN0kKNWX:cXWWN0kkkkx; cKc    ");              
System.out.println("          .d0' ';;;;;;;;;.    ';;;,.   .,;;;;;;;;,..,;;;;;;;;,..;;;;;;;;;,.     .,;;;;;;;;;..;;;,..;;;,..,;;;;;;;;;..,;;;;;;;;;. cKc    ");              
System.out.println("          .d0'                                                                                                                   cKc    ");              
System.out.println("          .d0' ;xkOkkkkkko,ckOOc 'dkOd';xOkkkkkkko':kkkx'      :kkkd'       ,xkOOkkkkkd,,xkkko'   ;kkkx,,dkkkkkkkkx,,dOkkkkkkkx, cKc    ");              
System.out.println("          .d0'.dWWWKo;:;;,'dWWWd.:KWW0;oWWWKdkWWW0:oNWWK,      oNWWK,      .lNWWXkddxxo,lNWWWWXx:.lNWWK:lNWWXxdxxxd;lNWWNOdxxxd, cKc    ");              
System.out.println("          .dO'.dWWW0'     .xWWWXO0NWW0;oWWW0cdWWW0:oWWWK,      oNWWK,      .lNWWNKO000k;lNWWNO0WN0KWWWK:lNWWKodKXNKclNWWWK0000O; cKc    ");              
System.out.println("          .xO'.dWWWKo::::;'dWWWk,cKWMO;dWWWXO0WWW0:oWWWXd::::;.oNWWXd::::;..lNWWNOddddo,lNWWX:.:kXWWMWXclNWWNxo0NWXclNWWNOddddd, cKc    ");              
System.out.println("          .dO' ;dxxxxxxxxl,:xxx: 'oxxl':xxxo,:xxxo,:xxxxxxxxxo,:xxxxxxxxxo'.,oxxxxxxxxo,;xxxo'   ,oxxxl.,oxxxxxxxxd,,oxxxxxxxxx, cKc    ");              
System.out.println("           ckocclllclllllccclllcccllcllcllccclllcccllllcllccllcccccccllcllccclclllllllcccllllccccccllccccccccccclllcclllllclllllcxk,    ");              
System.out.println("            ..'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''',;clllc:cc;'''''''''''''''..'..     ");              
System.out.println("                                                                                                   .:l:lddoc:cc.                         ");             
System.out.println("                ..;ccccccclcclc,        .;llccc'.       .;cclcccccccccccllclclc,.                  ,ooooooodllx:                         ");             
System.out.println("                 .:OXXXXX00XXXXd.      .;OXXXXKo.      .;OXXXXXXXXXXXXXXXXXXXXd'.                  'odloxkdoodd;                          ");            
System.out.println("                  .l0XXXNKOKNXNKl.    .;kXXXXXXKo.    .;kXXXXXXNXXXXXXXXXXXXX0c.                  .;oddoxxooxxo:.                         ");            
System.out.println("                   ,xXNNNNK0XNNN0c.   'xNNNNNNNN0l.   'xXNNNXOxkkkkOOOkkkkkkkx;                   .:dxkddxdxkxod;                         ");            
System.out.println("                   .:ONNNNNKKNNNNk;. .oKWNKOO0XNNO:. .oKWNNXl..................                    .ckkxOOxdkxc:;.                         ");           
System.out.println("                    .lKNNWNNKKNWWXx'.:KWWXkdxxKNNNx'.:0NWWNd.                                      .:xkkkkxdkx;':'                         ");           
System.out.println("                      'xNWWWWXKNWWW0ONWWKKNWWWXKNWWKOXWWWKOOOOOOOOOOOOOOo,.                         ,l::ldxxd:;::lddxo:.                      ");        
System.out.println("                      .,lk000kdok00000OdoxO000xddk00000OxodO0000000000Od:.                          .;;;oxxkxc;;;;;;;,,'''...                ");         
System.out.println("                       .'',cc;::,,:::;';c;:;;:;::,;:::;':c,:::ccc::::;';;.                       .'',;;:odolcc::cc:;;;:::cll;.               ");         
System.out.println("                        .cOXXX0OkOXXXKkk0KXxl0X0OkOXXXKkk0KXXXOlcccllccc'                     .';:ccc:::llccc:ccccccccloolddl:.              ");         
System.out.println("                        .,dKNNNNKOKXK00XNNO,.lXNNK0KXX00XNNNN0c.                             'oo::c::cc:ccccc::::::::ldkOkkkoc;.             ");         
System.out.println("                         .;kNNNNN0xxdOXNNKl..,kNNN0xxxOXNNNNKo'                             'oo,,:clcclc:clc:cclodddlccoxdoolc:.             ");         
System.out.println("                          .cONXNNNNXXNNNXd,. .c0NNNNNNNNNNNXx,.                            .,:'.,lxkxdoolcccodxkk00Oxl::clcc:::'             ");         
System.out.println("                           .cOXXXXXXXXXXO:.   .c0XXXXXXXXXX0c..':;.                      ..:c;. .lkkkkxdollxkkkkkO0Oxc:okkxdlclc'             ");        
System.out.println("                            .;lloooooolcc.     .;loooooolllc' .;c:,.                 .;::cdk0k, .'lodkkxoldkkkkkkkxoc,;k0Okkkdoo:.            ");        
System.out.println("                               ... ...            .. ....       .                   .;oooodxO0l.  .':loocclodddddol:,..lkkdddlclc'             ");       
System.out.println("                                                                                   .:loddooddo,     .,:coddoollc:,..   .;cccllccc'             ");       
System.out.println("                                                                                 .,,:lodo:;,..     .,cloddddddol:'.   ..;ldxxdood;.            ");       
System.out.println("                                                                                 .cdoxo:,.         .;c:c:,;::;'..  .';codxxkxxxxkl.            ");       
System.out.println("                       ..  ... ..  ..   .       .   ..  .  ...  ..                .,llc:'          .';::,''.',;,';cdxkOOOkkkkkOOkc.            ");       
System.out.println("                      'dl.,dx:;xo..;l;.;l:.    ;l;.,d;.ldl;okc.,d;                   ....          .;oxdddookXNNK0KK00OOkkkkkkdo:.              ");      
System.out.println("                      .'. .',..,,. .,'..,'     .'' .'..,''.',. .'.                                ,oxO0K0000XWWWNXK0OOkxxdoc:,.                 ");      
System.out.println("                                                                                                  .',;:cc::::ccc::;;;;,,,'.                     ");      
System.out.println("                                                                                                                                                ");      
System.out.println("                                                                                                                                  ");
System.out.println("=====================================================================");
System.out.println("Welcome to the WWF STEEL CAGE CHALLENGE -ROCK/PAPER/SCISSORS EDITION-");
System.out.println("=====================================================================");
System.out.println("");



System.out.println("Characters:");
System.out.println("-----------=============");
System.out.println("1. Hulk Hogan");
System.out.println("2. Razor Ramon");
System.out.println("3. Jake 'The Snake' Roberts");
System.out.println("------------============");
System.out.print("Choose your character (P1): ");
String p1char = scottsteiner.nextLine();
p1 = p1char;

System.out.println("");

System.out.println("Characters:");
System.out.println("-----------=============");
System.out.println("1. Hulk Hogan");
System.out.println("2. Razor Ramon");
System.out.println("3. Jake 'The Snake' Roberts");
System.out.println("------------============");
System.out.print("Choose your character (P2): ");
String p2char = scottsteiner.nextLine();
p2 = p2char;


System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


System.out.println("\t\t"+p1 + " vs. " + p2);
System.out.println("--------------------------------------------------");
System.out.print(p1 + ", Choose Rock (1), Paper (2), or Scissors (3): ");
int choice = scottsteiner.nextInt();

if (choice == 1) {
    p1attack = "p1rock";
}
else if (choice == 2) {
    p1attack = "p1paper";

}
else if (choice == 3) {
    p1attack = "p1scissors";

}

System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


System.out.println("\t\t"+p1 + " vs. " + p2);
System.out.println("--------------------------------------------------");
System.out.print(p2 + ", Choose Rock (1), Paper (2), or Scissors (3): ");
int choice2 = scottsteiner.nextInt();

if (choice2 == 1) {
    p2attack = "p2rock";
}
else if (choice2 == 2) {
    p2attack = "p2paper";

}
else if (choice2 == 3) {
    p2attack = "p2scissors";

}

System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

if (p1attack == "p1rock" && p2attack == "p2scissors"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Look at that vicious clothesline, 'Bout cut his head clean off!'");
System.out.println("Jerry: 'Hey, wait a minute, is that Randy Savage?!'");
System.out.println("Savage: 'I'm commin overr here for the commentatin, I'm wantin to see who's better,");
System.out.println("         because I'm the cream of the crop, and I am lookin for a worthy opponent, ");
System.out.println("         because I'm the Macho man, Raaaandy Savage OH YEAHH!'");
System.out.println("JR: 'Well OK then Macho Ma-'");
System.out.println("Jerry: Would you look at that suplex!");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p1 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a new champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your NEW, WWF Heavyweight Champion of the World... " + p1 + "!!!'");
p1champion = p1champion + 1;

}
else if (p1attack == "p1paper" && p2attack == "p2rock"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Look at that vicious clothesline, 'Bout cut his head clean off!'");
System.out.println("Jerry: 'Hey, wait a minute, is that Randy Savage?!'");
System.out.println("Savage: 'I'm commin overr here for the commentatin, I'm wantin to see who's better,");
System.out.println("         because I'm the cream of the crop, and I am lookin for a worthy opponent, ");
System.out.println("         because I'm the Macho man, Raaaandy Savage OH YEAHH!'");
System.out.println("JR: 'Well OK then Macho Ma-'");
System.out.println("Jerry: Would you look at that suplex!");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p1 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a new champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your NEW, WWF Heavyweight Champion of the World... " + p1 + "!!!'");
p1champion = p1champion + 1;

}
else if (p1attack == "p1scissors" && p2attack == "p2paper"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Look at that vicious clothesline, 'Bout cut his head clean off!'");
System.out.println("Jerry: 'Hey, wait a minute, is that Randy Savage?!'");
System.out.println("Savage: 'I'm commin overr here for the commentatin, I'm wantin to see who's better,");
System.out.println("         because I'm the cream of the crop, and I am lookin for a worthy opponent, ");
System.out.println("         because I'm the Macho man, Raaaandy Savage OH YEAHH!'");
System.out.println("JR: 'Well OK then Macho Ma-'");
System.out.println("Jerry: Would you look at that suplex!");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p1 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a new champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your NEW, WWF Heavyweight Champion of the World... " + p1 + "!!!'");
p1champion = p1champion + 1;

}




// p2

if (p2attack == "p2rock" && p1attack == "p1scissors"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Look at that vicious clothesline, 'Bout cut his head clean off!'");
System.out.println("Jerry: 'Hey, wait a minute, is that Randy Savage?!'");
System.out.println("Savage: 'I'm commin overr here for the commentatin, I'm wantin to see who's better,");
System.out.println("         because I'm the cream of the crop, and I am lookin for a worthy opponent, ");
System.out.println("         because I'm the Macho man, Raaaandy Savage OH YEAHH!'");
System.out.println("JR: 'Well OK then Macho Ma-'");
System.out.println("Jerry: Would you look at that suplex!");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p2 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a new champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your NEW, WWF Heavyweight Champion of the World... " + p2 + "!!!'");
p2champion = p2champion + 1;

}
else if (p2attack == "p2paper" && p1attack == "p1rock"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Look at that vicious clothesline, 'Bout cut his head clean off!'");
System.out.println("Jerry: 'Hey, wait a minute, is that Randy Savage?!'");
System.out.println("Savage: 'I'm commin overr here for the commentatin, I'm wantin to see who's better,");
System.out.println("         because I'm the cream of the crop, and I am lookin for a worthy opponent, ");
System.out.println("         because I'm the Macho man, Raaaandy Savage OH YEAHH!'");
System.out.println("JR: 'Well OK then Macho Ma-'");
System.out.println("Jerry: Would you look at that suplex!");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p2 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a new champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your NEW, WWF Heavyweight Champion of the World... " + p2 + "!!!'");
p2champion = p2champion + 1;

}
else if (p2attack == "p2scissors" && p1attack == "p1paper"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Look at that vicious clothesline, 'Bout cut his head clean off!'");
System.out.println("Jerry: 'Hey, wait a minute, is that Randy Savage?!'");
System.out.println("Savage: 'I'm commin overr here for the commentatin, I'm wantin to see who's better,");
System.out.println("         because I'm the cream of the crop, and I am lookin for a worthy opponent, ");
System.out.println("         because I'm the Macho man, Raaaandy Savage OH YEAHH!'");
System.out.println("JR: 'Well OK then Macho Ma-'");
System.out.println("Jerry: Would you look at that suplex!");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p2 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a new champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your NEW, WWF Heavyweight Champion of the World... " + p2 + "!!!'");
p2champion = p2champion + 1;
}


System.out.print("Enter '1' to Continue: ");
int cont3 = scottsteiner.nextInt();

if (cont3 == 0) {
    System.out.println("");
}
else if (cont3 != 0) {
    System.out.println("");
}


if (p1champion == 1 && p2champion == 0) {
System.out.println("\n");
System.out.println("===============================================================================================");
System.out.println("*Next week*");
System.out.println("JR: Hello everyone, and welcome to Monday Night Raw! I'm Jim Ross and this is Jerry 'The King' Lawler,");
System.out.println("    Get ready for this upcoming promo that " + p2 + " will do tonight, most likely about last weeks loss");
System.out.println("    to the great " + p1 + " for the WWF Heavyweight Championship of the World.'");
System.out.println("Jerry: 'Well said JR, we all know how angry " + p2 + " was after that great match, and I can't wait ");
System.out.println("        for what he is about to say in a few minutes here.'");
System.out.println("================================================================================================");
System.out.println(p2+": 'Well I'm sure you're all wondering about what I have to say, so I'll get to the chase. I'm ");
System.out.println("      challenging " + p1 + " to a rematch for the WWF Heavyweight Championship! And It'll ");
System.out.println("      be in a ladder match!'");
System.out.println("*"+p1+"'s' entrance music plays*");
System.out.println(p1+": 'Well let me tell you something "+p2+", I accept your challenge! But let me give the WWF universe some information,");
System.out.println("      "+p2+"'s gonna lose, and thats not a prediction, thats a spoiler!'");
System.out.println("================================================================================================");
System.out.println("JR: 'We very well might be in for a treat tonight, right Jerry?'");
System.out.println("Jerry: 'A treat indeed JR!'");
System.out.println("================================================================================================");
}
else if (p2champion == 1 && p1champion == 0) {
System.out.println("\n");
System.out.println("===============================================================================================");
System.out.println("*Next week*");
System.out.println("JR: Hello everyone, and welcome to Monday Night Raw! I'm Jim Ross and this is Jerry 'The King' Lawler,");
System.out.println("    Get ready for this upcoming promo that " + p1 + " will do tonight, most likely about last weeks loss");
System.out.println("    to the great " + p2 + " for the WWF Heavyweight Championship of the World.'");
System.out.println("Jerry: 'Well said JR, we all know how angry " + p1 + " was after that great match, and I can't wait ");
System.out.println("        for what he is about to say in a few minutes here.'");
System.out.println("================================================================================================");
System.out.println(p1+": 'Well I'm sure you're all wondering about what I have to say, so I'll get to the chase. I'm ");
System.out.println("      challenging " + p2 + " to a rematch for the WWF Heavyweight Championship! And It'll ");
System.out.println("      be in a ladder match!'");
System.out.println("*"+p2+"'s' entrance music plays*");
System.out.println(p2+": 'Well let me tell you something "+p1+", I accept your challenge! But let me give the WWF universe some information,");
System.out.println("      "+p1+"'s gonna lose, and thats not a prediction, thats a spoiler!'");
System.out.println("================================================================================================");
System.out.println("JR: 'We very well might be in for a treat tonight, right Jerry?'");
System.out.println("Jerry: 'A treat indeed JR!'");
System.out.println("================================================================================================");
}
p1champion = p1champion * 0;
p2champion = p2champion * 0;
//=========================

System.out.println("\n\n\t\t"+p1 + " vs. " + p2 + " Rematch");
System.out.println("--------------------------------------------------------");
System.out.print(p1 + ", Choose Rock (1), Paper (2), or Scissors (3): ");
int choice3 = scottsteiner.nextInt();

if (choice3 == 1) {
    p1attack = "p1rock";
}
else if (choice3 == 2) {
    p1attack = "p1paper";

}
else if (choice3 == 3) {
    p1attack = "p1scissors";

}

System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

System.out.println("\n\n\t\t"+p1 + " vs. " + p2 + " Rematch");
System.out.println("--------------------------------------------------------");
System.out.print(p2 + ", Choose Rock (1), Paper (2), or Scissors (3): ");
int choice4 = scottsteiner.nextInt();

if (choice4 == 1) {
    p2attack = "p2rock";
}
else if (choice4 == 2) {
    p2attack = "p2paper";

}
else if (choice4 == 3) {
    p2attack = "p2scissors";

}




if (p1attack == "p1rock" && p2attack == "p2scissors"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh God, Almighty! "+p1+" just hit him with a brutal suplex!'");
System.out.println("Jerry: 'This match may be over before We know it! Wait, him again!?'");
System.out.println("Savage: 'Well hello there from across the stream, It's I once agaiin for this opportunity");
System.out.println("         to showcase my vocal ability, because I'm the cream of the crop,  ");
System.out.println("         I am the cream in the World Wrestling Federation and there is no doubt about it, yeah, you JR\n you know that I'm the"); 
System.out.println("         'cream of the crop! , Raaaandy Savage OH YEAHH!'");
System.out.println("Jerry: 'Alright well back to the fight'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p1 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p1 + "!!!'");
p1champion = p1champion + 1;

}
else if (p1attack == "p1paper" && p2attack == "p2rock"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh God, Almighty! "+p1+" just hit him with a brutal suplex!'");
System.out.println("Jerry: 'This match may be over before We know it! Wait, him again!?'");
System.out.println("Savage: 'Well hello there from across the stream, It's I once agaiin for this opportunity");
System.out.println("         to showcase my vocal ability, because I'm the cream of the crop,  ");
System.out.println("         I am the cream in the World Wrestling Federation and there is no doubt about it, yeah, you JR\n you know that I'm the"); 
System.out.println("         'cream of the crop! , Raaaandy Savage OH YEAHH!'");
System.out.println("Jerry: 'Alright well back to the fight'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p1 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p1 + "!!!'");
p1champion = p1champion + 1;

}
else if (p1attack == "p1scissors" && p2attack == "p2paper"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh God, Almighty! "+p1+" just hit him with a brutal suplex!'");
System.out.println("Jerry: 'This match may be over before We know it! Wait, him again!?'");
System.out.println("Savage: 'Well hello there from across the stream, It's I once agaiin for this opportunity");
System.out.println("         to showcase my vocal ability, because I'm the cream of the crop,  ");
System.out.println("         I am the cream in the World Wrestling Federation and there is no doubt about it, yeah, you JR\n you know that I'm the"); 
System.out.println("         'cream of the crop! , Raaaandy Savage OH YEAHH!'");
System.out.println("Jerry: 'Alright well back to the fight'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p1 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p1 + "!!!'");
p1champion = p1champion + 1;

}




// p2

if (p2attack == "p2rock" && p1attack == "p1scissors"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh God, Almighty! "+p2+" just hit him with a brutal suplex!'");
System.out.println("Jerry: 'This match may be over before We know it! Wait, him again!?'");
System.out.println("Savage: 'Well hello there from across the stream, It's I once agaiin for this opportunity");
System.out.println("         to showcase my vocal ability, because I'm the cream of the crop,  ");
System.out.println("         I am the cream in the World Wrestling Federation and there is no doubt about it, yeah, you JR\n you know that I'm the"); 
System.out.println("         'cream of the crop! , Raaaandy Savage OH YEAHH!'");
System.out.println("Jerry: 'Alright well back to the fight'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p2 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p2 + "!!!'");
p2champion = p2champion + 1;

}
else if (p2attack == "p2paper" && p1attack == "p1rock"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh God, Almighty! "+p2+" just hit him with a brutal suplex!'");
System.out.println("Jerry: 'This match may be over before We know it! Wait, him again!?'");
System.out.println("Savage: 'Well hello there from across the stream, It's I once agaiin for this opportunity");
System.out.println("         to showcase my vocal ability, because I'm the cream of the crop,  ");
System.out.println("         I am the cream in the World Wrestling Federation and there is no doubt about it, yeah, you JR\n you know that I'm the"); 
System.out.println("         'cream of the crop! , Raaaandy Savage OH YEAHH!'");
System.out.println("Jerry: 'Alright well back to the fight'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p2 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p2 + "!!!'");
p2champion = p2champion + 1;

}
else if (p2attack == "p2scissors" && p1attack == "p1paper"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh God, Almighty! "+p2+" just hit him with a brutal suplex!'");
System.out.println("Jerry: 'This match may be over before We know it! Wait, him again!?'");
System.out.println("Savage: 'Well hello there from across the stream, It's I once agaiin for this opportunity");
System.out.println("         to showcase my vocal ability, because I'm the cream of the crop,  ");
System.out.println("         I am the cream in the World Wrestling Federation and there is no doubt about it, yeah, you JR\n you know that I'm the"); 
System.out.println("         'cream of the crop! , Raaaandy Savage OH YEAHH!'");
System.out.println("Jerry: 'Alright well back to the fight'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p2 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p2 + "!!!'");
p2champion = p2champion + 1;
}
// ===================================

System.out.print("Enter '1' to Continue: ");
int cont5 = scottsteiner.nextInt();

if (cont5 == 0) {
    System.out.println("");
}
else if (cont5 != 0) {
    System.out.println("");
}

if (p1champion == 1 && p2champion == 0) {
System.out.println("\n");
System.out.println("===============================================================================================");
System.out.println("*Next week*");
System.out.println("JR: Hello everyone, and welcome to Monday Night Raw! I'm Jim Ross and this is Jerry 'The King' Lawler,");
System.out.println("    Get ready for this upcoming promo that " + p2 + " will do tonight, most likely about last weeks loss");
System.out.println("    to " + p1 + " for the WWF Heavyweight Championship of the World.'");
System.out.println("Jerry: 'Well said JR, we all know how angry " + p2 + " was after that great match, and I can't wait ");
System.out.println("        for what he is about to say in a few minutes here.'");
System.out.println("================================================================================================");
System.out.println(p2+": 'Well I'm not happy about last week, I'm sure you all know, so I'll cut to the part where I");
System.out.println("      challenge " + p1 + " to a rematch for the WWF Heavyweight Championship! And It'll ");
System.out.println("      be in a Steel Cage match!!!'");
System.out.println("*"+p1+"'s' entrance music plays*");
System.out.println(p1+": 'Well well well "+p2+", I accept your stinking challenge! But you're not winning that title!");
System.out.println("================================================================================================");
System.out.println("JR: 'We very well might be in for a 5 star match tonight, isn't that right Jerry?'");
System.out.println("Jerry: 'A 5 star match indeed JR!!'");
System.out.println("================================================================================================");
}
else if (p2champion == 1 && p1champion == 0) {
System.out.println("\n");
System.out.println("===============================================================================================");
System.out.println("*Next week*");
System.out.println("JR: Hello everyone, and welcome to Monday Night Raw! I'm Jim Ross and this is Jerry 'The King' Lawler,");
System.out.println("    Get ready for this upcoming promo that " + p1 + " will do tonight, most likely about last weeks loss");
System.out.println("    to the great " + p2 + " for the WWF Heavyweight Championship of the World.'");
System.out.println("Jerry: 'Well said JR, we all know how angry " + p1 + " was after that great match, and I can't wait ");
System.out.println("        for what he is about to say in a few minutes here.'");
System.out.println("================================================================================================");
System.out.println(p1+": 'Well I'm not happy about last week, I'm sure you all know, so I'll cut to the part where I");
System.out.println("      challenge " + p2 + " to a rematch for the WWF Heavyweight Championship! And It'll ");
System.out.println("      be in a Steel Cage match!!!'");
System.out.println("*"+p2+"'s' entrance music plays*");
System.out.println(p2+": 'Well well well "+p1+", I accept your stinking challenge! But you're not winning that title!");
System.out.println("================================================================================================");
System.out.println("JR: 'We very well might be in for a 5 star match tonight, isn't that right Jerry?'");
System.out.println("Jerry: 'A 5 star match indeed JR!!'");
System.out.println("================================================================================================");
}
p1champion = p1champion * 0;
p2champion = p2champion * 0;



// =============


System.out.println("\n\n\t\t"+p1 + " vs. " + p2 + " Final Match");
System.out.println("--------------------------------------------------------");
System.out.print(p1 + ", Choose Rock (1), Paper (2), or Scissors (3): ");
int choice7 = scottsteiner.nextInt();

if (choice7 == 1) {
    p1attack = "p1rock";
}
else if (choice7 == 2) {
    p1attack = "p1paper";

}
else if (choice7 == 3) {
    p1attack = "p1scissors";

}

System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

System.out.println("\t\t"+p1 + " vs. " + p2 + " Final Match");
System.out.println("--------------------------------------------------------");
System.out.print(p2 + ", Choose Rock (1), Paper (2), or Scissors (3): ");
int choice9 = scottsteiner.nextInt();

if (choice9 == 1) {
    p2attack = "p2rock";
}
else if (choice9 == 2) {
    p2attack = "p2paper";

}
else if (choice9 == 3) {
    p2attack = "p2scissors";

}




if (p1attack == "p1rock" && p2attack == "p2scissors"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh Great Heavens! "+p1+" just hit him with a devastating powerbomb!!'");
System.out.println("Jerry: 'This match may very well be one of the all time greats! What!? Oh come on.'");
System.out.println("Savage: 'Well hello hello hello there, It's I, the Macho Man Raaaandy Savage, oh YEAHH!");
System.out.println("         Remember, Don't Buy Any Unripe Bananas, Yeah, 'Cause You Won't Live to Eat 'Em!,  ");
System.out.println("         Hulkamania Is Like A Single Grain Of Sand In The Sahara Desert That Is Macho Madness"); 
System.out.println("         OH YEAHH!'");
System.out.println("Jerry: 'Well I'm sure we all enjoy this but we need to get back to the scheduled programming.'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p1 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p1 + "!!!'");
p1champion = p1champion + 1;

}
else if (p1attack == "p1paper" && p2attack == "p2rock"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh Great Heavens! "+p1+" just hit him with a devastating powerbomb!!'");
System.out.println("Jerry: 'This match may very well be one of the all time greats! What!? Oh come on.'");
System.out.println("Savage: 'Well hello hello hello there, It's I, the Macho Man Raaaandy Savage, oh YEAHH!");
System.out.println("         Remember, Don't Buy Any Unripe Bananas, Yeah, 'Cause You Won't Live to Eat 'Em!,  ");
System.out.println("         Hulkamania Is Like A Single Grain Of Sand In The Sahara Desert That Is Macho Madness"); 
System.out.println("         OH YEAHH!'");
System.out.println("Jerry: 'Well I'm sure we all enjoy this but we need to get back to the scheduled programming.'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p1 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p1 + "!!!'");
p1champion = p1champion + 1;

}
else if (p1attack == "p1scissors" && p2attack == "p2paper"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh Great Heavens! "+p1+" just hit him with a devastating powerbomb!!'");
System.out.println("Jerry: 'This match may very well be one of the all time greats! What!? Oh come on.'");
System.out.println("Savage: 'Well hello hello hello there, It's I, the Macho Man Raaaandy Savage, oh YEAHH!");
System.out.println("         Remember, Don't Buy Any Unripe Bananas, Yeah, 'Cause You Won't Live to Eat 'Em!,  ");
System.out.println("         Hulkamania Is Like A Single Grain Of Sand In The Sahara Desert That Is Macho Madness");
System.out.println("         OH YEAHH!'");
System.out.println("Jerry: 'Well I'm sure we all enjoy this but we need to get back to the scheduled programming.'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p1 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p1 + "!!!'");
p1champion = p1champion + 1;

}




// p2

if (p2attack == "p2rock" && p1attack == "p1scissors"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh Great Heavens! "+p2+" just hit him with a devastating powerbomb!!'");
System.out.println("Jerry: 'This match may very well be one of the all time greats! What!? Oh come on.'");
System.out.println("Savage: 'Well hello hello hello there, It's I, the Macho Man Raaaandy Savage, oh YEAHH!");
System.out.println("         Remember, Don't Buy Any Unripe Bananas, Yeah, 'Cause You Won't Live to Eat 'Em!,  ");
System.out.println("         Hulkamania Is Like A Single Grain Of Sand In The Sahara Desert That Is Macho Madness"); 
System.out.println("         OH YEAHH!'");
System.out.println("Jerry: 'Well I'm sure we all enjoy this but we need to get back to the scheduled programming.'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p2 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p2 + "!!!'");
p2champion = p2champion + 1;

}
else if (p2attack == "p2paper" && p1attack == "p1rock"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh Great Heavens! "+p2+" just hit him with a devastating powerbomb!!'");
System.out.println("Jerry: 'This match may very well be one of the all time greats! What!? Oh come on.'");
System.out.println("Savage: 'Well hello hello hello there, It's I, the Macho Man Raaaandy Savage, oh YEAHH!");
System.out.println("         Remember, Don't Buy Any Unripe Bananas, Yeah, 'Cause You Won't Live to Eat 'Em!,  ");
System.out.println("         Hulkamania Is Like A Single Grain Of Sand In The Sahara Desert That Is Macho Madness"); 
System.out.println("         OH YEAHH!'");
System.out.println("Jerry: 'Well I'm sure we all enjoy this but we need to get back to the scheduled programming.'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p2 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p2 + "!!!'");
p2champion = p2champion + 1;

}
else if (p2attack == "p2scissors" && p1attack == "p1paper"){
System.out.println("===============================================================================================");
System.out.println("Announcer: 'Introducing to the ring...' 'This match is for one-fall...' *DING-DING*");
System.out.println("JR: 'Oh Great Heavens! "+p2+" just hit him with a devastating powerbomb!!'");
System.out.println("Jerry: 'This match may very well be one of the all time greats! What!? Oh come on.'");
System.out.println("Savage: 'Well hello hello hello there, It's I, the Macho Man Raaaandy Savage, oh YEAHH!");
System.out.println("         Remember, Don't Buy Any Unripe Bananas, Yeah, 'Cause You Won't Live to Eat 'Em!,  ");
System.out.println("         Hulkamania Is Like A Single Grain Of Sand In The Sahara Desert That Is Macho Madness"); 
System.out.println("         OH YEAHH!'");
System.out.println("Jerry: 'Well I'm sure we all enjoy this but we need to get back to the scheduled programming.'");
System.out.println("*More fighting continues...*");
System.out.println("===============================================================================================");
System.out.println("ONE... TWO............ THREE! ");
System.out.println("JR: 'BAWH GAWD! LAWLER DID YOU SEE THAT!?', 'It looks like " + p2 + " just won!!!' ");
System.out.println("Jerry: You're right JR, looks like we have a champion on our hands!");
System.out.println("===============================================================================================");
System.out.println("Announcer: 'And your WWF Heavyweight Champion of the World... " + p2 + "!!!'");
p2champion = p2champion + 1;
}

System.out.print("Enter '1' to Continue: ");
int cont6 = scottsteiner.nextInt();

if (cont6 == 0) {
    System.out.println("");
}
else if (cont6 != 0) {
    System.out.println("");
}

System.out.println("\n==============================================================================================");
System.out.println("JR: 'Well that one one heck of a title feud, isnt that right Lawler?'");
System.out.println("Jerry: 'That was absolutely amazing JR, and you know what made it better?'");
System.out.println("JR: 'Please, you didnt invite him over here this time did you? It was bad enough when");
System.out.println("    he just barged in-'");
System.out.println("Savage: 'Well hello, I'm the tower of power, too sweet to be sour. I'm funky like a monkey. Sky's the limit, and space is the place!");
System.out.println("=================================================================================================");
System.out.println("Thanks for Playing!");

    }

}
