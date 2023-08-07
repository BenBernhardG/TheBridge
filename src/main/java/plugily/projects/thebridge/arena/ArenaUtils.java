/*
 * Village Defense - Protect villagers from hordes of zombies
 * Copyright (c) 2022  Plugily Projects - maintained by Tigerpanzer_02 and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package plugily.projects.thebridge.arena;

import plugily.projects.minigamesbox.classic.arena.PluginArenaUtils;

/**
 * @author Plajer
 *     <p>Created at 13.03.2018
 */
public class ArenaUtils extends PluginArenaUtils {

  private ArenaUtils() {
    super();
  }

  public static int emptyBases(Arena arena) {
    return (int) arena.getBases().stream().filter(base -> base.getPlayersSize() == 0).count();
  }
}
