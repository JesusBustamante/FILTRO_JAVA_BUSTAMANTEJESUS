package Model;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ninjaDAO {

    public Map<ninja, List<skill>> getAllNinjas() {
        Map<ninja, List<skill>> list = new HashMap<>();
        String sql = "SELECT n.id, n.name, n.ranges, n.village, s.name, s.description from ninja n "
                + "left join ninja_skill ns on n.id = ns.id_ninja left join skill s on ns.id_skill = s.id "
                + "order by n.id";
        
        try (Connection conn = BBDD_Connection.conectar(); 
            PreparedStatement stmt = conn.prepareStatement(sql); 
            ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                ninja ninjas = new ninja(
                    rs.getInt("id"),
                    rs.getString("name"),
                    RangesNinja.valueOf(rs.getString("ranges").toUpperCase()),
                    rs.getString("village")
                );
                
                skill skills = rs.getInt("id") == 0 ? null : new skill(
                    rs.getString("name"),
                    rs.getString("description")
                );
                
                list.computeIfAbsent(ninjas, p -> new ArrayList<>());
                
                if (skills != null) {
                    list.get(ninjas).add(skills);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ninja getNinjaById(int id) {
        String sql = "SELECT * FROM ninja WHERE id = ?";
        
        try (Connection conn = BBDD_Connection.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            return rs.next() ? new ninja(rs.getInt("id"),
                                        rs.getString("name"),
                                        RangesNinja.valueOf(rs.getString("ranges").toUpperCase()),
                                        rs.getString("village")
                                        ) : null;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<mision> getAvailableMissions(int ninjaId) {
        String sql = "SELECT m.id, m.description, m.ranges, m.reward FROM mision m"
                + "LEFT JOIN ninja_mision nm ON m.id = nm.id_mision AND nm.id_ninja = ?"
                + "WHERE nm.id_ninja IS NULL";
        
        List<mision> missions = new ArrayList<>();
        
        try (Connection conn = BBDD_Connection.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, ninjaId);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                missions.add(new mision(rs.getInt("id"),
                                        rs.getString("description"),
                                        RangesMission.valueOf(rs.getString("ranges").toUpperCase()),
                                        rs.getDouble("reward")
                                        ));
            }
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return missions;
    }
}
