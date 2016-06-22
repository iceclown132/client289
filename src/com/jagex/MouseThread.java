package com.jagex;
public class MouseThread implements Runnable {

	public client client;
	public boolean running;
	public Object objectLock;
	public int index;
	public int mouse_x[];
	public int mouse_y[];

	public MouseThread(client client) {
		this.running = true;
		this.objectLock = new Object();
		this.mouse_x = new int[500];
		this.mouse_y = new int[500];
		this.client = client;
	}

	public void run() {
		while (running) {
			synchronized (objectLock) {
				if (index < 500) {
					mouse_x[index] = ((RSApplet) (client)).mouse_x;
					mouse_y[index] = ((RSApplet) (client)).mouse_y;
					index++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (Exception ex) {
				
			}
		}
	}
}
