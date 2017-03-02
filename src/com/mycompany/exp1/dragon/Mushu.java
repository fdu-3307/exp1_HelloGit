/**
 * 
 */
package com.mycompany.exp1.dragon;

import com.mycompany.exp1.village.Village;

/**
 * @author John
 *
 */
public class Mushu implements Dragon {

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#breathsFire()
	 */
	@Override
	public boolean breathsFire() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#canFly()
	 */
	@Override
	public Boolean canFly() {
		return new Boolean(false);
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#eatVillage(com.mycompany.exp1.village.Village)
	 */
	@Override
	public boolean eatVillage(Village village) {
		return false;
	}

}
