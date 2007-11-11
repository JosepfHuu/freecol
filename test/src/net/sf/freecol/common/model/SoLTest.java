/**
 *  Copyright (C) 2002-2007  The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.common.model;

import java.util.Iterator;

import net.sf.freecol.util.test.FreeColTestCase;

public class SoLTest extends FreeColTestCase {


    public void testSoL() {
        
        Colony colony = getStandardColony(7);
	for (int i = 1; i <= 100; i++) {
	    colony.addSoL(1);
	    colony.updatePopulation();
	    assertEquals(colony.getSoL(), i);
	    assertEquals(colony.getTory(), 100 - i);
	    assertEquals(colony.getMembers(), Math.round(i * 7 / 100f));

	}
    }


}