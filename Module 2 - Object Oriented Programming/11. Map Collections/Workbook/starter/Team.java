import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        this.name = name;
    }
    
    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer(String position) {
        return players.get(position);
    }

    public void setPlayer(String position, String player) {
        if (this.players == null) {
            this.players = new HashMap<>();
        }
        this.players.put(position, player);
    }    

    
}
