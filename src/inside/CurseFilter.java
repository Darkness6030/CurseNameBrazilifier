package inside;

import arc.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;

import static mindustry.Vars.*;

public class CurseFilter extends Plugin{
    //this is the most curses I've ever typed
    public static final String[] ohno = {"гей", "лох", "пидор", "сучка", "ахуел", "хуй", "ебало", "член", "сука", "шлюха", "уебан", "хуесос", "блядь", "ебаный", "нахуй", "ебать", "хуйня", "даун", "server", "admin", "говно", "ебал", "яой", "фурри", "пизда", "вагина", "пиздец"};
    
    @Override
    public void init(){
        
        Events.on(PlayerConnect.class, event -> {
            for(String bruh : ohno){
                if(event.player.name.toLowerCase().contains(bruh)){
                    event.player.con.kick("Ты не мог бы выбрать имя получше? Непристойные ники запрещены.");
                    break;
                }
            }
        });
    }

}
