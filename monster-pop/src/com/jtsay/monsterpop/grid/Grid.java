package com.jtsay.monsterpop.grid;

import java.util.ArrayList;
import java.util.Random;


/**
 * The Grid is made up of 9 spaces. Spaces can either contain a GameObject (monster, item, etc) or be empty.
 * Empty spaces are kept track of.
 * 
 * @author jltsay
 *
 */
public class Grid {
	
	private static Grid instance;
	ArrayList<Space> spaces;
	ArrayList<Integer> emptyIndexes;
	Random rand;
	
	public static Grid getInstance() {
		if (instance == null) {
			instance = new Grid();
		}
		return instance;
	}
	
	private Grid() {
		spaces = new ArrayList<Space>(9);
		for (int i=0; i<9; i++) {
			spaces.add(new Space());
			emptyIndexes.add(i);
		}
	}
	
	public Space getRandomEmptySpace() {
		int index = emptyIndexes.get(rand.nextInt(emptyIndexes.size()));
		return spaces.get(index);
	}
	
	
}