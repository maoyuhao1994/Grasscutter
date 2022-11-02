package emu.grasscutter.command.commands;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.PlayerProperty;
import emu.grasscutter.game.tower.TowerLevelRecord;
import emu.grasscutter.server.packet.send.PacketOpenStateChangeNotify;
import emu.grasscutter.server.packet.send.PacketSceneAreaUnlockNotify;
import emu.grasscutter.server.packet.send.PacketScenePointUnlockNotify;

@Command(label = "UnlockMap", 
         usage = "Unlockmap 1/0",
        aliases = {"Unlockmap"}, 
         permission = "player.setworldlevel", 
         permissionTargeted = "player.setworldlevel.others")
public final class UnlockMapCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.size() < 1) {
            return;
        }

        try {
            int level = Integer.parseInt(args.get(0));
            if (level > 1 || level < 0) {
                return;
            }

            unlockMap(targetPlayer);
        } catch (NumberFormatException ignored) {}
    }
    final static private List<Integer> sceneAreas = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,17,18,19,20,21,22,23,24,25,26,27,28,29,100,101,102,103,200,210,300,400,401,402,403);
      private boolean unlockMap(Player targetPlayer) {
        // Unlock.
        GameData.getScenePointsPerScene().forEach((sceneId, scenePoints) -> {
            // Unlock trans points.
            targetPlayer.getUnlockedScenePoints(sceneId).addAll(scenePoints);

            // Unlock map areas.
            targetPlayer.getUnlockedSceneAreas(sceneId).addAll(sceneAreas);
        });

        // Send notify.
        int playerScene = targetPlayer.getSceneId();
        targetPlayer.sendPacket(new PacketScenePointUnlockNotify(playerScene, targetPlayer.getUnlockedScenePoints(playerScene)));
        targetPlayer.sendPacket(new PacketSceneAreaUnlockNotify(playerScene, targetPlayer.getUnlockedSceneAreas(playerScene)));
        return true;
    }
}
