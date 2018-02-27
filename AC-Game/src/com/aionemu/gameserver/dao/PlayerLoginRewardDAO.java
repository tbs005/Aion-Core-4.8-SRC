/**
 * This file is part of Aion-Lightning <aion-lightning.org>.
 *
 *  Aion-Lightning is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Aion-Lightning is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details. *
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Aion-Lightning.
 *  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * Credits goes to all Open Source Core Developer Groups listed below
 * Please do not change here something, ragarding the developer credits, except the "developed by XXXX".
 * Even if you edit a lot of files in this source, you still have no rights to call it as "your Core".
 * Everybody knows that this Emulator Core was developed by Aion Lightning 

 * @-Aion-Lightning
 * @Goong_ADM

 

 */
package com.aionemu.gameserver.dao;

import java.sql.Timestamp;

import com.aionemu.commons.database.dao.DAO;
import com.aionemu.gameserver.model.gameobjects.player.LoginReward;

/**
 * @author Ranastic
 */

public abstract class PlayerLoginRewardDAO implements DAO
{
	@Override
	public String getClassName() {
		return PlayerLoginRewardDAO.class.getName();
	}
	
	public abstract LoginReward load(final int playerId);
	public abstract boolean addLoginReward(final int playerId, final int activated_id, final int login_count, final Timestamp next_login_count);
	public abstract boolean delLoginReward(final int playerId, final int activated_id, final int login_count, final Timestamp next_login_count);
	public abstract int getLoginCountByObjAndActivatedEventId(final int obj, final int activated_id);
	public abstract Timestamp getNextLoginCountbyObjAndActivatedEventId(final int obj, final int activated_id);
}