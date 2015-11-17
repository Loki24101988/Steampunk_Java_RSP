package team.tmbe.model.world;

import java.math.BigInteger;
import java.util.ArrayList;

import team.tmbe.model.Thing;

/**
 * This class represents the whole game world, with all universes, galaxies, planets, cities and the whole grab in them.
 * @author loki
 *
 */
public class World extends Thing {

	private final String NAME = "GAMEINGWORLD!";
	private static boolean ms_isCreated = false;
	private ArrayList<Universe> m_universes;
	
	/**
	 * This standard constructor is private, becuase we use the singleton pattern for this class.
	 */
	private World() {
		
		super();
		this.m_universes = new ArrayList<>();
		
	}
	
	/**
	 * This method adds a new universe to the game world, if this special universe isn't still in.
	 * @param newUniverse
	 */
	public void addUniverse(Universe newUniverse) {
		
		if(this.getNumberOfUniverses() > 0 && this.isNotInList(newUniverse)) {
			
			this.m_universes.add(newUniverse);
			
		}
		
	}
	
	/**
	 * This method removes a given universe from the game world universe list.
	 * @param oldUniverse
	 */
	public void removeUniverse(Universe oldUniverse) {
		
		this.removeUniverse(oldUniverse.getM_ID());
		
	}
	
	/**
	 * This method removes a universe which is defined by an ID.
	 * @param removeID
	 */
	private void removeUniverse(BigInteger removeID) {
		
		if(this.getNumberOfUniverses() > 0) {
			
			for(int i = 0; i < this.getNumberOfUniverses(); i++) {
				
				if(this.m_universes.get(i).getM_ID().equals(removeID)) {
					
					this.m_universes.remove(i);
					break;
					
				}
				
			}
			
		}
		
	}
	
	/**
	 * This method removes a given universe from the list in the game world. 
	 * @param ID
	 */
	public void removeUniverse(Thing ID) {
		
		this.removeUniverse(ID.getM_ID());
		
	}
	
	/**
	 * This method returns the number of universes in the game world.
	 * @return
	 */
	public int getNumberOfUniverses() {
		
		return this.m_universes.size();
	}
		
	/**
	 * This private method checks if a new universe is still added to the world.
	 * If the universe is still added the method returns false, otherwise it returns true.
	 * @param toCheckUniverse
	 * @return
	 */
	private boolean isNotInList(Universe toCheckUniverse) {
		
		boolean tmp_ret = true;
		
		for(Universe tmp_Universe : this.m_universes) {
			if(tmp_Universe.getM_ID().equals(toCheckUniverse.getM_ID())) {
				
				tmp_ret = false;
				break;
			}
		}
		
		return tmp_ret;
		
	}

	/*
	 * After this commment the singleton-pattern starts.
	 * Please do not change the following lines of code.
	 */
	/**
	 * This method creates a new game world. if the game world was created, the method returns a null value.
	 * @return
	 */
	public static World createGamingWorld() {
		
		if(!ms_isCreated) {
			
			ms_isCreated = true;
			return new World();
			
		} else {
			
			return null;
			
		}
	}
}
