package com.agent.imp;

import java.util.ArrayList;
import java.util.List;

import com.agent.Action;
import com.agent.Agent;
import com.agent.State;
import com.checkersgame.CheckersGame;
import com.checkersgame.Move;
import com.checkersgame.Piece;
import com.checkersgame.Player;
import com.checkersgame.gui.CheckerBoard;
/**
 * TODO, this really does nothing at the moment
 */
public class TestAgent implements Agent {
	
	public Player p;
	public CheckerBoard board;
	public CheckersGame game;
	@Override
	public void Init(Player p,CheckersGame game,  CheckerBoard board) {
		this.p = p;
		this.game=game;
		this.board = board;
	}

	@Override
	public void GetMove() {
		Move[] moves = game.AvailableMoves(p);
		int index = (int)(Math.random()*(moves.length));
		board.playableSpaces[moves[index].start].AgentsMove(p);
		board.playableSpaces[moves[index].end].AgentsMove(p);
	}
	public List<Move> FindAvailableMoves() {
		List<Move> moves = null;
		try {
			moves = new ArrayList<Move>();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (List<Move>)moves;
	}

	@Override
	public Action Percieve(State s) {
		return null;
	}
}
