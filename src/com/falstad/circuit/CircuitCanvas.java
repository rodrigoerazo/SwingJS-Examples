package com.falstad.circuit;

import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Canvas;

// Changed paint to paintComponent

class CircuitCanvas extends Canvas {
	CirSim pg;

	CircuitCanvas(CirSim p) {
		pg = p;
	}

	public Dimension getPreferredSize() {
		return new Dimension(300, 400);
	}

	public void update(Graphics g) {
		pg.updateCircuit(g);
	}

	public void paint(Graphics g) {
		pg.updateCircuit(g);
	}
};
